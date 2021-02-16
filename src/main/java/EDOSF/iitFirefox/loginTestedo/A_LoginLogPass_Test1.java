package EDOSF.iitFirefox.loginTestedo;

import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NUM_FAIL;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_LoginLogPass_Test1 extends testedo {




    public WebDriver driver;
    public String checking;


    @RetryingTest(NUM_FAIL)
    @BeforeEach
    void setUp() {
        try {
            // TODO WebDriver add in test
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_AllRightTest1() {
        try {
            EnterAndExit.LogPass(log1log, pass, driver);
            checking = driver.findElement(By.className("auth__button")).getText();
            System.out.println(checking);
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_ContragentIsDisconnectedTest2() {
        try {
            EnterAndExit.LogPass(log2log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! �� ������� ����� �� ������. ���������� ��������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_ContragentIsBlockedTest3() {
        try {
            EnterAndExit.LogPass(log3log, pass, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();

            System.out.println(checking);
            Check.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_UserDontCatchtoContragentTest4() {
        try {
            Enter.LogPass(log4log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ �� ���������� �� � ������ �����������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void D_UserIsBlockedTest4() {
        try {
            EnterAndExit.LogPass(log5log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ ������������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void E_UserDontHaveRole5() {
        try {
            EnterAndExit.LogPass(log6log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! � ������������ �� ��������� ����.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

 /*   @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_UserDontHaveCabinet7() {
        try {
            Enter.LogPass(log7log, pass, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > a:nth-child(5)")).getText();
            System.out.println(checking);
            Check.CheckExit("support@iit.ru", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void F_WrongLogPass6() {
        try {
            EnterAndExit.LogPass(wrong7log, wrong7log, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! �������������� �� ����������. ��������� ������������ ������ � ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
