package iitFirefox.login_testedo;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.testedo;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class D_ChooseRoleAndCabinet_Test4 extends testedo {
    private WebDriver driver;
    public String checking;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_UserWithOneCabinet_Test1() {
        try {
            Me.LogPass(logUser, pass, driver);
            Me.Sleep(500);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Кабинет Тест Вход 1", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_WithOneCabinet_Test2() {
        try {
            Me.LogPass(logAdmin, pass, driver);
            Me.Sleep(2000);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Me.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_WithOneSupport_Test3() {
        try {
            Me.LogPass(logSupport, pass, driver);
            checking = driver.findElement(By.cssSelector(".cabinets > div:nth-child(1) > label:nth-child(1)")).getText();
            System.out.println(checking + "/");
            Me.CheckExit("Выберите кабинет:", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_WithOneBylling_Test4() {
        try {
            Me.LogPass(logBilling, pass, driver);
            Me.Sleep(2000);
            checking = driver.findElement(By.cssSelector("#bilLev1")).getText();
            System.out.println(checking);
            Me.CheckExit("Биллинг", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_WithAB_Test5() {
        try {
            Me.LogPass(logAdminBilling, pass, driver);
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            checking = driver.findElement(By.id("select2-role-results")).getText();
            System.out.println(checking + "/");
            Me.CheckExit("Admin\n" +
                    "BillingEditor", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_WithALL_Test6() {
        try {
            Me.LogPass(LogAll, pass, driver);
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            checking = driver.findElement(By.id("select2-role-results")).getText();
            System.out.println(checking + "/");
            Me.CheckExit("Admin\n" +
                    "User8077\n" +
                    "Support\n" +
                    "BillingEditor", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_User4cabinet_Test7() {
        try {
            Me.LogPass(logManyCabinets, pass, driver);
            Me.Sleep(1000);
            Me.RoleSwitch(2,driver);
            Me.Sleep(1000);
            driver.findElement(By.id("select2-cabinet-container")).click();
            checking = driver.findElement(By.className("select2-results__options")).getAttribute("innerText");
            System.out.println(checking + "/");
            Me.CheckExit("test2\n" +
                    "Unused cabinet\n" +
                    "TestContractor1 Cabinet1\n" +
                    "TestContractor2Cabinet1", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

}