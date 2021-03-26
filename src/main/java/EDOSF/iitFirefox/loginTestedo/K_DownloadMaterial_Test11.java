package EDOSF.iitFirefox.loginTestedo;

import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.SettingsEDOSF.testedo;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.HelpUser;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static EDOSF.methods.Path.GetPathTools;
import static EDOSF.SettingsEDOSF.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class K_DownloadMaterial_Test11 extends testedo {
    public WebDriver driver;
    public Boolean test;
    public String checking;

    public static File dir;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            String path = GetPathTools();
            path = path.concat("TestFile");
            dir = new File(path);
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_TestDownloadFile_Test1() {
        try {
            driver.get(url10);
            //Удалить файлы в папке
            driver.findElement(By.xpath("//*[contains(text(), 'Руководство пользователя')]")).click();
            Thread.sleep(22000);
            // Взять файл в папке.
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            Check.CheckingContainsExit("Руководство_пользователя_Портала_ЭДО_СФ.doc", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_TestLink_Test2() {
        try {
            driver.get(url10);
            driver.findElement(By.xpath("//*[contains(text(), 'Руководство по инсталляции Плагина КриптоПро')]")).click();
            Thread.sleep(2000);
            checking = driver.findElement(By.xpath("/html/body/div/h1")).getText();
            Check.CheckingContainsExit("Установка КриптоПро ЭЦП Browser plug-in в Windows", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}