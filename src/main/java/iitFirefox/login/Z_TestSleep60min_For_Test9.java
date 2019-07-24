package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import iitAdd.p;

public class Z_TestSleep60min_For_Test9 {
    private WebDriver driver;
    public String text;
    public int qty;

    @Before
    public void setUp() {
        driver = Drivers.ff();
    }

    @Test
    public void A_Exit_LongTime_Test2() {
        driver.get(p.url);
        Me.LogPass(p.q8log1, p.q8pass1, driver);
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
