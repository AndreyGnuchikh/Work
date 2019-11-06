package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import iitFirefox.User.Form.CompleteFormAct;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Date;

import static iitAdd.Me.*;
import static iitAdd.Me.RoleSwitch;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class U_SendDocumentToContragent_Test21 extends iit8077 {
    WebDriver driver;
    String test,test2;

    @BeforeEach
    void setUp(){
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.LogPass(ip,ip,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }

    @Test
    @Order(1)
    void A_GetFileName_Test1(){
        try {
            Me.AddFile("1.html",driver);
            Me.ClickMenuFirstElement(12,driver);
            test = driver.findElement(By.id("sn-fname")).getAttribute("textContent");
            Me.CheckExit("1.html",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(2)
    void B_AddTextInFile_Test2(){
        try {
            Date date = new Date();
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+date);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            String dateText = date.toString();
            Me.CheckExit(dateText,test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(3)
    void C_CheckCabinetRecipient_Test3(){
        try {
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(2500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getText();
            Me.CheckExit("Все хорошо 2.0",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(4)
    void D_CheckCoworkerRecipient_Test4(){
        try {

            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(8)")).getText();
            Me.CheckExit("УПД Должность 2",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(5)
    void E_AddTextInFileAndOpenInRecipientLk_Test5(){
        try {
            Date date = new Date();
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+date);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            test();
            Me.Sleep(500);
            driver.findElement(By.name("id51890")).click();
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            String DateText = date.toString();
            Me.CheckExit(DateText,test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(6)
    void F_CheckCabinetRecipientInRecipientLk_Test6(){
        try {
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            test();
            Me.Sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getText();

            Me.CheckExit("Все хорошо 2.0",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(7)
    void G_CheckCoworkerRecipientInRecipientLk_Test7(){
        try {
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            test();
            Me.Sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(8)")).getText();

            Me.CheckExit("УПД Должность 2",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(8)
    void H_CheckCabinetSenderInRecipientLk_Test8(){
        try {
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            test();
            Me.Sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(4)")).getText();

            Me.CheckExit("Кабинет 1",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(9)
    void I_CheckCoworkerSenderInRecipientLk_Test9(){
        try {
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            test();
            Me.Sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(5)")).getText();

            Me.CheckExit("ИП",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(10)
    void J_CheckStatus_Test10(){
        try {
            Me.AddFile("1.html",driver);
            Me.Sleep(500);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            Me.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" table:nth-child(1) > tr:nth-child(1) > td:nth-child(12) > div:nth-child(1) > i:nth-child(1)")).getAttribute("title");

            Me.CheckExit("Исходящий",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(11)
    void K_SendEmailRecipient_Test11(){
        try {
            Date date = new Date();
            String dateText,check;
            check = "true";
            Me.Exit(driver);
            //Start
            driver.get(url);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            String checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-1\"]")).getAttribute("checked");
            if (!check.equals(checkbox2)) {
                driver.findElement(By.cssSelector("#not-1")).click();
            }
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Exit(driver);
            Me.Email(testIitTest4,EmailPass,driver);
            Me.Sleep(500);
            Me.DeletedEmail(driver);
            //AddAndSend
            driver.get(url);
            Me.LogPass(ip,ip,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.AddFile("1.html",driver);
            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+ date);
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.OpenNameFolder("Не оформленные исход",driver);
            Me.Sleep(500);
            Me.Exit(driver);
            //Email
            Me.EmailTest4(testIitTest4,EmailPass,driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject",driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject")).click();
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("textContent");
            test = test.substring(273);
            dateText = date.toString();
            Me.CheckExit(dateText,test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(12)
    void L_WrongSellerNoSignSendUDPDocument_Test12(){
        try {
            Me.AddFile("upd\\IPSchfDop.xml",driver);

            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood1();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(2000);
            test = driver.findElement(By.cssSelector(".resptext > div:nth-child(1) > div:nth-child(2)")).getAttribute("textContent");
            Me.CheckExit("1. IPSchfDop.xml (Можно отправить только продавцу)",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(13)
    void M_SendUDPNoSignDocument_Test13(){
        try {
            Me.AddFile("upd\\IPSchfDop.xml",driver);

            test2 = Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.Sleep(2000);
            test = driver.findElement(By.cssSelector(".resptext > div:nth-child(1) > div:nth-child(2)")).getAttribute("textContent");
            Me.CheckExit("1. IPSchfDop.xml (Можно отправить только продавцу)",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(14)
    void N_SendSignUPDDocument_Test14(){
        try {
            test = Me.AddFile("upd\\IPSchfDop.xml",driver);
            Me.SingFirstFileUDP(test,driver);
            Me.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)",driver);
            Me.Exit(driver);
            Me.loggingCerts(upd2,driver);
            Me.RoleSwitch(2,driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.OpenNameFolder("УПД 123",driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(15)
    void O_SendUPDDocumentWith2Sign_Test15(){
        try{
            test2 = CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"4",driver);
            Me.Sleep(10000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.Sleep(500);
            Me.ClickMenuFirstElement(12,driver);
            Me.SendCabinet("Тест Все хорошо","Переименованный кабинет",driver);
            Me.Sleep(6000);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getAttribute("textContent");
            Me.CheckExit("Переименованный кабинет",test,driver);
        }catch (Throwable e) {
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(16)
    void P_ChoseIitSendUPD_Test16(){
        try{
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(12,driver);
            driver.findElement(By.cssSelector(".selectize-input")).click();
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("ИИТ");
            Sleep(1500);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Sleep(1500);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
            Sleep(1000);
            driver.findElement(By.xpath("//*[contains(text(), 'ИИТ')][contains(@class, 'option')]")).click();
            test = driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1)")).getAttribute("textContent");

            Me.CheckExit("Секретарь",test,driver);
        }catch (Throwable e){
            Me.Catch(driver,e);
        }
    }
    @Test
    @Order(17)
    void Q_DocSendingSecondDocument_Test17(){
            try{
                Exit(driver);
                loggingCerts(upd,driver);
                RoleSwitch(2,driver);
                Sleep(2000);
                Me.startEndingCertAndSendingFiles(driver);
                Me.Sleep(2000);
                driver.findElement(By.cssSelector(".createDocument")).click();
                driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
                Me.Sleep(500);
                driver.findElement(By.cssSelector("#uploadForm")).click();
                Me.Sleep(500);
                driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
                Me.Sleep(500);
                driver.findElement(By.cssSelector("#create")).click();
                Me.Sleep(1000);
                // Add act
                test2 = CompleteFormAct.Act(driver);
                Me.ClickMenuFirstElement(3, driver);
                Me.Sleep(500);
                test2 = driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(2)")).getAttribute("outerHTML");
                ////////////////////////////////////////
                test2 = Me.Split(test2,"connectedDoc\":\"",36);
                Me.Sleep(1000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
                Me.Sleep(1000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
                Me.Sleep(1000);
                driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Me.Sleep(1000);
                driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Me.Sleep(4000);
                Me.SingFirstFile(driver);
                driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
                Me.startEndingCertAndSendingFiles(driver);
                Me.ClickMenuFirstElement(12,driver);
                Me.SendCabinet("Все хорошо 2,0","Все хорошо 2.0",driver);
                Me.Exit(driver);
                Me.loggingCerts(upd2,driver);
                Me.RoleSwitch(2,driver);
                Me.startEndingCertAndSendingFiles(driver);
                Me.OpenNameFolder("не",driver);
                String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
                row = row.substring(0, 36);
                Me.CheckExit(test2,row,driver);
            }catch (Throwable e){

                Me.Catch(driver,e);
            }
        }
        void sendAllGood2(){
            driver.findElement(By.cssSelector(".selectize-input")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Все хорошо 2");
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
            Me.Sleep(200);
            driver.findElement(By.xpath("//*[contains(text(), 'Все хорошо 2.0')][contains(@class, 'option')]")).click();
            Me.Sleep(100);
            driver.findElement(By.cssSelector("#sendModal > div > div > div.modal-body > div:nth-child(4) > div > div.selectize-input.items.not-full.has-options")).click();
            Me.Sleep(100);
            driver.findElement(By.xpath("//*[contains(text(), 'УПД Должность 2')][contains(@class, 'option')]")).click();
            Me.Sleep(100);
        }
        void sendAllGood1() {
            driver.findElement(By.cssSelector(".selectize-input")).click();
            Me.Sleep(100);
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Тест Все хорошо");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
            Me.Sleep(200);
            driver.findElement(By.xpath("//*[contains(text(), 'Переименованный кабинет')][contains(@class, 'option')]")).click();
            Me.Sleep(100);
            driver.findElement(By.cssSelector("#sendModal > div > div > div.modal-body > div:nth-child(4) > div > div.selectize-input.items.not-full.has-options")).click();
            Me.Sleep(100);
            driver.findElement(By.xpath("//*[contains(text(), 'Иванов Денис')][contains(@class, 'option')]")).click();
            Me.Sleep(100);
        }
        public void test() {
            String folder = driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1)")).getAttribute("className");
            if(!folder.contains("expanded")){
                driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
                Sleep(1500);
                ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
            }
        }
    }
