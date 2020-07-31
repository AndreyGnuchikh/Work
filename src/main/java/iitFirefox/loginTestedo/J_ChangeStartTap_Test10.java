package iitFirefox.loginTestedo;

import iitAdd.Drivers;
import iitAdd.iit8077;
import iitAdd.testedo;
import methods.Cabinet;
import methods.Check;
import methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J_ChangeStartTap_Test10 extends testedo {
    private WebDriver driver;
    public String test;

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
    void A_ChangeStartTap_Test1() {
        try {
            driver.get(url9);
            driver.findElement(By.className("header__logo-link")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.CheckExit(ur19_2, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ChangeStartTapLogin1_Test2() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.className("btn-primary")).click();
            driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
            test = driver.findElement(By.className("header__title")).getText();
            System.out.println(test);
            Check.CheckExit("Приветствуем, Все Все", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_ChangeStartTapLogin2_Test3() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.className("btn-primary")).click();
            driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
            test = driver.findElement(By.className("header__title")).getText();
            System.out.println(test);
            Check.Check("Приветствуем, Все Все", test, driver);
            driver.findElement(By.className("header__btn-enter")).click();
            test = driver.findElement(By.name("adminInfoText")).getText();
            System.out.println(test);
            Check.CheckExit("Все контрагенты", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_ChangeStartTapLogout1_Test4() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.className("btn-primary")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.CheckExit(url, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_ChangeStartTapLogout2_Test5() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.className("header__logo-img")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.Check(url, test, driver);
            test = driver.findElement(By.className("auth__title")).getText();
            System.out.println(test);
            Check.CheckExit("Вход в личный кабинет", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
