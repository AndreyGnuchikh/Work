package iitFirefox.User;

import iitFirefox.User.SoapTest1.*;
import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class A_SigningOfReceipts_Test1 {
    public WebDriver driver;
    public String test;

    public String test2;


    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        test = null;
    }

    @Test
    public void A_UPDSigningObviouslySChF_Test1() {

        Me.loggingCerts(p.upd, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        test = AddDocumentUPDUserASChF_Test1.add();
        driver.findElement(By.cssSelector(".directory > a:nth-child(1)")).click();
        Me.Sleep(2500);
        //If we use folder we need find element by xpath and found for contains
        driver.findElement(By.xpath("//*[contains(text(), 'СЧФ 321')]")).click();
        Me.Sleep(1500);
        Me.SingFirstFileUDP(test, driver);
        Me.Sleep(30000);
        driver.findElement(By.cssSelector(".active-file")).click();
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
        System.out.println(test);
        Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
    }

    @Test
    public void B_UPDSigningNoObviouslySChF_Test2() {
        Me.loggingCerts(p.upd2, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        test = AddDocumentUPDUserASChF_Test2.add();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".directory > a:nth-child(1)")).click();
        Me.Sleep(1500);

        driver.findElement(By.xpath("//*[contains(text(), 'СЧФ Наименование')]")).click();
        Me.SingFirstFileUDP(test, driver);
        Me.Sleep(60000);
        Me.ClickMenuFirstElement(9, driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        System.out.println(test);
        Me.CheckExit("td-operator-number numbergreen", test, driver);
    }

    @Test
    public void C_UPDSigningObviouslySChFDOP_Test3() {
        Me.loggingCerts(p.upd, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

        test = AddDocumentUPDUserASChFDop_Test3.add();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".directory > a:nth-child(1)")).click();
        Me.Sleep(1500);

        driver.findElement(By.xpath("//*[contains(text(), 'Тест 3')]")).click();
        Me.Sleep(500);
        Me.SingFirstFileUDP(test, driver);
        Me.Sleep(30000);
        driver.findElement(By.cssSelector(".active-file")).click();
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
        System.out.println(test);
        Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
    }

    @Test
    public void D_UPDSigningNoObviouslySChFDOP_Test4() {
        Me.loggingCerts(p.upd2, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        test = AddDocumentUPDUserASChFDop_Test4.add();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".directory > a:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), 'УПД 123')]")).click();
        Me.Sleep(1500);
        Me.SingFirstFileUDP(test, driver);
        Me.Sleep(25000);
        Me.ClickMenuFirstElement(9, driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        System.out.println(test);
        Me.CheckExit("td-operator-number numbergreen", test, driver);
    }

    @Test
    public void E_UPDNoSigningSChF_Test5() {
        Me.LogPass(p.q9log1, p.q9pass1, driver);
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
    }

    @Test
    public void F_PushRememberMyLate_Test6() {
        Me.loggingCerts(p.upd, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        test = AddDocumentUPDUserASChF_Test1.add();
        driver.findElement(By.cssSelector(".directory > a:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), 'СЧФ 321')]")).click();
        Me.SingFirstFileUDP(test, driver);
        Me.Sleep(20000);
        driver.findElement(By.cssSelector(".active-file")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".active-file")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > b:nth-child(1)")).getText();
        System.out.println(test);
        Me.CheckExit("У вас есть неподписанные квитанции для следующих документов:", test, driver);
    }
}
