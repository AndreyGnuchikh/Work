package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.Element;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Email;
import edosf.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class E_ChangeParamMessage_Test5 implements Iit8077 {
    private WebDriver driver;
    public String sleep;
    public String check;
    public String row;




    @BeforeEach
    void A_DelatedCheckboxs() {
        try {
            Email.DeletedCabinetMarkerAndDeletedEmail(URL, PASS_5_LOG, TEST_IIT_TEST2, EMAIL_PASS, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка получения письма: Извещение о пересылке документа")
    void A_SendingLetterAboutSendingFile_Test1() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass(PASS_5_LOG, PASS_5_LOG, driver);
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
            Email.Email(TEST_IIT_TEST2, EMAIL_PASS, driver);
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

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка получения письма: Извещение о согласовании документа")
    void B_SendingLetterAboutReportHarmonization_Test2() {
        try {
            Date date = new Date();
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass(PASS_5_LOG, PASS_5_LOG, driver);
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
            Email.Email(TEST_IIT_TEST2, EMAIL_PASS, driver);
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

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка получения письма: Изменение ответственного исполнителя")
    void C_SendingLetterAboutResponsibilityPerformer_Test3() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass(PASS_5_LOG, PASS_5_LOG, driver);
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
            Email.Email(TEST_IIT_TEST2, EMAIL_PASS, driver);
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