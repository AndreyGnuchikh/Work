package EDOSF.methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class Check {
    public static void CheckExit(String textStringForTest, String checking, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Request  " + textStringForTest);
        System.out.println("Response " + checking);
        if (checking.equals(textStringForTest)) {
            System.out.println("Test is Successful");
            driver.quit();
            assertTrue(true);
        } else {
            driver.quit();
            fail("Test is Failing.");
        }
    }

    // Checking  whatHave whatGet driver //Don't  driver.quit();
    public static void Check(String test, String checking, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Request  " + test);
        System.out.println("Response " + checking);
        if (checking.equals(test)) {
            System.out.println(test);
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }

    public static void CheckingContains(String test, String checking, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");

        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }

    public static void CheckingContainsExit(String test, String checking, WebDriver driver) throws InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(test);
        if (checking.contains(test)) {
            System.out.println("Test check is Successful");
            driver.quit();
        } else {
            driver.quit();
            System.out.println("Test is false");
            Assertions.fail();
        }
    }
}
