package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.iitFirefox.userTestedo.soap.*;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import edosf.methods.Sign;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class A_SigningOfReceipts_Test1 implements Testedo {
    public WebDriver driver;
    public String test;
    public String test2;





    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            test = null;
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Подписание СЧФ с отображением квитанций в фоновом режиме.")
    void A_UPDSigningObviouslySChF_Test1() {
        try {
            EnterAndExit.loggingCerts(UPD, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Cabinet.OpenNameFolder("СЧФ 321", driver);
            Thread.sleep(1500);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(40000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Подписание СЧФ в скрытом режиме.")
    void B_UPDSigningNoObviouslySChF_Test2() {
        try {
            EnterAndExit.loggingCerts(UPD2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test2.add();
            Thread.sleep(2500);
            Cabinet.OpenNameFolder("СЧФ", driver);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(60000);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            System.out.println(test);
            Check.CheckExit("td-operator-number numbergreen", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Подписание СЧФДОП с отображением квитанций в фоновом режиме.")
    void C_UPDSigningObviouslySChFDOP_Test3() {
        try {
            EnterAndExit.loggingCerts(UPD, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);

            test = AddDocumentUPDUserASChFDop_Test3.add();
            Thread.sleep(1500);
            Cabinet.OpenNameFolder("Тест 3", driver);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(30000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Подписание СЧФДОП в скрытом режиме.")
    void D_UPDSigningNoObviouslySChFDOP_Test4() {
        try {
            EnterAndExit.loggingCerts(UPD2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChFDop_Test4.add();
            Cabinet.OpenNameFolder("УПД 123", driver);

            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(25000);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            System.out.println(test);
            Check.CheckExit("td-operator-number numbergreen", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка отсутствия формирования квитанций без подписи.")
    void E_UPDNoSigningSChF_Test5() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test5.add();
            Thread.sleep(1500);
            Cabinet.OpenNameFolder("СЧФ", driver);
            Actions builder = new Actions(driver);
            Thread.sleep(2200);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + test)).click();
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test))
            ).sendKeys(Keys.ARROW_DOWN).build().perform();
            test2 = driver.findElement(By.id("cm-sign")).getAttribute("class");
            System.out.println(test2);
            Check.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка появления надписи Напомнить мне позже.")
    void F_PushRememberMyLate_Test6() {
        try {
            EnterAndExit.loggingCerts(UPD, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Cabinet.OpenNameFolder("СЧФ 321", driver);

            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(15000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
