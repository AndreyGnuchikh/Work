package iitFirefox.User8077;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class S_NotificationAndApproval_Test19 extends iit8077 {
    WebDriver driver;
    String test, test2;
    String checkbox2;
    String check;


    @BeforeEach
    void setUP() {
        try {
            driver = Drivers.ff();
            check = "true";
            Me.Email(testIitTest2, EmailPass, driver);
            Me.Sleep(3000);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            boolean boo = driver.findElements(By.cssSelector("button.control:nth-child(2)")).size() > 0;
            System.out.println("Много писем " + boo);
            if (boo == true) {
                driver.findElement(By.cssSelector("button.control:nth-child(2)")).click();
            }

            Me.Sleep(2500);
            driver.findElement(By.id("recipient-1")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("div.b-mail-dropdown__item:nth-child(7) > a:nth-child(1)")).click();
            Me.Sleep(3000);
            ////////////////////////////////////////////////////////////////////////
            driver.get(url);
            Me.Sleep(3000);
            Me.LogPass(pass5log, pass5log, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-2\"]")).getAttribute("checked");
            if (!check.equals(checkbox2)) {
                driver.findElement(By.cssSelector("#not-2")).click();
            }
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_NotificationOpenCart_Test1() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(4000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Me.Sleep(500);

            Me.CheckExit("Согласовано", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_NotificationOpenEmail_Test2() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(2000);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();

            Me.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_NotificationOpenNoEmail_Test3() {
        try {
            Me.Sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.xpath("//*[@id=\"not-2\"]")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.Sleep(500);
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);

            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.Sleep(10000);
            Boolean Check = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            String test = "1";
            if (Check.equals(false)) {
                test = "0";
            }
            Me.CheckExit("0", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_CommentNotificationOpenCart_Test4() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест2");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Me.Sleep(500);

            Me.CheckExit("Тест2", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_SkipNotificationOpenCart_Test5() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест3");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Me.Sleep(500);

            Me.CheckExit("Воздержался", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_SkiNotificationOpenEmail_Test6() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            Me.Sleep(500);
            Me.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_SkiNotificationOpenNoEmail_Test7() {
        try {
            Me.Sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.xpath("//*[@id=\"not-2\"]")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Me.Sleep(500);
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();

            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.Sleep(10000);
            Boolean Check = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            String test = "1";
            if (Check.equals(false)) {
                test = "0";
            }
            Me.CheckExit("0", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_CommentSkiNotificationOpenEmail_Test8() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест8");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) ")).click();
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Me.Sleep(500);

            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = Me.Split(test, "документу:\n");
            Me.CheckExit("Тест8", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_CommentTextSkiNotificationOpenEmail_Test9() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест8");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3500);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = Me.Split(test, "уведомлению:\n", 11);
            System.out.println(test);
            Me.CheckingContainsExit("Отсутствует", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void J_RejectOpenCart_Test10() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Me.Sleep(500);

            Me.CheckExit("Отклонено", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_RejectOpenEmail_Test11() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.Sleep(1500);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();

            Me.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_CommentTextReject_Test12() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > input:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-text")).sendKeys("Сопроводительный");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(5000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.Exit(driver);
            Me.Email(testIitTest2, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = Me.Split(test, "уведомлению:\n", 16);
            Me.CheckExit("Сопроводительный", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(13)
    void M_CommentSendAnotherUser_Test13() {
        try {
            Me.EmailTest3(testIitTest3, EmailPass, driver);
            Me.Sleep(3000);
            if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
            } else {
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            }
            Me.Sleep(2000);
            driver.findElement(By.id("recipient-1")).click();
            Me.Sleep(1500);
            driver.findElement(By.xpath("//*[contains(text(),'Выйти из сервисов Яндекса')]")).click();
            //////////////////////////////////////////////////////////////////////////
            driver.get(url);
            Me.Sleep(3000);
            Me.LogPass(pass5log, pass5log, driver);
            Me.LogPass(pass5log, pass5log, driver);

            ////////////////////////////////////////////////////////////////////
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > input:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-text")).sendKeys("Сопроводительный");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3500);

            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.Exit(driver);
            Me.EmailTest3(testIitTest3, EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = Me.Split(test, "уведомлению:\n", 16);
            Me.CheckExit("Сопроводительный", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(14)
    void N_ResolutionOpenCart_Test14() {
        try {
            test2 = Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(10, driver);
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест14");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Me.Sleep(500);
            Me.Check("Тест14", test, driver);
            driver.findElement(By.cssSelector("#cardfileModal > div > div > div.modal-footer > button")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + test2 + " > table > tr > td.dgrid-cell.dgrid-column-comment.field-comment")).getText();
            Me.CheckExit("", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

}