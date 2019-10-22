package iitFirefox.login_testedo;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.testedo;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
            Me.Catch(driver, e);
        }
    }

    @Ignore
    @Order(1)
    void A_Exit_LongTime_Test2() {
        try {
            driver.get(url);
            Me.LogPass(LogAll, pass, driver);
            driver.findElement(By.id("selectRole")).click();
            for (int i = 0; i < 61; i++) {
                Me.Sleep(60000);
                qty += 1;
                System.out.println(qty + " minut");
            }
            driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
            text = driver.findElement(By.className("auth__title")).getText();
            System.out.println(text);
            Me.CheckExit("���� � ������ �������", text, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
