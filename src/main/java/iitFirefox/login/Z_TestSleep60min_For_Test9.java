package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import iitAdd.testedo;
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

         try {driver = Drivers.ff();
    }catch (Throwable e) {
             Me.Catch(driver,e);
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
        Me.CheckExit("¬ход в личный кабинет", text, driver);
    } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
