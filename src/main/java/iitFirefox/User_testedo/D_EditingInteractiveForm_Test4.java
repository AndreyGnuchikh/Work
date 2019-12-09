package iitFirefox.User_testedo;


import iitAdd.Drivers;

import iitAdd.Me;
import iitAdd.testedo;
import iitFirefox.User8077.Form.CompleteForm;
import iitFirefox.User8077.Form.CompleteFormAct;
import iitFirefox.User8077.Form.CompleteFormDopSchF;
import iitFirefox.User8077.SoapTest1.AddDocumentUPDUserACT;
import iitFirefox.User8077.SoapTest1.AddDocumentUPDUserASChFDop_Test3;
import iitFirefox.User8077.SoapTest1.AddDocumentUPDUserASChF_Test1;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class D_EditingInteractiveForm_Test4 extends testedo {
    public static WebDriver driver;
    public String row;
    String test2;

    @BeforeEach
    void setUp() {
        try {
            row = null;
            driver = Drivers.ff();
            driver.get(url);
            Me.loggingCerts8080(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.Sleep(2000);
            Me.startEndingCertAndSendingFiles(driver);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_EditingSCHF_Test1() {
        try {
            Me.Sleep(3000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add счф
            test2 = CompleteForm.SCHF(driver);
            Me.ClickMenuFirstElement(3, driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#numberSf")).clear();
            driver.findElement(By.cssSelector("#numberSf")).sendKeys("Тест");
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".glyphicon-ok")).click();
            Me.Sleep(1500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            System.out.println(row);
            row = row.substring(36, 59);
            System.out.println(row);
            Me.CheckExit("Счет-Фактура № Тест.xml", row, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_EditingACT_Test2() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add act
            test2 = CompleteFormAct.Act(driver);
            Me.ClickMenuFirstElement(3, driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#numberActEW")).clear();
            driver.findElement(By.cssSelector("#numberActEW")).sendKeys("Тест");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(1500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            System.out.println(row);
            row = row.substring(36, 68);
            System.out.println(row);
            Me.CheckingContainsExit("Акт выполненных работ №", row, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_EditingSChFDOP_Test3() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add act
            test2 = CompleteFormDopSchF.DopSchF(driver);
            Me.ClickMenuFirstElement(3, driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#numberUPD")).clear();
            driver.findElement(By.cssSelector("#numberUPD")).sendKeys("Тест");
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".glyphicon-cloud-upload")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(1500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            System.out.println(row);
            row = row.substring(36, 79);
            System.out.println(row);
            Me.CheckingContainsExit("Универсальный передаточный документ №", row, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    // Not New
    @Test
    @Order(4)
    void D_EditingSCHF_NotNew_Test4() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            test2 = CompleteForm.SCHF(driver);
            CheckDisableButtonSing();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_EditingACT_NotNew_Test5() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            test2 = CompleteFormAct.Act(driver);
            CheckDisableButtonSing();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_EditingSChFDOP_NotNew_Test6() {
        try {
            Me.Sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Me.Sleep(1000);
            // Add act
            test2 = CompleteFormDopSchF.DopSchF(driver);
            CheckDisableButtonSing();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    // add Soap
    @Test
    @Order(7)
    void G_EditingSCHF_Soap_Test7() {
        try {
            Me.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserASChF_Test1.add();
            Me.OpenNameFolder("СЧФ 321", driver);
            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_EditingACT_Soap_Test8() {
        try {
            Me.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserACT.add();
            Me.OpenNameFolder("АКТ", driver);

            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_EditingSChFDOP_Soap_Test9() {
        try {
            Me.startEndingCertAndSendingFiles(driver);

            test2 = AddDocumentUPDUserASChFDop_Test3.add();
            Me.OpenNameFolder("Тест 3", driver);
            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    // add files
    @Test
    @Order(10)
    void J_EditingSChF_addFiles_Test10() {
        try {
            Me.AddFileUPDError("0.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_EditingDop_addFiles_Test11() {
        try {
            Me.AddFileUPDError("Dop.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_EditingSchFDop_addFiles_Test12() {
        try {
            Me.AddFileUPDError("SchfDop.xml", driver);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(500);
            CheckDisableButton();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void CheckDisableButtonSing() {
        Me.SingFirstFile(driver);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Me.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }

    void CheckDisableButton() {
        Me.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Me.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }
}
