package iitFirefox.login_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D_ChooseRoleAndCabinet_Test4 {
    private WebDriver driver;
    public String checking;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p8080.url2);
    }

    @Test
    public void A_UserWithOneCabinet_Test1() {
        Me.LogPass(p8080.q4log, p8080.pass1log, driver);
        Me.Sleep(500);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Кабинет Тест Вход 1", checking, driver);
    }

    @Test
    public void B_WithOneCabinet_Test2() {
        Me.LogPass(p8080.q4log2, p8080.pass1log, driver);
        Me.Sleep(2000);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Все контрагенты", checking, driver);
    }

    @Test
    public void C_WithOneSupport_Test3() {
        Me.LogPass(p8080.q4log3, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div/div/div/div[1]/label")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Выберите кабинет:", checking, driver);
    }

    @Test
    public void D_WithOneBylling_Test4() {
        Me.LogPass(p8080.q4log4, p8080.pass1log, driver);
        Me.Sleep(2000);
        checking = driver.findElement(By.cssSelector("#billing")).getText();
        System.out.println(checking);
        Me.CheckExit("Биллинг", checking, driver);
    }

    @Test
    public void E_WithAB_Test5() {
        Me.LogPass(p8080.q4log5, p8080.pass1log, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span/span[2]/b")).click();
        checking = driver.findElement(By.id("select2-role-results")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Admin\n" +
                "BillingEditor", checking, driver);
    }

    @Test
    public void F_WithALL_Test6() {
        Me.LogPass(p8080.q4log6, p8080.pass1log, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div/div/div/div[1]/span")).click();
        checking = driver.findElement(By.id("select2-role-results")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("Admin\n" +
                "User\n" +
                "Support\n" +
                "BillingEditor", checking, driver);

    }

    @Test
    public void G_User5cabinet_Test7() {
        Me.LogPass(p8080.q4log7, p8080.pass1log, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[1]/span/span[1]/span/span[2]/b")).click();
        checking = driver.findElement(By.id("role")).getText();
        System.out.println(checking + "/");
        Me.CheckExit("User\n" +
                "Admin\n" +
                "Support\n" +
                "BillingEditor", checking, driver);
    }


}