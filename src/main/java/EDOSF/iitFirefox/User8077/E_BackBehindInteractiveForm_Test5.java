package EDOSF.iitFirefox.User8077;

import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.SettingsEDOSF.iit8077;
import EDOSF.Forms.CompleteForm;
import EDOSF.Forms.CompleteFormAct;
import EDOSF.Forms.CompleteFormDopSchF;
import EDOSF.methods.Check;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.SettingsEDOSF.Settings.NUM_FAIL;
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E_BackBehindInteractiveForm_Test5 extends iit8077 {
    WebDriver driver;
    String test2;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            Thread.sleep(200);
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
            CompleteForm.SCHF("NO",driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector(".doc_title")).getText();
            System.out.println(test2);
            Check.CheckExit("����-������� �  ", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
            CompleteFormAct.Act("NO",driver);
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

    @RetryingTest(NUM_FAIL)
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
            CompleteFormDopSchF.DopSchF("NO",driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2500);
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
