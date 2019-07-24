package iitFirefox.login_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class I_ChangeStartTap_Test9 {
    private WebDriver driver;
    public String test;

    @Before
    public void setUp() {
        driver = Drivers.ff();
    }

    @Test
    public void A_ChangeStartTap_Test1() {
        driver.get(p8080.url9);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(p8080.ur19_2, test, driver);
    }

    @Test
    public void B_ChangeStartTapLogin1_Test2() {
        driver.get(p8080.url);
        Me.LogPass(p8080.q9log1, p8080.q9pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/h1")).getText();
        System.out.println(test);
        Me.CheckExit("Приветствуем, Все", test, driver);
    }

    @Test
    public void C_ChangeStartTapLogin2_Test3() {
        driver.get(p8080.url);
        Me.LogPass(p8080.q9log1, p8080.q9pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
        test = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/h1")).getText();
        System.out.println(test);
        Me.Check("Приветствуем, Все", test, driver);
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div[2]/div[2]/div/a/button")).click();
        test = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/div/h1")).getText();
        System.out.println(test);
        Me.CheckExit("Все контрагенты", test, driver);
    }

    @Test
    public void D_ChangeStartTapLogout1_Test4() {
        driver.get(p8080.url);
        Me.LogPass(p8080.q9log1, p8080.q9pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.CheckExit(p8080.url2, test, driver);
    }

    @Test
    public void E_ChangeStartTapLogout2_Test5() {
        driver.get(p8080.url);
        Me.LogPass(p8080.q9log1, p8080.q9pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a")).click();
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.Check(p8080.url2, test, driver);
        test = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        System.out.println(test);
        Me.CheckExit("Вход в личный кабинет", test, driver);
    }
}
