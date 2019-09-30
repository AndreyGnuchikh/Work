package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;
import static iitAdd.Me.Sleep;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class M_SkipDocument_Test13 extends iit8077 {
    WebDriver driver;
    String test,test2;
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
    void A_SkipDocument_DOP_Test1(){
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"2",driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Sleep(1000);
        test = driver.findElement(By.cssSelector("#signModal-title")).getText();
        Me.Check("Подписать ЭД",test,driver);
        Sleep(1000);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        Me.CheckExit("Подписание было пропущено пользователем.",test,driver);

    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(2)
    void B_SkipDocument_SchfDOP_Test2(){
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"3",driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Sleep(1500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Sleep(1000);
        test = driver.findElement(By.cssSelector("#signModal-title")).getText();
        Me.Check("Подписать ЭД",test,driver);
        Sleep(1000);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        Me.CheckExit("Подписание было пропущено пользователем.",test,driver);

    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(3)
    void C_SkipDocument_Schf_Test3(){
         try {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"1",driver);
        Actions builder2 = new Actions(driver);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
        builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        Sleep(1000);
        test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true",test,driver);

    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
}
