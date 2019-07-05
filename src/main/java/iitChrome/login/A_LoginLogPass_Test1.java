package iitChrome.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A_LoginLogPass_Test1 {
    public WebDriver driver;
    public String checking;
    @Before
    public void setUp() {
        // TODO WebDriver add in test
        driver = Drivers.chrome();
        driver.get(p.url1);
    }

    @Test
    public void A_AllRightTest1() {
        Me.LogPass(p.log1log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).getText();

        System.out.println(checking);
        Me.CheckExit("Выбрать", checking, driver);
    }

    @Test
    public void B_ContragentIsDisconnectedTest2() {
        Me.LogPass(p.log2log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Не удалось войти на портал. Контрагент отключен.", checking, driver);
    }

    @Test
    public void C_ContragentIsBlockedTest3() {
        Me.LogPass(p.log3log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]/p[1]")).getText();

        System.out.println(checking);
        Me.CheckExit("УВАЖАЕМЫЙ ПОЛЬЗОВАТЕЛЬ УСЛУГ ОПЕРАТОРА ЭДО!", checking, driver);
    }

    @Test
    public void D_UserDontCatchtoContragentTest4() {
        Me.LogPass(p.log4log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь не прикреплен ни к одному контрагенту.", checking, driver);
    }

    @Test
    public void E_UserIsBlockedTest5() {
        Me.LogPass(p.log5log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("Вход в личный кабинет невозможен. Пользователь заблокирован", checking, driver);
    }

    @Test
    public void F_UserDontHaveRole6() {
        Me.LogPass(p.log6log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("У пользователя не назначена роль.", checking, driver);
    }

    @Test
    public void G_UserDontHaveCabinet7() {
        Me.LogPass(p.log7log, p.pass1log, driver);
        checking = driver.findElement(By.xpath("/html/body/div[2]/div/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    @Test
    public void H_WrongLogPass8() {
        Me.LogPass(p.wrong7log, p.wrong7log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
        System.out.println(checking);
        Me.CheckExit("Авторизоваться не получилось. Проверьте правильность логина и пароля или подключение ключа ЭП", checking, driver);
    }

}
