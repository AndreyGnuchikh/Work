package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class T_OpenProtocolCompliance_Test20 extends iit8077 {
    WebDriver driver;
    String test;
    String test2;
    String urlSubstring = url.substring(0,22);
     @BeforeEach
    void setUp(){
         try {
        driver = Drivers.ff();
        driver.get(urlSubstring +"/auth?error=noauth");
        Me.loggingCerts(upd,driver);
        Me.RoleSwitch(2,driver);
        Me.startEndingCertAndSendingFiles(driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }
    @Test
    @Order(1)
    void A_NameCardED_Test1(){
         try {
        test2 =  Me.AddFile("1.html",driver);
        driver.get(urlSubstring +"/iit/compliance?idf="+test2);
        Me.Sleep(500);
        test = driver.findElement(By.id("file")).getText();
        Me.Sleep(500);
        Me.CheckExit("«1.html»",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(2)
    void B_NameCardED_Test2(){
         try {
        Date date = new Date();
        test2 =  Me.AddFile("1.html",driver);
        driver.get(urlSubstring +"/iit/compliance?idf="+test2);
        Me.Sleep(500);
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        test = driver.findElement(By.id("date")).getText();
        Me.Sleep(500);
        Me.CheckExit(dateFormat.format(date),test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(3)
    void C_SignCardED_Test3(){
         try {
        test2 =  Me.AddFile("1.html",driver);
        Me.SingFirstFile(driver);
        driver.get(urlSubstring +"/iit/compliance?idf="+test2);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(2)")).getText();
        Me.Sleep(500);
        Me.Check("УПД должность 2001",test,driver);
        test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(4)")).getText();
        Me.Sleep(500);
        Me.Check("Должность",test,driver);
        test = driver.findElement(By.cssSelector("#signatures > tr > td:nth-child(5)")).getText();
        Me.Sleep(500);
        Me.CheckExit("67778A2E000300036346\n" +
                "с 20.05.2019 по 02.03.2020",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(4)
    void D_OperatorCardED_Test4(){
         try {
        test2 =  Me.AddFile("1.html",driver);
        driver.get(urlSubstring +"/iit/compliance?idf="+test2);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("div.p:nth-child(6) > span:nth-child(1)")).getText();
        Me.Sleep(500);
        Me.CheckExit("Справочную информацию об Операторе электронного документооборота ООО «ИИТ» (ИНН/КПП: 7708713259/770801001; ОГРН: 1107746079649) можно получить на сайте iit.ru, о доверенных Удостоверяющих центрах - на сайтах УЦ.",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(5)
    void E_EmailIITCardED_Test5(){
         try {
        test2 =  Me.AddFile("1.html",driver);
        driver.get(urlSubstring +"/iit/compliance?idf="+test2);
        Me.Sleep(500);
        test = driver.findElement(By.id("mail")).getText();
        Me.Sleep(500);
        Me.CheckExit("info@iit.ru",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(6)
    void F_CardEDCheckNewWindow_Test6(){
         try {
        test2 =  Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(11,driver);
        test = String.valueOf(driver.getWindowHandles());
        test = test.substring(13,23);
        System.out.println(test);
        driver.switchTo().window(test);
        test = driver.getCurrentUrl();
        System.out.println(test);
        Me.Sleep(500);
        Me.CheckingContainsExit("10.48.0.13:8077/iit/compliance?idf=",test,driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
}