package iitChrome.login;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class C_ForgotPassword_Test3 extends iit8077 {

    private WebDriver driver;
    public String sleep;
    public Boolean isPresent;
    public String newpass;
    public String checking;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.chrome();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_ForgetPassword() {
        try {
            driver.get(url);
            driver.findElement(By.id("passwordReminder")).click();
            Me.Sleep(500);
            driver.findElement(By.id("rebuildpas-email")).sendKeys(testIitTestRegister);
            Me.Sleep(500);
            driver.findElement(By.className("butok")).click();
            Me.Sleep(3500);
            checking = driver.findElement(By.cssSelector(".resptext")).getText();
            System.out.println(checking);
            Me.Check("Пароль был успешно восстановлен и был выслан на указанную почту", checking, driver);

            driver.get("https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
            Me.Sleep(1500);

            //Если элемент не виден на странице вернет false если винед true
            isPresent = driver.findElements(By.cssSelector("a.passp-auth-header-link:nth-child(1)")).size() > 0;
            System.out.println(isPresent);
            //==============
            if (isPresent == true) {
                driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]")).sendKeys(testIitTest);
                Me.Sleep(1500);
                driver.findElement(By.cssSelector(".passp-button.passp-sign-in-button button.button2:nth-child(1)")).click();
                Me.Sleep(500);
                driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys(EmailPass);
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".button2")).click();
            } else {
                driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]")).sendKeys(testIitTest);
                Me.Sleep(500);
                driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys(EmailPass);
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".button2")).click();
            }
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
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
            driver.get(url);
            Me.Sleep(1000);
            Me.LogPass(testIitTest, newpass, driver);
            Me.Sleep(3000);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Me.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ForgetPassword2() {

        try {
            driver.get(url);
            Me.Sleep(1500);
            driver.findElement(By.id("passwordReminder")).click();
            Me.Sleep(500);
            driver.findElement(By.id("rebuildpas-email")).sendKeys("Hello");
            Me.Sleep(1500);
            driver.findElement(By.className("butok")).click();
            Me.Sleep(500);
            checking = driver.findElement(By.className("resptext")).getText();
            System.out.println(checking);
            Me.Sleep(1500);
            Me.CheckExit("Некорректный email!", checking, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }


}
