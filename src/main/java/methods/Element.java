package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Element {
    //https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html
    public static void WaitElementToBeClickableAndClick(String link, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + link);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(1200);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(link))));
        Thread.sleep(500);
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

    public static void visibleElement180SecToWait(Integer sec, String link, WebDriver driver) throws InterruptedException {
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
}
