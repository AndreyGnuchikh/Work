package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import iitAdd.p;

public class H_ChangeRoles_Test8 {
    private WebDriver driver;
    public String checking;

    @Before
    public void upSet() {
        driver = Drivers.ff();
        driver.get(p.url);
    }

    @Test
    public void A_TestChangeRoleAdminToUser_Test1() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("������� ��� ������", checking, driver);
    }

    @Test
    public void B_TestChangeRoleAdminToSupport_Test2() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("���� - ������������� ������", checking, driver);
    }

    @Test
    public void C_TestChangeRoleAdminToBillingEditor_Test3() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(1, driver);
        Admin();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("�������", checking, driver);
    }

    @Test
    public void D_TestChangeRoleUserTo_Admin_Test4() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(2, driver);
        User();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("���������� �������������", checking, driver);
    }

    @Test
    public void E_TestChangeRoleUserTo_Support_Test5() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(2, driver);
        User();
        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("���� - ������������� ������", checking, driver);
    }

    @Test
    public void F_TestChangeRoleUserTo_BillingEditor_Test6() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(2, driver);
        User();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("�������", checking, driver);
    }

    @Test
    public void G_TestChangeRoleSupportTo_Admin_Test7() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("���������� �������������", checking, driver);
    }

    @Test
    public void H_TestChangeRoleSupportTo_User_Test8() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("������� ��� ������", checking, driver);
    }

    @Test
    public void I_TestChangeRoleSupportTo_BillingEditor_Test9() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(3, driver);
        Support();

        Me.RoleSwitch(4, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("�������", checking, driver);

    }

    @Test
    public void J_TestChangeRoleBillingEditorToAdmin__Test10() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(1, driver);
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.CheckExit("���������� �������������", checking, driver);
    }

    @Test
    public void K_TestChangeRoleBillingEditorToUser__Test11() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(2, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("������� ��� ������", checking, driver);
    }

    @Test
    public void L_TestChangeRoleBillingEditorToSupport__Test12() {
        Me.LogPass(p.q7log1, p.q7pass1, driver);
        Me.RoleSwitch(4, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

        Me.RoleSwitch(3, driver);
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("���� - ������������� ������", checking, driver);

    }

    public void Admin() {
        checking = driver.findElement(By.cssSelector("#certcenter > span")).getText();
        Me.Check("���������� �������������", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();

    }

    public void User() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("������� ��� ������", checking, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

    public void Support() {
        checking = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.Check("���� - ������������� ������", checking, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".change-cabin > button:nth-child(1)")).click();
    }

}