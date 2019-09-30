package iitIE.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Z_TestSleep60min_For_Test9 extends iit8077{
    private WebDriver driver;
    public String text;
    public int qty;

     @BeforeEach
    void setUp() {
        driver = Drivers.ie();
    }

    @Test
    void A_Exit_LongTime_Test2() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).click();
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
