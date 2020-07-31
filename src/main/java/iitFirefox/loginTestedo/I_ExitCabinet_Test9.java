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
public class I_ExitCabinet_Test9 extends testedo {
    private WebDriver driver;
    private String text;

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
    void A_Exit_Test1() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.id("selectRole")).click();
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
            text = driver.findElement(By.className("auth__title")).getText();
            Check.CheckExit("¬ход в личный кабинет", text, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
