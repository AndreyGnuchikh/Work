package EDOSF.iitFirefox.login8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class D_ChooseRoleAndCabinet_Test4 extends iit8077 {
    private WebDriver driver;
    public String checking;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_UserWithOneCabinet_Test1() {
        try {
            EnterAndExit.LogPass(logUser, pass, driver);
            Thread.sleep(500);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Кабинет 1", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_WithOneCabinet_Test2() {
        try {
            EnterAndExit.LogPass(logAdmin, pass, driver);
            Thread.sleep(2000);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Все контрагенты", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_WithOneSupport_Test3() {
        try {
            EnterAndExit.LogPass(logSupport, pass, driver);
            checking = driver.findElement(By.cssSelector(".cabinets > div:nth-child(1) > label:nth-child(1)")).getText();
            System.out.println(checking + "/");
            Check.CheckExit("Выберите кабинет:", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_WithOneBylling_Test4() {
        try {
            EnterAndExit.LogPass(logBilling, pass, driver);
            Thread.sleep(2000);
            checking = driver.findElement(By.cssSelector(".d-none")).getText();
            System.out.println(checking);
            Check.CheckExit("БИЛ", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_WithAB_Test5() {
        try {
            EnterAndExit.LogPass(logAdminBilling, pass, driver);
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            checking = driver.findElement(By.id("select2-role-results")).getText();
            System.out.println(checking + "/");
            Check.CheckExit("Admin\n" +
                    "BillingEditor", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_WithALL_Test6() {
        try {
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            checking = driver.findElement(By.id("select2-role-results")).getText();
            System.out.println(checking + "/");
            Check.CheckExit("Admin\n" +
                    "User\n" +
                    "Support\n" +
                    "BillingEditor", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_User4cabinet_Test7() {
        try {
            EnterAndExit.LogPass(logManyCabinets, pass, driver);
            Thread.sleep(1000);
            EnterAndExit.RoleSwitch(2,driver);
            Thread.sleep(1000);
            driver.findElement(By.id("select2-cabinet-container")).click();
            Thread.sleep(1000);
            checking = driver.findElement(By.className("select2-results__options")).getAttribute("innerText");
            System.out.println(checking + "/");
            Check.CheckExit("Переименованный кабинет\n" +
                    "Кабинет Все хорошо\n" +
                    "Все хорошо кабинет\n" +
                    "Все хорошо тест бд\n" +
                    "Тест 150", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}