package iitFirefox.login;

import iitAdd.Drivers;
import iitAdd.Me;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import iitAdd.p;

public class G_ChangePassword_Tes7 {
    private WebDriver driver;
    public String sleep;

    @Before
    public void Before() {
        driver = Drivers.ff();
        driver.get(p.url3);
        Me.LogPass(p.q7log, p.pass7log, driver);
        driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-panel\"]/div[5]/div/div[1]")).click();
    }

    @Test
    public void A_ChengePasswordInCabinet_Test1() {
        log(p.pass7log, p.pass7log, p.pass7log);
        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("������ ��� ������� �������", checkingTest, driver);
    }
    @Test
    public void B_PasswordWritesecontWrong_Test2() {
        log(p.pass7log, p.pass7log, p.wrong7log);
        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("����� ������ ������ �������� �������!", checkingTest, driver);
    }
    @Test
    public void C_OldPasswordWrittenWrong_Test3() {
        log(p.wrong7log, p.pass7log, p.pass7log);

        String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
        System.out.println(checkingTest);
        Me.CheckExit("������ ������ ������ �������", checkingTest, driver);
    }

    public void log(String log1, String log2, String log3) {
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[1]/input")).sendKeys(log1);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[2]/input")).sendKeys(log2);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[3]/input")).sendKeys(log3);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[2]/button")).click();
        Me.Sleep(2000);
    }



}

