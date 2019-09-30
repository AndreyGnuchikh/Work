package iitFirefox.login_testedo;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.Settings;
import iitAdd.testedo;
import org.junit.Ignore;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_LoginLogPass_Test1 extends testedo {
    public WebDriver driver;
    public String checking;
     @BeforeEach
    void setUp() {
         try {
        // TODO WebDriver add in test
        driver = Drivers.ff();
        driver.get(url);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }


    @Test
    @Order(1)
     void A_AllRightTest1() {
        try {
        Me.LogPass(log1log, pass, driver);
        checking = driver.findElement(By.className("auth__button")).getText();
        System.out.println(checking);
        Me.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }

    @Test
    @Order(2)
    void B_ContragentIsDisconnectedTest2() {
        try {
        Me.LogPass(log2log, pass, driver);
        checking = driver.findElement(By.id("alertMessage")).getText();

        System.out.println(checking);
        Me.CheckExit("Внимание! Не удалось войти на портал. Контрагент отключен.", checking, driver);
    }catch (Throwable e) {
        Me.Catch(driver,e);
    }
}

    @Test
    @Order(3)
    void C_ContragentIsBlockedTest3() {
        try {
        Me.LogPass(log3log, pass, driver);
        checking = driver.findElement(By.cssSelector("#alertMessage > p:nth-child(3)")).getText();

        System.out.println(checking);
        Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
    }catch (Throwable e) {
        Me.Catch(driver,e);
    }
}

    @Test
    @Order(4)
    void D_UserDontCatchtoContragentTest4() {
        try {
        Me.LogPass(log4log, pass, driver);
        checking = driver.findElement(By.id("alertMessage")).getText();

        System.out.println(checking);
        Me.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
        }catch (Throwable e) {
        Me.Catch(driver,e);
    }
}

    @Test
    @Order(5)
    void E_UserIsBlockedTest5() {
        try {
            Me.LogPass(log5log, pass, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Me.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_UserDontHaveRole6() {
         try {
        Me.LogPass(log6log, pass, driver);
        checking = driver.findElement(By.id("alertMessage")).getText();

        System.out.println(checking);
        Me.CheckExit("Внимание! У пользователя не назначена роль.", checking, driver);
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(7)
    void G_UserDontHaveCabinet7() {
         try {
        Me.LogPass(log7log, pass, driver);
        checking = driver.findElement(By.cssSelector("#alertMessage > a:nth-child(5)")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(8)
    void H_WrongLogPass8() {
         try {
        Me.LogPass(wrong7log, wrong7log, driver);
        checking = driver.findElement(By.id("alertMessage")).getText();
        System.out.println(checking);
        Me.CheckExit("Внимание! Авторизоваться не получилось.\n" +
                "Проверьте правильность логина и пароля или подключение ключа ЭП", checking, driver);
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

}
