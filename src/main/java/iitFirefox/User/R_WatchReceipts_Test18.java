package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class R_WatchReceipts_Test18 {
    WebDriver driver;
    String test,test2;

    @Before
    public void setUP(){
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd,driver);
        Me.RoleSwitch(2,driver);
        Me.startEndingCertAndSendingFiles(driver);
    }
    @Test
    public void A_ReceiptÀOneSignAndDataSchF_Test1(){
        Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(9,driver);
        Me.Sleep(1000);
        CheckGreen("#file-operator-sc");
        CheckGreen("#file-operator-snc");
        CheckGreen("#file-operator-bi");
        test = Me.Time();
        System.out.println(test);
        test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0,10);
        Me.CheckExit(test,test2,driver);
    }
    @Test
    public void B_ReceiptOneSignAndDataSchFDop_Test2(){
        Me.CreateFirstUPDDocumentAndSign("3",driver);
        Me.ClickMenuFirstElement(9,driver);
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Me.Check("td-operator-number numbergreen",test,driver);
        test = driver.findElement(By.cssSelector("#file-operator-snc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Me.Check("td-operator-number numbergreen",test,driver);
        test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Me.Check("td-operator-number numbergreen",test,driver);
        test = Me.Time();
        System.out.println(test);
        test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0,10);
        Me.CheckExit(test,test2,driver);
    }
    @Test
    public void C_NoReceiptAndDataDop_Test3(){
        Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(9,driver);

        test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

        System.out.println(test2);
        Me.CheckingContainsExit("dijitDisabled", test2, driver);
    }
    @Test
    public void D_AllReceiptAndDataSchF_Test4(){
        Me.CreateFirstUPDDocumentAndSignAndSand("1",driver);
        Me.Exit(driver);
        Me.loggingCerts(p.upd2,driver);
        Me.RoleSwitch(2,driver);
        Me.startEndingCertAndSendingFiles(driver);
        Me.Sleep(15000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[contains(text(), 'Ñ×Ô Íàèìåíîâàíèå')]")).click();

        Me.ClickMenuFirstElement(9,driver);
        Me.Sleep(1000);
        CheckGreen("#file-operator-sc");
        CheckGreen("#file-operator-snc");
        CheckGreen("#file-operator-bi");
        CheckGreen("#file-operator-bnic");
        CheckGreen("#file-operator-bni");
        CheckGreen("#file-operator-bc");
        CheckGreen("#file-operator-bnc");

        CheckName("#file-operator-sc","ÏÎÏ ?");
        CheckName("#file-operator-snc","ÈÏÏÏ ?");
        CheckName("#file-operator-bi","ÏÎÑ ?");
        CheckName("#file-operator-bnic","ÈÎÑ ?");
        CheckName("#file-operator-bni","ÈÏÏ ?");
        CheckName("#file-operator-bc","ÏÎÈ ?");
        CheckName("#file-operator-bnc","ÈÎÈ ?");

        test = Me.Time();
        System.out.println(test);

        CheckTime("#file-operator-sc",test);
        CheckTime("#file-operator-snc",test);
        CheckTime("#file-operator-bi",test);
        CheckTime("#file-operator-bnic",test);
        CheckTime("#file-operator-bni",test);
        CheckTime("#file-operator-bc",test);
        test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0,10);
        Me.CheckExit(test,test2,driver);
    }
    @Test
    public void E_AllReceiptAndDataSchFDOP_Test5(){
        Me.CreateFirstUPDDocumentAndSignAndSand("3",driver);
        Me.Exit(driver);
        Me.loggingCerts(p.upd2,driver);
        Me.RoleSwitch(2,driver);
        Me.startEndingCertAndSendingFiles(driver);
        Me.Sleep(15000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[contains(text(), 'ÓÏÄ 123')]")).click();

        Me.ClickMenuFirstElement(9,driver);
        Me.Sleep(1000);
        CheckGreen("#file-operator-sc");
        CheckGreen("#file-operator-snc");
        CheckGreen("#file-operator-bi");
        CheckGreen("#file-operator-bnic");
        CheckGreen("#file-operator-bni");
        CheckGreen("#file-operator-bc");
        CheckGreen("#file-operator-bnc");

        CheckName("#file-operator-sc","ÏÎÏ ?");
        CheckName("#file-operator-snc","ÈÏÏÏ ?");
        CheckName("#file-operator-bi","ÏÎÑ ?");
        CheckName("#file-operator-bnic","ÈÎÑ ?");
        CheckName("#file-operator-bni","ÈÏÏ ?");
        CheckName("#file-operator-bc","ÏÎÈ ?");
        CheckName("#file-operator-bnc","ÈÎÈ ?");

        test = Me.Time();
        System.out.println(test);

        CheckTime("#file-operator-sc",test);
        CheckTime("#file-operator-snc",test);
        CheckTime("#file-operator-bi",test);
        CheckTime("#file-operator-bnic",test);
        CheckTime("#file-operator-bni",test);
        CheckTime("#file-operator-bc",test);
        test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0,10);
        Me.CheckExit(test,test2,driver);
    }
    @Test
    public void F_NoReceiptAndDataNoFormalDocument_Test6(){
        Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(9,driver);

        test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

        System.out.println(test2);
        Me.CheckingContainsExit("dijitDisabled", test2, driver);
    }





    public void CheckGreen(String str){
        test = driver.findElement(By.cssSelector(str+" > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Me.Check("td-operator-number numbergreen",test,driver);
    }
    public void CheckName(String str,String str2){
        test = driver.findElement(By.cssSelector(str+" > td:nth-child(2)")).getText();
        Me.Check(str2,test,driver);
    }
    public void CheckTime(String str,String test){
    test2 = driver.findElement(By.cssSelector(str+" > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
    test2 = test2.substring(0,10);
        Me.Check(test,test2,driver);
    }
}
