package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.Cabinet;
import edosf.methods.Check;
import edosf.methods.EnterAndExit;
import edosf.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@RunWith(JUnitPlatform.class)

public class K_WatchingED_Test11 implements Testedo {
    WebDriver driver;
    String test, test2;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_CheckAllButton_Test1() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(URL, UPD2, "2", driver);
            test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).getText();
            Check.Check("Просмотреть", test2, driver);
            test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
            Check.Check("Заполнить", test2, driver);
            test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
            Check.Check("Подписать", test2, driver);
            test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
            Check.CheckExit("Пропустить", test2, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_CheckFill_Test2() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(URL, UPD2, "2", driver);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
            Check.Check("Заполнить", test, driver);
            test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
            Check.Check("Подписать", test, driver);
            test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
            Check.Check("Пропустить", test, driver);
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(3500);
            test = driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
            System.out.println(test);
            Check.CheckExit("УПД", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_CheckSign_Test3() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(URL, UPD2, "2", driver);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
            Thread.sleep(8000);
            test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("Все документы успешно подписаны УСИЛЕННОЙ ЭП!", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_CheckSkip_Test4() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(URL, UPD2, "2", driver);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
            Thread.sleep(3500);
            test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
            System.out.println(test);
            Check.CheckExit("Подписание было пропущено пользователем.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}