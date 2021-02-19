package OFD.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Element {
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
    public static String getNameElement(String name, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String gatName;
        Thread.sleep(800);
        gatName = driver.findElement(By.xpath("//*[contains(text(), '"+name+"')]")).getText();
        return gatName;
    }


    public static void waitElementToBeClickableAndClick(String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(link))));
        Thread.sleep(1200);
        driver.findElement(By.cssSelector(link)).click();
    }

    public static void waitElementToBeClickableAndClick(int xpath, String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(1100);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(link))));
        Thread.sleep(500);
        driver.findElement(By.xpath(link)).click();
    }
    public static void visibleElement180SecToWait(String link, WebDriver driver) throws InterruptedException {
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

    public static void visibleElementNUMSecToWait(Integer sec, String link, WebDriver driver) throws InterruptedException {
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

    public static void ifElementExistClick(String elementCssSelector, WebDriver driver) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Boolean exist = driver.findElements(By.cssSelector(elementCssSelector)).size()>0;
        if(exist){
            driver.findElement(By.cssSelector(elementCssSelector)).click();
        }
    }
    public static void GetIdAndIfElementExistClick(String elementClass, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String idElement =  driver.findElement(By.xpath("//div[@class='"+elementClass+"']")).getAttribute("id");
        Boolean exist = driver.findElements(By.id(idElement)).size()>0;
        if(exist){
            driver.findElement(By.id(idElement)).click();
        }
        Thread.sleep(100);
    }
}
