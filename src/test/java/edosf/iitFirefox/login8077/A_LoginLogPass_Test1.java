package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class A_LoginLogPass_Test1 implements Iit8077 {

    public WebDriver driver;
    public String checking;


    @BeforeEach
    void setUp() {
        try {
            // TODO WebDriver add in test
            driver = Drivers.ff();
            driver.get(URL);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ���������� ������������ ��������� ��� �������.")
    void A_AllRightTest1() {
        try {
            EnterAndExit.LogPass(LOG1LOG, PASS, driver);
            checking = driver.findElement(By.className("auth__button")).getText();
            System.out.println(checking);
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)

    @DisplayName("�������� ������ ��� ����� ������������ � ����������� ������������.")
    void B_ContragentIsDisconnectedTest2() {
        try {
            EnterAndExit.LogPass(LOG2LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! �� ������� ����� �� ������. ���������� ��������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ������������ � ��������������� ������������.")
    void C_ContragentIsBlockedTest3() {
        try {
            EnterAndExit.LogPass(LOG3LOG, PASS, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();

            System.out.println(checking);
            Check.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ������������, ���� �� ��� ������������.")
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
    @DisplayName("�������� ������ ��� ����� ���������������� ������������.")
    void D_UserIsBlockedTest4() {
        try {
            EnterAndExit.LogPass(LOG5LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ ������������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ���������������� ������������.")
    void E_UserDontHaveRole5() {
        try {
            EnterAndExit.LogPass(LOG6LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! � ������������ �� ��������� ����.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

 /*   @RetryingTest(NUM_FAIL)
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
    @DisplayName("�������� ������ ��� ����� ������������ � ������� � ������ ��� ������.")
    void F_WrongLogPass6() {
        try {
            EnterAndExit.LogPass(WRONG_7_LOG, WRONG_7_LOG, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! �������������� �� ����������. ��������� ������������ ������ � ������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
