package EDOSF.methods;

import EDOSF.iitAdd.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Email {
    //Email sleep
    public static void Email(String email, String pass, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal,isPresentPhoneNumber;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        Thread.sleep(1000);

        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className("AuthAccountListItem-displayName")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className("AuthAccountListItem-displayName")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login")).size() > 0;
        isPresentPhoneNumber = driver.findElements(By.className("div.passp-button:nth-child(3) > button:nth-child(1)")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            Thread.sleep(500);
            driver.findElement(By.id("passp-field-login")).sendKeys(email);
            Thread.sleep(500);
            driver.findElement(By.cssSelector("button.Button2_type_submit")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(pass);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".Button2_type_submit")).click();
        } else {
            Thread.sleep(1500);
            isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
            System.out.println("Только Пароль " + isPresentPass);
            if (isPresentPass) {
                Thread.sleep(1000);
                driver.findElement(By.id("passp-field-passwd")).sendKeys(pass);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".Button2_type_submit")).click();
            }
            if(isPresentPhoneNumber){
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("div.passp-button:nth-child(3) > button:nth-child(1)")).click();
                Thread.sleep(5000);
            }
        }

    }

    public static void EmailTest3(String testIitTest3, String EmailPass, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal, SecondPart;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        SecondPart = driver.findElements(By.xpath("//*[contains(text(),'testiit.test3')]")).size() > 0;
        System.out.println("Выбор Тест 3 " + SecondPart);
        if (SecondPart) {
            driver.findElement(By.xpath("//*[contains(test(),'testiit.test3')]")).click();
        }

        Thread.sleep(1000);
        SecondPart = driver.findElements(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).size() > 0;
        System.out.println(SecondPart);
        if (SecondPart) {
            driver.findElement(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).click();
        }

        Thread.sleep(1000);
        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className("AuthAccountListItem-displayName")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className("AuthAccountListItem-displayName")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            driver.findElement(By.id("passp-field-login")).sendKeys(testIitTest3);
            driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".Button2_type_submit")).click();
            Thread.sleep(1500);
        }
        isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
        System.out.println("Только Пароль " + isPresentPass);
        if (isPresentPass) {
            driver.findElement(By.id("passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".Button2_type_submit")).click();
        }
    }

    public static void EmailTest4(String testIitTest4, String EmailPass, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        boolean isPresentLog, isPresentPass, isNormal, SecondPart;
        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        SecondPart = driver.findElements(By.xpath("//*[contains(text(),'testiit.test4')]")).size() > 0;
        System.out.println("Выбор Тест 4 " + SecondPart);
        if (SecondPart) {
            driver.findElement(By.xpath("//*[contains(text(),'testiit.test4')][contains(@class, 'passp-account-list-item__login')]")).click();
        }

        Thread.sleep(1000);
        SecondPart = driver.findElements(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).size() > 0;
        System.out.println(SecondPart);
        if (SecondPart) {
            driver.findElement(By.cssSelector("li.passp-account-list-item_block:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).click();
        }

        Thread.sleep(1000);
        // Если элемент не виден на странице вернет false если винед true
        isNormal = driver.findElements(By.className("AuthAccountListItem-displayName")).size() > 0;
        System.out.println("Уже есть ак " + isNormal);
        if (isNormal) {
            driver.findElement(By.className("AuthAccountListItem-displayName")).click();
        }
        isPresentLog = driver.findElements(By.id("passp-field-login")).size() > 0;
        System.out.println("Логин Пароль " + isPresentLog);
        //==============
        if (isPresentLog) {
            driver.findElement(By.id("passp-field-login")).sendKeys(testIitTest4);
            driver.findElement(By.cssSelector("button.button2_type_submit")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".Button2_type_submit")).click();
            Thread.sleep(1500);
        }
        isPresentPass = driver.findElements(By.id("passp-field-passwd")).size() > 0;
        System.out.println("Только Пароль " + isPresentPass);
        if (isPresentPass) {
            driver.findElement(By.id("passp-field-passwd")).sendKeys(EmailPass);
            driver.findElement(By.cssSelector(".Button2_type_submit")).click();
        }
    }

    public static void DeletedEmail(WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        boolean winterBrandAD,HaveSomeLetters;


        Thread.sleep(2000);
        HaveSomeLetters = driver.findElements(By.cssSelector("a.ns-view-folder:nth-child(1) > div:nth-child(3)")).size() > 0;
        //If don't have disabled attribute, we will continue this thread.
        if(HaveSomeLetters){
        winterBrandAD = driver.findElements(By.cssSelector("button.control:nth-child(1)")).size() > 0;
        if(winterBrandAD){
            driver.findElement(By.cssSelector("button.control:nth-child(1)")).click();
            Thread.sleep(1000);
        }
        if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
            System.out.println("isEnabled");
        } else {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            boolean boo = driver.findElements(By.cssSelector("button.control:nth-child(2)")).size() > 0;
            System.out.println("Много писем " + boo);
            if (boo) {
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("button.control:nth-child(2)")).click();

            }
        }
        }

    }

    public static void DeletedCabinetMarkerAndDeletedEmail(String url, String pass5log, String EmailName, String EmailPass, WebDriver driver) throws Exception {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String checkbox1, checkbox2, checkbox3;
        String check;
        check = "true";
        driver = Drivers.ff();
        driver.get(url);
        Thread.sleep(1000);
        EnterAndExit.LogPass(pass5log, pass5log, driver);
        Thread.sleep(2000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);

        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        checkbox1 = driver.findElement(By.xpath("//*[@id=\"not-1\"]")).getAttribute("checked");
        checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-2\"]")).getAttribute("checked");
        checkbox3 = driver.findElement(By.xpath("//*[@id=\"not-3\"]")).getAttribute("checked");

        if (check.equals(checkbox1)) {
            driver.findElement(By.cssSelector("#not-1")).click();
        }
        if (check.equals(checkbox2)) {
            driver.findElement(By.cssSelector("#not-2")).click();
        }
        if (check.equals(checkbox3)) {
            driver.findElement(By.cssSelector("#not-3")).click();
        }
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Thread.sleep(1000);
        Email.Email(EmailName, EmailPass, driver);
        Thread.sleep(4500);
        Email.DeletedEmail(driver);
        driver.quit();
    }
}
