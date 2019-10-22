package iitFirefox.User_testedo;


import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import iitAdd.testedo;
import iitFirefox.User.Form.CompleteForm;
import iitFirefox.User.Form.CompleteFormAct;
import iitFirefox.User.Form.CompleteFormDopSchF;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E_BackBehindInteractiveForm_Test5 extends testedo {
    WebDriver driver;
    String test2;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts8080(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_BackBehindInteractiveFormSchF_Test1() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add счф
            CompleteForm.SCHFNoClick(driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Me.CheckExit("Счет-фактура №  ", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_BackBehindInteractiveFormACT_Test2() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add счф
            CompleteFormAct.ActClick(driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Me.CheckExit("Счет-фактура №  ", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_BackBehindInteractiveFormSCHFDOP_Test3() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1500);
            CompleteFormDopSchF.DopSchFClick(driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(1000);

            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Me.CheckExit("Счет-фактура №  ", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
