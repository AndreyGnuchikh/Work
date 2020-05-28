package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class Sign {
    public static void SignFirstFile(WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String row;
        Thread.sleep(2500);
        // Click and found first element
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Actions builder = new Actions(driver);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(By.id("cm-sign_text")).click();
        Thread.sleep(5500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Thread.sleep(10000);
    }

    public static void SignFirstFileUDP(String row, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Thread.sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Thread.sleep(14000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        EnterAndExit.startEndingCertAndSendingFiles(driver);
    }

    public static void SignFirstFileUDPSecondSign(String row, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Actions builder = new Actions(driver);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        Element.WaitElementToBeClickableAndClick("#grid-basic2-row-" + row, driver);
        Thread.sleep(1200);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Thread.sleep(4300);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("2");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Èìÿ2");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
        Thread.sleep(7000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Thread.sleep(500);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
    }
}
