package iitFirefox.UserTestedo;

import iitAdd.Drivers;
import iitAdd.testedo;
import methods.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J_SigningDocumentUPD_Test10 extends testedo {

    public WebDriver driver;
    public String test, test2, checking;


    @Test
    @Order(1)
    void A_Signing_Schf_Document_Test1() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\0.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("true", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_Signing_Dop_Document_Test2() {
        try {
            setUp();
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            EnterAndExit.Exit(driver);

            driver.get(url);
            EnterAndExit.loggingCerts(upd2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(3000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(1000);
            Cabinet.OpenNameFolder("АКТ", driver);
            Thread.sleep(5200);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Sign.SignFirstFileUDPSecondSign(test2, driver);
            String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все хорошо 2.0", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_Signing_SchfDOP_Document_Test3() {
        try {
            setUp();
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            EnterAndExit.Exit(driver);
            driver.get(url);
            EnterAndExit.loggingCerts(upd2, driver);

            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(3000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            HelpUser.sleepUpd();
            Cabinet.OpenNameFolder("УПД 123", driver);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            Sign.SignFirstFileUDPSecondSign(test2, driver);
            String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все хорошо 2.0", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_Signing_Schf_Error_Test4() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(fio9, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(500);
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("innerText");
            System.out.println(test2);
            Check.CheckingContainsExit(", для Вас не заполнена информация, необходимая для подписания УПД. Для добавления необходимых сведений нажмите на Ваше ФИО в правом верхнем углу Личного кабинета и заполните блок \"Настроить область полномочий\" и сохраните изменения. Либо свяжитесь с технической поддержкой ООО \"ИИТ\": e-mail: support@iit.ru тел: 8 (499) 262-24-25", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_Signing_SchfDOP_Error_Test5() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(fio, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);

            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            System.out.println(test2);
            Check.CheckExit("9: Ошибка! У Вас отсутствует допуск для подписания формализованных документов", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_Signing_ErrorCertRole_Test6() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(fio, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            System.out.println(test2);
            Check.CheckExit("9: Ошибка! У Вас отсутствует допуск для подписания формализованных документов", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_Signing_Dop_5_seconds_Test7() {
        try {
            //Test 2 Sign With
            setUp();
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            EnterAndExit.Exit(driver);
            driver.get(url);
            EnterAndExit.loggingCerts(upd2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(3000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(1000);
            Cabinet.OpenNameFolder("АКТ", driver);
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            System.out.println(test2);
            for (int i = 0; i < 20; i++) {
                Thread.sleep(500);
                driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
                Thread.sleep(500);
                driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
                Thread.sleep(2000);
                Actions builder = new Actions(driver);
                driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
                Thread.sleep(500);
                builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
                ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
                test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
                System.out.println(test);
                driver.findElement(By.id("cm-sign_text")).click();
                Thread.sleep(500);
                if (test.equals("false")) {
                    i = 21;
                    System.out.println(i);
                }
            }
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(7500);
            String test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
            Check.CheckExit("Все документы успешно подписаны УСИЛЕННОЙ ЭП!", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_Signing_Dop_Elements_Test8() {
        try {
            setUp();
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            EnterAndExit.Exit(driver);
            driver.get(url);
            EnterAndExit.loggingCerts(upd2, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(3000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(1000);
            Cabinet.OpenNameFolder("АКТ", driver);
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            secondSign();
            test = null;
            Thread.sleep(1000);
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Thread.sleep(1000);
            Check.Check("УПД", test, driver);
            Thread.sleep(500);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Thread.sleep(500);
            Check.CheckingContains("Должность", test, driver);
            Thread.sleep(500);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Thread.sleep(500);
            Check.Check("d", test, driver);
            Thread.sleep(500);
            String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Check.CheckExit("Замечаний нет", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_Signing_SchfDOP_Elements_Test9() {
        try {
            setUp();
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            EnterAndExit.Exit(driver);
            driver.get(url);
            EnterAndExit.loggingCerts(upd2, driver);

            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(3000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            HelpUser.sleepUpd();
            Cabinet.OpenNameFolder("УПД 123", driver);

            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            secondSign();
            Thread.sleep(1500);
            test = null;
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Check.Check("УПД", test, driver);

            test = driver.findElement(By.id("position")).getAttribute("value");
            Check.CheckingContains("Должность", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Check.Check("d", test, driver);
            String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Check.CheckExit("Замечаний нет", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void setUp() {
        try {
            driver = Drivers.ff();
            Thread.sleep(500);
            driver.get(url);
            Thread.sleep(500);
            EnterAndExit.loggingCerts(upd, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            File dir = new File("C:\\Tools\\TestFile");
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void secondSign() throws InterruptedException {
        Actions builder = new Actions(driver);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        System.out.println(test2);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
        Thread.sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Thread.sleep(500);
    }
}
