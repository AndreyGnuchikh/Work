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

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class I_ExitCabinet_Test9 implements Testedo {
    private WebDriver driver;
    private String text;




    @BeforeEach
    void setUp() {

        try {
            driver = Drivers.ff();
        } catch (Throwable e)
        {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_Exit_Test1() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
            driver.findElement(By.id("selectRole")).click();
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
            text = driver.findElement(By.className("auth__title")).getText();
            Check.CheckExit("¬ход в личный кабинет", text, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
