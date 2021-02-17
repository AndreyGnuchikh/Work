package EDOSF.iitFirefox.loginTestedo;

import EDOSF.iitAdd.Admin.HelpAdmin;
import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.Element;
import EDOSF.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class F_ChangeScopeOfAuthority_Test6 extends testedo {
    WebDriver driver;
    String test;




    @BeforeEach
    void SetUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_DontChange_Test1() {
        try {
            role(1, "Не выбрано");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_Change2paragraph_Test2() {
        try {
            role(2, "Лицо, ответственное за подписание счетов-фактур");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_Change3paragraph_Test3() {
        try {
            role(3, "Лицо, совершившее сделку, операцию");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_Change4paragraph_Test4() {
        try {
            role(4, "Лицо, совершившее сделку, операцию и ответственное за ее оформление");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_Change5paragraph_Test5() {
        try {
            role(5, "Лицо, ответственное за оформление свершившегося события");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_Change6paragraph_Test6() {
        try {
            role(6, "Лицо, совершившее сделку, операцию и ответственное за подписание счетов-фактур");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_Change7paragraph_Test7() {
        try {
            role(7, "Лицо, совершившее сделку, операцию и ответственное за ее оформление и за подписание счетов-фактур");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void H_Change8paragraph_Test8() {
        try {
            role(8, "Лицо, ответственное за оформление свершившегося события и за подписание счетов-фактур");
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    void I_ChangeBasisOfAuthority_Test9() {
        try {
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#user-nav")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).clear();
            driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).sendKeys("Test");
            driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#user-nav")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).getAttribute("value");
            Check.CheckExit("Test", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void role(int numerAuthority, String text) throws InterruptedException {
        EnterAndExit.RoleSwitch(2, driver);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select > option:nth-child(" + numerAuthority + ")")).click();
        driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
        Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)", driver);
        Thread.sleep(600);
        EnterAndExit.Exit(driver);
        Thread.sleep(1000);
        EnterAndExit.LogPass(LogAll, pass, driver);
        EnterAndExit.RoleSwitch(1, driver);
        driver.findElement(By.cssSelector("#user")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#user-search")).sendKeys("Все Все");
        Thread.sleep(2100);
        HelpAdmin.MenuAdmin(1, "//*[contains(text(), 'Все Все')][contains(@class, 'dgrid-column-name ')]", driver);
        Thread.sleep(1200);
        test = driver.findElement(By.cssSelector("#carduser-authority-area-name")).getText();
        Thread.sleep(1600);
        System.out.println(test);
        Check.CheckExit(text, test, driver);
    }
}
