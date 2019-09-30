package iitChrome.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D_ChooseRoleAndCabinet_Test4 extends iit8077{
    private WebDriver driver;
    public String checking;

     @BeforeEach
    void setUp() {
        driver = Drivers.chrome();
        driver.get(url);
    }

    @Test
    void A_UserWithOneCabinet_Test1() {
        Me.LogPass(logUser, pass, driver);
        Me.Sleep(500);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Кабинет 1", checking, driver);
    }

    @Test
    void B_WithOneCabinet_Test2() {
        Me.LogPass(logAdmin, pass, driver);
        Me.Sleep(2000);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Все контрагенты", checking, driver);
    }

    @Test
    void C_WithOneSupport_Test3() {
        Me.LogPass(logSupport, pass, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div/div/div/div[1]/label")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Выберите кабинет:", checking, driver);
    }

    @Test
    void D_WithOneBylling_Test4() {
        Me.LogPass(logBilling, pass, driver);
        Me.Sleep(2000);
        checking = driver.findElement(By.cssSelector("#billing")).getText();
        System.out.println(checking);
        Me.CheckExit("Биллинг", checking, driver);
    }

    @Test
    void E_WithAB_Test5() {
        Me.LogPass(logAdminBilling, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[1]/span/span[1]/span/span[2]/b")).click();
        checking = driver.findElement(By.id("select2-role-results")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Admin\n" +
                "BillingEditor", checking, driver);
    }

    @Test
    void F_WithALL_Test6() {
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div/div/div/div[1]/span")).click();
        checking = driver.findElement(By.id("select2-role-results")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Admin\nUser\nSupport\nBillingEditor", checking, driver);

    }

    @Test
    void G_User5cabinet_Test7() {
        Me.LogPass(logManyCabinets, pass, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[1]/span/span[1]/span/span[2]/b")).click();
        checking = driver.findElement(By.id("cabinet")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Переименованный кабинет\nВсе хорошо кабинет\nКабинет Все хорошо\nТест 150\nВсе хорошо тест бд", checking, driver);
    }


}