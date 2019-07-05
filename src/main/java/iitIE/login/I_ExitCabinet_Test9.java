package iitIE.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class I_ExitCabinet_Test9 {
    private WebDriver driver;
    private String text;

    @Before
    public void setUp() {
        driver = Drivers.ie();
    }

    @Test
    public void A_Exit_Test1() {
        driver.get(p.url);
        Me.LogPass(p.q8log1, p.q8pass1, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("form.text-right > button:nth-child(1)")).click();
        text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        Me.CheckExit("¬ход в личный кабинет", text, driver);
    }

}
