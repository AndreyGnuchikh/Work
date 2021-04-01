package edosf.iitFirefox.loginTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class H_ChangeRoles_Test8 implements Testedo {
    private WebDriver driver;
    public String checking;




    @BeforeEach
    void upSet() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_TestChangeRoleAdminToUser_Test1() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Кабинет Все хорошо", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_TestChangeRoleAdminToSupport_Test2() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit(SUPPORT_CABINET, checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_TestChangeRoleAdminToBillingEditor_Test3() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_TestChangeRoleUserTo_Admin_Test4() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_TestChangeRoleUserTo_Support_Test5() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();
            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit(SUPPORT_CABINET, checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_TestChangeRoleSupportTo_Admin_Test7() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Thread.sleep(2000);
            Support();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void H_TestChangeRoleSupportTo_User_Test8() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Кабинет Все хорошо", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(10)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.blue--text:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(11)
    void K_TestChangeRoleBillingEditorToUser__Test11() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(10)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.blue--text:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Кабинет Все хорошо", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }


    @RetryingTest(NUM_FAIL)
    @Order(12)
    void L_TestChangeRoleBillingEditorToSupport__Test12() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(10)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.blue--text:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit(SUPPORT_CABINET, checking, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void Admin() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("Все контрагенты", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    void User() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("Кабинет Все хорошо", checking, driver);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    void Support() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check(SUPPORT_CABINET, checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}