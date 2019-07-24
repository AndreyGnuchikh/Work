package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import iitFirefox.User.Form.CompleteForm;
import iitFirefox.User.Form.CompleteFormAct;
import iitFirefox.User.Form.CompleteFormDopSchF;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class F_ErrorsCreateFormalDocFromIF_Test6 {
    WebDriver driver;
    String date, test2, save;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

    }

    @Test
    public void A_ErrorsFormSchFFirstPage_Test1() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteForm.SCHFNoClick(driver);
        System.out.println(date);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(500);

        Region("#interSFdoc");
        inn("#interSFdoc");
        CheckdateFirstPage("#");
        Check("#numberSf");
        Check("#numbercorSf");
        Checkdate("#dateSf");
        Checkdate("#datecorSf");
        Check("input.col-md-12");
        Region2("#interSFdoc");
        Region3("#interSFdoc");
        inn3("#interSFdoc");

        driver.quit();
    }
    @Test
    public void B_ErrorsFormSchFSecondPage_Test2() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteForm.SCHFNoClick(driver);
        System.out.println(date);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        page2Name("#interSFdoc");
        page2NumberCustomDeclaration("#interSFdoc");
        driver.quit();

    }
    @Test
    public void C_ErrorsFormACTFirstPage_Test3() {

        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        System.out.println(date);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(500);

        Region("#interActEWdoc");
        inn("#interActEWdoc");
        CheckdateFirstPage("#");
        CheckACT("#numberActEW");
        Check("#numbercorActEW");
        Checkdate("#dateActEW");
        Checkdate("#datecorActEW");
        Check("input.col-md-12");
        Region2("#interActEWdoc");
        Region3("#interActEWdoc");
        inn3("#interActEWdoc");
        driver.quit();
    }
    @Test
    public void D_ErrorsFormACTSecondPage_Test4() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        System.out.println(date);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        page2Name("#interActEWdoc");
        page2NumberCustomDeclaration("#interActEWdoc");
        driver.quit();

    }
    @Test
    public void E_ErrorsFormACTThreePage_Test5_Tap1() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        CheckACTPage3("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
        CheckdateThreepage("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
        Checkdate("#dateActEW");
        Page3ACT("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#shipment-info");
        driver.quit();

    }

    @Test
    public void F_ErrorsFormACTThreePage_Test6_Tap2() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Должность");
        driver.findElement(By.cssSelector("#org-name")).sendKeys("Наименование");
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
        Page3ACTTap2("#recvInfo_representative > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#recvInfo_representative > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#recvInfo_representative > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#org-name");
        driver.quit();

    }

    @Test
    public void G_ErrorsFormACTThreePage_Test7_Tap3() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormAct.ActClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector(".edit_but")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
        driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
        Page3ACTTap3("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap3("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        driver.quit();

    }
    @Test
    public void H_ErrorsFormSchFDOPFirstPage_Test8() {

        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#editorFiles")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormDopSchF.DopSchFClick(driver);
        System.out.println(date);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(1000);

        RegionDOPSCHF("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
        innDOPSCHF("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
        CheckdateFirstPage("#");
        Check("#numberUPD");
        Check("#numbercorUPD");
        Checkdate("#dateUPD");
        Checkdate("#datecorUPD");
        Check("input.col-md-12");
        Region2DOPSCHF("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
        Region3DOPSCHF("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
        inn3DOPSCHF("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

        driver.quit();
    }
    @Test
    public void I_ErrorsFormSchFDOPSecondPage_Test9() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormDopSchF.DopSchFClick(driver);
        System.out.println(date);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Me.Sleep(1000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        String open, close;
        Me.Sleep(500);
        open = "#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)";
        Me.Sleep(500);
        close = "#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)";
        Me.Sleep(500);
        page2NameDOPSCHF(open, "#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)", close);
        Me.Sleep(500);
        page2NumberCustomDeclarationDOPSCHF(open, "#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)", close);
        driver.quit();

    }

    @Test
    public void K_ErrorsFormSchFDOPThreePage_Test10_Tap1() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormDopSchF.DopSchFClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        CheckSchFDOPPage3("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
        CheckdateThreepage("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
        Checkdate("#dateUPD");
        Page3ACT("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
        Page3ACT("#shipment-info");
        driver.quit();

    }

    @Test
    public void L_ErrorsFormSchFDOPThreePage_Test11_Tap2() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormDopSchF.DopSchFClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Должность");
        driver.findElement(By.cssSelector("#org-name")).sendKeys("Наименование");
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
        Page3ACTTap2("#recvInfo_representative > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#recvInfo_representative > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#recvInfo_representative > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap2("#org-name");
        driver.quit();

    }

    @Test
    public void M_ErrorsFormSchFDOPThreePage_Test12_Tap3() {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#editorFiles")).click();
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add счф
        CompleteFormDopSchF.DopSchFClick(driver);
        System.out.println(date);
        Me.Sleep(1500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(3) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".edit_but")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
        driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
        Page3ACTTap3("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        Page3ACTTap3("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        driver.quit();

    }

    public void Check(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }
    public void CheckACT(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("mandatory-save", test2, driver);


    }
    public void CheckACTPage3(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("mandatory-save", test2, driver);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }

    public void Checkdate(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Me.Sleep(1500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        driver.findElement(By.cssSelector(s)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }
    public void CheckdateFirstPage(String s) {
        String getId = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        System.out.println(getId);
        getId = getId.substring(209, 220);
        if (getId.contains("\"")) {
            getId = getId.substring(0, 10);
        }
        if (getId.contains("\"")) {
            getId = getId.substring(0, 9);
        }
        if (getId.contains("\"")) {
            getId = getId.substring(0, 8);
        }
        System.out.println(getId);
        Me.Sleep(500);
        s = s + getId;
        save = null;
        Me.Sleep(500);
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        Me.Sleep(500);
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }
    public void CheckdateThreepage(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(2500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }
    public void Region(String s) {
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("1561561651");
        test2 = driver.findElement(By.cssSelector("#seller-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "> div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }
    public void inn(String s) {
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        test2 = driver.findElement(By.cssSelector("#seller-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("1561561651");
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }
    public void Region2(String s) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#shipper-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#shipper-compinn")).sendKeys("1561561651", Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#shipper-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#shipper-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }

    public void Region3(String s) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.Sleep(500);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("5555555555", Keys.ENTER);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }
    public void inn3(String s) {
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("5555555555");
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }
    public void inn4(String s) {
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#consignee-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#consignee-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#consignee-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#consignee-compinn")).sendKeys("5555555555", Keys.ENTER);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }

    public void RegionDOPSCHF(String open, String close) {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("1561561651");
        test2 = driver.findElement(By.cssSelector("#seller-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(close)).click();

    }
    public void innDOPSCHF(String open, String close) {
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        test2 = driver.findElement(By.cssSelector("#seller-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("1561561651");
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(close)).click();

    }
    public void Region2DOPSCHF(String open, String close) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#shipper-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#shipper-compinn")).sendKeys("1561561651", Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#shipper-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#shipper-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(close)).click();

    }
    public void inn2DOPSCHF(String open, String close) {
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#shipper-compinn")).clear();
        test2 = driver.findElement(By.cssSelector("#shipper-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#shipper-compinn")).sendKeys("1561561651");
        driver.findElement(By.cssSelector("#shipper-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(close)).click();

    }
    public void Region3DOPSCHF(String open, String close) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-rusreg")).getAttribute("className");
        System.out.println(test2);
        Me.Sleep(500);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("5555555555", Keys.ENTER);
        driver.findElement(By.cssSelector(close)).click();

    }
    public void inn3DOPSCHF(String open, String close) {
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("5555555555");
        driver.findElement(By.cssSelector(close)).click();

    }
    public void inn4DOPSCHF(String open, String close) {
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#consignee-compinn")).clear();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#consignee-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#consignee-compinn")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        driver.findElement(By.cssSelector("#consignee-compinn")).sendKeys("5555555555", Keys.ENTER);
        driver.findElement(By.cssSelector(close)).click();

    }

    public void page2Name(String s) {
        Me.Sleep(2500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN);

        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        save = null;
        save = driver.findElement(By.cssSelector(s + "> div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).clear();
        test2 = driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(500);
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys(save);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + "  > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
    }
    public void page2NumberCustomDeclaration(String s) {

        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        String Element = s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)";
        save = null;
        save = driver.findElement(By.cssSelector(Element)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(Element)).clear();
        test2 = driver.findElement(By.cssSelector(Element)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys(save);
        driver.findElement(By.cssSelector(s + " > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
    }
    public void page2NameDOPSCHF(String open, String element, String close) {

        Me.Sleep(3500);
        driver.findElement(By.cssSelector(open)).click();
        save = null;
        save = driver.findElement(By.cssSelector(element)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(element)).clear();
        test2 = driver.findElement(By.cssSelector(element)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(close)).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys(save);
        driver.findElement(By.cssSelector(close)).click();
    }
    public void page2NumberCustomDeclarationDOPSCHF(String open, String element, String close) {
        driver.findElement(By.cssSelector(open)).click();
        String Element = element;
        save = null;
        save = driver.findElement(By.cssSelector(Element)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(Element)).clear();
        test2 = driver.findElement(By.cssSelector(Element)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys(save);
        driver.findElement(By.cssSelector(close)).click();
    }

    public void Page3ACT(String s) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    public void Page3ACTTap2(String s) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        Me.Sleep(500);

        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    public void Page3ACTTap3(String s) {
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        Me.Sleep(500);

        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.Sleep(500);
        Me.CheckingContains("inputFormat-error", test2, driver);
        Me.Sleep(500);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP);
        Me.Sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Me.Sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    public void CheckSchFDOPPage3(String s) {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Me.CheckingContains("inputFormat-error", test2, driver);
        driver.findElement(By.xpath("//*")).sendKeys(Keys.UP, Keys.UP, Keys.UP, Keys.UP, Keys.UP);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Me.Sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Me.Sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }
}
