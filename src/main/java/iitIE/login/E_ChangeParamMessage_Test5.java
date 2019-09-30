package iitIE.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class E_ChangeParamMessage_Test5 extends iit8077{
    private WebDriver driver;
    public String sleep;
    public String checkbox1, checkbox2, checkbox3;
    public String check;
    public String row;
     @BeforeEach
    void A_DelatedCheckboxs() {
        String test;
        check = "true";
        driver = Drivers.ie();
        driver.get(url);
        Me.LogPass(pass5log, pass5log, driver);
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
        Me.Email(testIitTest2, EmailPass,driver);
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
    void A_SendingLetterAboutSendingFile_Test1() {
        driver = Drivers.ie();
        driver.get(url);
        Me.LogPass(pass5log, pass5log, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#not-1")).click();
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

        //add file
        Me.AddFileAndClickMenu(12, "1.html", driver);
        driver.findElement(By.xpath("//*[@id=\"sendModal\"]/div/div/div[2]/div[2]/div/div[1]/input")).sendKeys("Тест Все хорошо");
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("div.Form-control:nth-child(2) > div:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Me.Sleep(1000);
        Me.Email(testIitTest2, EmailPass,driver);
        Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
        if (test1.equals("Портал ЭДО ИИТ: Извещение о пересылке документа")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            driver.quit();
        } else {
            driver.quit();
            Assertions.fail();
        }
    }

    @Test
    void B_SendingLetterAboutReportHarmonization_Test2() {
        Date date = new Date();
        driver = Drivers.ie();
        driver.get(url);
        Me.LogPass(pass5log, pass5log, driver);
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
        Me.Email(testIitTest2, EmailPass,driver);
        Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
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
           Assertions.fail();
        }
    }

    @Test
    void C_SendingLetterAboutResponsibilityPerformer_Test3() {
        driver = Drivers.ie();
        driver.get(url);
        Me.LogPass(pass5log, pass5log, driver);
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
        Me.Email(testIitTest2, EmailPass,driver);
        Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();

        if (test1.equals("Портал ЭДО ИИТ: Изменение ответственного исполнителя")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            driver.quit();
        } else {
            driver.quit();
           Assertions.fail();
        }
    }
}