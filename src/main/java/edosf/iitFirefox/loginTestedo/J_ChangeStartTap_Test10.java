package edosf.iitFirefox.loginTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class J_ChangeStartTap_Test10 implements Testedo {
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
    void D_ChangeStartTapLogout1_Test4() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            driver.findElement(By.className("btn-primary")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("form.text-right > button:nth-child(1) > i:nth-child(1)")).click();
            test = driver.getCurrentUrl();
            System.out.println(test);
            Check.CheckExit(URL, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
