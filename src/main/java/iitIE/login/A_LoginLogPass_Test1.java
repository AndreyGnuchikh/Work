package iitIE.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A_LoginLogPass_Test1 extends iit8077{
    public WebDriver driver;
    public String checking;
     @BeforeEach
    void setUp() {
        // TODO WebDriver add in test
        driver = Drivers.ie();
        driver.get(url);
    }

    @Test
    void A_AllRightTest1() {
        Me.LogPass(log1log, pass, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).getText();

        System.out.println(checking);
        Me.CheckExit("Выбрать", checking, driver);
    }

    @Test
    void B_ContragentIsDisconnectedTest2() {
        Me.LogPass(log2log, pass, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Не удалось войти на портал. Контрагент отключен.", checking, driver);
    }

    @Test
    void C_ContragentIsBlockedTest3() {
        Me.LogPass(log3log, pass, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]/p[1]")).getText();

        System.out.println(checking);
        Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
    }

    @Test
    void D_UserDontCatchtoContragentTest4() {
        Me.LogPass(log4log, pass, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
    }

    @Test
    void E_UserIsBlockedTest5() {
        Me.LogPass(log5log, pass, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
    }

    @Test
    void F_UserDontHaveRole6() {
        Me.LogPass(log6log, pass, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("У пользователя не назначена роль.", checking, driver);
    }

    @Test
    void G_UserDontHaveCabinet7() {
        Me.LogPass(log7log, pass, driver);
        checking = driver.findElement(By.xpath("/html/body/div[2]/div/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    @Test
    void H_WrongLogPass8() {
        Me.LogPass(wrong7log, wrong7log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
        System.out.println(checking);
        Me.CheckExit("Авторизоваться не получилось. Проверьте правильность логина и пароля или подключение ключа ЭП", checking, driver);
    }

}
