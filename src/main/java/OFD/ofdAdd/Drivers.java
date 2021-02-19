package OFD.ofdAdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static OFD.ofdAdd.OfdStand.HEAD_LESS;
import static OFD.ofdAdd.OfdStand.LOGS;


public class Drivers {


    // TODO WebDriver add
    public static WebDriver ie() {
        System.setProperty("webdriver.ie.driver", "C:\\Tools\\IEDriverServer.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        // Чистая сессия
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        capabilities.setCapability("requireWindowFocus", true);
        capabilities.setCapability("ignoreProtectedModeSetting", true);
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        capabilities.setCapability("disable-popup-blocking", true);
        capabilities.setCapability("enablePersistentHover", true);
        WebDriver driver = new InternetExplorerDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver ff() throws InterruptedException {

        Thread.sleep(1000);
        FirefoxProfile profile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver.exe");

        if (LOGS) {
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        }

        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "C:\\Tools\\TestFile");
        profile.setPreference("browser.download.useDownloadDir", true);
        // Указывает тип документа по умолчанию которые скачиваются без всплывающего окна
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/png, exe, application/zip, application/msword, application/xml, text/html ;charset=UTF-8");
        profile.setPreference("browser.helperApps.neverAsk.openFile", "image/png, exe, application/zip, application/msword,text/html,application/xml,text/plain;charset=UTF-8");

        //Добавление Плазина Крипто про
        profile.addExtension(
                new File("C:\\Tools\\cryptopro_extension_for_cades_browser_plug_in-1.1.1-an+fx-windows.xpi"));

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setLogLevel(Level.OFF);
        firefoxOptions.setProfile(profile);

        if (HEAD_LESS) {
            firefoxOptions.addArguments("--headless");
        }
/*        firefoxOptions.addArguments("--window-size=1920,1080");
        firefoxOptions.addArguments("--width=1920");
        firefoxOptions.addArguments("--height=1080");*/

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver chrome() {
        System.setProperty("webdriver.chroHelpUser.driver", "C:\\Tools\\chromedriver.exe");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("download.default_directory", "C:\\Tools\\TestFile");
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.directory_upgrade", true);
        chromePrefs.put("browser.helperApps.neverAsk.saveToDisk", "image/png, exe, application/zip, application/msword, application/xml, text/html ;charset=UTF-8");
        chromePrefs.put("browser.helperApps.neverAsk.openFile", "image/png, exe, application/zip, application/msword,text/html,application/xml,text/plain;charset=UTF-8");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addExtensions(new File("C:\\Tools\\cryptopro_extension_for_cades_browser_plug_in-1.1.1-an+fx-windows.xpi"));
        ///////// Don't work options.setHeadless(true);

        WebDriver d = new ChromeDriver(options);


        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        d.manage().window().maximize();
        return d;
    }


}
