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
import static java.lang.Runtime.getRuntime;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class B_LoginCerts_Test2 implements Iit8077 {
    public String checking;
    private WebDriver driver;



    @BeforeEach
    void Before() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("������������� ���� �������� �������� �� ����� ��")
    void A_ValidDate_Test1() {
        try {
            EnterAndExit.loggingCerts(FIO, driver);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Thread.sleep(500);
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ������������ � ����������� ������������.\n")
    void B_ContragentIsDisconnect_Test2() {
        try {
            EnterAndExit.loggingCerts(FIO2, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! �� ������� ����� �� ������. ���������� ��������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ������������ � ��������������� ������������.\n")
    void C_ContragentIsBlock_Test3() {
        try {
            EnterAndExit.loggingCerts(FIO3, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();
            System.out.println(checking);
            Check.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @RetryingTest(NUM_FAIL)
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
    @DisplayName("�������� ������ ��� ����� ������������, ���� �� ��� ������������.\n")
    void D_UserIsBlock_Test4() {
        try {
            EnterAndExit.loggingCerts(FIO5, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ ������������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("�������� ������ ��� ����� ������������, � �������� ��� ����.\n")
    void E_UserNoHaveRole_Test5() {
        try {
            EnterAndExit.loggingCerts(FIO6, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! � ������������ �� ��������� ����.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

   /* @RetryingTest(NUM_FAIL)
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
    @DisplayName("�������� ������ ��� ����� ������������, ���� ������ �� ��� ������.\n")
    void F_KeyDontInput6() {
        try {
            EnterAndExit.loggingCerts(FIO10, driver);
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
