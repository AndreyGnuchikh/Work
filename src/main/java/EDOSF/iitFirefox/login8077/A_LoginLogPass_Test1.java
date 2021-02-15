package EDOSF.iitFirefox.login8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import OFD.methods.RetryRule;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NumFail;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_LoginLogPass_Test1 extends iit8077 {

    public WebDriver driver;
    public String checking;

    @Rule
    public RetryRule rule = new RetryRule(NumFail);

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
    @Test
    @Order(1)
    void A_AllRightTest1() {
        try {
            EnterAndExit.LogPass(log1log, pass, driver);
            checking = driver.findElement(By.className("auth__button")).getText();
            System.out.println(checking);
            Check.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ContragentIsDisconnectedTest2() {
        try {
            EnterAndExit.LogPass(log2log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! Не удалось войти на портал. Контрагент отключен.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_ContragentIsBlockedTest3() {
        try {
            EnterAndExit.LogPass(log3log, pass, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();

            System.out.println(checking);
            Check.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @Test
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

    @Test
    @Order(5)
    void D_UserIsBlockedTest4() {
        try {
            EnterAndExit.LogPass(log5log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь заблокирован.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void E_UserDontHaveRole5() {
        try {
            EnterAndExit.LogPass(log6log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("Внимание! У пользователя не назначена роль.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

 /*   @Test
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

    @Test
    @Order(8)
    void F_WrongLogPass6() {
        try {
            EnterAndExit.LogPass(wrong7log, wrong7log, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("Внимание! Авторизоваться не получилось. Проверьте правильность логина и пароля", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
