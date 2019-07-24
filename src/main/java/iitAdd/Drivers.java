package iitAdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class Drivers {
    // TODO WebDriver add
    public static WebDriver ie() {
        System.setProperty("webdriver.ie.driver", "C:\\Tools\\IEDriverServer.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        // ������ ������
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

    public static WebDriver ff() {
        FirefoxProfile profile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver.exe");
        // ������ �����
        //System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "C:\\Tools\\TestFile");
        profile.setPreference("browser.download.useDownloadDir", true);
        // ��������� ��� ��������� �� ��������� ������� ����������� ��� ������������ ����
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/png, exe, application/zip, text/html,application/msword;charset=UTF-8");
        //���������� ������� ������ ���
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

    public static WebDriver chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Tools\\cryptopro_extension_for_cades_browser_plug_in-1.1.1-an+fx-windows.xpi"));
        WebDriver d = new ChromeDriver(options);


        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        d.manage().window().maximize();
        return d;
    }

}