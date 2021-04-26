package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import edosf.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Q_AddCommentsToDocumentFromCardED_Test17 implements Testedo {
    WebDriver driver;
    String test0, test, test2;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_add50Comments_Test1() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(1500);
            for (int i = 0; i < 50; i++) {
                test0 = "Test";
                driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
                driver.findElement(By.cssSelector(".glyphicon-plus")).click();
                Thread.sleep(1000);
                if (i == 0) {
                    test = "Test";
                } else if (i == 1) {
                    test = "Test; Test";
                } else {
                    test = "";
                    for (int j = 0; j < i; j++) {
                        test = test + "Test; ";
                    }
                    test = test + test0;

                }
                test2 = driver.findElement(By.cssSelector("#cf-comm")).getAttribute("textContent");
                System.out.println(test2);
                Check.Check(test2, test, driver);
            }
            Check.CheckExit("Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_addLongComment_Test2() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(2500);
            test0 = "Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test;";
            driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
            driver.findElement(By.cssSelector(".glyphicon-plus")).click();
            Thread.sleep(1000);

            test2 = driver.findElement(By.cssSelector("#cf-comm")).getAttribute("textContent");
            System.out.println(test2);
            Check.CheckExit("Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test;", test2, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_addCommentInCabinet_Test3() {
        try {

            String row = FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(8, driver);
            Thread.sleep(2500);
            test0 = "Добавление ком в блок Комментарии";
            driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
            driver.findElement(By.cssSelector(".glyphicon-plus")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
            test2 = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + "> table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            System.out.println(test2);
            Check.CheckExit("Добавление ком в блок Комментарии", test2, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
