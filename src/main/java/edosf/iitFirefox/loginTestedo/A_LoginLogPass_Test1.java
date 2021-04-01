package edosf.iitFirefox.loginTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_LoginLogPass_Test1 implements Testedo {




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
    @Order(1)
    void A_AllRightTest1() {
        try {
            EnterAndExit.LogPass(LOG1LOG, PASS, driver);
            checking = driver.findElement(By.className("auth__button")).getText();
            System.out.println(checking);
            Check.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_ContragentIsDisconnectedTest2() {
        try {
            EnterAndExit.LogPass(LOG2LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! Не удалось войти на портал. Контрагент отключен.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_ContragentIsBlockedTest3() {
        try {
            EnterAndExit.LogPass(LOG3LOG, PASS, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();

            System.out.println(checking);
            Check.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
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
            Check.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void D_UserIsBlockedTest4() {
        try {
            EnterAndExit.LogPass(LOG5LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь заблокирован.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void E_UserDontHaveRole5() {
        try {
            EnterAndExit.LogPass(LOG6LOG, PASS, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! У пользователя не назначена роль.", checking, driver);
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
            EnterAndExit.LogPass(WRONG_7LOG, WRONG_7LOG, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("Внимание! Авторизоваться не получилось. Проверьте правильность логина и пароля", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
