package edosf.iitFirefox.user8077;

import edosf.forms.CompleteForm;
import edosf.forms.CompleteFormAct;
import edosf.forms.CompleteFormDopSchF;
import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Iit8077;
import edosf.iitFirefox.user8077.soap.AddDocumentUPDUserACT;
import edosf.iitFirefox.user8077.soap.AddDocumentUPDUserASChFDop_Test3;
import edosf.iitFirefox.user8077.soap.AddDocumentUPDUserASChF_Test1;
import edosf.methods.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class D_EditingInteractiveForm_Test4 implements Iit8077 {
    public static WebDriver driver;
    public String row;
    String test2;




    @BeforeEach
    void setUp() {
        try {
            row = null;
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".active-file")).click();
            Thread.sleep(1500);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
            Thread.sleep(1500);
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
    void J_EditingSChF_addFiles_Test10() {
        try {
            FileCreateAndLoading.AddFileUPDError("0.xml", driver);
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
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
