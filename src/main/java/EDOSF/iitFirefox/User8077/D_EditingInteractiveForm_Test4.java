package EDOSF.iitFirefox.User8077;

import EDOSF.Forms.CompleteForm;
import EDOSF.Forms.CompleteFormAct;
import EDOSF.Forms.CompleteFormDopSchF;
import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.SettingsEDOSF.iit8077;
import EDOSF.iitFirefox.User8077.Soap.AddDocumentUPDUserACT;
import EDOSF.iitFirefox.User8077.Soap.AddDocumentUPDUserASChFDop_Test3;
import EDOSF.iitFirefox.User8077.Soap.AddDocumentUPDUserASChF_Test1;
import EDOSF.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.SettingsEDOSF.Settings.NUM_FAIL;
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class D_EditingInteractiveForm_Test4 extends iit8077 {
    public static WebDriver driver;
    public String row;
    String test2;




    @BeforeEach
    void setUp() {
        try {
            row = null;
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(300);
            driver.findElement(By.cssSelector(".active-file")).click();
            Thread.sleep(1500);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_EditingSCHF_Test1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            test2 = CompleteForm.SCHF("Yes", driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#numberSf")).clear();
            driver.findElement(By.cssSelector("#numberSf")).sendKeys("Тест");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".glyphicon-ok")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            System.out.println(row);
            row = row.substring(36, 59);
            System.out.println(row);
            Check.CheckExit("Счет-Фактура № Тест.xml", row, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_EditingACT_Test2() {
        try {
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
            test2 = CompleteFormAct.Act("Yes", driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#numberActEW")).clear();
            driver.findElement(By.cssSelector("#numberActEW")).sendKeys("Тест");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            row = row.substring(36, 68);
            System.out.println(row);
            Check.CheckingContainsExit("Акт выполненных работ №", row, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_EditingSChFDOP_Test3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add act
            test2 = CompleteFormDopSchF.DopSchF("YES", driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            Cabinet.ClickMenuFirstElement(3, driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#numberUPD")).clear();
            driver.findElement(By.cssSelector("#numberUPD")).sendKeys("Тест");
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".glyphicon-cloud-upload")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            row = row.substring(36, 79);
            System.out.println(row);
            Check.CheckingContainsExit("Универсальный передаточный документ №", row, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    // Not New
    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_EditingSCHF_NotNew_Test4() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            test2 = CompleteForm.SCHF("Yes", driver);
            CheckDisableButtonSign();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_EditingACT_NotNew_Test5() {
        try {
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
            test2 = CompleteFormAct.Act("Yes", driver);
            CheckDisableButtonSign();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_EditingSChFDOP_NotNew_Test6() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add act
            test2 = CompleteFormDopSchF.DopSchF("YES", driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(1000);
            CheckDisableButtonSign();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    // add Soap
    @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_EditingSCHF_Soap_Test7() {
        try {
            EnterAndExit.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserASChF_Test1.add();
            Cabinet.OpenNameFolder("СЧФ 321", driver);
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void H_EditingACT_Soap_Test8() {
        try {
            EnterAndExit.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserACT.add();
            Cabinet.OpenNameFolder("АКТ", driver);

            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    void I_EditingSChFDOP_Soap_Test9() {
        try {
            EnterAndExit.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserASChFDop_Test3.add();
            Cabinet.OpenNameFolder("Тест 3", driver);
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    // add files
    @RetryingTest(NUM_FAIL)
    @Order(10)
    void J_EditingSChF_addFiles_Test10() {
        try {
            FileCreateAndLoading.AddFileUPDError("0.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(11)
    void K_EditingDop_addFiles_Test11() {
        try {
            FileCreateAndLoading.AddFileUPDError("Dop.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(12)
    void L_EditingSchFDop_addFiles_Test12() {
        try {
            FileCreateAndLoading.AddFileUPDError("SchfDop.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void CheckDisableButtonSign() throws InterruptedException {
        Sign.SignFirstFile(driver);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Thread.sleep(2000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Thread.sleep(1000);
        Cabinet.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Check.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }

    void CheckDisableButton() throws InterruptedException {

        Cabinet.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Check.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }
}
