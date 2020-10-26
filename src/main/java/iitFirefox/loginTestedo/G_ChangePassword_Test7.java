package iitFirefox.loginTestedo;

import iitAdd.Drivers;
import iitAdd.iit8077;
import iitAdd.testedo;
import methods.Cabinet;
import methods.Check;
import methods.Element;
import methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class G_ChangePassword_Test7 extends testedo {
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
    void A_Old_PasswordInCabinet_Test1() {
        try {
            log(pass7log, pass7log, pass7log);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Новый пароль не должен совпадать со старым!", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_PasswordWriteSecondWrong_Test2() {
        try {
            log(pass7log, pass7log, wrong7log);
            String checkingTest = driver.findElement(By.cssSelector("div.col-md-7:nth-child(3) > input:nth-child(2)")).getAttribute("outerHTML");
            System.out.println(checkingTest);
            Check.CheckingContains("border-color: red", checkingTest, driver);
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
    @Test
    @Order(4)
    void D_Change_PasswordInCabinet_Test4() {
        try {
            log(pass7log, newpass7log, newpass7log);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.Check("Пароль был успешно изменен", checkingTest, driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(1500);
            driver.findElement(By.id("user-nav")).click();
            Thread.sleep(2800);
            driver.findElement(By.cssSelector("#user-panel > div:nth-child(6) > div > div.nav-title.collapsed")).click();

            log(newpass7log, pass7log, pass7log);
            String checkingTest2 = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Пароль был успешно изменен", checkingTest2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void log(String log1, String log2, String log3) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[1]/input")).sendKeys(log1);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[2]/input")).sendKeys(log2);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[1]/div[3]/input")).sendKeys(log3);
        Thread.sleep(500);
        if(driver.findElement(By.cssSelector("#navbarChangePassButton")).isEnabled()){
            driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div[2]/button")).click();
        }
         Thread.sleep(2000);
    }


}

