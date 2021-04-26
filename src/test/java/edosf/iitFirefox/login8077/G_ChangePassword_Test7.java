package edosf.iitFirefox.login8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.Element;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class G_ChangePassword_Test7 implements Iit8077 {
    private WebDriver driver;
    public String sleep;



    @BeforeEach
    void Before() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass(Q_7LOG, PASS_7LOG, driver);
            Element.VisibleElement180SecToWait("#user-nav",driver);
            Thread.sleep(1500);
            driver.findElement(By.id("user-nav")).click();
            Thread.sleep(2800);
            driver.findElement(By.cssSelector("#user-panel > div:nth-child(6) > div > div.nav-title.collapsed")).click();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка ошибки: Новый пароль не должен совпадать со старым!")
    void A_Old_PasswordInCabinet_Test1() {
        try {
            log(PASS_7LOG, PASS_7LOG, PASS_7LOG);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Новый пароль не должен совпадать со старым!", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка ошибки красной рамки ввода неправильного, 2 пароля")
    void B_PasswordWriteSecondWrong_Test2() {
        try {
            log(PASS_7LOG, PASS_7LOG, WRONG_7_LOG);
            String checkingTest = driver.findElement(By.cssSelector("div.col-md-7:nth-child(3) > input:nth-child(2)")).getAttribute("outerHTML");
            System.out.println(checkingTest);
            Check.CheckingContainsExit("border-color: red", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка ошибки ввода старого пароля(всплывающее окно)")
    void C_OldPasswordWrittenWrong_Test3() {
        try {
            log(WRONG_7_LOG, PASS_7LOG, PASS_7LOG);

            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.CheckExit("Старый пароль введен неверно", checkingTest, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Проверка успешного изменения пароля.")
    void D_Change_PasswordInCabinet_Test4() {
        try {
            log(PASS_7LOG, NEW_PASS_7LOG, NEW_PASS_7LOG);
            String checkingTest = driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-body.text-center > h3")).getText();
            System.out.println(checkingTest);
            Check.Check("Пароль был успешно изменен", checkingTest, driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(1500);
            driver.findElement(By.id("user-nav")).click();
            Thread.sleep(2800);
            driver.findElement(By.cssSelector("#user-panel > div:nth-child(6) > div > div.nav-title.collapsed")).click();

            log(NEW_PASS_7LOG, PASS_7LOG, PASS_7LOG);
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

