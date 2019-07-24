package iitFirefox.login_8080;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
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
        driver = Drivers.ff();
        driver.get(p8080.url1);
    }

    @Test
    public void A_AllRightTest1() {
        Me.LogPass(p8080.log1log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).getText();

        System.out.println(checking);
        Me.CheckExit("�������", checking, driver);
    }

    @Test
    public void B_ContragentIsDisconnectedTest2() {
        Me.LogPass(p8080.log2log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("�� ������� ����� �� ������. ���������� ��������.", checking, driver);
    }

    @Test
    public void C_ContragentIsBlockedTest3() {
        Me.LogPass(p8080.log3log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]/p[1]")).getText();

        System.out.println(checking);
        Me.CheckExit("��������� ������������ ����� ��������� ���!", checking, driver);
    }

    @Test
    public void D_UserDontCatchtoContragentTest4() {
        Me.LogPass(p8080.log4log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("���� � ������ ������� ����������. ������������ �� ���������� �� � ������ �����������.", checking, driver);
    }

    @Test
    public void E_UserIsBlockedTest5() {
        Me.LogPass(p8080.log5log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("���� � ������ ������� ����������. ������������ ������������", checking, driver);
    }

    @Test
    public void F_UserDontHaveRole6() {
        Me.LogPass(p8080.log6log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();

        System.out.println(checking);
        Me.CheckExit("� ������������ �� ��������� ����.", checking, driver);
    }

    @Test
    public void G_UserDontHaveCabinet7() {
        Me.LogPass(p8080.log7log, p8080.pass1log, driver);
        checking = driver.findElement(By.xpath("/html/body/div[2]/div/a")).getText();
        System.out.println(checking);
        Me.CheckExit("support@iit.ru", checking, driver);
    }

    @Test
    public void H_WrongLogPass8() {
        Me.LogPass(p8080.wrong7log, p8080.wrong7log, driver);
        checking = driver.findElement(By.xpath("//*[@id=\"alertText\"]")).getText();
        System.out.println(checking);
        Me.CheckExit("�������������� �� ����������. ��������� ������������ ������ � ������ ��� ����������� ����� ��", checking, driver);
    }

}
