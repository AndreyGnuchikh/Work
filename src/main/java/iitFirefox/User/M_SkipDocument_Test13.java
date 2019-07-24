package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;

public class M_SkipDocument_Test13 {
    WebDriver driver;
    String test,test2;
    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
    }
    @Test
    public void A_SkipDocument_DOP_Test1(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#signModal-title")).getText();
        Me.Check("Подписать ЭД",test,driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        Me.CheckExit("Подписание было пропущено пользователем.",test,driver);

    }
    @Test
    public void B_SkipDocument_SchfDOP_Test2(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("3",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#signModal-title")).getText();
        Me.Check("Подписать ЭД",test,driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        Me.CheckExit("Подписание было пропущено пользователем.",test,driver);

    }
    @Test
    public void С_SkipDocument_Schf_Test3(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("1",driver);
        Actions builder2 = new Actions(driver);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
        builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true",test,driver);

    }
}
