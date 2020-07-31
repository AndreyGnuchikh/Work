package iitFirefox.loginTestedo;


import iitAdd.Drivers;
import iitAdd.iit8077;
import iitAdd.testedo;
import methods.Cabinet;
import methods.Check;
import methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    @Test
    @Order(1)
    void A_ValidDate_Test1() {
        try {
            EnterAndExit.loggingCerts8080(fio, driver);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Thread.sleep(500);
            Check.CheckExit("�������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ContragentIsDisconnect_Test2() {
        try {
            EnterAndExit.loggingCerts8080(fio2, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();
            System.out.println(checking);
            Check.CheckExit("��������! �� ������� ����� �� ������. ���������� ��������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_ContragentIsBlock_Test3() {
        try {
            EnterAndExit.loggingCerts8080(fio3, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > div:nth-child(3)")).getText();
            System.out.println(checking);
            Check.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

/*    @Test
    @Order(4)
    void D_UserNoCabinet_Test4() {
        try {
            Enter.loggingCerts8080(fio4, driver);
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

    @Test
    @Order(5)
    void E_UserIsBlock_Test5() {
        try {
            EnterAndExit.loggingCerts8080(fio5, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! ���� � ������ ������� ����������. ������������ ������������.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_UserNoHaveRole_Test6() {
        try {
            EnterAndExit.loggingCerts8080(fio6, driver);
            checking = driver.findElement(By.id("alertMessage")).getText();

            System.out.println(checking);
            Check.CheckExit("��������! � ������������ �� ��������� ����.", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

   /* @Test
    @Order(7)
    void G_UserNoHaveCabinetTest7() {
        try {
            Enter.loggingCerts8080(fio7, driver);
            checking = driver.findElement(By.cssSelector("#alertMessage > a:nth-child(5)")).getText();
            System.out.println(checking);
            Check.CheckExit("support@iit.ru", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    //    @Test
    //@Order(8)
//    void H_NoValidation_Test8() {
//    try {
//        Enter.loggingCerts8080(fio8, driver);
//      checking = driver.findElement(By.id("alertMessage")).getText();
//        System.out.println(checking);
//        Check.CheckExit("���������� �� ������ ��������� � �������������� ������.", checking, driver);
//    }catch (Throwable e) {
//             Cabinet.Catch(driver, e);
//         }
//    }
/*    @Test
    //@Order(9)
   try {
    void I_NoConnectUser_Test9() {
        Enter.loggingCerts8080(fio9, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/span/a")).getText();
        System.out.println(checking);
        Check.CheckExit("support@iit.ru", checking, driver);
    }catch (Throwable e) {
             Cabinet.Catch(driver, e);
         }
    }*/

    @Test
    @Order(10)
    void J_KeyDontInput10() {
        try {
            EnterAndExit.loggingCerts8080(fio10, driver);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(2000);
            checking = driver.findElement(By.cssSelector("p.text-center")).getText();
            System.out.println(checking);
            Check.CheckExit("������ �����������", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_Test_Test11() {
        try {
            driver.get(url);
            System.out.println("11 ���� Doesn't actual. If cert is does not correct it doesn't collect");
            System.out.println("Test is successful");
            driver.quit();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
