package EDOSF.iitFirefox.loginTestedo;

import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.EnterAndExit;
import OFD.methods.RetryRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NumFail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Z_TestSleep60min_For_Test9 extends testedo {
    private WebDriver driver;
    public String text;
    public int qty;




    @BeforeEach
    void setUp() {

        try {
            driver = Drivers.ff();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @Ignore
    @Order(1)
    void A_Exit_LongTime_Test2() {
        try {
            driver.get(url);
            EnterAndExit.LogPass(LogAll, pass, driver);
            driver.findElement(By.id("selectRole")).click();
            for (int i = 0; i < 61; i++) {
                Thread.sleep(60000);
                qty += 1;
                System.out.println(qty + " minut");
            }
            driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
            text = driver.findElement(By.className("auth__title")).getText();
            System.out.println(text);
            Check.CheckExit("¬ход в личный кабинет", text, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
