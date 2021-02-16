package EDOSF.iitFirefox.User8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import EDOSF.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NUM_FAIL; 
 import org.junitpioneer.jupiter.RetryingTest;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class L_CompletedEDWithSideCustomer_Test12 extends iit8077 {
    WebDriver driver;
    String test, test2;




    @RetryingTest(NUM_FAIL)
    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_CompletedCoworker_DOP_Test1() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(1000);
            CheckTest12(test,driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_RepresentativeOfTheOrganization_DOP_Test2() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Check.Check("УПД", test, driver);
            /*test = driver.findElement(By.id("name")).getAttribute("value");
            Check.Check("2", test, driver);*/
            /*test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Check.Check("должность", test, driver);*/
            test = driver.findElement(By.id("position")).getAttribute("value");
            Check.CheckingContains("Должность", test, driver);
            test = driver.findElement(By.id("org-name")).getAttribute("value");
            Check.Check("Все хорошо 2,0", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Check.Check("1", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Check.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_Individual_DOP_Test3() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            CheckTest12(test,driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_CompletedCoworker_SchfDOP_Test4() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(500);
            CheckTest12(test,driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_RepresentativeOfTheOrganization_SchfDOP_Test5() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Check.Check("УПД", test, driver);
            /*test = driver.findElement(By.id("name")).getAttribute("value");
            Check.Check("2", test, driver);*/
            /*test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Check.Check("должность", test, driver);*/
            test = driver.findElement(By.id("position")).getAttribute("value");
            Check.CheckingContains("Должность", test, driver);
            test = driver.findElement(By.id("org-name")).getAttribute("value");
            Check.Check("Все хорошо 2,0", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Check.Check("1", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Check.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_Individual_SchfDOP_Test6() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            CheckTest12(test,driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    public static  void CheckTest12(String test,WebDriver driver) throws Exception {
        try {
            Thread.sleep(1000);
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Check.Check("УПД", test, driver);
/*            test = driver.findElement(By.id("name")).getAttribute("value");
            Check.Check("2", test, driver);*/
            /*test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Check.Check("должность", test, driver);*/
            test = driver.findElement(By.id("position")).getAttribute("value");
            Check.CheckingContains("Должность", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Check.Check("1", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Check.CheckExit("Замечаний нет", test, driver);
        }catch (Throwable e){
            Cabinet.Catch(driver, e);
        }
    }
}
