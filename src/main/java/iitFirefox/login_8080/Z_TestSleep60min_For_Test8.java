package iitFirefox.login_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Z_TestSleep60min_For_Test8 {
    private WebDriver driver;
    public String text;
    public int qty;

    @Before
    public void setUp() {
        driver = Drivers.ff();
    }

    @Test
    public void A_Exit_LongTime_Test2() {
        driver.get(p8080.url);
        Me.LogPass(p8080.q8log1, p8080.q8pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
        for (int i = 0; i < 61; i++) {
            Me.Sleep(60000);
            qty += 1;
            System.out.println(qty + " minut");
        }
        driver.findElement(By.xpath("//*")).sendKeys(Keys.F5);
        text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        System.out.println(text);
        Me.CheckExit("¬ход в личный кабинет", text, driver);
    }
}
