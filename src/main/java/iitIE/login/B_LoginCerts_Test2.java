package iitIE.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;

public class B_LoginCerts_Test2 {
    public String checking;
    private WebDriver driver;

    @Before
    public void Before() {
        driver = Drivers.ie();
        driver.get(p.url2);
    }

    @Test
    public void A_ValidDate_Test1() {

        Me.loggingCerts(p.fio, driver);
        checking = driver.findElement(By.cssSelector(".roles > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")).getText();

        System.out.println(checking);
        Me.CheckExit("Выбрать", checking, driver);
    }

    @Test
    public void B_ContragentIsDisconnect_Test2() {
        Me.loggingCerts(p.fio2, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
        System.out.println(checking);
        Me.CheckExit("Не удалось войти на портал. Контрагент отключен.", checking, driver);
    }

    @Test
    public void C_ContragentIsBlock_Test3() {
        Me.loggingCerts(p.fio3, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]/p[1]")).getText();
        System.out.println(checking);
        Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
    }

    @Test
    public void D_UserNoCabinet_Test4() {
        Me.loggingCerts(p.fio4, driver);
        checking = driver.findElement(By.id("alertText")).getText();
        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
    }

    @Test
    public void E_UserIsBlock_Test5() {
        Me.loggingCerts(p.fio5, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
    }

    @Test
    public void F_UserNoHaveRole_Test6() {
        Me.loggingCerts(p.fio6, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("У пользователя не назначена роль.", checking, driver);
    }

    @Test
    public void G_UserNoHaveCabinetTest7() {
        Me.loggingCerts(p.fio7, driver);
        checking = driver.findElement(By.xpath("/html/body/div[2]/div/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    //    @Test
//    public void H_NoValidation_Test8() {
//        Me.loggingCerts(p.fio8, driver);
//        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
//        System.out.println(checking);
//        Me.CheckExit("Сертификат не прошел валидацию в удостоверяющем центре.", checking, driver);
//    }
    @Test
    public void I_NoConnectUser_Test9() {
        Me.loggingCerts(p.fio9, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/span/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    @Test
    public void J_KeyDontInput10() throws InterruptedException, IOException {
        Me.loggingCerts(p.fio10, driver);
        getRuntime().exec("taskkill /im nmcades.exe");
        Me.Sleep(5000);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div")).getText();
        System.out.println(checking);
        Me.CheckExit("Ошибка авторизации", checking, driver);
    }

    @Test
    public void K_Test_Test11() {
        driver.get(p.url2);
        System.out.println("11 тест Doesn't actual. If cert is does not correct it doesn't collect");
        System.out.println("Test is successful");
        driver.quit();
    }
}
