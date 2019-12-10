package iitFirefox.UserTestedo;

import iitAdd.testedo;
import iitFirefox.UserTestedo.SoapTest1.*;
import iitAdd.Drivers; 
import methods.Cabinet;
import methods.EnterAndExit;
import methods.Check;
import methods.Sign;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_SigningOfReceipts_Test1 extends testedo {
    public WebDriver driver;
    public String test;

    public String test2;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            test = null;
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_UPDSigningObviouslySChF_Test1() {
        try {
            EnterAndExit.loggingCerts8080(upd, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Cabinet.OpenNameFolder("СЧФ 321", driver);
            Thread.sleep(1500);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(30000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_UPDSigningNoObviouslySChF_Test2() {
        try {
            EnterAndExit.loggingCerts8080(upd2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test2.add();
            Cabinet.OpenNameFolder("СЧФ Наименование", driver);
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

    @Test
    @Order(3)
    void C_UPDSigningObviouslySChFDOP_Test3() {
        try {
            EnterAndExit.loggingCerts8080(upd, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);

            test = AddDocumentUPDUserASChFDop_Test3.add();
            Cabinet.OpenNameFolder("Тест 3", driver);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(30000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_UPDSigningNoObviouslySChFDOP_Test4() {
        try {
            EnterAndExit.loggingCerts8080(upd2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChFDop_Test4.add();
            Cabinet.OpenNameFolder("УПД 123", driver);
            Thread.sleep(1500);
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

    @Test
    @Order(5)
    void E_UPDNoSigningSChF_Test5() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test5.add();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".dirname > a:nth-child(2)")).click();
            Actions builder = new Actions(driver);
            Thread.sleep(1500);
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

    @Test
    @Order(6)
    void F_PushRememberMyLate_Test6() {
        try {
            EnterAndExit.loggingCerts8080(upd, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Cabinet.OpenNameFolder("СЧФ 321", driver);
            Sign.SignFirstFileUDP(test, driver);
            Thread.sleep(20000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
