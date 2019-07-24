package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import iitAdd.p;

public class J_ChangeStartTap_Test10 {
    private WebDriver driver;
    public String test;

    @Before
    public void setUp() {
        driver = Drivers.ff();
    }

    @Test
    public void A_ChangeStartTap_Test1() {
        driver.get(p.url9);
        driver.findElement(By.className("header__logo-link")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(p.ur19_2, test, driver);
    }

    @Test
    public void B_ChangeStartTapLogin1_Test2() {
        driver.get(p.url);
        Me.LogPass(p.q9log1, p.q9pass1, driver);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.className("header__title")).getText();
        System.out.println(test);
        Me.CheckExit("Приветствуем, укцу", test, driver);
    }

    @Test
    public void C_ChangeStartTapLogin2_Test3() {
        driver.get(p.url);
        Me.LogPass(p.q9log1, p.q9pass1, driver);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.className("header__title")).getText();
        System.out.println(test);
        Me.Check("Приветствуем, укцу", test, driver);
        driver.findElement(By.className("header__btn-enter")).click();
        test = driver.findElement(By.name("adminInfoText")).getText();
        System.out.println(test);
        Me.CheckExit("Все контрагенты", test, driver);
    }

    @Test
    public void D_ChangeStartTapLogout1_Test4() {
        driver.get(p.url);
        Me.LogPass(p.q9log1, p.q9pass1, driver);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(p.url2, test, driver);
    }

    @Test
    public void E_ChangeStartTapLogout2_Test5() {
        driver.get(p.url);
        Me.LogPass(p.q9log1, p.q9pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.Check(p.url2, test, driver);
        test = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        System.out.println(test);
        Me.CheckExit("Вход в личный кабинет", test, driver);
    }
}
