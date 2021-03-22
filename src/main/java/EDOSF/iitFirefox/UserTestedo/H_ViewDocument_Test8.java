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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static EDOSF.SettingsEDOSF.Drivers.GetPathTools;
import static EDOSF.SettingsEDOSF.Settings.*;

import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class H_ViewDocument_Test8 extends testedo {
    public static WebDriver driver;
    public String test2;





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
            driver = ffWithoutAddon();
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
            List<File> lst = Arrays.asList(arrFiles);
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

    public static WebDriver ffWithoutAddon() throws InterruptedException {
        Thread.sleep(1000);

        FirefoxProfile profile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver", "src/main/java/EDOSF/SettingsEDOSF/DriverElements/geckodriver.exe");

        if (LOGS) {
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        }

        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", GetPathTools("TestFile\\"));
        profile.setPreference("browser.download.useDownloadDir", true);
        // Указывает тип документа по умолчанию которые скачиваются без всплывающего окна
        //profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/png, exe, application/zip, application/msword, application/xml, text/html ;charset=UTF-8");
        //profile.setPreference("browser.helperApps.neverAsk.openFile", "image/png, exe, application/zip, application/msword,text/html,application/xml,text/plain;charset=UTF-8");

        //Добавление Плазина Крипто про
        profile.addExtension(
                new File("Tools/cryptopro_extension_for_cades_browser_plug_in-1.1.1-an+fx-windows.xpi"));

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setLogLevel(Level.OFF);
        firefoxOptions.setProfile(profile);

        if (HEADLESS) {
            firefoxOptions.addArguments("--headless"); //////////////////////////////////////
        }
/*        firefoxOptions.addArguments("--window-size=1920,1080");
        firefoxOptions.addArguments("--width=1920");
        firefoxOptions.addArguments("--height=1080");*/

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}

