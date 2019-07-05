package iitIE.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F_ChangeScopeOfAuthority_Test6 {
    WebDriver driver;
    String test;

    @Before
    public void SetUp() {
        driver = Drivers.ie();
        driver.get(p.url3);
        Me.LogPass(p.q6log1, p.q6pass1, driver);

    }

    @Test
    public void A_DontChange_Test1() {
        role(1, "Не выбрано");
    }

    @Test
    public void B_Change2paragtaph_Test2() {
        role(2, "Лицо, ответственное за подписание счетов-фактур");
    }

    @Test
    public void C_Change3paragtaph_Test3() {
        role(3, "Лицо, совершившее сделку, операцию");
    }

    @Test
    public void D_Change4paragtaph_Test4() {
        role(4, "Лицо, совершившее сделку, операцию и ответственное за ее оформление");
    }

    @Test
    public void E_Change5paragtaph_Test5() {
        role(5, "Лицо, ответственное за оформление свершившегося события");
    }

    @Test
    public void F_Change6paragtaph_Test6() {
        role(6, "Лицо, совершившее сделку, операцию и ответственное за подписание счетов-фактур");
    }

    @Test
    public void G_Change7paragtaph_Test7() {
        role(7, "Лицо, совершившее сделку, операцию и ответственное за ее оформление и за подписание счетов-фактур");
    }

    @Test
    public void H_Change8paragtaph_Test8() {
        role(8, "Лицо, ответственное за оформление свершившегося события и за подписание счетов-фактур");
    }

    @Test
    public void I_ChangeBasisOfAuthority_Test9() {
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).clear();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).sendKeys("Test");
        driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1300);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).getAttribute("value");
        Me.CheckExit("Test", test, driver);
    }

    public void role(int numerAuthority, String text) {
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select > option:nth-child(" + numerAuthority + ")")).click();
        driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1300);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        Me.Sleep(500);
        Me.Exit(driver);
        Me.Sleep(1000);
        Me.LogPass(p.q6log1, p.q6pass1, driver);
        Me.RoleSwitch(1, driver);
        driver.findElement(By.cssSelector("#user")).click();
        Me.Sleep(200);
        driver.findElement(By.cssSelector("#user-search")).sendKeys("укцу");
        Me.Sleep(1100);
        Me.MenuAdmin(1, "/html/body/div[10]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div[2]/div/div[2]/table/tr/td[2]", driver);
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector("#carduser-authority-area-name")).getText();
        Me.Sleep(1500);
        System.out.println(test);
        Me.CheckExit(text, test, driver);
    }
}
