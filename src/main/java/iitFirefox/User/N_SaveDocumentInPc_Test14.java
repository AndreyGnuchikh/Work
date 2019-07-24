package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class N_SaveDocumentInPc_Test14 {
    WebDriver driver;
    String test,test2;
    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
        File dir = new File("C:\\Tools\\TestFile");
        Me.DeletedFiles(dir);
    }

    @Test
    public void A_SaveDocument_Test1()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(0);
        Me.CheckExit("C:\\Tools\\TestFile\\0.pdf",test,driver);
    }
    @Test
    public void B_SaveCompliance_Test2()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        test = test.substring(0,28);
        Me.CheckExit("C:\\Tools\\TestFile\\compliance",test,driver);
    }
    @Test
    public void C_SaveP7SFormat_Test3()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("9",test,driver);
    }
    @Test
    public void D_SaveP7SFormatAndDocument_Test4()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("10",test,driver);
    }
    @Test
    public void E_SaveP7SFormatAndCompliance_Test5()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(0);
        Me.CheckExit("10",test,driver);
    }
    @Test
    public void F_SaveAll_Test6()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("11",test,driver);
    }
    @Test
    public void G_SaveComplianceAndDocument_Test7()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(5000);
        test = Me.Rezip(1);
        Me.CheckExit("3",test,driver);
    }
    @Test
    public void H_DatesName_Test8()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("1",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("y-MM-dd");
        test2 = dateFormat.format(currentDate);
        Me.CheckExit("C:\\Tools\\TestFile\\" + test2 +".zip",test,driver);
    }
    @Test
    public void I_DOP_SaveDocument_Test9()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("C:\\Tools\\TestFile\\Dop.pdf",test,driver);
    }
    @Test
    public void J_DOP_SaveCompliance_Test10()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        test = test.substring(0,28);
        Me.CheckExit("C:\\Tools\\TestFile\\compliance",test,driver);
    }
    @Test
    public void K_DOP_SaveP7SFormat_Test11()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("4",test,driver);
    }
    @Test
    public void L_DOP_SaveP7SFormatAndDocument_Test12()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("5",test,driver);
    }
    @Test
    public void M_DOP_SaveP7SFormatAndCompliance_Test13()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(0);
        Me.CheckExit("5",test,driver);
    }
    @Test
    public void N_DOP_SaveAll_Test14()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("6",test,driver);
    }
    @Test
    public void O_DOP_SaveComplianceAndDocument_Test15()throws IOException{
        test2 = Me.CreateFirstUPDDocumentAndSign("2",driver);
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(5000);
        test = Me.Rezip(1);
        Me.CheckExit("3",test,driver);
    }
    @Test
    public void P_NoFormat_SaveDocument_Test16()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(1000);
        test = Me.Rezip(0);
        Me.CheckExit("C:\\Tools\\TestFile\\1.html",test,driver);
    }
    @Test
    public void Q_NoFormat_SaveCompliance_Test17()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(1000);
        test = Me.Rezip(1);
        test = test.substring(0,28);
        Me.CheckExit("C:\\Tools\\TestFile\\compliance",test,driver);
    }
    @Test
    public void R_NoFormat_SaveP7s_Test18()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(1000);
        test = Me.Rezip(0);
        Me.CheckExit("C:\\Tools\\TestFile\\1.p7s",test,driver);
    }
    @Test
    public void S_NoFormat_SaveP7SFormatAndDocument_Test19()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("3",test,driver);
    }
    @Test
    public void T_NoFormat_SaveP7SFormatAndCompliance_Test20()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(0);
        Me.CheckExit("3",test,driver);
    }
    @Test
    public void U_NoFormat_SaveAll_Test21()throws IOException{
        Me.AddFileAndClickMenu(5,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.ClickMenuFirstElement(6,driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadDocument")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadCompliance")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        test = Me.Rezip(1);
        Me.CheckExit("4",test,driver);
    }
    @Test
    public void V_NoFormat_NoSaveP7s_Test22()throws IOException{
        Me.AddFileAndClickMenu(6,"1.html",driver);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        Me.Sleep(1000);
        test = Me.Rezip(0);
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("y-MM-dd");
        test2 = dateFormat.format(currentDate);
        Me.CheckExit("C:\\Tools\\TestFile\\" + test2 +".zip",test,driver);
    }

}