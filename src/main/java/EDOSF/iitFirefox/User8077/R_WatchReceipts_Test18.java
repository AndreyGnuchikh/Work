package EDOSF.iitFirefox.User8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.HelpUser;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import EDOSF.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NUM_FAIL; 
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class R_WatchReceipts_Test18 extends iit8077 {
    WebDriver driver;
    String test, test2;




    @RetryingTest(NUM_FAIL)
    @BeforeEach
    void setUP() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_ReceiptOneSignAndDataSchF_Test1() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            CheckGreen("#file-operator-sc");
            CheckGreen("#file-operator-snc");
            CheckGreen("#file-operator-bi");
            test = HelpUser.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_ReceiptOneSignAndDataSchFDop_Test2() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSign("3", driver);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Check.Check("td-operator-number numbergreen", test, driver);
            test = driver.findElement(By.cssSelector("#file-operator-snc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Check.Check("td-operator-number numbergreen", test, driver);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Check.Check("td-operator-number numbergreen", test, driver);
            test = HelpUser.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_NoReceiptAndDataDop_Test3() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSign("2", driver);
            Cabinet.ClickMenuFirstElement(9, driver);

            test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

            System.out.println(test2);
            Check.CheckingContainsExit("dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_AllReceiptAndDataSchF_Test4() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("1", driver);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(20000);
            Cabinet.OpenNameFolder("Ñ×Ô Íàèìåíîâàíèå", driver);

            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(2000);
            CheckGreen("#file-operator-sc");
            CheckGreen("#file-operator-snc");
            CheckGreen("#file-operator-bi");
            CheckGreen("#file-operator-bnic");
            CheckGreen("#file-operator-bni");
            CheckGreen("#file-operator-bc");
            CheckGreen("#file-operator-bnc");

            CheckName("#file-operator-sc", "ÏÎÏ ?");
            CheckName("#file-operator-snc", "ÈÏÏÏ ?");
            CheckName("#file-operator-bi", "ÏÎÑ ?");
            CheckName("#file-operator-bnic", "ÈÎÑ ?");
            CheckName("#file-operator-bni", "ÈÏÏ ?");
            CheckName("#file-operator-bc", "ÏÎÈ ?");
            CheckName("#file-operator-bnc", "ÈÎÈ ?");

            test = HelpUser.Time();
            System.out.println(test);

            CheckTime("#file-operator-sc", test);
            CheckTime("#file-operator-snc", test);
            CheckTime("#file-operator-bi", test);
            CheckTime("#file-operator-bnic", test);
            CheckTime("#file-operator-bni", test);
            CheckTime("#file-operator-bc", test);
            test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_AllReceiptAndDataSchFDOP_Test5() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(upd2, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(20000);
            Cabinet.OpenNameFolder("ÓÏÄ 123", driver);

            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            CheckGreen("#file-operator-sc");
            CheckGreen("#file-operator-snc");
            CheckGreen("#file-operator-bi");
            CheckGreen("#file-operator-bnic");
            CheckGreen("#file-operator-bni");
            CheckGreen("#file-operator-bc");
            CheckGreen("#file-operator-bnc");

            CheckName("#file-operator-sc", "ÏÎÏ ?");
            CheckName("#file-operator-snc", "ÈÏÏÏ ?");
            CheckName("#file-operator-bi", "ÏÎÑ ?");
            CheckName("#file-operator-bnic", "ÈÎÑ ?");
            CheckName("#file-operator-bni", "ÈÏÏ ?");
            CheckName("#file-operator-bc", "ÏÎÈ ?");
            CheckName("#file-operator-bnc", "ÈÎÈ ?");

            test = HelpUser.Time();
            System.out.println(test);

            CheckTime("#file-operator-sc", test);
            CheckTime("#file-operator-snc", test);
            CheckTime("#file-operator-bi", test);
            CheckTime("#file-operator-bnic", test);
            CheckTime("#file-operator-bni", test);
            CheckTime("#file-operator-bc", test);
            test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_NoReceiptAndDataNoFormalDocument_Test6() {
        try {
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(9, driver);

            test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

            System.out.println(test2);
            Check.CheckingContainsExit("dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void CheckGreen(String str) throws InterruptedException {
        Thread.sleep(200);
        test = driver.findElement(By.cssSelector(str + " > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Check.Check("td-operator-number numbergreen", test, driver);
        Thread.sleep(200);
    }

    void CheckName(String str, String str2) throws InterruptedException {
        test = driver.findElement(By.cssSelector(str + " > td:nth-child(2)")).getText();
        Check.Check(str2, test, driver);
    }

    void CheckTime(String str, String test) throws InterruptedException {
        test2 = driver.findElement(By.cssSelector(str + " > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0, 10);
        Check.Check(test, test2, driver);
    }
}
