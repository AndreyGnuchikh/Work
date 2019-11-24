package iitFirefox.User8077;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class R_WatchReceipts_Test18 extends iit8077 {
    WebDriver driver;
    String test, test2;

    @BeforeEach
    void setUP() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_ReceiptOneSignAndDataSchF_Test1() {
        try {
            Me.CreateFirstUPDDocumentAndSign("1", driver);
            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(1000);
            CheckGreen("#file-operator-sc");
            CheckGreen("#file-operator-snc");
            CheckGreen("#file-operator-bi");
            test = Me.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Me.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ReceiptOneSignAndDataSchFDop_Test2() {
        try {
            Me.CreateFirstUPDDocumentAndSign("3", driver);
            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Me.Check("td-operator-number numbergreen", test, driver);
            test = driver.findElement(By.cssSelector("#file-operator-snc > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Me.Check("td-operator-number numbergreen", test, driver);
            test = driver.findElement(By.cssSelector("#file-operator-bi > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
            Me.Check("td-operator-number numbergreen", test, driver);
            test = Me.Time();
            System.out.println(test);
            test2 = driver.findElement(By.cssSelector("#file-operator-sc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Me.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_NoReceiptAndDataDop_Test3() {
        try {
            Me.CreateFirstUPDDocumentAndSign("2", driver);
            Me.ClickMenuFirstElement(9, driver);

            test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

            System.out.println(test2);
            Me.CheckingContainsExit("dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_AllReceiptAndDataSchF_Test4() {
        try {
            Me.CreateFirstUPDDocumentAndSignAndSand("1", driver);
            Me.Exit(driver);
            Me.loggingCerts(upd2, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.Sleep(20000);
            Me.OpenNameFolder("Ñ×Ô Íàèìåíîâàíèå", driver);

            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(2000);
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

            test = Me.Time();
            System.out.println(test);

            CheckTime("#file-operator-sc", test);
            CheckTime("#file-operator-snc", test);
            CheckTime("#file-operator-bi", test);
            CheckTime("#file-operator-bnic", test);
            CheckTime("#file-operator-bni", test);
            CheckTime("#file-operator-bc", test);
            test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Me.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_AllReceiptAndDataSchFDOP_Test5() {
        try {
            Me.CreateFirstUPDDocumentAndSignAndSand("3", driver);
            Me.Exit(driver);
            Me.loggingCerts(upd2, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.Sleep(20000);
            Me.OpenNameFolder("ÓÏÄ 123", driver);

            Me.ClickMenuFirstElement(9, driver);
            Me.Sleep(1000);
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

            test = Me.Time();
            System.out.println(test);

            CheckTime("#file-operator-sc", test);
            CheckTime("#file-operator-snc", test);
            CheckTime("#file-operator-bi", test);
            CheckTime("#file-operator-bnic", test);
            CheckTime("#file-operator-bni", test);
            CheckTime("#file-operator-bc", test);
            test2 = driver.findElement(By.cssSelector("#file-operator-bnc > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
            test2 = test2.substring(0, 10);
            Me.CheckExit(test, test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_NoReceiptAndDataNoFormalDocument_Test6() {
        try {
            Me.AddFile("1.html", driver);
            Me.ClickMenuFirstElement(9, driver);

            test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");

            System.out.println(test2);
            Me.CheckingContainsExit("dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void CheckGreen(String str) {
        Me.Sleep(200);
        test = driver.findElement(By.cssSelector(str + " > td:nth-child(1) > span:nth-child(1)")).getAttribute("className");
        Me.Check("td-operator-number numbergreen", test, driver);
        Me.Sleep(200);
    }

    void CheckName(String str, String str2) {
        test = driver.findElement(By.cssSelector(str + " > td:nth-child(2)")).getText();
        Me.Check(str2, test, driver);
    }

    void CheckTime(String str, String test) {
        test2 = driver.findElement(By.cssSelector(str + " > td:nth-child(3) > span:nth-child(1)")).getAttribute("textContent");
        test2 = test2.substring(0, 10);
        Me.Check(test, test2, driver);
    }
}
