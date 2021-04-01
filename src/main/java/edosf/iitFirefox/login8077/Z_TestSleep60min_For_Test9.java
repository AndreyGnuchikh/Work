package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Z_TestSleep60min_For_Test9 implements Iit8077 {
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
    void A_Exit_LongTime_Test1() {
        try {
            driver.get(URL);
            EnterAndExit.LogPass(LOG_ALL, PASS, driver);
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
