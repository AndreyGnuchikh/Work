package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class T_OpenProtocolCompliance_Test20 implements Testedo {
    WebDriver driver;
    String test;
    String test2;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            Thread.sleep(500);
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_NameCardED_Test1() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(URL_IDF + test2);
            Thread.sleep(500);
            test = driver.findElement(By.id("file")).getText();
            Thread.sleep(500);
            Check.CheckExit("�1.html�", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_NameCardED_Test2() {
        try {
            Date date = new Date();
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(URL_IDF + test2);
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

    @RetryingTest(NUM_FAIL)
    void C_SignCardED_Test3() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            Sign.SignFirstFile(driver);
            driver.get(URL_IDF + test2);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(2)")).getText();
            Thread.sleep(500);
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(4)")).getText();
            Thread.sleep(500);
            Check.Check("���������", test, driver);
            test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(5)")).getText();
            Thread.sleep(500);
            Check.CheckExit("024789D3004BAD4FAC412678563F929C3B\n" +
                    "� 18.06.2021 �� 18.09.2021", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_OperatorCardED_Test4() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(URL_IDF + test2);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("div.p:nth-child(6) > span:nth-child(1)")).getText();
            Thread.sleep(500);
            Check.CheckExit("���������� ���������� �� ��������� ������������ ���������������� ��� ���һ (���/���: 7708713259/770801001; ����: 1107746079649) ����� �������� �� ����� iit.ru, � ���������� �������������� ������� - �� ������ ��.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_EmailIITCardED_Test5() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            driver.get(URL_IDF + test2);
            Thread.sleep(500);
            test = driver.findElement(By.id("mail")).getText();
            Thread.sleep(500);
            Check.CheckExit("info@iit.ru", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
            Check.CheckingContainsExit(URL_IDF, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}