package methods;

import iitAdd.iit8077;
import iitAdd.testedo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class EnterAndExit {
    public static void LogPass(String login, String pass, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        System.out.println("Password: " + pass);
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"username-login\"]")).sendKeys(login);
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"passwordfield\"]")).sendKeys(pass);
        Thread.sleep(200);
        driver.findElement(By.className("auth__button")).click();
        Thread.sleep(2000);
    }

    // loggingCerts logCert driver
    public static void loggingCerts(String login, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        Thread.sleep(1500);
        driver.findElement(By.className("auth__tab-item--right")).click();
        Element.WaitElementToBeClickableAndClick(1, "//*[@id=\"keyModal_body\"]/option[" + login + "]", driver);
        Thread.sleep(500);
        driver.findElement(By.className("btnSelectKey")).click();
        Thread.sleep(6000);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        if (!url.equals(iit8077.urlsert)) {
            String test;
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).getAttribute("clientTop");
            Thread.sleep(1000);
            if (test.equals("1")) {
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).click();
            }
            Thread.sleep(5000);

        }

    }

    public static void loggingCerts8080(String login, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Login: " + login);
        Thread.sleep(1200);
        driver.findElement(By.className("auth__tab-item--right")).click();
        Element.WaitElementToBeClickableAndClick(1, "//*[@id=\"keyModal_body\"]/option[" + login + "]", driver);
        Thread.sleep(1000);
        driver.findElement(By.className("btnSelectKey")).click();
        Thread.sleep(6000);
        String url = driver.getCurrentUrl();
        if (!url.equals(testedo.urlsert)) {
            String test;
            Thread.sleep(400);
            test = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).getAttribute("clientTop");
            Thread.sleep(400);
            if (test.equals("1")) {
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button")).click();
            }
            Thread.sleep(5000);
        }
    }

    public static void RoleSwitch(int i, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        switch (i) {
            case 1:
                // One
                System.out.println("Role:" + i);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
            case 2:
                // Two
                System.out.println("Role:" + i);
                Thread.sleep(1600);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(2)")).click();
                Thread.sleep(500);
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
            case 3:
                System.out.println("Role:" + i);
                // Three
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(3)")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#selectRole")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/main/section/div/div[2]/Form/div[2]/div/div/span/span[1]/span")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("li.select2-results__option:nth-child(1)")).click();
                driver.findElement(By.cssSelector("#enter")).click();
                break;
            case 4:
                System.out.println("Role:" + i);
                // Four
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
                driver.findElement(By.cssSelector(".select2-results__option:nth-child(4)")).click();
                driver.findElement(By.cssSelector("#selectRole")).click();
                break;
        }
    }


    public static void startEndingCertAndSendingFiles(WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        if (driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).isDisplayed()) {
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Element.WaitElementToBeClickableAndClick(20,"button.btn:nth-child(5)",driver);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            System.out.println("receipts Signing");
        }
        if (driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).isDisplayed()) {
            driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
            Thread.sleep(1000);
        }
    }
    public static void startEndingCertAndSendingFiles(String SkipSignFiles, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method "+SkipSignFiles+" " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        if (driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).isDisplayed()) {
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#operatorModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
            System.out.println("receipts Signing");
        }
        if (driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).isDisplayed()) {
            driver.findElement(By.cssSelector("#userAlertModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
            Thread.sleep(1000);
        }
    }


    public static void Exit(WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
        Thread.sleep(1000);
    }
}
