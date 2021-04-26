package edosf.iitFirefox.user8077;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Iit8077;
import edosf.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static edosf.methods.Path.GetPathTools;
import static edosf.settingsEdo.Settings.NUM_FAIL;
import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class N_SaveDocumentInPc_Test14 implements Iit8077 {
    WebDriver driver;
    String test, test2;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            File dir = new File(GetPathTools("testFile"));
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_SaveDocument_Test1() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(0);
            Check.CheckingContainsExit("Tools\\testFile\\0.pdf", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_SaveCompliance_Test2() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckingContainsExit("compliance", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_SaveP7SFormat_Test3() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("9", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_SaveP7SFormatAndDocument_Test4() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("10", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_SaveP7SFormatAndCompliance_Test5() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(0);
            Check.CheckExit("10", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void F_SaveAll_Test6() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("11", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void G_SaveComplianceAndDocument_Test7() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Thread.sleep(500);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(5000);
            test = HelpUser.ReZip(1);
            Check.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void H_DatesName_Test8() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("y-MM-dd");
            test2 = dateFormat.format(currentDate);
            Check.CheckingContainsExit("Tools\\testFile\\" + test2 + ".zip", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void I_DOP_SaveDocument_Test9() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckingContainsExit("Tools\\testFile\\Dop.pdf", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void J_DOP_SaveCompliance_Test10() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckingContainsExit("Tools\\testFile\\compliance", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void K_DOP_SaveP7SFormat_Test11() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("4", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void L_DOP_SaveP7SFormatAndDocument_Test12() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Thread.sleep(500);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("5", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void M_DOP_SaveP7SFormatAndCompliance_Test13() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(0);
            Check.CheckExit("5", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void N_DOP_SaveAll_Test14() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("6", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void O_DOP_SaveComplianceAndDocument_Test15() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(5000);
            test = HelpUser.ReZip(1);
            Check.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void P_NoFormat_SaveDocument_Test16() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1000);
            test = HelpUser.ReZip(0);
            Check.CheckingContainsExit("1.html", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    void Q_NoFormat_SaveCompliance_Test17() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1000);
            test = HelpUser.ReZip(1);
            Check.CheckingContainsExit("Tools\\testFile\\compliance", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void R_NoFormat_SaveP7s_Test18() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1000);
            test = HelpUser.ReZip(0);
            Check.CheckingContainsExit("1.p7s", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void S_NoFormat_SaveP7SFormatAndDocument_Test19() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void T_NoFormat_SaveP7SFormatAndCompliance_Test20() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(0);
            Check.CheckExit("3", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void U_NoFormat_SaveAll_Test21() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(5, "1.html", driver);
            Element.WaitElementToBeClickableAndClick("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)",driver);
            Element.WaitElementIsDisableAndClickIfNot("button.btn:nth-child(5)",driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadDocument")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadCompliance")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            test = HelpUser.ReZip(1);
            Check.CheckExit("4", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void V_NoFormat_NoSaveP7s_Test22() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(6, "1.html", driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1000);
            test = HelpUser.ReZip(0);
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("y-MM-dd");
            test2 = dateFormat.format(currentDate);
            Check.CheckingContainsExit("Tools\\testFile\\" + test2 + ".zip", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}