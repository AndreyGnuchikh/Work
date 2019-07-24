package iitFirefox.User;

import iitAdd.Drivers;

import iitAdd.Me;
import iitAdd.p;
import iitFirefox.User.Form.CompleteForm;
import iitFirefox.User.Form.CompleteFormAct;
import iitFirefox.User.Form.CompleteFormDopSchF;
import iitFirefox.User.SoapTest1.AddDocumentUPDUserACT;
import iitFirefox.User.SoapTest1.AddDocumentUPDUserASChFDop_Test3;
import iitFirefox.User.SoapTest1.AddDocumentUPDUserASChF_Test1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D_EditingInteractiveForm_Test4 {
    public static WebDriver driver;
    public String row;
    String test2;

    @Before
    public void setUp() {
        row = null;
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

    }

    @Test
    public void A_EditingSCHF_Test1() {
        Me.Sleep(2000);
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
    }

    @Test
    public void B_EditingACT_Test2() {
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
    }

    @Test
    public void C_EditingSChFDOP_Test3() {
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
    }

    // Not New
    @Test
    public void D_EditingSCHF_NotNew_Test4() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        test2 = CompleteForm.SCHF(driver);
        CheckDisableButtonSing();
    }

    @Test
    public void E_EditingACT_NotNew_Test5() {
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
    }

    @Test
    public void F_EditingSChFDOP_NotNew_Test6() {
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
    }

    // add Soap
    @Test
    public void G_EditingSCHF_Soap_Test7() {
        Me.startEndingCertAndSendingFiles(driver);

        test2 = AddDocumentUPDUserASChF_Test1.add();
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(), 'СЧФ 321')]")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    @Test
    public void H_EditingACT_Soap_Test8() {
        Me.startEndingCertAndSendingFiles(driver);

        test2 = AddDocumentUPDUserACT.add();
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(), 'АКТ')]")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    @Test
    public void I_EditingSChFDOP_Soap_Test9() {
        Me.startEndingCertAndSendingFiles(driver);

        test2 = AddDocumentUPDUserASChFDop_Test3.add();
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(), 'Тест 3')]")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    // add files
    @Test
    public void J_EditingSChF_addFiles_Test10() {
        Me.AddFileUPDError("0.xml", driver);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    @Test
    public void K_EditingDop_addFiles_Test11() {
        Me.AddFileUPDError("Dop.xml", driver);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    @Test
    public void L_EditingSchFDop_addFiles_Test12() {
        Me.AddFileUPDError("SchfDop.xml", driver);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.Sleep(500);
        CheckDisableButton();
    }

    public void CheckDisableButtonSing() {
        Me.SingFirstFile(driver);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Me.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }

    public void CheckDisableButton() {

        Me.ClickMenuFirstElement(3, driver);
        test2 = driver.findElement(By.cssSelector("#cm-edit_text")).getAttribute("class");
        Me.CheckExit("dijitReset dijitMenuItemLabel", test2, driver);
    }
}
