package edosf.iitFirefox.loginTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Z_TestSleep60min_For_Test9 implements Testedo {
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
    @Disabled("Disabled long test!")
    void A_Exit_LongTime_Test2() {
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
            Check.CheckExit("���� � ������ �������", text, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
