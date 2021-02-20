package EDOSF.iitFirefox.UserTestedo;

import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.SettingsEDOSF.testedo;
import EDOSF.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.SettingsEDOSF.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class S_NotificationAndApproval_Test19 extends testedo {
    WebDriver driver;
    String test, test2;
    String checkbox2;
    String check;





    @BeforeEach
    void setUP() {
        try {
            driver = Drivers.ff();
            check = "true";
            Email.Email(testIitTest2, EmailPass, driver);
            Thread.sleep(3000);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            boolean boo = driver.findElements(By.cssSelector("button.control:nth-child(2)")).size() > 0;
            System.out.println("Много писем " + boo);
            if (boo == true) {
                driver.findElement(By.cssSelector("button.control:nth-child(2)")).click();
            }

            Thread.sleep(2500);
            driver.findElement(By.cssSelector("span.user-account__name:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".legouser__menu-item_action_exit > span:nth-child(1)")).click();
            Thread.sleep(3000);
            ////////////////////////////////////////////////////////////////////////
            driver.get(url);
            Thread.sleep(3000);
            EnterAndExit.LogPass(pass5log, pass5log, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-2\"]")).getAttribute("checked");
            if (!check.equals(checkbox2)) {
                driver.findElement(By.cssSelector("#not-2")).click();
            }
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_NotificationOpenCart_Test1() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(4000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Thread.sleep(500);

            Check.CheckExit("Согласовано", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_NotificationOpenEmail_Test2() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();

            Check.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_NotificationOpenNoEmail_Test3() {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"not-2\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Thread.sleep(500);
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);

            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Thread.sleep(10000);
            Boolean Check = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            String test = "1";
            if (Check.equals(false)) {
                test = "0";
            }
            EDOSF.methods.Check.CheckExit("0", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_CommentNotificationOpenCart_Test4() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест2");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Thread.sleep(500);

            Check.CheckExit("Тест2", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_SkipNotificationOpenCart_Test5() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест3");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Thread.sleep(500);

            Check.CheckExit("Воздержался", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_SkiNotificationOpenEmail_Test6() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            Thread.sleep(500);
            Check.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_SkiNotificationOpenNoEmail_Test7() {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"not-2\"]")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Thread.sleep(500);
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();

            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Thread.sleep(10000);
            Boolean Check = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            String test = "1";
            if (Check.equals(false)) {
                test = "0";
            }
            EDOSF.methods.Check.CheckExit("0", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void H_CommentSkiNotificationOpenEmail_Test8() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест8");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) ")).click();
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Thread.sleep(500);

            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = HelpUser.Split(test, "документу:\n");
            Check.CheckExit("Тест8", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    void I_CommentTextSkiNotificationOpenEmail_Test9() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест8");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3500);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = HelpUser.Split(test, "уведомлению:\n", 11);
            System.out.println(test);
            Check.CheckingContainsExit("Отсутствует", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    void J_RejectOpenCart_Test10() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
            Thread.sleep(500);

            Check.CheckExit("Отклонено", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(11)
    void K_RejectOpenEmail_Test11() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Thread.sleep(1500);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();

            Check.CheckExit("Портал ЭДО ИИТ: Извещение о согласовании документа", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(12)
    void L_CommentTextReject_Test12() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > input:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-text")).sendKeys("Сопроводительный");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest2, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = HelpUser.Split(test, "уведомлению:\n", 16);
            Check.CheckExit("Сопроводительный", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(13)
    void M_CommentSendAnotherUser_Test13() {
        try {
            Email.EmailTest3(testIitTest3, EmailPass, driver);
            Thread.sleep(3000);
            if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
            } else {
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            }
            Thread.sleep(2500);
            driver.findElement(By.cssSelector("span.user-account__name:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".legouser__menu-item_action_exit > span:nth-child(1)")).click();
            Thread.sleep(3000);
            //////////////////////////////////////////////////////////////////////////
            driver.get(url);
            Thread.sleep(3000);
            EnterAndExit.LogPass(pass5log, pass5log, driver);
            EnterAndExit.LogPass(pass5log, pass5log, driver);

            ////////////////////////////////////////////////////////////////////
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > input:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-text")).sendKeys("Сопроводительный");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-confirmdeny")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест");
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3500);

            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            EnterAndExit.Exit(driver);
            Email.EmailTest3(testIitTest3, EmailPass, driver);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("innerText");
            test = HelpUser.Split(test, "уведомлению:\n", 16);
            Check.CheckExit("Сопроводительный", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(14)
    void N_ResolutionOpenCart_Test14() {
        try {
            test2 = FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(10, driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#cn-confirmpass")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#cn-comment")).sendKeys("Тест14");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("div.modal.fade.in div.modal-footer button")).click();
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(5)")).getText();
            Thread.sleep(500);
            Check.Check("Тест14", test, driver);
            driver.findElement(By.cssSelector("#cardfileModal > div > div > div.modal-footer > button")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + test2 + " > table > tr > td.dgrid-cell.dgrid-column-comment.field-comment")).getText();
            Check.CheckExit("", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}