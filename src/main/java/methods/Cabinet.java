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
        String row;
        Thread.sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Thread.sleep(2000);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-10, -10).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        switch (NumButtonsMenu) {
            case (1):
                driver.findElement(By.id("cm-upl_text")).click();
                break;
            case (2):
                //Удалить файлы в папке
                File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
                HelpUser.DeletedFiles(dir);

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
        driver.findElement(By.cssSelector("[foldername=\"" + name + "\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("[foldername=\"" + name + "\"]")).click();
    }
    public static void Catch(WebDriver driver, Throwable e) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.quit();
        e.printStackTrace();
        Assertions.fail();
    }
    public static void SendCabinet(String who, String cabinet, WebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector(".selectize-input")).click();
        driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys(who);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
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
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#modalSendButton")).click();

        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
    }

    public static void Up(WebDriver driver){
        ((JavascriptExecutor)driver).executeScript("scroll(0,0)");
    }
    public static void Down(WebDriver driver){
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    }
}
