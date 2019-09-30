package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@RunWith(JUnitPlatform.class)

public class K_WatchingED_Test11 extends iit8077 {
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
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }

    @Test
    @Order(1)
    void A_CheckAllButton_Test1() {
        try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"2",driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).getText();
        Me.Check("Просмотреть", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
        Me.Check("Заполнить", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
        Me.Check("Подписать", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
        Me.CheckExit("Пропустить", test2, driver);

    }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }

    @Test
    @Order(2)
    void B_CheckFill_Test2() {
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
        Me.Check("Заполнить", test, driver);
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
        Me.Check("Подписать", test, driver);
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
        Me.Check("Пропустить", test, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(3500);
        test = driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
        System.out.println(test);
        Me.CheckExit("УПД", test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(3)
    void C_CheckSign_Test3() {
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
        Me.Sleep(3500);
        test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
        System.out.println(test);
        Me.CheckExit("Все документы успешно подписаны УСИЛЕННОЙ ЭП!", test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(4)
    void D_CheckSkip_Test4() {
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Me.Sleep(3500);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
        System.out.println(test);
        Me.CheckExit("Подписание было пропущено пользователем.", test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

}