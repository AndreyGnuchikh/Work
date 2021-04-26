package edosf.iitFirefox.loginTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class D_ChooseRoleAndCabinet_Test4 implements Testedo {
    private WebDriver driver;
    public String checking;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_UserWithOneCabinet_Test1() {
        try {
            EnterAndExit.LogPass(LOG_USER, PASS, driver);
            Thread.sleep(500);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("������� 1", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_WithOneCabinet_Test2() {
        try {
            EnterAndExit.LogPass(LOG_ADMIN, PASS, driver);
            Thread.sleep(2000);
            checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��� �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_WithOneSupport_Test3() {
        try {
            EnterAndExit.LogPass(LOG_SUPPORT, PASS, driver);
            checking = driver.findElement(By.cssSelector(".cabinets > div:nth-child(1) > label:nth-child(1)")).getText();
            System.out.println(checking + "/");
            Check.CheckExit("�������� �������:", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_WithOneBylling_Test4() {
        try {
            EnterAndExit.LogPass(LOG_BILLING, PASS, driver);
            Thread.sleep(3000);
            checking = driver.findElement(By.cssSelector(".d-none")).getText();
            System.out.println(checking);
            Check.CheckingContainsExit("���", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_WithAB_Test5() {
        try {
            EnterAndExit.LogPass(LOG_ADMIN_BILLING, PASS, driver);
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            checking = driver.findElement(By.id("select2-role-results")).getText();
            System.out.println(checking + "/");
            Check.CheckExit("Admin\n" +
                    "BillingEditor", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void F_WithALL_Test6() {
        try {
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
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

    @RetryingTest(NUM_FAIL)
    void G_User4cabinet_Test7() {
        try {
            EnterAndExit.LogPass(LOG_MANY_CABINETS, PASS, driver);
            Thread.sleep(1000);
            EnterAndExit.RoleSwitch(2,driver);
            Thread.sleep(1000);
            driver.findElement(By.id("select2-cabinet-container")).click();
            Thread.sleep(1000);
            checking = driver.findElement(By.className("select2-results__options")).getAttribute("innerText");
            System.out.println(checking + "/");
            Check.CheckExit("��������������� �������\n" +
                    "������� ��� ������\n" +
                    "��� ������ �������\n" +
                    "��� ������ ���� ��\n" +
                    "���� 150", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}