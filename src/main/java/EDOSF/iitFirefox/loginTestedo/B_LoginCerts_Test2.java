package EDOSF.iitFirefox.loginTestedo;


import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junitpioneer.jupiter.RetryingTest;

import static EDOSF.iitAdd.Settings.NUM_FAIL;
import static java.lang.Runtime.getRuntime;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class B_LoginCerts_Test2 extends testedo {
    public String checking;
    private WebDriver driver;




    @BeforeEach
    void Before() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_ValidDate_Test1() {
        try {
            EnterAndExit.loggingCerts(fio, driver);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Thread.sleep(500);
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_ContragentIsDisconnect_Test2() {
        try {
            EnterAndExit.loggingCerts(fio2, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! �� ������� ����� �� ������. ���������� ��������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_ContragentIsBlock_Test3() {
        try {
            EnterAndExit.loggingCerts(fio3, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();
            System.out.println(checking);
            Check.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_UserNoCabinet_Test4() {
        try {
            Enter.loggingCerts(fio4, driver);
            Thread.sleep(1500);
            Enter.RoleSwitch(2,driver);
            Thread.sleep(2500);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! ��� �������� ������������ ����������� �������� ��� ������.\n" +
                    "��� ��������� ������� � ������� �������� ���������� � ����������� ��������� ��� \"���\":\n" +
                    "���: 8 (499) 262 24 25\n" +
                    "e-mail: support@iit.ru", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void D_UserIsBlock_Test4() {
        try {
            EnterAndExit.loggingCerts(fio5, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ ������������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void E_UserNoHaveRole_Test5() {
        try {
            EnterAndExit.loggingCerts(fio6, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! � ������������ �� ��������� ����.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

   /* @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_UserNoHaveCabinetTest7() {
        try {
            Enter.loggingCerts(fio7, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > a:nth-child(5)")).getText();
            System.out.println(checking);
            Check.CheckExit("support@iit.ru", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    //    @RetryingTest(NUM_FAIL)
    //@Order(8)
//    void H_NoValidation_Test8() {
//    try {
//        Enter.loggingCerts(fio8, driver);
//      checking = driver.findElement(By.id("alertMessage")).getText();
//        System.out.println(checking);
//        Check.CheckExit("���������� �� ������ ��������� � �������������� ������.", checking, driver);
//    }catch (Throwable e) {
//             Cabinet.Catch(driver, e);
//         }
//    }
/*    @RetryingTest(NUM_FAIL)
    //@Order(9)
   try {
    void I_NoConnectUser_Test9() {
        Enter.loggingCerts(fio9, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/span/a")).getText();
        System.out.println(checking);
        Check.CheckExit("support@iit.ru", checking, driver);
    }catch (Throwable e) {
             Cabinet.Catch(driver, e);
         }
    }*/

    @RetryingTest(NUM_FAIL)
    @Order(10)
    void F_KeyDontInput6() {
        try {
            EnterAndExit.loggingCerts(fio10, driver);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(2000);
            checking = driver.findElement(By.cssSelector("p.text-center")).getText();
            System.out.println(checking);
            Check.CheckExit("������ �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
