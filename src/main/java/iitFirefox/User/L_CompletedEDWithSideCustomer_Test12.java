package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;

public class L_CompletedEDWithSideCustomer_Test12 {
    WebDriver driver;
    String test,test2;
    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
    }
    @Test
    public void A_CompletedCoworker_DOP_Test1(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Me.Check("Должность 2",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
    @Test
    public void B_RepresentativeOfTheOrganization_DOP_Test2(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Me.Check("Должность 2",test,driver);
        test = driver.findElement(By.id("org-name")).getAttribute("value");
        Me.Check("Все хорошо 2,0",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
    @Test
    public void C_Individual_DOP_Test3(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
    @Test
    public void D_CompletedCoworker_SchfDOP_Test4(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("3",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Me.Check("Должность 2",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
    @Test
    public void E_RepresentativeOfTheOrganization_SchfDOP_Test5(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("3",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Me.Check("Должность 2",test,driver);
        test = driver.findElement(By.id("org-name")).getAttribute("value");
        Me.Check("Все хорошо 2,0",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
    @Test
    public void F_Individual_SchfDOP_Test6(){
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("3",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("УПД",test,driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2",test,driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d",test,driver);
        test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("Замечаний нет",test,driver);

    }
}
