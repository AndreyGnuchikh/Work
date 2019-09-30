package iitChrome.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;

public class B_LoginCerts_Test2 extends iit8077{
    public String checking;
    private WebDriver driver;

     @BeforeEach
    void Before() {
        driver = Drivers.chrome();
        driver.get(url);
    }

    @Test
    void A_ValidDate_Test1() {

        Me.loggingCerts(fio, driver);
        checking = driver.findElement(By.cssSelector(".roles > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")).getText();

        System.out.println(checking);
        Me.CheckExit("Выбрать", checking, driver);
    }

    @Test
    void B_ContragentIsDisconnect_Test2() {
        Me.loggingCerts(fio2, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
        System.out.println(checking);
        Me.CheckExit("Не удалось войти на портал. Контрагент отключен.", checking, driver);
    }

    @Test
    void C_ContragentIsBlock_Test3() {
        Me.loggingCerts(fio3, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]/p[1]")).getText();
        System.out.println(checking);
        Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
    }

    @Test
    void D_UserNoCabinet_Test4() {
        Me.loggingCerts(fio4, driver);
        checking = driver.findElement(By.id("alertText")).getText();
        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
    }

    @Test
    void E_UserIsBlock_Test5() {
        Me.loggingCerts(fio5, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
    }

    @Test
    void F_UserNoHaveRole_Test6() {
        Me.loggingCerts(fio6, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("У пользователя не назначена роль.", checking, driver);
    }

    @Test
    void G_UserNoHaveCabinetTest7() {
        Me.loggingCerts(fio7, driver);
        checking = driver.findElement(By.xpath("/html/body/div[2]/div/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    //    @Test
//    void H_NoValidation_Test8() {
//        Me.loggingCerts(p.fio8, driver);
//        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
//        System.out.println(checking);
//        Me.CheckExit("Сертификат не прошел валидацию в удостоверяющем центре.", checking, driver);
//    }
/*    @Test
    void I_NoConnectUser_Test9() {
        Me.loggingCerts(p.fio9, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/span/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }*/

    @Test
    void J_KeyDontInput10() throws InterruptedException, IOException {
        Me.loggingCerts(fio10, driver);
        getRuntime().exec("taskkill /im nmcades.exe");
        Me.Sleep(3000);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div")).getText();
        System.out.println(checking);
        Me.CheckExit("Ошибка авторизации", checking, driver);
    }

    @Test
    void K_Test_Test11() {
        driver.get(url);
        System.out.println("11 тест Doesn't actual. If cert is does not correct it doesn't collect");
        System.out.println("Test is successful");
        driver.quit();
    }
}
