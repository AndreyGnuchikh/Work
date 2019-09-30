package iitChrome.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class H_ChangeRoles_Test8 extends iit8077{
    private WebDriver driver;
    public String checking;

     @BeforeEach
    void upSet() {
        driver = Drivers.chrome();
        driver.get(url);
    }

    @Test
    void A_TestChangeRoleAdminToUser_Test1() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Кабинет Все хорошо", checking, driver);
    }

    @Test
    void B_TestChangeRoleAdminToSupport_Test2() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("ЖАСО - Нижегородский филиал", checking, driver);
    }

    @Test
    void C_TestChangeRoleAdminToBillingEditor_Test3() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Биллинг", checking, driver);
    }

    @Test
    void D_TestChangeRoleUserTo_Admin_Test4() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(2, driver);
        User();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("Управление сертификатами", checking, driver);
    }

    @Test
    void E_TestChangeRoleUserTo_Support_Test5() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(2, driver);
        User();

        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("ЖАСО - Нижегородский филиал", checking, driver);
    }

    @Test
    void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(2, driver);
        User();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Биллинг", checking, driver);
    }

    @Test
    void G_TestChangeRoleSupportTo_Admin_Test7() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("Управление сертификатами", checking, driver);
    }

    @Test
    void H_TestChangeRoleSupportTo_User_Test8() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Кабинет Все хорошо", checking, driver);
    }

    @Test
    void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Биллинг", checking, driver);

    }

    @Test
    void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("Управление сертификатами", checking, driver);
    }

    @Test
    void K_TestChangeRoleBillingEditorToUser__Test11() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Кабинет Все хорошо", checking, driver);
    }

    @Test
    void L_TestChangeRoleBillingEditorToSupport__Test12() {
        Me.LogPass(LogAll, pass, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("ЖАСО - Нижегородский филиал", checking, driver);

    }

    void Admin() {
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.Check("Управление сертификатами", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    void User() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("Кабинет Все хорошо", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    void Support() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("ЖАСО - Нижегородский филиал", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}