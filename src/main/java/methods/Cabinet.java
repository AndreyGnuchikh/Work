package methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Cabinet {

    public static String ClickMenuFirstElement(int NumButtonsMenu, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        String row;
        Thread.sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Thread.sleep(2100);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-5, -5).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке
                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                HelpUser.DeletedFiles(dir);
                Thread.sleep(500);
                DOMElementDeleted(driver);
                driver.findElement(By.id("cm-open_text")).click();
                break;
            case (3):
                Thread.sleep(500);
                driver.findElement(By.id("cm-edit_text")).click();
                break;
            case (4):
                driver.findElement(By.id("cm-rename_text")).click();
                break;
            case (5):
                Thread.sleep(500);
                driver.findElement(By.id("cm-sign_text")).click();
                Thread.sleep(1500);
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
            case (15):
                break;

        }
        Thread.sleep(500);
        return row;
    }
    public static void OpenNameFolder(String name, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Thread.sleep(1000);
        String folder = driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1)")).getAttribute("className");
        if (!folder.contains("expanded")) {
            driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
            Thread.sleep(1500);
            ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
        }
        Thread.sleep(3800);
        EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
        driver.findElement(By.cssSelector("[foldername=\"" + name + "\"]")).click();
        Thread.sleep(4000);
        EnterAndExit.startEndingCertAndSendingFiles("SkipSingFiles",driver);
        Thread.sleep(1000);
        Cabinet.Up(driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();

    }
    public static void Catch(WebDriver driver, Throwable e) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.quit();
        e.printStackTrace();
        String srt = null;
        if(e.toString().contains("org.openqa.selenium.NoSuchElementException:")){
            srt = e.toString();
            int index1 = srt.indexOf("For documentation on this error");
            int index2 = srt.indexOf("t:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Проблена с нахождением элемента "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Проблена с нахождением элемента "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());

        }
        if(e.toString().contains("org.openqa.selenium.ElementClickInterceptedException:")){
            srt = e.toString();
            int index1 = srt.indexOf("Build info:");
            int index2 = srt.indexOf("n:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Элемент как то скрыт от нажатия "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Элемент как то скрыт от нажатия "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
        }
        if(e.toString().contains("org.openqa.selenium.ElementNotInteractableException:")){
            srt = e.toString();
            int index1 = srt.indexOf("Build info:");
            int index2 = srt.indexOf("n:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Эламент есть в DOM, но не находится в поле нажатия, видости "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Эламент есть в DOM, но не находится в поле нажатия, видости "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
        }
        Assertions.fail(srt);
    }
    public static void SendCabinet(String who, String cabinet, WebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys(who);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Thread.sleep(1500);
        if(driver.getCurrentUrl().contains("testedo")){        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();}else {
        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1)")).click();}
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(), '" + cabinet + "')][contains(@class, 'option')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#modalSendButton")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    }
    public static void SendCabinet(String who, String cabinet, String coworker, WebDriver driver) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys(who);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), '" + cabinet + "')][contains(@class, 'option')]")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".not-full")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[contains(text(), '" + coworker + "')][contains(@class, 'option')]")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#modalSendButton")).click();

        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    }

    public static void Up(WebDriver driver){
        ((JavascriptExecutor)driver).executeScript("scroll(0,0)");
    }
    public static void Down(WebDriver driver){ ((JavascriptExecutor)driver).executeScript("scroll(0,400)"); }
    public static void DOMElementDeleted(WebDriver driver){ ((JavascriptExecutor)driver).executeScript("return document.getElementsByClassName('navbar-fixed-top')[0].remove();");

    }
}
