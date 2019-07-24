package iitFirefox.User;

import iitAdd.Drivers;

import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class S_NotificationAndApproval_Test19 {
    WebDriver driver;
    String test,test2;
    String checkbox2;
    String check;


    @Before
    public void setUP(){
        driver = Drivers.ff();
        check = "true";
        driver.get(p.url3);
        Me.LogPass(p.pass5log, p.pass5log, driver);
        Me.startEndingCertAndSendingFiles(driver);

        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-2\"]")).getAttribute("checked");
        if (check.equals(checkbox2)) {
            driver.findElement(By.cssSelector("#not-2")).click();
        }
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        Me.Sleep(500);
        Me.Exit(driver);
        Me.Sleep(1000);
        Me.Email(driver);
        Me.Sleep(2000);
        if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
        } else {
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
        }
        Me.Sleep(2000);
        driver.findElement(By.id("recipient-1")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("div.b-mail-dropdown__item:nth-child(7) > a:nth-child(1)")).click();
        ////////////////////////////////////////////////////////////////////////
        driver.get(p.url3);
        Me.Sleep(3000);
        Me.LogPass(p.pass5log, p.pass5log, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.xpath("//*[@id=\"not-2\"]")).click();
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(10,driver);
    }
    @Test
    public void A_NotificationOpenCart_Test1(){
     Me.Sleep(1000);
     driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
     driver.findElement(By.cssSelector("#modalSendConfirm")).click();
     Me.Sleep(3000);
     driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    Me.ClickMenuFirstElement(8,driver);
    Me.Sleep(500);
    test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
        Me.Sleep(500);
    Me.CheckExit("Согласовано",test,driver);
    }
    @Test
    public void B_NotificationOpenEmail_Test2(){
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
        driver.findElement(By.cssSelector("#modalSendConfirm")).click();
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        Me.Exit(driver);
        Me.Email(driver);
    }

}
