package iitChrome.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class J_ChangeStartTap_Test10 extends iit8077{
    private WebDriver driver;
    public String test;

     @BeforeEach
    void setUp() {
        driver = Drivers.chrome();
    }

    @Test
    void A_ChangeStartTap_Test1() {
        driver.get(url9);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(ur19_2, test, driver);
    }

    @Test
    void B_ChangeStartTapLogin1_Test2() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/h1")).getText();
        System.out.println(test);
        Me.CheckExit("Приветствуем, укцу", test, driver);
    }

    @Test
    void C_ChangeStartTapLogin2_Test3() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/h1")).getText();
        System.out.println(test);
        Me.Check("Приветствуем, укцу", test, driver);
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/div/a/button")).click();
        test = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/div/h1")).getText();
        System.out.println(test);
        Me.CheckExit("Все контрагенты", test, driver);
    }

    @Test
    void D_ChangeStartTapLogout1_Test4() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(url, test, driver);
    }

    @Test
    void E_ChangeStartTapLogout2_Test5() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.Check(url, test, driver);
        test = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        System.out.println(test);
        Me.CheckExit("Вход в личный кабинет", test, driver);
    }
}
