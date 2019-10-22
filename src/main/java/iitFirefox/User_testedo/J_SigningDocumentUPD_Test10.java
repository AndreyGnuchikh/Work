package iitFirefox.User_testedo;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.testedo;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import static iitAdd.Me.Sleep;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J_SigningDocumentUPD_Test10 extends testedo {

    public WebDriver driver;
    public String test, test2, checking;


    @Test
    @Order(1)
    void A_Signing_Schf_Document_Test1() {
        try {
            setUp();
            Me.AddFile("upd\\0.xml", driver);
            Me.ClickMenuFirstElement(5, driver);
            Sleep(2500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Sleep(5000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.startEndingCertAndSendingFiles(driver);
            Me.ClickMenuFirstElement(5, driver);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Me.CheckExit("true", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_Signing_Dop_Document_Test2() {
        try {
            setUp();
            test2 = Me.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            Me.Exit(driver);

            driver.get(url);
            Me.loggingCerts8080(upd2, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(3000);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(1000);
            Me.OpenNameFolder("АКТ", driver);

            Sleep(5000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Me.SingFirstFileUDPSecondSing(test2, driver);
            String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все хорошо 2.0", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_Signing_SchfDOP_Document_Test3() {
        try {
            setUp();
            test2 = Me.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            Me.Exit(driver);
            driver.get(url);
            Me.loggingCerts8080(upd2, driver);

            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(3000);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(32000);
            Me.OpenNameFolder("УПД 123", driver);

            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Sleep(1000);
            Me.SingFirstFileUDPSecondSing(test2, driver);
            String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все хорошо 2.0", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_Signing_Schf_Error_Test4() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts8080(fio9, driver);
            Sleep(1500);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(500);
            Me.AddFile("upd\\SchfDop.xml", driver);
            Me.ClickMenuFirstElement(5, driver);
            Sleep(1500);
            test2 = driver.findElement(By.cssSelector(".resptext")).getAttribute("innerText");
            System.out.println(test2);
            Me.CheckExit("D_Signing_Schf_Error_Test4, для Вас не заполнена информация, необходимая для подписания УПД.\n" +
                    "Для добавления необходимых сведений нажмите на Ваше ФИО в правом верхнем углу Личного кабинета и заполните блок \"Настроить область полномочий\" и сохраните изменения.\n" +
                    "Либо свяжитесь с технической поддержкой ООО \"ИИТ\":\n" +
                    "e-mail: support@iit.ru\n" +
                    "тел: 8 (499) 262-24-25", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_Signing_SchfDOP_Error_Test5() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts8080(fio, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);

            Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            Me.AddFile("upd\\SchfDop.xml", driver);
            Me.ClickMenuFirstElement(5, driver);
            Sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Sleep(500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            System.out.println(test2);
            Me.CheckExit("Ошибка! В сертификате Пользователя отсутствует информация о должности", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_Signing_ErrorCertRole_Test6() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts8080(fio, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            Me.AddFile("upd\\SchfDop.xml", driver);
            Me.ClickMenuFirstElement(5, driver);
            Sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Sleep(500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            System.out.println(test2);
            Me.CheckExit("Ошибка! В сертификате Пользователя отсутствует информация о должности", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_Signing_Dop_5_seconds_Test7() {
        try {
            //Test 2 Sign With
            setUp();
            test2 = Me.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            Me.Exit(driver);
            driver.get(url);
            Me.loggingCerts8080(upd2, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(3000);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(1000);
            Me.OpenNameFolder("АКТ", driver);
            Sleep(5000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            System.out.println(test2);
            for (int i = 0; i < 20; i++) {
                Sleep(500);
                driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
                Sleep(500);
                driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
                Sleep(2000);
                Actions builder = new Actions(driver);
                driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
                Sleep(500);
                builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
                ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
                test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
                System.out.println(test);
                driver.findElement(By.id("cm-sign_text")).click();
                Sleep(500);
                if (test.equals("false")) {
                    i = 21;
                    System.out.println(i);
                }
            }
            Sleep(2500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Sleep(7500);
            String test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
            Me.CheckExit("Все документы успешно подписаны УСИЛЕННОЙ ЭП!", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_Signing_Dop_Elements_Test8() {
        try {
            setUp();
            test2 = Me.CreateFirstUPDDocumentAndSignAndSand("2", driver);
            Me.Exit(driver);
            driver.get(url);
            Me.loggingCerts8080(upd2, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(3000);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(1000);
            Me.OpenNameFolder("АКТ", driver);
            Sleep(5000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            secondSing();
            test = null;
            Sleep(500);
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Sleep(500);
            Me.Check("УПД", test, driver);
            Sleep(500);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Sleep(500);
            Me.Check("2", test, driver);
            Sleep(500);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Sleep(500);
            Me.Check("Должность 2", test, driver);
            Sleep(500);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Sleep(500);
            Me.Check("d", test, driver);
            Sleep(500);
            String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_Signing_SchfDOP_Elements_Test9() {
        try {
            setUp();
            test2 = Me.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            Me.Exit(driver);
            driver.get(url);
            Me.loggingCerts8080(upd2, driver);

            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(3000);
            Me.startEndingCertAndSendingFiles(driver);
            Sleep(32000);
            Me.OpenNameFolder("УПД 123", driver);

            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Sleep(1000);
            secondSing();
            test = null;
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Me.Check("Должность 2", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void setUp() {
        try {
            driver = Drivers.ff();
            Me.Sleep(500);
            driver.get(url);
            Me.loggingCerts8080(upd, driver);
            Sleep(1500);
            Me.RoleSwitch(2, driver);
            Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            File dir = new File("C:\\Tools\\TestFile");
            Me.DeletedFiles(dir);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void secondSing() {
        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        System.out.println(test2);

        driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Me.Sleep(6000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
    }
}
