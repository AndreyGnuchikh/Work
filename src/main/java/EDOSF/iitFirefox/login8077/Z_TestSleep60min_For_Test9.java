package EDOSF.iitFirefox.login8077;

import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.SettingsEDOSF.iit8077;
import EDOSF.methods.Check;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Z_TestSleep60min_For_Test9 extends iit8077 {
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
            Check.CheckExit("���� � ������ �������", text, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}