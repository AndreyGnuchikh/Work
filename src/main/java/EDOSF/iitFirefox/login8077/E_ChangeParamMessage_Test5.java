package EDOSF.iitFirefox.login8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Element;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Email;
import EDOSF.methods.FileCreateAndLoading;
import OFD.methods.RetryRule;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

import static EDOSF.iitAdd.Settings.NumFail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E_ChangeParamMessage_Test5 extends iit8077 {
    private WebDriver driver;
    public String sleep;
    public String check;
    public String row;




    @BeforeEach
    void A_DelatedCheckboxs() {
        try {
            Email.DeletedCabinetMarkerAndDeletedEmail(url, pass5log, testIitTest2, EmailPass, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_SendingLetterAboutSendingFile_Test1() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(pass5log, pass5log, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-1")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            FileCreateAndLoading.AddFileAndClickMenu(12, "1.html", driver);
            Thread.sleep(3000);
            Cabinet.SendCabinet("Тест все хорошо", "Переименованный кабинет", driver);
            Thread.sleep(2000);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(500);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("Портал ЭДО ИИТ: Извещение о пересылке документа")) {
                System.out.println("Successful");
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_SendingLetterAboutReportHarmonization_Test2() {
        try {
            Date date = new Date();
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(pass5log, pass5log, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-2")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            FileCreateAndLoading.AddFileAndClickMenu(10, "1.html", driver);
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"cn-comment\"]")).sendKeys("Саглосование ", date.toString());
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(1000);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(500);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("Портал ЭДО ИИТ: Извещение о согласовании документа")) {
                System.out.println("Successful");
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();

                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_SendingLetterAboutResponsibilityPerformer_Test3() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(pass5log, pass5log, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-3")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            FileCreateAndLoading.AddFileAndClickMenu(7, "1.html", driver);
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"modalSetTrust\"]")).click();
            Thread.sleep(1000);
            Email.Email(testIitTest2, EmailPass, driver);
            Thread.sleep(1000);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(1000);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("Портал ЭДО ИИТ: Изменение ответственного исполнителя")) {
                System.out.println("Successful");
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}