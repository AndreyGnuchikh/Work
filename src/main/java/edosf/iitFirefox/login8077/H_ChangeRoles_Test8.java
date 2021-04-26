package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class H_ChangeRoles_Test8 implements Iit8077 {
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
    @DisplayName("��������� ���� Admin �� User")
    void A_TestChangeRoleAdminToUser_Test1() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� ��� ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� Admin �� Support")
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
    @DisplayName("��������� ���� Admin �� BillingEditor")
    void C_TestChangeRoleAdminToBillingEditor_Test3() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� User �� Admin")
    void D_TestChangeRoleUserTo_Admin_Test4() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� User �� Support")
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
    @DisplayName("��������� ���� User �� BillingEditor")
    void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� Support �� Admin")
    void G_TestChangeRoleSupportTo_Admin_Test7() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Thread.sleep(2000);
            Support();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� Support �� User")
    void H_TestChangeRoleSupportTo_User_Test8() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� ��� ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� Support �� BillingEditor")
    void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector("div.v-list-item__title:nth-child(2)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� BillingEditor �� Admin")
    void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(10)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.blue--text:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� BillingEditor �� User")
    void K_TestChangeRoleBillingEditorToUser__Test11() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(10)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button.blue--text:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� ��� ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }


    @RetryingTest(NUM_FAIL)
    @DisplayName("��������� ���� BillingEditor �� Support")
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

    private void Admin() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("��� �����������", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    private void User() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("������� ��� ������", checking, driver);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    private void Support() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check(SUPPORT_CABINET, checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}