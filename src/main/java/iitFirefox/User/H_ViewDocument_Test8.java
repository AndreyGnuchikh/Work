package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import iitFirefox.User.Form.CompleteFormDopSchF;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class H_ViewDocument_Test8 {
    public WebDriver driver;
    public String test2;

    @Before
    public void setUP() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
    }
    @Test
    public void A_DownloadFile_Test1() {
        Me.AddFileAndClickMenu(2, "1.html", driver);
        File dir = new File("C:\\Tools\\TestFile\\");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        String test = lst.get(0).toString();
        test = test.substring(18);
        System.out.println(test);
        Me.DeletedFiles(dir);
        Me.CheckExit("1.html", test, driver);
    }
    @Test
    public void B_DownloadFileSecondWindow_Test2() {
        driver = ffWithoutAddon();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFileAndClickMenu(2, "1.html", driver);
        File dir = new File("C:\\Tools\\TestFile\\");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        try {
            test2 = arrFiles[0].getName();
            Me.DeletedFiles(dir);
            Me.CheckExit("No File", test2, driver);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test succesful");
            driver.quit();
        }
    }

    @Test
    public void C_OpenUPD_Test3() {
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        CompleteFormDopSchF.DopSchF(driver);
        Me.ClickMenuFirstElement(2, driver);
        test2 = driver.findElement(By.cssSelector("#butPrintUPD > button:nth-child(1)")).getText();
        Me.Check("Закрыть", test2, driver);
        driver.findElement(By.cssSelector("#butPrintUPD > button:nth-child(1) > span:nth-child(1)")).click();
        Me.Sleep(1000);
        test2 = driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).getText();
        Me.CheckExit("Все документы", test2, driver);
    }

    public static WebDriver ffWithoutAddon() {
        FirefoxProfile profile = new FirefoxProfile();
        // Убрать вывод
        //System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "C:\\Tools\\TestFile");
        profile.setPreference("browser.download.useDownloadDir", true);
        // Указывает тип документа по умолчанию которые скачиваются без всплывающего окна

        //Добавление Плазина Крипто про
        profile.addExtension(
                new File("C:\\Tools\\cryptopro_extension_for_cades_browser_plug_in-1.1.1-an+fx-windows.xpi"));

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setLogLevel(Level.OFF);
        firefoxOptions.setProfile(profile);

        //firefoxOptions.addArguments("--headless"); //////////////////////////////////////
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}

