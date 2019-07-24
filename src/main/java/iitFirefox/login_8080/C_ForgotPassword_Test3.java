package iitFirefox.login_8080;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import iitAdd.p8080;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class C_ForgotPassword_Test3 {

    private WebDriver driver;
    public String sleep;
    public Boolean isPresent;
    public String newpass;
    public String checking;

    @Before
    public void setUp() {
        driver = Drivers.ff();
    }

    @Test
    public void A_ForgetPassword() {
        driver.get(p8080.url3);
        driver.findElement(By.xpath("//*[@id=\"passwordReminder\"]/a")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//div[@id='RebuildPasswordModal']/div/div/div[2]/div[2]/input")).sendKeys(p8080.pass3emailRegisrt);
        Me.Sleep(500);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]")).click();
        Me.Sleep(3500);
        checking = driver.findElement(By.cssSelector(".resptext")).getText();
        System.out.println(checking);
        Me.Check("������ ��� ������� ������������ � ��� ������ �� ��������� �����", checking, driver);

        driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
        Me.Sleep(1500);
        //���� ������� �� ����� �� �������� ������ false ���� ����� true
        isPresent = driver.findElements(By.cssSelector("a.passp-auth-header-link:nth-child(1)")).size() > 0;
        System.out.println(isPresent);
        //==============
        if (isPresent == true) {
            driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]")).sendKeys(p8080.pass3email);
            Me.Sleep(500);
            driver.findElement(By.cssSelector("button.button2:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys(p8080.pass3email2);
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".button2")).click();
        } else {
            driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]")).sendKeys(p8080.pass3email);
            Me.Sleep(500);
            driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys(p8080.pass3email2);
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".button2")).click();
        }
        Me.visibleElement60SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        driver.findElement(By.cssSelector("a.ns-view-folder:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
        Me.Sleep(3000);
        newpass = driver.findElement(By.cssSelector(".mail-Message-Body-Content > div:nth-child(4)")).getText();
        Me.Sleep(1000);
        newpass = newpass.substring(14);
        System.out.println(newpass);
        driver.findElement(By.cssSelector("a.ns-view-folder:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
        } else {
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
        }
        driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".js-toolbar-item-title-delete")).click();
        Me.Sleep(1000);
        driver.get(p8080.url3);
        Me.Sleep(1000);
        Me.LogPass(p8080.pass3email, newpass, driver);
        Me.Sleep(3000);
        checking = driver.findElement(By.cssSelector(".roles > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")).getText();
        System.out.println(checking);
        Me.CheckExit("�������", checking, driver);
        }

    @Test
    public void B_ForgetPassword2() {
        driver.get(p8080.url3);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"passwordReminder\"]/a")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//div[@id='RebuildPasswordModal']/div/div/div[2]/div[2]/input")).sendKeys("Hello");
        Me.Sleep(1500);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]")).click();
        Me.Sleep(500);
        checking = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/h3")).getText();
        System.out.println(checking);
        Me.Sleep(1500);
        Me.CheckExit("������������ email!", checking, driver);
    }


}