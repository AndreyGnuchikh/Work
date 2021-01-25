package EDOSF.iitFirefox.UserTestedo;

import EDOSF.Form.CompleteFormAct;
import EDOSF.iitAdd.Drivers;
import EDOSF.iitAdd.testedo;
import EDOSF.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class U_SendDocumentToContragent_Test21 extends testedo {
    WebDriver driver;
    String test,test2;

    @BeforeEach
    void setUp(){
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(ip,ip,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }

    @Test
    @Order(1)
    void A_GetFileName_Test1(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            Cabinet.ClickMenuFirstElement(12,driver);
            test = driver.findElement(By.id("sn-fname")).getAttribute("textContent");
            Check.CheckExit("1.html",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(2)
    void B_AddTextInFile_Test2(){
        try {
            Date date = new Date();
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+date);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            Cabinet.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            String dateText = date.toString();
            Check.CheckExit(dateText,test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(3)
    void C_CheckCabinetRecipient_Test3(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(2500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            Cabinet.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getText();
            Check.CheckExit("Все хорошо 2.0",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(4)
    void D_CheckCoworkerRecipient_Test4(){
        try {

            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            Cabinet.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(8)")).getText();
            Check.CheckExit("УПД Должность 2",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(5)
    void E_AddTextInFileAndOpenInRecipientLk_Test5(){
        try {
            Date date = new Date();
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+date);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            test();
            Thread.sleep(500);
            driver.findElement(By.name("id51890")).click();
            Thread.sleep(500);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            String DateText = date.toString();
            Check.CheckExit(DateText,test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(6)
    void F_CheckCabinetRecipientInRecipientLk_Test6(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            test();
            Thread.sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getText();

            Check.CheckExit("Все хорошо 2.0",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(7)
    void G_CheckCoworkerRecipientInRecipientLk_Test7(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            test();
            Thread.sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(8)")).getText();

            Check.CheckExit("УПД Должность 2",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(8)
    void H_CheckCabinetSenderInRecipientLk_Test8(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            test();
            Thread.sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(4)")).getText();

            Check.CheckExit("Кабинет 1",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(9)
    void I_CheckCoworkerSenderInRecipientLk_Test9(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            test();
            Thread.sleep(500);
            driver.findElement(By.name("id51890")).click();
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(5)")).getText();

            Check.CheckExit("ИП",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(10)
    void J_CheckStatus_Test10(){
        try {
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            Thread.sleep(500);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            Cabinet.OpenNameFolder("Не оформленные исход",driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" table:nth-child(1) > tr:nth-child(1) > td:nth-child(12) > div:nth-child(1) > i:nth-child(1)")).getAttribute("title");

            Check.CheckExit("Исходящий",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(11)
    void K_SendEmailRecipient_Test11(){
        try {
            Date date = new Date();
            String dateText,check;
            check = "true";
            EnterAndExit.Exit(driver);
            //Start
            driver.get(url);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            String checkbox2 = driver.findElement(By.xpath("//*[@id=\"not-1\"]")).getAttribute("checked");
            if (!check.equals(checkbox2)) {
                driver.findElement(By.cssSelector("#not-1")).click();
            }
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            EnterAndExit.Exit(driver);
            Email.Email(testIitTest4,EmailPass,driver);
            Thread.sleep(500);
            Email.DeletedEmail(driver);
            //AddAndSend
            driver.get(url);
            EnterAndExit.LogPass(ip,ip,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            FileCreateAndLoading.AddFile("SkipSignFiles","1.html",driver);
            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys(""+ date);
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Cabinet.OpenNameFolder("Не оформленные исход",driver);
            Thread.sleep(500);
            EnterAndExit.Exit(driver);
            //Email
            Email.EmailTest4(testIitTest4,EmailPass,driver);
            Element.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject",driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject")).click();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector(".mail-Message-Body-Content")).getAttribute("textContent");
            test = test.substring(273);
            dateText = date.toString();
            Check.CheckExit(dateText,test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(12)
    void L_WrongSellerNoSignSendUDPDocument_Test12(){
        try {
            FileCreateAndLoading.AddFile("upd\\IPSchfDop.xml",driver);

            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood1();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector(".resptext > div:nth-child(1) > div:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("1. IPSchfDop.xml (Можно отправить только продавцу)",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(13)
    void M_SendUDPNoSignDocument_Test13(){
        try {
            FileCreateAndLoading.AddFile("upd\\IPSchfDop.xml",driver);

            test2 = Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Thread.sleep(2000);
            test = driver.findElement(By.cssSelector(".resptext > div:nth-child(1) > div:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("1. IPSchfDop.xml (Можно отправить только продавцу)",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(14)
    void N_SendSignUPDDocument_Test14(){
        try {
            test = FileCreateAndLoading.AddFile("upd\\IPSchfDop.xml",driver);
            Sign.SignFirstFileUDP(test,driver);
            Cabinet.ClickMenuFirstElement(12,driver);
            sendAllGood2();
            driver.findElement(By.cssSelector("#sn-comment")).sendKeys("textContent");
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#modalSendButton")).click();
            Element.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)",driver);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2,driver);
            EnterAndExit.RoleSwitch(2,driver);
            EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
            Cabinet.OpenNameFolder("УПД 123",driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(15)
    void O_SendUPDDocumentWith2Sign_Test15(){
        try{
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url,upd2,"4",driver);
            Thread.sleep(10000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Thread.sleep(500);
            Cabinet.ClickMenuFirstElement(12,driver);
            Cabinet.SendCabinet("Тест Все хорошо","Переименованный кабинет",driver);
            Thread.sleep(6000);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-"+test2+" > table:nth-child(1) > tr:nth-child(1) > td:nth-child(7)")).getAttribute("textContent");
            Check.CheckExit("Переименованный кабинет",test,driver);
        }catch (Throwable e) {
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(16)
    void P_ChoseIitSendUPD_Test16(){
        try{
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(12,driver);
            driver.findElement(By.cssSelector(".selectize-input")).click();
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("ИИТ");
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(text(), 'ИИТ')][contains(@class, 'option')]")).click();
            test = driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1)")).getAttribute("textContent");

            Check.CheckExit("Секретарь",test,driver);
        }catch (Throwable e){
            Cabinet.Catch(driver,e);
        }
    }
    @Test
    @Order(17)
    void Q_DocSendingSecondDocument_Test17(){
            try{
                EnterAndExit.Exit(driver);
                EnterAndExit.loggingCerts(upd,driver);
                EnterAndExit.RoleSwitch(2,driver);
                Thread.sleep(2000);
                EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
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
                // Add act
                test2 = CompleteFormAct.Act("Yes",driver);
                Cabinet.ClickMenuFirstElement(3, driver);
                Thread.sleep(500);
                test2 = driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(2)")).getAttribute("outerHTML");
                ////////////////////////////////////////
                test2 = HelpUser.Split(test2,"connectedDoc\":\"",36);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Thread.sleep(4000);
                Sign.SignFirstFile(driver);
                driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
                EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
                Cabinet.ClickMenuFirstElement(12,driver);
                Cabinet.SendCabinet("Все хорошо 2,0","Все хорошо 2.0",driver);
                EnterAndExit.Exit(driver);
                EnterAndExit.loggingCerts(upd2,driver);
                EnterAndExit.RoleSwitch(2,driver);
                EnterAndExit.startEndingCertAndSendingFiles("SkipSignFiles",driver);
                Cabinet.OpenNameFolder("не",driver);
                String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
                row = row.substring(0, 36);
                Check.CheckExit(test2,row,driver);
            }catch (Throwable e){

                Cabinet.Catch(driver,e);
            }
        }
        void sendAllGood2() throws InterruptedException {
            driver.findElement(By.cssSelector(".selectize-input")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Все хорошо 2");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[contains(text(), 'Все хорошо 2.0')][contains(@class, 'option')]")).click();
            Thread.sleep(100);
            driver.findElement(By.cssSelector("#sendModal > div > div > div.modal-body > div:nth-child(4) > div > div.selectize-input.items.not-full.has-options")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(), 'УПД 2')][contains(@class, 'option')]")).click();
            Thread.sleep(100);
        }
        void sendAllGood1() throws InterruptedException {
            driver.findElement(By.cssSelector(".selectize-input")).click();
            Thread.sleep(100);
            driver.findElement(By.cssSelector(".selectize-input > input:nth-child(1)")).sendKeys("Тест Все хорошо");
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".selectize-dropdown-content > div:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#sendModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[contains(text(), 'Переименованный кабинет')][contains(@class, 'option')]")).click();
            Thread.sleep(100);
            driver.findElement(By.cssSelector("#sendModal > div > div > div.modal-body > div:nth-child(4) > div > div.selectize-input.items.not-full.has-options")).click();
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[contains(text(), 'Иванов Денис')][contains(@class, 'option')]")).click();
            Thread.sleep(100);
        }
        public void test() throws InterruptedException {
            String folder = driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1)")).getAttribute("className");
            if(!folder.contains("expanded")){
                driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
                Thread.sleep(1500);
                ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
            }
        }
    }
