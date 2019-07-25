package iitAdd;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static iitAdd.p.urlsert;
import static iitAdd.p8080.urlsert8080;
import static java.lang.Runtime.getRuntime;

public class Me {

    //SetUp ===========================================================================================================

    // logging log pass driver
    public static void LogPass(String login, String pass, WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"username-login\"]")).sendKeys(login);
        driver.findElement(By.xpath("//*[@id=\"passwordfield\"]")).sendKeys(pass);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/form/div[3]/button")).click();
        Me.Sleep(2000);
    }

    // loggingCerts logCert driver
    public static void loggingCerts(String login, WebDriver driver) {

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/ul/li[2]/a")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"keyModal_body\"]/option[" + login + "]")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button")).click();
        Sleep(6000);
        String url = driver.getCurrentUrl();
        if (!url.equals(urlsert)) {
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

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"keyModal_body\"]/option[" + login + "]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button")).click();
        Sleep(6000);
        String url = driver.getCurrentUrl();
        if (!url.equals(urlsert8080)) {
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
        switch (i) {
            case 1:
                // One Admin
                Sleep(300);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
                break;
            case 2:
                // Two User
                Sleep(300);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span/span[2]")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
                break;
            case 3:
                // Three Billing editor
                Sleep(300);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span/span[2]")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.ENTER);
                Me.Sleep(1000);
                driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]")).click();
                driver.findElement(By.xpath("//*[@id=\"enter\"]")).click();
                break;
            case 4:
                // Support
                Me.Sleep(500);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span/span[2]")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.DOWN);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
                break;
        }
    }

    public static void startEndingCertAndSendingFiles(WebDriver driver) {
        Me.Sleep(2000);
        if (driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).isDisplayed()) {
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(5000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            System.out.println("receipts signing");
        }
        if (driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).isDisplayed()) {
            driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
            Me.Sleep(1000);
        }
    }
    //SetUp ============================================================================================================

    //Check /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Checking  whatHave whatGet driver
    public static void CheckExit(String textStringForTest, String checking, WebDriver driver) {
        System.out.println("Запрос "+ textStringForTest);
        System.out.println("Ответ  "+ checking);
        if (checking.equals(textStringForTest)) {
            System.out.println("Test is Successful");
            driver.quit();
        } else {
            driver.quit();
            System.out.println("Test is false");
            Assert.fail();
        }
    }

    // Checking  whatHave whatGet driver //Don't  driver.quit();
    public static void Check(String test, String checking, WebDriver driver) {
        System.out.println("Запрос "+ test);
        System.out.println("Ответ  "+ checking);
        if (checking.equals(test)) {
            System.out.println(test);
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assert.fail();
        }
    }

    public static void CheckingContains(String test, String checking, WebDriver driver) {
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assert.fail();
        }
    }
    public static void CheckingContainsExit(String test, String checking, WebDriver driver) {
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");
            driver.quit();
        } else {
            driver.quit();
            System.out.println("Test is false");
            Assert.fail();
        }
    }
    //Check ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Sleep number_)
    public static void Sleep(int number) {
        try {
            Thread.sleep(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Email sleep
    public static void Email(WebDriver driver) {
        Me.Sleep(2000);
        Boolean isPresentLog,isPresentPass;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        Me.Sleep(1000);

        // Если элемент не виден на странице вернет false если винед true
        isPresentLog = driver.findElements(By.id("passp-field-login")).size() > 0;
        System.out.println(isPresentLog);
        //==============
        if (isPresentLog == true) {
            driver.findElement(By.id("passp-field-login")).sendKeys(p.q5email);
            driver.findElement(By.cssSelector("button.button2:nth-child(1)")).click();
            Me.Sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys(p.q5emailpass);
            driver.findElement(By.cssSelector(".button2")).click();
            Me.Sleep(1500);
        }
        isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
        if(isPresentPass == true){
            driver.findElement(By.id("passp-field-passwd")).sendKeys(p.q5emailpass);
            driver.findElement(By.cssSelector(".button2")).click();
        }
    }

    public static void visibleElement60SecToWait(String link, WebDriver driver) {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            if (i == 2 || i == 28) {
                driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
                System.out.println("F5");
            }
            Boolean bool = driver.findElements(By.cssSelector(link)).size() > 0;
            if (bool == false) {
                Me.Sleep(2000);
            } else {
                i = 31;
            }

        }
    }

    public static void MenuAdmin(int i, String string, WebDriver driver) {
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
        String row;
        Me.Sleep(2500);
        // Click and found first element
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Actions builder = new Actions(driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(10000);
    }

    public static void SingFirstFileUDP(String strd, WebDriver driver) {

        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        System.out.println(strd);

        driver.findElement(By.cssSelector("#grid-basic2-row-" + strd)).click();
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + strd))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(10000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
    }

    public static void SingFirstFileUDPSecondSing(String strd, WebDriver driver) {

        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        System.out.println(strd);

        driver.findElement(By.cssSelector("#grid-basic2-row-" + strd)).click();
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + strd))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("2");
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
        Sleep(6000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.Sleep(500);
        Me.startEndingCertAndSendingFiles(driver);
    }

    public static String AddFile(String fileName, WebDriver driver) {
        // Add file
        String row;
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Me.Sleep(200);
        System.out.println(fileName);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        // Click and found first element
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        Me.Sleep(500);
        row = row.substring(0, 36);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        return row;
    }

    public static void AddFileUPDError(String fileName, WebDriver driver) {
        // Add file UPD Error
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Me.Sleep(200);
        upload.sendKeys("C:\\Tools\\upd\\" + fileName);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Me.Sleep(3000);
    }

    public static void AddFileUPDError8080(String fileName, WebDriver driver) {
        // Add file UPD Error
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Me.Sleep(200);
        upload.sendKeys("C:\\Tools\\upd8080\\" + fileName);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Me.Sleep(3000);
    }

    public static String AddFileAndClickMenu(int NumButtonsMenu, String fileName, WebDriver driver) {
        // Add file
        String row = null;
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Me.Sleep(200);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        // Click and found first element
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        System.out.println(row);
        row = row.substring(0, 36);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();

        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке
                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                for (File file : dir.listFiles())
                    if (!file.isDirectory())
                        file.delete();
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
        test2 = Me.AddFile(upd, driver);
        Me.ClickMenuFirstElement(5, driver);

        Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        Me.startEndingCertAndSendingFiles(driver);
        if (upd != "upd\\Dop.xml") {
            Sleep(12000);
            driver.findElement(By.cssSelector(".active-file")).click();
            Sleep(1500);
            Me.startEndingCertAndSendingFiles(driver);
        }
        return test2;
    }

    public static String CreateFirstUPDDocumentAndSignAndSand(String upd, WebDriver driver) {
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
        test2 = Me.AddFile(upd, driver);
        Me.ClickMenuFirstElement(5, driver);

        Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        Me.startEndingCertAndSendingFiles(driver);
        if (upd != "upd\\Dop.xml") {
            Sleep(12000);
            driver.findElement(By.cssSelector(".active-file")).click();
            Sleep(1500);
            Me.startEndingCertAndSendingFiles(driver);
        }
        Me.ClickMenuFirstElement(12, driver);
        Sleep(1500);
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Все хорошо 2");
        Sleep(1000);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#select2-sn-recivercabinet-container")).click();
        Sleep(500);
        test = driver.findElement(By.cssSelector("#select2-sn-recivercabinet-results")).getAttribute("innerHTML");
        test = test.substring(244, 318);
        System.out.println(test);
        driver.findElement(By.cssSelector("#" + test + "")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Sleep(2500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        return test2;
    }

    public static String CreateFirstUDPDocumentAndSignOneAndTwo(String upd, WebDriver driver) {
        // 1 SchF 2 DOP 3 SchFDOP
        String test, nameFile;
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
        nameFile = Me.AddFile(upd, driver);
        Me.ClickMenuFirstElement(5, driver);

        Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Sleep(1000);
        Me.startEndingCertAndSendingFiles(driver);
        if (upd != "upd\\Dop.xml") {
            Sleep(12000);
            driver.findElement(By.cssSelector(".active-file")).click();
            Sleep(1500);
            Me.startEndingCertAndSendingFiles(driver);
        }
        Me.ClickMenuFirstElement(12, driver);
        Sleep(1500);
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Все хорошо 2");
        Sleep(1000);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#select2-sn-recivercabinet-container")).click();
        Sleep(500);
        test = driver.findElement(By.cssSelector("#select2-sn-recivercabinet-results")).getAttribute("innerHTML");
        test = test.substring(244, 318);
        System.out.println(test);
        driver.findElement(By.cssSelector("#" + test + "")).click();
        Sleep(500);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Sleep(2500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Exit(driver);
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2500);
        switch (upd) {
            case ("upd\\0.xml"):
                driver.findElement(By.xpath("//*[contains(text(),'СЧФ Наименование')]")).click();
                break;
            case ("upd\\Dop.xml"):
                driver.findElement(By.xpath("//*[contains(text(),'АКТ')]")).click();
                break;
            case ("upd\\SchfDop.xml"):
                driver.findElement(By.xpath("//*[contains(text(),'УПД 123')]")).click();
                break;
        }
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        System.out.println(nameFile);

        driver.findElement(By.cssSelector("#grid-basic2-row-" + nameFile)).click();
        Sleep(1000);
        if (upd != "upd\\0.xml") {
            for (int i = 0; i < 20; i++) {
                Sleep(500);
                driver.findElement(By.cssSelector(".active-file")).click();
                Sleep(500);
                driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
                Sleep(2000);
                Actions builder2 = new Actions(driver);
                driver.findElement(By.cssSelector("#grid-basic2-row-" + nameFile)).click();
                Sleep(500);
                builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + nameFile))
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
            Sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        }
        return nameFile;
    }

    //Add and Signing --------------------------------------------------------------------------------------------------

    public static void ClickMenuFirstElement(int NumButtonsMenu, WebDriver driver) {
        String row = null;
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        System.out.println(row);
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();

        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке
                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                for (File file : dir.listFiles())
                    if (!file.isDirectory())
                        file.delete();
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
    }

    public static String Krutilka(String str, Integer number) {
        String rerurningTest = null;
        String[] dre = new String[500];
        for (int i = 0; i < 1; i++) {
            String vals[] = str.split(">");
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
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

    public static void Exit(WebDriver driver) {
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
        Me.Sleep(1000);
    }

    // return Number List or Path file
    public static String Rezip(Integer numElementsFileList) throws IOException {
        Sleep(2000);
        String NameFile,test,out;
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
        if(lst2.size() <=2) {
            for (int i = 0; i < lst2.size(); i++) {
                System.out.println(lst2.get(i));
            }
            out = lst2.get(numElementsFileList).toString();
        }else{
            Integer num = lst2.size();
            out = num.toString();
        }

        return out;
    }

    public static String Time() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        System.out.println("Constructor 4: " + dateFormat.format( currentDate ) );
        return dateFormat.format(currentDate);
    }

    public static void DeletedCabinetMarkerAndDeletedEmail(WebDriver driver){
        String checkbox1, checkbox2, checkbox3;
        String check;
        check = "true";
        driver = Drivers.ff();
        driver.get(p.url3);
        Me.LogPass(p.pass5log, p.pass5log, driver);
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
}
