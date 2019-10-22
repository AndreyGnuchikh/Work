package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class L_CompletedEDWithSideCustomer_Test12 extends iit8077 {
    WebDriver driver;
    String test, test2;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_CompletedCoworker_DOP_Test1() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(500);
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Me.Check("Должность 2", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_RepresentativeOfTheOrganization_DOP_Test2() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Me.Check("Должность 2", test, driver);
            test = driver.findElement(By.id("org-name")).getAttribute("value");
            Me.Check("Все хорошо 2,0", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_Individual_DOP_Test3() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_CompletedCoworker_SchfDOP_Test4() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(500);
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Me.Check("Должность 2", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_RepresentativeOfTheOrganization_SchfDOP_Test5() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("position")).getAttribute("value");
            Me.Check("Должность 2", test, driver);
            test = driver.findElement(By.id("org-name")).getAttribute("value");
            Me.Check("Все хорошо 2,0", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_Individual_SchfDOP_Test6() {
        try {
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            test = driver.findElement(By.id("surname")).getAttribute("value");
            Me.Check("УПД", test, driver);
            test = driver.findElement(By.id("name")).getAttribute("value");
            Me.Check("2", test, driver);
            test = driver.findElement(By.id("patronymic")).getAttribute("value");
            Me.Check("должность", test, driver);
            test = driver.findElement(By.id("authority")).getAttribute("value");
            Me.Check("d", test, driver);
            test = driver.findElement(By.id("shipment-info")).getAttribute("value");
            Me.CheckExit("Замечаний нет", test, driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}
