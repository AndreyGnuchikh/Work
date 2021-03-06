package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import edosf.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class P_OpenCardsDocuments_Test16 implements Testedo {
    WebDriver driver;
    String test, test2;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_OpenCardFirstBlock_Test1() {
        try {
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-fname")).getText();
            Thread.sleep(500);
            Check.Check("1.html", test, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#cf-creator")).getText();
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#cf-perf")).getText();
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#cf-date")).getText();
            test = test.substring(0, 10);
            Check.Check(dateFormat.format(currentDate), test, driver);
            dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(2)")).getText();
            test = test.substring(0, 10);
            Check.Check(dateFormat.format(currentDate), test, driver);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Check.Check("�����������", test, driver);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(3)")).getText();
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(4)")).getText();
            Check.CheckExit("�", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_OpenCardSecondBlock_Test2() {
        try {
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            System.out.println(dateFormat.format(currentDate));
            FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            Cabinet.OpenNameFolder("���", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            //Second
            test = driver.findElement(By.cssSelector("#cf-fname")).getText();
            Thread.sleep(500);
            Check.Check("Dop.xml", test, driver);
            test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(4)")).getText();
            test = test.substring(0, 10);
            Thread.sleep(500);
            Check.Check(dateFormat.format(currentDate), test, driver);
            test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(3)")).getText();
            Check.Check("���������", test, driver);
            test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Check.CheckExit("024789D3004BAD4FAC412678563F929C3B\n" +
                    "� 18.06.2021 �� 18.09.2021", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_OpenCardThirdBlock_Test3() {
        try {
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            Cabinet.OpenNameFolder("���",driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(2500);
            //Third
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(2)")).getText();
            test = test.substring(0, 10);
            Thread.sleep(500);
            Check.Check(dateFormat.format(currentDate), test, driver);
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Check.Check("����������", test, driver);
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(3)")).getText();
            Check.Check("���� ��� ������", test, driver);
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(4)")).getText();
            Check.CheckingContains("��� 1", test, driver);
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Check.Check("��� ������ 2,0", test, driver);
            test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(6)")).getText();
            Check.CheckExit("������ ������", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_OpenCardComments_Test4() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys("����");
            driver.findElement(By.cssSelector("#cf-sendcomm")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-comm")).getText();
            Thread.sleep(1000);
            Check.Check("����", test, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys("����");
            driver.findElement(By.cssSelector("#cf-sendcomm")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-comm")).getText();
            Thread.sleep(500);
            Check.CheckExit("����; ����", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_OpenCardDoubleClick_Test5() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            String row = null;
            Thread.sleep(2500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            System.out.println(row);
            Thread.sleep(1500);
            WebElement element = driver.findElement(By.cssSelector("#grid-basic2-row-" + row));
            new Actions(driver).doubleClick(element).perform(); // ��� build()
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-fname")).getText();
            Check.CheckExit("1.html", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
