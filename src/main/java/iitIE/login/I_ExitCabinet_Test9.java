package iitIE.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class I_ExitCabinet_Test9 extends iit8077{
    private WebDriver driver;
    private String text;

     @BeforeEach
    void setUp() {
        driver = Drivers.ie();
    }

    @Test
    void A_Exit_Test1() {
        driver.get(url);
        Me.LogPass(LogAll, pass, driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/Form/div[1]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("Form.text-right > button:nth-child(1)")).click();
        text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h2")).getText();
        Me.CheckExit("¬ход в личный кабинет", text, driver);
    }

}
