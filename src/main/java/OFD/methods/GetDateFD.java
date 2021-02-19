package OFD.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetDateFD {
    public static void getData(String time1, String time2, String typeFD,String clickFDData, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Element.clickElementByName("Фискальные документы", driver);
        Thread.sleep(1000);
        List<WebElement> muchoCheese = driver.findElements(By.className("v-datefield-textfield"));
        Thread.sleep(800);
        muchoCheese.get(0).sendKeys(Keys.CONTROL + "A");
        muchoCheese.get(0).sendKeys(time1);
        Thread.sleep(300);
        muchoCheese.get(1).sendKeys(Keys.CONTROL + "A");
        Thread.sleep(300);
        muchoCheese.get(1).sendKeys(time2);
        Thread.sleep(300);
        driver.findElement(By.className("v-filterselect-input-readonly")).click();
        Element.clickElementByName(typeFD, driver);
        driver.findElement(By.className("v-button-blue")).click();
        Thread.sleep(300);
        Element.doubleClickElementByName(clickFDData, driver);
        Thread.sleep(600);
        driver.get(driver.findElement(By.cssSelector(".v-embedded > iframe:nth-child(1)")).getAttribute("src"));
    }
}
