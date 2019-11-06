package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class N_SaveDocumentInPc_Test14 extends iit8077 {
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
            File dir = new File("C:\\Tools\\TestFile");
            Me.DeletedFiles(dir);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_SaveDocument_Test1() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(0);
            Me.CheckExit("C:\\Tools\\TestFile\\0.pdf", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_SaveCompliance_Test2() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            test = test.substring(0, 28);
            Me.CheckExit("C:\\Tools\\TestFile\\compliance", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_SaveP7SFormat_Test3() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("9", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_SaveP7SFormatAndDocument_Test4() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("10", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_SaveP7SFormatAndCompliance_Test5() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(0);
            Me.CheckExit("10", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_SaveAll_Test6() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("11", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_SaveComplianceAndDocument_Test7() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.Sleep(500);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(5000);
            test = Me.ReZip(1);
            Me.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_DatesName_Test8() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("y-MM-dd");
            test2 = dateFormat.format(currentDate);
            Me.CheckExit("C:\\Tools\\TestFile\\" + test2 + ".zip", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_DOP_SaveDocument_Test9() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("C:\\Tools\\TestFile\\Dop.pdf", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void J_DOP_SaveCompliance_Test10() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            test = test.substring(0, 28);
            Me.CheckExit("C:\\Tools\\TestFile\\compliance", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_DOP_SaveP7SFormat_Test11() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("4", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_DOP_SaveP7SFormatAndDocument_Test12() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.Sleep(500);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("5", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(13)
    void M_DOP_SaveP7SFormatAndCompliance_Test13() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(0);
            Me.CheckExit("5", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(14)
    void N_DOP_SaveAll_Test14() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("6", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(15)
    void O_DOP_SaveComplianceAndDocument_Test15() {
        try {
            test2 = Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(5000);
            test = Me.ReZip(1);
            Me.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(16)
    void P_NoFormat_SaveDocument_Test16() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(1000);
            test = Me.ReZip(0);
            Me.CheckExit("C:\\Tools\\TestFile\\1.html", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(17)
    void Q_NoFormat_SaveCompliance_Test17() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(1000);
            test = Me.ReZip(1);
            test = test.substring(0, 28);
            Me.CheckExit("C:\\Tools\\TestFile\\compliance", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(18)
    void R_NoFormat_SaveP7s_Test18() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(1000);
            test = Me.ReZip(0);
            Me.CheckExit("C:\\Tools\\TestFile\\1.p7s", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(19)
    void S_NoFormat_SaveP7SFormatAndDocument_Test19() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(20)
    void T_NoFormat_SaveP7SFormatAndCompliance_Test20() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(0);
            Me.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(21)
    void U_NoFormat_SaveAll_Test21() {
        try {
            Me.AddFileAndClickMenu(5, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            Me.ClickMenuFirstElement(6, driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = Me.ReZip(1);
            Me.CheckExit("4", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(22)
    void V_NoFormat_NoSaveP7s_Test22() {
        try {
            Me.AddFileAndClickMenu(6, "1.html", driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Me.Sleep(1000);
            test = Me.ReZip(0);
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("y-MM-dd");
            test2 = dateFormat.format(currentDate);
            Me.CheckExit("C:\\Tools\\TestFile\\" + test2 + ".zip", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

}