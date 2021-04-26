package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.HelpUser;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static edosf.methods.Path.GetPathTools;
import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class K_DownloadMaterial_Test11 implements Iit8077 {
    public WebDriver driver;
    public Boolean test;
    public String checking;

    public static File dir;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            String path = GetPathTools();
            path = path.concat("testFile");
            dir = new File(path);
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    @DisplayName("Проверка скачивания файла")
    void A_TestDownloadFile_Test1() {
        try {
            driver.get(URL10);
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
    @DisplayName("Проверка перехода по ссылке.")
    void B_TestLink_Test2() {
        try {
            driver.get(URL10);
            driver.findElement(By.xpath("//*[contains(text(), 'Руководство по инсталляции Плагина КриптоПро')]")).click();
            Thread.sleep(2000);
            checking = driver.findElement(By.xpath("/html/body/div/h1")).getText();
            Check.CheckingContainsExit("Установка КриптоПро ЭЦП Browser plug-in в Windows", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}