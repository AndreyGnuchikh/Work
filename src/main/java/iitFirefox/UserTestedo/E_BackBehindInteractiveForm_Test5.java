package iitFirefox.UserTestedo;


import iitAdd.Drivers; 
import methods.Cabinet;
import methods.EnterAndExit;
import iitAdd.testedo;
import iitFirefox.User8077.Form.CompleteForm;
import iitFirefox.User8077.Form.CompleteFormAct;
import iitFirefox.User8077.Form.CompleteFormDopSchF;
import methods.Check;
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
            EnterAndExit.loggingCerts8080(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_BackBehindInteractiveFormSchF_Test1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add ���
            CompleteForm.SCHFNoClick(driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Check.CheckExit("����-������� �  ", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_BackBehindInteractiveFormACT_Test2() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add ���
            CompleteFormAct.ActClick(driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Check.CheckExit("����-������� �  ", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_BackBehindInteractiveFormSCHFDOP_Test3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            CompleteFormDopSchF.DopSchFClick(driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);

            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Check.CheckExit("����-������� �  ", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}