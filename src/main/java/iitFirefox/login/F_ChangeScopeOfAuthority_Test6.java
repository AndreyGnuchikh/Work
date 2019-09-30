package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import iitAdd.testedo;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class F_ChangeScopeOfAuthority_Test6 extends iit8077 {
    WebDriver driver;
    String test;

     @BeforeEach
    void SetUp() {
         try {
        driver = Drivers.ff();
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);

    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }

    @Test
    @Order(1)
    void A_DontChange_Test1() {
        try {
        role(1, "Не выбрано");
    } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_Change2paragtaph_Test2() {
        try {
        role(2, "Лицо, ответственное за подписание счетов-фактур");
    } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_Change3paragtaph_Test3() {
         try {
        role(3, "Лицо, совершившее сделку, операцию");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(4)
    void D_Change4paragtaph_Test4() {
         try {
        role(4, "Лицо, совершившее сделку, операцию и ответственное за ее оформление");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(5)
    void E_Change5paragtaph_Test5() {
         try {
        role(5, "Лицо, ответственное за оформление свершившегося события");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(6)
    void F_Change6paragtaph_Test6() {
         try {
        role(6, "Лицо, совершившее сделку, операцию и ответственное за подписание счетов-фактур");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(7)
    void G_Change7paragtaph_Test7() {
         try {
        role(7, "Лицо, совершившее сделку, операцию и ответственное за ее оформление и за подписание счетов-фактур");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(8)
    void H_Change8paragtaph_Test8() {
         try {
        role(8, "Лицо, ответственное за оформление свершившегося события и за подписание счетов-фактур");
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    @Test
    @Order(9)
    void I_ChangeBasisOfAuthority_Test9() {
         try {
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).clear();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).sendKeys("Test");
        driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
        Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)",driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#nav-bar-authority-area-comment")).getAttribute("value");
        Me.CheckExit("Test", test, driver);
    } catch (Throwable e) {
             Me.Catch(driver, e);
         }
    }

    void role(int numerAuthority, String text) {
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#user-nav")).click();
        driver.findElement(By.cssSelector("div.statistic:nth-child(5) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select")).click();
        driver.findElement(By.cssSelector("#nav-bar-authority-area-select > option:nth-child(" + numerAuthority + ")")).click();
        driver.findElement(By.cssSelector("#collapseFourAuthorityArea > div:nth-child(2) > button:nth-child(1)")).click();
        Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)",driver);
        Me.Sleep(600);
        Me.Exit(driver);
        Me.Sleep(1000);
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(1, driver);
        driver.findElement(By.cssSelector("#user")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#user-search")).sendKeys("Все");
        Me.Sleep(2100);
        Me.MenuAdmin(1, "//*[contains(text(), 'Все')][contains(@class, 'dgrid-column-name ')]", driver);
        Me.Sleep(1200);
        test = driver.findElement(By.cssSelector("#carduser-authority-area-name")).getText();
        Me.Sleep(1600);
        System.out.println(test);
        Me.CheckExit(text, test, driver);
    }
}
