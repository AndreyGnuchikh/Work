package iitFirefox.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import iitAdd.testedo;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Runtime.getRuntime;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class B_LoginCerts_Test2 extends iit8077 {
    public String checking;
    private WebDriver driver;

    @BeforeEach
    void Before() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_ValidDate_Test1() {
        try {
            Me.loggingCerts(fio, driver);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Me.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ContragentIsDisconnect_Test2() {
        try {
            Me.loggingCerts(fio2, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Me.CheckExit("Внимание! Не удалось войти на портал. Контрагент отключен.", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_ContragentIsBlock_Test3() {
        try {
            Me.loggingCerts(fio3, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > p:nth-child(3)")).getText();
            System.out.println(checking);
            Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_UserNoCabinet_Test4() {
        try {
            Me.loggingCerts(fio4, driver);
            Me.Sleep(1500);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Me.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_UserIsBlock_Test5() {
        try {
            Me.loggingCerts(fio5, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Me.CheckExit("Внимание! Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_UserNoHaveRole_Test6() {
        try {
            Me.loggingCerts(fio6, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Me.CheckExit("Внимание! У пользователя не назначена роль.", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_UserNoHaveCabinetTest7() {
        try {
            Me.loggingCerts(fio7, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > a:nth-child(5)")).getText();
            System.out.println(checking);
            Me.CheckExit("support@iit.ru", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    //    @Test
    //@Order(8)
//    void H_NoValidation_Test8() {
//    try {
//        Me.loggingCerts(fio8, driver);
//      checking = driver.findElement(By.id("alertMessage")).getText();
//        System.out.println(checking);
//        Me.CheckExit("Сертификат не прошел валидацию в удостоверяющем центре.", checking, driver);
//    }catch (Throwable e) {
//             Me.Catch(driver, e);
//         }
//    }
/*    @Test
    //@Order(9)
   try {
    void I_NoConnectUser_Test9() {
        Me.loggingCerts(fio9, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/span/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }*/

    @Test
    @Order(10)
    void J_KeyDontInput10() {
        try {
            Me.loggingCerts(fio10, driver);
            getRuntime().exec("taskkill /im nmcades.exe");
            Me.Sleep(2000);
            checking = driver.findElement(By.cssSelector("p.text-center")).getText();
            System.out.println(checking);
            Me.CheckExit("Ошибка авторизации", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_Test_Test11() {
        try {
            driver.get(url);
            System.out.println("11 тест Doesn't actual. If cert is does not correct it doesn't collect");
            System.out.println("Test is successful");
            driver.quit();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
