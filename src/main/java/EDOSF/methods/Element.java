package EDOSF.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Element {
    //https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html
    public static void WaitElementToBeClickableAndClick(String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(link))));
        Thread.sleep(1200);
        driver.findElement(By.cssSelector(link)).click();
    }

    public static void WaitElementToBeClickableAndClick(int xpath, String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(1100);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(link))));
        Thread.sleep(500);
        driver.findElement(By.xpath(link)).click();
    }

    public static void VisibleElement180SecToWait(String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            if (i == 2 || i == 28) {
                driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
                System.out.println("F5");
            }
            boolean bool = driver.findElements(By.cssSelector(link)).size() > 0;
            if (!bool) {
                Thread.sleep(1000);
            } else {
                i = 31;
            }

        }
    }

    public static void VisibleElement180SecToWait(Integer sec, String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (int i = 0; i < sec; i++) {
            System.out.println(i);
            if (i == 2 || i == 28) {
                driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
                System.out.println("F5");
            }
            boolean bool = driver.findElements(By.cssSelector(link)).size() > 0;
            if (!bool) {
                Thread.sleep(1000);
            } else {
                i = 31;
            }

        }
    }

    public static void WaitElementIsDisableAndClickIfNot(String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String isDisabled;
        for (int i = 0; i <50 ; i++) {
            isDisabled = driver.findElement(By.cssSelector(link)).getAttribute("outerHTML");
            if (isDisabled.contains("disabled")) {
                Thread.sleep(1000);
            }else{
                break;
            }
        }
        driver.findElement(By.cssSelector(link)).click();
    }

    public static void clickElementByName(String name, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.findElement(By.xpath("//*[contains(text(), '"+name+"')]")).click();
    }
    public static void doubleClickElementByName(String name, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions actions = new Actions(driver);
        WebElement elementLocator =   driver.findElement(By.xpath("//*[contains(text(), '"+name+"')]"));
        actions.doubleClick(elementLocator).perform();
    }
    public static String CreateXpathNameForElement(String name) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String returnName = "//*[contains(text(), '" + name + "')]";
        return returnName;
    }

}
