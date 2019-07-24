package iitFirefox.login_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class E_ChangeParamMessage_Test5 {
    private WebDriver driver;
    public String sleep;
    public String checkbox1, checkbox2, checkbox3;
    public String check;
    public String row;
    @Before
    public void A_DelatedCheckboxs() {
        String test;
        check = "true";
        driver = Drivers.ff();
        driver.get(p8080.url3);
        Me.LogPass(p8080.pass5log, p8080.pass5log, driver);
        Me.startEndingCertAndSendingFiles(driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        checkbox1 = driver.findElement(By.xpath("//*[@id=\"not-1\"]")).getAttribute("checked");
        checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-2\"]")).getAttribute("checked");
        checkbox3 = driver.findElement(By.xpath("//*[@id=\"not-3\"]")).getAttribute("checked");
        if (check.equals(checkbox1)) {
            driver.findElement(By.cssSelector("#not-1")).click();
        }
        if (check.equals(checkbox2)) {
            driver.findElement(By.cssSelector("#not-2")).click();
        }
        if (check.equals(checkbox3)) {
            driver.findElement(By.cssSelector("#not-3")).click();
        }
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1000);
        Me.Email(driver);
        Me.Sleep(4000);
        if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
        } else {
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
        }
        driver.quit();
    }

    @Test
    public void A_SendingLetterAboutSendingFile_Test1() {
        driver = Drivers.ff();
        driver.get(p8080.url3);
        Me.LogPass(p8080.pass5log, p8080.pass5log, driver);
        Me.startEndingCertAndSendingFiles(driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#not-1")).click();
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

        //add file
        Me.AddFileAndClickMenu(12, "1.html", driver);
        driver.findElement(By.xpath("//*[@id=\"sendModal\"]/div/div/div[2]/div[2]/div/div[1]/input")).sendKeys("АО АИСА ИТ-Сервис");
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("div.form-control:nth-child(2) > div:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Me.Sleep(1000);
        Me.Email(driver);
        Me.visibleElement60SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        Me.Sleep(500);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
        System.out.println(test1);
        if (test1.equals("Портал ЭДО ИИТ: Извещение о пересылке документа")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            driver.quit();
        } else {
            driver.quit();
            Assert.fail();
        }
    }

    @Test
    public void B_SendingLetterAboutReportHarmonization_Test2() {
        Date date = new Date();
        driver = Drivers.ff();
        driver.get(p8080.url3);
        Me.LogPass(p8080.pass5log, p8080.pass5log, driver);
        Me.startEndingCertAndSendingFiles(driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#not-2")).click();
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

        //add file
        Me.AddFileAndClickMenu(10, "1.html", driver);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"cn-comment\"]")).sendKeys("Саглосование ", date.toString());
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#modalSendConfirm")).click();
        Me.Sleep(1000);
        Me.Email(driver);
        Me.visibleElement60SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        Me.Sleep(500);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
        System.out.println(test1);
        if (test1.equals("Портал ЭДО ИИТ: Извещение о согласовании документа")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();

            driver.quit();
        } else {
            driver.quit();
            Assert.fail();
        }
    }

    @Test
    public void C_SendingLetterAboutResponsibilityPerformer_Test3() {
        driver = Drivers.ff();
        driver.get(p8080.url3);
        Me.LogPass(p8080.pass5log, p8080.pass5log, driver);
        Me.startEndingCertAndSendingFiles(driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#not-3")).click();
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

        //add file
        Me.AddFileAndClickMenu(7, "1.html", driver);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"modalSetTrust\"]")).click();
        Me.Sleep(1000);
        Me.Email(driver);
        Me.visibleElement60SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        Me.Sleep(500);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
        System.out.println(test1);
        if (test1.equals("Портал ЭДО ИИТ: Изменение ответственного исполнителя")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            driver.quit();
        } else {
            driver.quit();
            Assert.fail();
        }
    }
}