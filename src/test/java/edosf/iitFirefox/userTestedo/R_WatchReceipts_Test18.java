package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class R_WatchReceipts_Test18 implements Testedo {
    WebDriver driver;
    String test, test2;




    @BeforeEach
    void setUP() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_ReceiptOneSignAndDataSchF_Test1() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSign("1", driver);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            CheckGreen("2");
            CheckGreen("3");
            test = HelpUser.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("tr.file-operator:nth-child(2)" + " > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_ReceiptOneSignAndDataSchFDop_Test2() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSign("3", driver);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("tr.file-operator:nth-child(2)" + " > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Check.Check("td-operator-number numbergreen", test, driver);
            test = driver.findElement(By.cssSelector("tr.file-operator:nth-child(3)" + " > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Check.Check("td-operator-number numbergreen", test, driver);
            test = HelpUser.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("tr.file-operator:nth-child(2) > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
    void D_AllReceiptAndDataSchF_Test4() {
        try {
            FileCreateAndLoading.CreateFirstUPDDocumentAndSignAndSand("1", driver);
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(UPD2, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(20000);
            Cabinet.OpenNameFolder("явт", driver);

            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(2000);
            CheckGreen("2");
            CheckGreen("3");
            CheckGreen("4");
            CheckGreen("5");
            CheckGreen("6");


            CheckName("2", "оно ?");
            CheckName("3", "оня ?");
            CheckName("4", "хоо ?");
            CheckName("5", "онх ?");
            CheckName("6", "онхо ?");

            test = HelpUser.Time();
            System.out.println(test);

            CheckTime("2", test);
            CheckTime("3", test);
            CheckTime("4", test);
            CheckTime("5", test);
            CheckTime("6", test);

            test2 = driver.findElement(By.cssSelector("tr.file-operator:nth-child(3) > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_AllReceiptAndDataSchFDOP_Test5() {
        try {
            FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2,"3", driver);
            Cabinet.ClickMenuFirstElement(9, driver);
            Thread.sleep(1000);
            CheckGreen("2");
            CheckGreen("3");
            CheckGreen("4");
            CheckGreen("5");
            CheckGreen("6");


            CheckName("2", "оно ?");
            CheckName("3", "оня ?");
            CheckName("4", "хоо ?");
            CheckName("5", "онх ?");
            CheckName("6", "онхо ?");

            test = HelpUser.Time();
            System.out.println(test);

            CheckTime("2", test);
            CheckTime("3", test);
            CheckTime("4", test);
            CheckTime("5", test);
            CheckTime("6", test);

            test2 = driver.findElement(By.cssSelector("tr.file-operator:nth-child(3) > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Check.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
        test = driver.findElement(By.cssSelector("tr.file-operator:nth-child("+str+")" + " > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Check.Check("td-operator-number numbergreen", test, driver);
        Thread.sleep(200);
    }

    void CheckName(String str, String str2) throws InterruptedException {
        test = driver.findElement(By.cssSelector("tr.file-operator:nth-child("+str+")" + " > td:nth-child(2)")).getText();
        Check.Check(str2, test, driver);
    }

    void CheckTime(String str, String test) throws InterruptedException {
        test2 = driver.findElement(By.cssSelector("tr.file-operator:nth-child("+str+")" + " > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0, 10);
        Check.Check(test, test2, driver);
    }
}
