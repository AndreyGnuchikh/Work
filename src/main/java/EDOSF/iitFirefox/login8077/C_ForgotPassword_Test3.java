package EDOSF.iitFirefox.login8077;


import EDOSF.iitAdd.Drivers;
import EDOSF.methods.*;
import EDOSF.iitAdd.iit8077;
import OFD.methods.RetryRule;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NumFail;

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
            driver = Drivers.ff();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @Test
    @Order(1)
    void A_ForgetPassword() {
        try {
            Email.Email(testIitTest,EmailPass,driver);
            Thread.sleep(4500);
            Email.DeletedEmail(driver);
            driver.get(url);
            driver.findElement(By.id("passwordReminder")).click();
            Thread.sleep(500);
            driver.findElement(By.id("rebuildpas-email")).sendKeys(testIitTestRegister);
            Thread.sleep(500);
            driver.findElement(By.className("butok")).click();
            Thread.sleep(3500);
            checking = driver.findElement(By.cssSelector(".resptext")).getText();
            System.out.println(checking);
            Check.Check("Пароль был успешно восстановлен и был выслан на указанную почту", checking, driver);
            Email.Email(testIitTest,EmailPass,driver);
            Thread.sleep(1000);
            Element.VisibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            driver.findElement(By.cssSelector("a.ns-view-folder:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(5500);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).click();
            Thread.sleep(3000);
            newpass = driver.findElement(By.cssSelector(".mail-Message-Body-Content > div:nth-child(4)")).getText();
            Thread.sleep(1000);
            newpass = newpass.substring(14);
            System.out.println(newpass);
            driver.findElement(By.cssSelector("a.ns-view-folder:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(500);
            if (!driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).isEnabled()) {
            } else {
                Thread.sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            }
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".js-toolbar-item-title-delete")).click();
            Thread.sleep(1000);
            driver.get(url);
            Thread.sleep(1000);
            EnterAndExit.LogPass(testIitTest, newpass, driver);
            Thread.sleep(3000);
            checking = driver.findElement(By.id("selectRole")).getText();
            System.out.println(checking);
            Check.CheckExit("Выбрать", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ForgetPassword2() {

        try {
            driver.get(url);
            Thread.sleep(1500);
            driver.findElement(By.id("passwordReminder")).click();
            Thread.sleep(500);
            driver.findElement(By.id("rebuildpas-email")).sendKeys("Hello");
            Thread.sleep(1500);
            driver.findElement(By.className("butok")).click();
            Thread.sleep(500);
            checking = driver.findElement(By.className("resptext")).getText();
            System.out.println(checking);
            Thread.sleep(1500);
            Check.CheckExit("Некорректный email!", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }


}
