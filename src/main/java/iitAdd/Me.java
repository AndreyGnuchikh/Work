package iitAdd;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static java.lang.Runtime.getRuntime;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


public class Me {


    //SetUp ===========================================================================================================

    // logging log1log pass driver
    public static void LogPass(String login, String pass, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        System.out.println("Password: " + pass);
        Sleep(200);
        driver.findElement(By.xpath("//*[@id=\"username-login8077\"]")).sendKeys(login);
        Sleep(200);
        driver.findElement(By.xpath("//*[@id=\"passwordfield\"]")).sendKeys(pass);
        Sleep(200);
        driver.findElement(By.className("auth__button")).click();
        Sleep(2000);
    }

    // loggingCerts logCert driver
    public static void loggingCerts(String login, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        Sleep(1500);
        driver.findElement(By.className("auth__tab-item--right")).click();
        Me.WaitElementToBeClickableAndClick(1, "//*[@id=\"keyModal_body\"]/option[" + login + "]", driver);
        Sleep(500);
        driver.findElement(By.className("btnSelectKey")).click();
        Sleep(6000);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        if (!url.equals(iit8077.urlsert)) {
            String test;
            Sleep(1000);
            test = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).getAttribute("clientTop");
            Sleep(1000);
            if (test.equals("1")) {
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).click();
            }
            Sleep(5000);

        }

    }

    public static void loggingCerts8080(String login, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        Sleep(1200);
        driver.findElement(By.className("auth__tab-item--right")).click();
        Me.WaitElementToBeClickableAndClick(1, "//*[@id=\"keyModal_body\"]/option[" + login + "]", driver);
        Sleep(1000);
        driver.findElement(By.className("btnSelectKey")).click();
        Sleep(6000);
        String url = driver.getCurrentUrl();
        if (!url.equals(testedo.urlsert)) {
            String test;
            Sleep(400);
            test = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).getAttribute("clientTop");
            Sleep(400);
            if (test.equals("1")) {
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).click();
            }
            Sleep(5000);
        }
    }

    public static void RoleSwitch(int i, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        switch (i) {
            case 1:
                // One
                System.out.println("Role:" + i);
                Sleep(1000);
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
            case 2:
                // Two
                System.out.println("Role:" + i);
                Sleep(1500);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                Sleep(1000);
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(2)")).click();
                Sleep(500);
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
            case 3:
                System.out.println("Role:" + i);
                // Three
                Sleep(1000);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(3)")).click();
                Sleep(1000);
                driver.findElement(By.cssSelector("#selectRole")).click();
                Sleep(1000);
                driver.findElement(By.xpath("/html/body/main/section/div/div[2]/Form/div[2]/div/div/span/span[1]/span")).click();
                Sleep(1000);
                driver.findElement(By.cssSelector("li.select2-results__option:nth-child(1)")).click();
                driver.findElement(By.cssSelector("#enter")).click();
                break;
            case 4:
                System.out.println("Role:" + i);
                // Four
                Sleep(500);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(4)")).click();
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
        }
    }

    public static void startEndingCertAndSendingFiles(WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        if (driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).isDisplayed()) {
            Sleep(500);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Sleep(2000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Sleep(5000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            System.out.println("receipts signing");
        }
        if (driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).isDisplayed()) {
            driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
            Sleep(1000);
        }
    }
    //SetUp ============================================================================================================

    //Check /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Checking  whatHave whatGet driver
    public static void CheckExit(String textStringForTest, String checking, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Request  " + textStringForTest);
        System.out.println("Response " + checking);
        if (checking.equals(textStringForTest)) {
            System.out.println("Test is Successful");
            driver.quit();
            assertTrue(true);
        } else {
            driver.quit();
            fail("Test is Failing.");
        }
    }

    // Checking  whatHave whatGet driver //Don't  driver.quit();
    public static void Check(String test, String checking, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Request  " + test);
        System.out.println("Response " + checking);
        if (checking.equals(test)) {
            System.out.println(test);
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }

    public static void Catch(WebDriver driver, Throwable e) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.quit();
        e.printStackTrace();
        Assertions.fail();
    }

    public static void CheckingContains(String test, String checking, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }

    public static void CheckingContainsExit(String test, String checking, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");
            driver.quit();
        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }
    //Check ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Sleep number_)
    public static void Sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void SleepUpd() {
        try {
            Thread.sleep(Settings.ToWaitUpd);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html
    public static void WaitElementToBeClickableAndClick(String link, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(link))));
        Sleep(500);
        driver.findElement(By.cssSelector(link)).click();
    }

    public static void WaitElementToBeClickableAndClick(int xpath, String link, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(link))));
        Sleep(500);
        driver.findElement(By.xpath(link)).click();
    }

    //Email sleep
    public static void Email(String email, String pass, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        Sleep(1000);

        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className(".button2_theme_normal")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className(".button2_theme_normal")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login8077")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            Me.Sleep(500);
            driver.findElement(By.id("passp-field-login8077")).sendKeys(email);
            Me.Sleep(500);
            driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            Sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(pass);
            Sleep(1500);
            driver.findElement(By.cssSelector(".button2")).click();
        } else {
            Sleep(1500);
            isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            System.out.println("Только Пароль " + isPresentPass);
            if (isPresentPass) {
                Sleep(1000);
                driver.findElement(By.id("passp-field-passwd")).sendKeys(pass);
                Sleep(1000);
                driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            }
        }

    }

    public static void EmailTest3(String testIitTest3, String EmailPass, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal, SecondPart;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        SecondPart = driver.findElements(By.xpath("//*[contains(text(),'testiit.test3')]")).size() > 0;
        System.out.println("Выбор Тест 3 " + SecondPart);
        if (SecondPart) {
            driver.findElement(By.xpath("//*[contains(test(),'testiit.test3')]")).click();
        }

        Sleep(1000);
        SecondPart = driver.findElements(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).size() > 0;
        System.out.println(SecondPart);
        if (SecondPart) {
            driver.findElement(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).click();
        }

        Sleep(1000);
        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className(".button2_theme_normal")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className(".button2_theme_normal")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login8077")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            driver.findElement(By.id("passp-field-login8077")).sendKeys(testIitTest3);
            driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            Sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".button2")).click();
            Sleep(1500);
        }
        isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
        System.out.println("Только Пароль " + isPresentPass);
        if (isPresentPass) {
            driver.findElement(By.id("passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".button2")).click();
        }
    }

    public static void EmailTest4(String testIitTest4, String EmailPass, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal, SecondPart;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        SecondPart = driver.findElements(By.xpath("//*[contains(text(),'testiit.test4')]")).size() > 0;
        System.out.println("Выбор Тест 4 " + SecondPart);
        if (SecondPart) {
            driver.findElement(By.xpath("//*[contains(text(),'testiit.test4')][contains(@class, 'passp-account-list-item__login')]")).click();
        }

        Sleep(1000);
        SecondPart = driver.findElements(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).size() > 0;
        System.out.println(SecondPart);
        if (SecondPart) {
            driver.findElement(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).click();
        }

        Sleep(1000);
        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className(".button2_theme_normal")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className(".button2_theme_normal")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login8077")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            driver.findElement(By.id("passp-field-login8077")).sendKeys(testIitTest4);
            driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            Sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".button2")).click();
            Sleep(1500);
        }
        isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
        System.out.println("Только Пароль " + isPresentPass);
        if (isPresentPass) {
            driver.findElement(By.id("passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".button2")).click();
        }
    }

    public static void visibleElement180SecToWait(String link, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            if (i == 2 || i == 28) {
                driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
                System.out.println("F5");
            }
            boolean bool = driver.findElements(By.cssSelector(link)).size() > 0;
            if (!bool) {
                Sleep(1000);
            } else {
                i = 31;
            }

        }
    }

    public static void visibleElement180SecToWait(Integer sec, String link, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (int i = 0; i < sec; i++) {
            System.out.println(i);
            if (i == 2 || i == 28) {
                driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
                System.out.println("F5");
            }
            boolean bool = driver.findElements(By.cssSelector(link)).size() > 0;
            if (!bool) {
                Sleep(1000);
            } else {
                i = 31;
            }

        }
    }

    public static void MenuAdmin(int i, String string, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Sleep(500);
        builder.contextClick(driver.findElement(By.xpath(string))).sendKeys(
                Keys.ARROW_DOWN).build().perform();

        switch (i) {
            case 1:
                driver.findElement(By.id("user-info_text")).click();
                break;
            case 2:
                driver.findElement(By.id("user-corinfo")).click();
                break;
            case 3:
                driver.findElement(By.id("user-updatecert")).click();
                break;
            case 4:
                driver.findElement(By.id("user-changepass")).click();
                break;
            case 5:
                driver.findElement(By.id("user-delete")).click();
                break;
        }
        Sleep(500);
    }

    //Add and Signing --------------------------------------------------------------------------------------------------
    public static void SingFirstFile(WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String row;
        Sleep(2500);
        // Click and found first element
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Actions builder = new Actions(driver);
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Sleep(500);
        driver.findElement(By.id("cm-sign_text")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(10000);
    }

    public static void SingFirstFileUDP(String row, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Sleep(4000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(10000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        startEndingCertAndSendingFiles(driver);
    }

    public static void SingFirstFileUDPSecondSing(String row, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Sleep(4000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("2");
        Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
        Sleep(7000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(500);
        startEndingCertAndSendingFiles(driver);
    }

    public static String AddFile(String fileName, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file
        String row;
        Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Sleep(2500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Sleep(200);
        System.out.println(fileName);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        // Click and found first element
        Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        Sleep(800);
        row = row.substring(0, 36);
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        return row;
    }

    public static void AddFileUPDError(String fileName, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file UPD Error
        Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Sleep(200);
        upload.sendKeys("C:\\Tools\\upd\\" + fileName);
        Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Sleep(3000);
    }

/*    public static void AddFileUPDError8080(String fileName, WebDriver driver) {
        System.out.println("-----Start method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file UPD Error
        Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Sleep(200);
        upload.sendKeys("C:\\Tools\\upd8080\\" + fileName);
        Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Sleep(3000);
    }*/

    public static String AddFileAndClickMenu(int NumButtonsMenu, String fileName, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file
        String row;
        Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Sleep(200);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Sleep(3500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        // Click and found first element
        Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Sleep(500);
        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке

                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                DeletedFiles(dir);

                driver.findElement(By.id("cm-open_text")).click();
                break;
            case (3):
                driver.findElement(By.id("cm-edit_text")).click();
                break;
            case (4):
                driver.findElement(By.id("cm-rename_text")).click();
                break;
            case (5):
                driver.findElement(By.id("cm-sign_text")).click();
                break;
            case (6):
                Sleep(500);
                driver.findElement(By.id("cm-download_text")).click();
                break;
            case (7):
                driver.findElement(By.id("cm-trust_text")).click();
                break;
            case (8):
                driver.findElement(By.id("cm-card_text")).click();
                break;
            case (9):
                driver.findElement(By.id("cm-operator_text")).click();
                break;
            case (10):
                driver.findElement(By.id("cm-apply_text")).click();
                break;
            case (11):
                driver.findElement(By.id("compliance-protocol_accel")).click();
                break;
            case (12):
                driver.findElement(By.id("cm-send_text")).click();
                break;
            case (13):
                driver.findElement(By.id("cm-folder_accel")).click();
                break;
            case (14):
                driver.findElement(By.id("cm-del-full_text")).click();
                break;
        }


        return row;
    }

    public static String CreateFirstUPDDocumentAndSign(String upd, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // 1 SchF 2 DOP 3 SchFDOP
        String test2;
        switch (upd) {
            case ("1"):
                upd = "upd\\0.xml";
                break;
            case ("2"):
                upd = "upd\\Dop.xml";
                break;
            case ("3"):
                upd = "upd\\SchfDop.xml";
                break;
        }
        test2 = AddFile(upd, driver);
        ClickMenuFirstElement(5, driver);

        Sleep(4000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(6000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Sleep(15000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Sleep(1500);
            startEndingCertAndSendingFiles(driver);
        }
        return test2;
    }

    public static String CreateFirstUPDDocumentAndSignAndSand(String upd, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // 1 SchF 2 DOP 3 SchFDOP
        String test, test2;
        switch (upd) {
            case ("1"):
                upd = "upd\\0.xml";
                break;
            case ("2"):
                upd = "upd\\Dop.xml";
                break;
            case ("3"):
                upd = "upd\\SchfDop.xml";
                break;
        }
        test2 = AddFile(upd, driver);
        ClickMenuFirstElement(5, driver);
        Me.Sleep(5000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Sleep(12000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Sleep(1500);
            startEndingCertAndSendingFiles(driver);
        }
        ClickMenuFirstElement(12, driver);
        Sleep(1500);
        SendCabinet("Все хорошо 2", "Все хорошо 2.0", "Андрей Андрей", driver);
        return test2;
    }

    public static String CreateFirstUDPDocumentAndSignOneAndTwo(String url, String upd2, String upd, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // 1 SchF 2 DOP 3 SchFDOP
        String test, row;
        switch (upd) {
            case ("1"):
                upd = "upd\\0.xml";
                break;
            case ("2"):
                upd = "upd\\Dop.xml";
                break;
            case ("3"):
                upd = "upd\\SchfDop.xml";
                break;
            case ("4"):
                upd = "upd\\IPSchfDop.xml";
                break;
        }
        row = AddFile(upd, driver);
        ClickMenuFirstElement(5, driver);

        Sleep(4200);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(6000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Sleep(12000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Sleep(1500);
            startEndingCertAndSendingFiles(driver);
        }
        ClickMenuFirstElement(12, driver);
        Sleep(2000);
        SendCabinet("Все хорошо 2", "Все хорошо 2.0", driver);
        Me.Sleep(500);
        Exit(driver);
        driver.get(url);
        loggingCerts(upd2, driver);
        RoleSwitch(2, driver);
        startEndingCertAndSendingFiles(driver);
        Sleep(1500);


        switch (upd) {
            case ("upd\\0.xml"):
                OpenNameFolder("СЧФ Наименование", driver);
                break;
            case ("upd\\Dop.xml"):
                OpenNameFolder("АКТ", driver);
                break;
            case ("upd\\SchfDop.xml"):
            case ("upd\\IPSchfDop.xml"):
                Me.Sleep(500);
                OpenNameFolder("УПД 123", driver);
                break;
        }
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Sleep(1000);
        if (!upd.equals("upd\\0.xml")) {
            for (int i = 0; i < 20; i++) {
                Sleep(500);
                driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
                Sleep(500);
                driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
                Sleep(2000);
                Actions builder2 = new Actions(driver);
                Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
                Sleep(500);
                builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
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
            Sleep(5000);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();

        }
        return row;
    }

    //Add and Signing --------------------------------------------------------------------------------------------------

    public static String ClickMenuFirstElement(int NumButtonsMenu, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String row;
        Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(2000);
        Me.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Me.Sleep(1000);
        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке
                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                DeletedFiles(dir);

                driver.findElement(By.id("cm-open_text")).click();
                break;
            case (3):
                driver.findElement(By.id("cm-edit_text")).click();
                break;
            case (4):
                driver.findElement(By.id("cm-rename_text")).click();
                break;
            case (5):
                driver.findElement(By.id("cm-sign_text")).click();
                break;
            case (6):
                driver.findElement(By.id("cm-download_text")).click();
                break;
            case (7):
                driver.findElement(By.id("cm-trust_text")).click();
                break;
            case (8):
                driver.findElement(By.id("cm-card_text")).click();
                break;
            case (9):
                driver.findElement(By.id("cm-operator_text")).click();
                break;
            case (10):
                driver.findElement(By.id("cm-apply_text")).click();
                break;
            case (11):
                driver.findElement(By.id("compliance-protocol_text")).click();
                break;
            case (12):
                driver.findElement(By.id("cm-send_text")).click();
                break;
            case (13):
                driver.findElement(By.id("cm-folder_text")).click();
                break;
            case (14):
                driver.findElement(By.id("cm-del-full_text")).click();
                break;

        }
        Me.Sleep(500);
        return row;
    }

    public static String Krutilka(String str, Integer number) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String rerurningTest = null;
        String[] dre = new String[500];
        for (int i = 0; i < 1; i++) {
            String[] vals = str.split(">");
            for (String s : vals) {
                i++;
                dre[i] = s;
                System.out.println(i + " " + dre[i]);
            }
            rerurningTest = dre[number];

        }
        return rerurningTest;
    }

    public static void DeletedFiles(File dir) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

    public static void Exit(WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
        Sleep(1000);
    }

    // return Number List or Path file
    public static String ReZip(Integer numElementsFileList) throws IOException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(2000);
        String NameFile, test, out;
        File dir = new File("C:\\Tools\\TestFile");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        Sleep(1000);
        NameFile = lst.get(0).toString();
        NameFile = NameFile.substring(18);
        System.out.println(NameFile);
        test = "C:\\Program Files\\7-Zip\\7z.exe e C:\\Tools\\TestFile\\" + NameFile + " -o\"C:\\Tools\\TestFile\\\"";
        System.out.println(test);
        getRuntime().exec(test);
        Sleep(3500);
        File dir2 = new File("C:\\Tools\\TestFile");
        File[] arrFiles2 = dir2.listFiles();
        List<File> lst2 = Arrays.asList(arrFiles2);
        if (lst2.size() <= 2) {
            for (File file : lst2) {
                System.out.println(file);
            }
            out = lst2.get(numElementsFileList).toString();
        } else {
            int num = lst2.size();
            out = Integer.toString(num);
        }

        return out;
    }

    public static String Time() {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Date currentDate = new Date();
        SimpleDateFormat dateFormat;

        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        System.out.println("Constructor 4: " + dateFormat.format(currentDate));
        return dateFormat.format(currentDate);
    }

    public static void DeletedCabinetMarkerAndDeletedEmail(String url, String pass5log, String EmailName, String EmailPass, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String checkbox1, checkbox2, checkbox3;
        String check;
        check = "true";
        driver = Drivers.ff();
        driver.get(url);
        Me.Sleep(1000);
        LogPass(pass5log, pass5log, driver);
        Me.Sleep(2000);
        startEndingCertAndSendingFiles(driver);

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
        Sleep(1000);
        Email(EmailName, EmailPass, driver);
        Sleep(4500);
        DeletedEmail(driver);
        driver.quit();
    }

    public static void DeletedEmail(WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Me.Sleep(1500);
        if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
            System.out.println("isEnabled");
        } else {
            Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            boolean boo = driver.findElements(By.cssSelector("button.control:nth-child(2)")).size() > 0;
            System.out.println("Много писем " + boo);
            if (boo) {
                driver.findElement(By.cssSelector("button.control:nth-child(2)")).click();
            }
        }
    }

    public static void OpenNameFolder(String name, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Sleep(1000);
        String folder = driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1)")).getAttribute("className");
        if (!folder.contains("expanded")) {
            driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
            Sleep(1500);
            ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
        }
        Sleep(3500);
        driver.findElement(By.cssSelector("[foldername=\"" + name + "\"]")).click();
        Sleep(4000);
        driver.findElement(By.cssSelector("[foldername=\"" + name + "\"]")).click();
    }

    public static void SendCabinet(String who, String cabinet, WebDriver driver) {
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys(who);
        Sleep(1500);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(), '" + cabinet + "')][contains(@class, 'option')]")).click();
        Sleep(2000);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    }

    public static void SendCabinet(String who, String cabinet, String coworker, WebDriver driver) {
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys(who);
        Sleep(2000);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
        Sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), '" + cabinet + "')][contains(@class, 'option')]")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector(".not-full")).click();
        Sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), '" + coworker + "')][contains(@class, 'option')]")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#modalSendButton")).click();

        Sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    }

    public static String Split(String text, String textSplit) {
        String[] str = text.split(textSplit);
        text = str[1];
        System.out.println(text);
        return text;
    }

    public static String Split(String text, String textSplit, int number) {
        String[] str = text.split(textSplit);
        text = str[1];
        System.out.println(text);
        text = text.substring(0, number);
        System.out.println(text);
        return text;
    }
}
