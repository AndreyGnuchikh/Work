package iitFirefox.loginTestedo;

import iitAdd.Drivers; 
import methods.Cabinet;
import methods.EnterAndExit;
import iitAdd.testedo;
import methods.Check;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class H_ChangeRoles_Test8 extends testedo {
    private WebDriver driver;
    public String checking;

    @BeforeEach
    void upSet() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_TestChangeRoleAdminToUser_Test1() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > p:nth-child(2) > a:nth-child(3) > strong:nth-child(1)")).getText();
            Check.CheckExit("������� 2", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_TestChangeRoleAdminToSupport_Test2() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("����� - ������ ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_TestChangeRoleAdminToBillingEditor_Test3() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(1, driver);
            Admin();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_TestChangeRoleUserTo_Admin_Test4() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_TestChangeRoleUserTo_Support_Test5() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();

            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("����� - ������ ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(2, driver);
            User();
            Thread.sleep(500);
            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_TestChangeRoleSupportTo_Admin_Test7() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_TestChangeRoleSupportTo_User_Test8() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� 2", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(3, driver);
            Support();

            EnterAndExit.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_TestChangeRoleBillingEditorToUser__Test11() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� 2", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_TestChangeRoleBillingEditorToSupport__Test12() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            EnterAndExit.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            EnterAndExit.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("����� - ������ ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void Admin() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("��� �����������", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    private void User() throws InterruptedException {
        Thread.sleep(500);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("������� 2", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(2200);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    private void Support() throws InterruptedException {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Check.Check("����� - ������ ������", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}