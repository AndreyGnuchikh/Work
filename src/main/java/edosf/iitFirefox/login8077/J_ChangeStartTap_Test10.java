package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J_ChangeStartTap_Test10 implements Iit8077 {
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

    @RetryingTest(NUM_FAIL)
    @Order(1)
    @DisplayName("Проверка перехода на главную страницу из меню логина")
    void A_ChangeStartTap_Test1() {
        try {
            driver.get(URL_9);
            driver.findElement(By.className("header__logo-link")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.CheckExit(UR19_2, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    @DisplayName("Проверка перехода из главной страницы в роль пользователя (при логине пользователя в системе)")
    void B_ChangeStartTapLogin1_Test2() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            driver.findElement(By.className("btn-primary")).click();
            driver.findElement(By.xpath("//*[@id=\"wrap\"]/nav/div/div[1]/div/a")).click();
            test = driver.findElement(By.className("header__title")).getText();
            System.out.println(test);
            Check.CheckExit("Приветствуем, Все Все", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    @DisplayName("Проверка перехода из главной страницы в роль админа (при логине админа в системе)")
    void C_ChangeStartTapLogin2_Test3() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
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

    @RetryingTest(NUM_FAIL)
    @Order(4)
    @DisplayName("Проверка перехода из главной страницы в роль пользователя (при разлогине пользователя в системе)")
    void D_ChangeStartTapLogout1_Test4() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            driver.findElement(By.className("btn-primary")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.CheckExit(URL, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    @DisplayName("Проверка перехода из главной страницы в роль админа (при разлогине админа в системе)")
    void E_ChangeStartTapLogout2_Test5() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            driver.findElement(By.className("header__logo-img")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.Check(URL, test, driver);
            test = driver.findElement(By.className("auth__title")).getText();
            System.out.println(test);
            Check.CheckExit("Вход в личный кабинет", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
