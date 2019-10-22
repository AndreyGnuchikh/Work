package iitFirefox.User_testedo;

import iitAdd.testedo;
import iitFirefox.User_testedo.SoapTest1.*;
import iitAdd.Drivers;
import iitAdd.Me;
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
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_UPDSigningObviouslySChF_Test1() {
        try {
            Me.loggingCerts8080(upd, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Me.OpenNameFolder("СЧФ 321", driver);
            Me.Sleep(1500);
            Me.SingFirstFileUDP(test, driver);
            Me.Sleep(30000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_UPDSigningNoObviouslySChF_Test2() {
        try {
            Me.loggingCerts8080(upd2, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test2.add();
            Me.OpenNameFolder("СЧФ Наименование", driver);
            Me.SingFirstFileUDP(test, driver);
            Me.Sleep(60000);
            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            System.out.println(test);
            Me.CheckExit("td-operator-number numbergreen", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_UPDSigningObviouslySChFDOP_Test3() {
        try {
            Me.loggingCerts8080(upd, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);

            test = AddDocumentUPDUserASChFDop_Test3.add();
            Me.OpenNameFolder("Тест 3", driver);
            Me.SingFirstFileUDP(test, driver);
            Me.Sleep(30000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_UPDSigningNoObviouslySChFDOP_Test4() {
        try {
            Me.loggingCerts8080(upd2, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChFDop_Test4.add();
            Me.OpenNameFolder("УПД 123", driver);
            Me.Sleep(1500);
            Me.SingFirstFileUDP(test, driver);
            Me.Sleep(25000);
            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            System.out.println(test);
            Me.CheckExit("td-operator-number numbergreen", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_UPDNoSigningSChF_Test5() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test5.add();
            Me.Sleep(1500);
            driver.findElement(By.cssSelector(".dirname > a:nth-child(2)")).click();
            Actions builder = new Actions(driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + test)).click();
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test))
            ).sendKeys(Keys.ARROW_DOWN).build().perform();
            test2 = driver.findElement(By.id("cm-sign")).getAttribute("class");
            System.out.println(test2);
            Me.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_PushRememberMyLate_Test6() {
        try {
            Me.loggingCerts8080(upd, driver);
            Me.Sleep(1500);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            test = AddDocumentUPDUserASChF_Test1.add();
            Me.OpenNameFolder("СЧФ 321", driver);
            Me.SingFirstFileUDP(test, driver);
            Me.Sleep(20000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
            System.out.println(test);
            Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
