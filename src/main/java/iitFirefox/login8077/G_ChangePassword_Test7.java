package iitFirefox.login8077;

import iitAdd.Drivers; 
import methods.Cabinet;
import methods.Element;
import methods.EnterAndExit;
import iitAdd.iit8077;
import methods.Check;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class G_ChangePassword_Test7 extends iit8077 {
    private WebDriver driver;
    public String sleep;

    @BeforeEach
    void Before() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(q7log, pass7log, driver);
            Element.visibleElement180SecToWait("#user-nav",driver);
            Thread.sleep(1500);
            driver.findElement(By.id("user-nav")).click();
            Thread.sleep(2800);
            driver.findElement(By.cssSelector("#user-panel > div:nth-child(6) > div > div.nav-title.collapsed")).click();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_ChengePasswordInCabinet_Test1() {
        try {
            log(pass7log, pass7log, pass7log);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Пароль был успешно изменен", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_PasswordWritesecontWrong_Test2() {
        try {
            log(pass7log, pass7log, wrong7log);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Новый пароль введен повторно неверно!", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_OldPasswordWrittenWrong_Test3() {
        try {
            log(wrong7log, pass7log, pass7log);

            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Старый пароль введен неверно", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void log(String log1, String log2, String log3) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[1]/input")).sendKeys(log1);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[2]/input")).sendKeys(log2);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[3]/input")).sendKeys(log3);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[2]/button")).click();
        Thread.sleep(2000);
    }


}

