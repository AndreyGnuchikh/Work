package EDOSF.iitFirefox.UserTestedo;

import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class T_OpenProtocolCompliance_Test20 extends testedo {
    WebDriver driver;
    String test;
    String test2;
    String urlSubstring = url.substring(0, 22);

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            Thread.sleep(500);
            driver.get(urlSubstring + "/auth?error=noauth");
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_NameCardED_Test1() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(urlSubstring + "/iit/compliance?idf=" + test2);
            Thread.sleep(500);
            test = driver.findElement(By.id("file")).getText();
            Thread.sleep(500);
            Check.CheckExit("«1.html»", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_NameCardED_Test2() {
        try {
            Date date = new Date();
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(urlSubstring + "/iit/compliance?idf=" + test2);
            Thread.sleep(500);
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            test = driver.findElement(By.id("date")).getText();
            Thread.sleep(500);
            Check.CheckExit(dateFormat.format(date), test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_SignCardED_Test3() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            Sign.SignFirstFile(driver);
            driver.get(urlSubstring + "/iit/compliance?idf=" + test2);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(2)")).getText();
            Thread.sleep(500);
            Check.Check("УПД 1", test, driver);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(4)")).getText();
            Thread.sleep(500);
            Check.Check("Должность", test, driver);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(5)")).getText();
            Thread.sleep(500);
            Check.CheckExit("0179F1A80022AB9F954F6140530460C324\n" +
                    "с 13.12.2019 по 13.03.2020", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_OperatorCardED_Test4() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(urlSubstring + "/iit/compliance?idf=" + test2);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("div.p:nth-child(6) > span:nth-child(1)")).getText();
            Thread.sleep(500);
            Check.CheckExit("Справочную информацию об Операторе электронного документооборота ООО «ИИТ» (ИНН/КПП: 7708713259/770801001; ОГРН: 1107746079649) можно получить на сайте iit.ru, о доверенных Удостоверяющих центрах - на сайтах УЦ.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_EmailIITCardED_Test5() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(urlSubstring + "/iit/compliance?idf=" + test2);
            Thread.sleep(500);
            test = driver.findElement(By.id("mail")).getText();
            Thread.sleep(500);
            Check.CheckExit("info@iit.ru", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_CardEDCheckNewWindow_Test6() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(11, driver);
            Thread.sleep(500);
            test = String.valueOf(driver.getWindowHandles());
            test = test.substring(5,15);
            System.out.println(test);
            driver.switchTo().window(test);
            test = driver.getCurrentUrl();
            System.out.println(test);
            Thread.sleep(500);
            Check.CheckingContainsExit("10.48.0.13/iit/compliance?idf=", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}