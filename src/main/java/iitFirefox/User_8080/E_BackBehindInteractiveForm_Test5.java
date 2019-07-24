package iitFirefox.User_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import iitFirefox.User.Form.CompleteForm;
import iitFirefox.User.Form.CompleteFormAct;
import iitFirefox.User.Form.CompleteFormDopSchF;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class E_BackBehindInteractiveForm_Test5 {
    WebDriver driver;
    String test2;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

    }

    @Test
    public void A_BackBehindInteractiveFormSchF_Test1() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteForm.SCHFNoClick(driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
        System.out.println(test2);
        Me.CheckExit("Счет-фактура №  ", test2, driver);
    }

    @Test
    public void B_BackBehindInteractiveFormACT_Test2() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
        System.out.println(test2);
        Me.CheckExit("Счет-фактура №  ", test2, driver);
    }

    @Test
    public void C_BackBehindInteractiveFormSCHFDOP_Test3() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        CompleteFormDopSchF.DopSchFClick(driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(1000);

        test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
        System.out.println(test2);
        Me.CheckExit("Счет-фактура №  ", test2, driver);
    }
}
