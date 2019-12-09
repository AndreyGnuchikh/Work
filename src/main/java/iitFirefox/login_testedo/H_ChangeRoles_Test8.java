package iitFirefox.login_testedo;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.testedo;
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
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_TestChangeRoleAdminToUser_Test1() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(1, driver);
            Admin();

            Me.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > p:nth-child(2) > a:nth-child(3) > strong:nth-child(1)")).getText();
            Me.CheckExit("Кабинет 2", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_TestChangeRoleAdminToSupport_Test2() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(1, driver);
            Admin();

            Me.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("СОГАЗ - Омский филиал", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_TestChangeRoleAdminToBillingEditor_Test3() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(1, driver);
            Admin();

            Me.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_TestChangeRoleUserTo_Admin_Test4() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(2, driver);
            User();

            Me.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_TestChangeRoleUserTo_Support_Test5() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(2, driver);
            User();

            Me.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("СОГАЗ - Омский филиал", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(2, driver);
            User();
            Me.Sleep(500);
            Me.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_TestChangeRoleSupportTo_Admin_Test7() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(3, driver);
            Support();

            Me.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_TestChangeRoleSupportTo_User_Test8() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(3, driver);
            Support();

            Me.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Кабинет 2", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(3, driver);
            Support();

            Me.RoleSwitch(4, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            Me.RoleSwitch(1, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_TestChangeRoleBillingEditorToUser__Test11() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            Me.RoleSwitch(2, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Кабинет 2", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_TestChangeRoleBillingEditorToSupport__Test12() {
        try {
            Me.LogPass(LogAll, pass, driver);
            Me.RoleSwitch(4, driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

            Me.RoleSwitch(3, driver);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("СОГАЗ - Омский филиал", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void Admin() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("Все контрагенты", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    private void User() {
        Me.Sleep(500);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("Кабинет 2", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(2200);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    private void Support() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("СОГАЗ - Омский филиал", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}