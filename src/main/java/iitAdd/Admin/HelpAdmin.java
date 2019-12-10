package iitAdd.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class HelpAdmin {
    public static void MenuAdmin(int i, String string, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Thread.sleep(500);
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
        Thread.sleep(500);
    }

}
