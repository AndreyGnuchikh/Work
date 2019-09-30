package iitChrome.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class G_ChangePassword_Tes7 extends iit8077{
    private WebDriver driver;
    public String sleep;

     @BeforeEach
    void Before() {
        driver = Drivers.chrome();
        driver.get(url);
        Me.LogPass(q7log, pass7log, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-panel\"]/div[5]/div/div[1]")).click();
    }

    @Test
    void A_ChengePasswordInCabinet_Test1() {
        log(pass7log, pass7log, pass7log);
        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("Пароль был успешно изменен", checkingTest, driver);
    }
    @Test
    void B_PasswordWritesecontWrong_Test2() {
        log(pass7log, pass7log, wrong7log);
        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("Новый пароль введен повторно неверно!", checkingTest, driver);
    }
    @Test
    void C_OldPasswordWrittenWrong_Test3() {
        log(wrong7log, pass7log, pass7log);

        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("Старый пароль введен неверно", checkingTest, driver);
    }

    void log(String log1, String log2, String log3) {
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[1]/input")).sendKeys(log1);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[2]/input")).sendKeys(log2);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[3]/input")).sendKeys(log3);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[2]/button")).click();
        Me.Sleep(2000);
    }


}

