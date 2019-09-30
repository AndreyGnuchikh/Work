package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class P_OpenCardsDocuments_Test16 extends iit8077 {
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
    void A_OpenCardFirstBlock_Test1(){
         try {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

        Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(10,driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#modalSendConfirm")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        test = driver.findElement(By.cssSelector("#cf-fname")).getText();
        Me.Sleep(500);
        Me.Check("1.html",test,driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#cf-creator")).getText();
        Me.Check("УПД Должность",test,driver);
        test = driver.findElement(By.cssSelector("#cf-perf")).getText();
        Me.Check("УПД Должность",test,driver);
        test = driver.findElement(By.cssSelector("#cf-date")).getText();
        test = test.substring(0,10);
        Me.Check(dateFormat.format( currentDate ),test,driver);
        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(2)")).getText();
        test = test.substring(0,10);
        Me.Check(dateFormat.format( currentDate ),test,driver);
        test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(1)")).getText();
        Me.Check("Согласовано",test,driver);
        test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(3)")).getText();
        Me.Check("УПД Должность",test,driver);
        test = driver.findElement(By.cssSelector("#cf-confirmBody > tr:nth-child(1) > td:nth-child(4)")).getText();
        Me.CheckExit("Д",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(2)
    void B_OpenCardSecondBlock_Test2(){
         try {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format( currentDate ));
        Me.CreateFirstUPDDocumentAndSignAndSand("2",driver);
        Me.OpenNameFolder("АКТ",driver);
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        //Second
        test = driver.findElement(By.cssSelector("#cf-fname")).getText();
        Me.Sleep(500);
        Me.Check("Dop.xml",test,driver);
        test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(1)")).getText();
        Me.Check("УПД должность 2001",test,driver);
        test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(4)")).getText();
        test = test.substring(0,10);
        Me.Sleep(500);
        Me.Check(dateFormat.format( currentDate ),test,driver);
        test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(3)")).getText();
        Me.Check("Должность",test,driver);
        test = driver.findElement(By.cssSelector("#cf-signBody > tr:nth-child(1) > td:nth-child(5)")).getText();
        Me.CheckExit("67778A2E000300036346\n" +
                "с 20.05.2019 по 02.03.2020",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(3)
    void C_OpenCardThirdBlock_Test3(){
         try {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        Me.CreateFirstUPDDocumentAndSignAndSand("3",driver);
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        //Third
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(2)")).getText();
        test = test.substring(0,10);
        Me.Sleep(500);
        Me.Check(dateFormat.format( currentDate ),test,driver);
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(1)")).getText();
        Me.Check("Отправлено",test,driver);
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(3)")).getText();
        Me.Check("Тест Все хорошо",test,driver);
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(4)")).getText();
        Me.Check("УПД Должность",test,driver);
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(5)")).getText();
        Me.Check("Все хорошо 2,0",test,driver);
        test = driver.findElement(By.cssSelector("#cf-historyBody > tr:nth-child(1) > td:nth-child(6)")).getText();
        Me.CheckExit("Андрей Андрей",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(4)
    void D_OpenCardComments_Test4(){
         try {
        Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys("Тест");
        driver.findElement(By.cssSelector("#cf-sendcomm")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        test = driver.findElement(By.cssSelector("#cf-comm")).getText();
        Me.Sleep(1000);
        Me.Check("Тест",test,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys("Тест");
        driver.findElement(By.cssSelector("#cf-sendcomm")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        test = driver.findElement(By.cssSelector("#cf-comm")).getText();
        Me.Sleep(500);
        Me.CheckExit("Тест; Тест",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(5)
    void E_OpenCardDoubleClick_Test5(){
         try {
        Me.AddFile("1.html",driver);
        String row = null;
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        System.out.println(row);
        Me.Sleep(1500);
        WebElement element = driver.findElement(By.cssSelector("#grid-basic2-row-" + row));
        new Actions(driver).doubleClick(element).perform(); // без build()
        Me.Sleep(1500);
        test = driver.findElement(By.cssSelector("#cf-fname")).getText();
        Me.CheckExit("1.html",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
}
