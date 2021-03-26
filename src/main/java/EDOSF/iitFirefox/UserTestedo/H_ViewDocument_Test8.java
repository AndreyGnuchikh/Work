package EDOSF.iitFirefox.UserTestedo;

import EDOSF.Forms.CompleteFormDopSchF;
import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.SettingsEDOSF.testedo;
import EDOSF.methods.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static EDOSF.SettingsEDOSF.Settings.*;
import static EDOSF.methods.Path.GetPathTools;

import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class H_ViewDocument_Test8 extends testedo {
    public static WebDriver driver;
    public String test2;


    void setUP() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }


    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_DownloadFile_Test1() {
        try {
            setUP();
            FileCreateAndLoading.AddFileAndClickMenu(6, "1.html", driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(2000);

            File dir = new File(GetPathTools("TestFile\\"));
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            test = test.substring(18);
            System.out.println(test);
            HelpUser.DeletedFiles(dir);
            Check.CheckingContainsExit(".zip", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_DownloadFileSecondWindow_Test2() {
        try {
            driver = Drivers.ffWithoutAddon();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFileAndClickMenu(6, "1.html", driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(2000);
            File dir = new File(GetPathTools("TestFile\\"));
            File[] arrFiles = dir.listFiles();
            try {
                test2 = arrFiles[0].getName();
                HelpUser.DeletedFiles(dir);
                Check.CheckExit("No File", test2, driver);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Test succesful");
                driver.quit();
            }
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_OpenUPD_Test3() {
        try {
            setUP();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            CompleteFormDopSchF.DopSchF("YES",driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".active-file")).click();
            Thread.sleep(1000);
            Cabinet.ClickMenuFirstElement(2, driver);

            test2 = driver.findElement(By.cssSelector("#butPrint > button:nth-child(2)")).getText();
            Check.Check("Закрыть", test2, driver);
            driver.findElement(By.cssSelector("#butPrint > button:nth-child(2)")).click();
            Thread.sleep(1000);
            test2 = driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).getText();
            Check.CheckExit("Все документы", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }



}

