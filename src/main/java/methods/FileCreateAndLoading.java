package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import static methods.Cabinet.*;
import static methods.HelpUser.*;

public class FileCreateAndLoading {
    public static String AddFile(String fileName, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file
        String row;
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Thread.sleep(200);
        System.out.println(fileName);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        // Click and found first element
        Thread.sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        Thread.sleep(800);
        row = row.substring(0, 36);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        return row;
    }

    public static String AddFile(String SkipSignFiles,String fileName, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method "+SkipSignFiles+" " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file
        String row;
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Thread.sleep(200);
        System.out.println(fileName);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        EnterAndExit.startEndingCertAndSendingFiles("Skip",driver);
        // Click and found first element
        Thread.sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        Thread.sleep(800);
        row = row.substring(0, 36);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        return row;
    }

    public static void AddFileUPDError(String fileName, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file UPD Error
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Thread.sleep(200);
        upload.sendKeys("C:\\Tools\\upd\\" + fileName);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Thread.sleep(3000);
    }

    public static String AddFileAndClickMenu(int NumButtonsMenu, String fileName, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Add file
        String row;
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Thread.sleep(200);
        upload.sendKeys("C:\\Tools\\" + fileName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Thread.sleep(3500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        // Click and found first element
        Thread.sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(500);
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
                Thread.sleep(500);
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

    public static String CreateFirstUPDDocumentAndSign(String upd, WebDriver driver) throws InterruptedException {
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

        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Thread.sleep(1000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Thread.sleep(15000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        }
        return test2;
    }

    public static String CreateFirstUPDDocumentAndSignAndSand(String upd, WebDriver driver) throws InterruptedException {
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
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Thread.sleep(1000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Thread.sleep(12000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        }
        ClickMenuFirstElement(12, driver);
        Thread.sleep(1500);
        SendCabinet("Все хорошо 2", "Все хорошо 2.0", "Андрей Андрей", driver);
        return test2;
    }

    public static String CreateFirstUDPDocumentAndSignOneAndTwo(String url, String upd2, String upd, WebDriver driver) throws InterruptedException {
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

        Thread.sleep(4200);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Thread.sleep(1000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        if (!upd.equals("upd\\Dop.xml")) {
            Thread.sleep(12000);
            driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        }
        ClickMenuFirstElement(12, driver);
        Thread.sleep(2000);
        SendCabinet("Все хорошо 2", "Все хорошо 2.0", driver);
        Thread.sleep(500);
        EnterAndExit.Exit(driver);
        driver.get(url);
        EnterAndExit.loggingCerts(upd2, driver);
        EnterAndExit.RoleSwitch(2, driver);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        Thread.sleep(1500);


        switch (upd) {
            case ("upd\\0.xml"):
                OpenNameFolder("СЧФ Наименование", driver);
                break;
            case ("upd\\Dop.xml"):
                OpenNameFolder("АКТ", driver);
                break;
            case ("upd\\SchfDop.xml"):
            case ("upd\\IPSchfDop.xml"):
                Thread.sleep(500);
                OpenNameFolder("УПД 123", driver);
                break;
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Thread.sleep(1000);
        if (!upd.equals("upd\\0.xml")) {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(500);
                driver.findElement(By.cssSelector("button.btn-default:nth-child(3) > span:nth-child(2)")).click();
                Thread.sleep(500);
                driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
                Thread.sleep(2000);
                Actions builder2 = new Actions(driver);
                Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
                Thread.sleep(500);
                builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
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

        }
        return row;
    }
}
