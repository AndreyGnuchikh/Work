package iitFirefox.UserTestedo;

import iitAdd.Drivers;
import iitAdd.testedo;
import Form.CompleteForm;
import Form.CompleteFormAct;
import Form.CompleteFormDopSchF;
import methods.Cabinet;
import methods.Check;
import methods.EnterAndExit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class F_ErrorsCreateFormalDocFromIF_Test6 extends testedo {
    WebDriver driver;
    String date, test2, save;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts8080(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_ErrorsFormSchFFirstPage_Test1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteForm.SCHF("NO",driver);
            System.out.println(date);
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(500);

            Region("#change_seller");
            inn("#change_seller");
            CheckdateFirstPage("#");
            Check("#numberSf");
            //Check("#numbercorSf");
            Checkdate("#dateSf");
            //Checkdate("#datecorSf");
            Check("input.col-md-12");
            Region2("#change_buyer");
            Inn2("#change_buyer");

            driver.quit();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_ErrorsFormSchFSecondPage_Test2() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteForm.SCHF("NO",driver);
            System.out.println(date);
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("div.row:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            page2NameMark("#interSFdoc");
            page2NumberCustomDeclarationMakr();
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_ErrorsFormACTFirstPage_Test3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormAct.Act("NO",driver);
            System.out.println(date);
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(500);

            Region("#change_seller");
            inn("#change_seller");
            CheckdateFirstPage("#");
            CheckACT("#numberActEW");
            //Check("#numbercorActEW");
            Checkdate("#dateActEW");
            //Checkdate("#datecorActEW");
            Check("input.col-md-12");
            Region2("#change_buyer");
            Inn2("#change_buyer");
            driver.quit();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_ErrorsFormACTSecondPage_Test4() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormAct.Act("NO",driver);
            System.out.println(date);
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            page2Name("#change_seller");
            driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
            page2NumberCustomDeclaration();
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_ErrorsFormACTThreePage_Test5_Tap1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormAct.Act("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();
            CheckACTPage3("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
            CheckdateThreepage("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
            Checkdate("#dateActEW");
            Page3ACT("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#shipment-info");
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_ErrorsFormACTThreePage_Test6_Tap2() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormAct.Act("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();

            driver.findElement(By.cssSelector(".edit_but")).click();
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            Thread.sleep(500);
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

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_ErrorsFormACTThreePage_Test7_Tap3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormAct.Act("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();

            driver.findElement(By.cssSelector(".edit_but")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
            driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
            Page3ACTTap3("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
            Page3ACTTap3("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_ErrorsFormSchFDOPFirstPage_Test8() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#editorFiles")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormDopSchF.DopSchF("NO",driver);
            System.out.println(date);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(1000);

            Region("#change_seller");
            inn("#change_seller");
            CheckdateFirstPage("#");
            Check("#numberUPD");
            //Check("#numbercorUPD");
            Checkdate("#dateUPD");
            //Checkdate("#datecorUPD");
            Check("input.col-md-12");
            Region2("#change_buyer");
            Inn2("#change_buyer");

            driver.quit();
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_ErrorsFormSchFDOPSecondPage_Test9() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormDopSchF.DopSchF("NO",driver);
            Thread.sleep(2000);
            System.out.println(date);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            String open, close;
            Thread.sleep(500);
            open = "div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)";
            Thread.sleep(500);
            close = "div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)";
            Thread.sleep(500);
            page2NameDOPSCHF(open, "div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)", close);
            Thread.sleep(500);
            page2NumberNotNumFeeDOPSCHF(open, "div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)", close);
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void K_ErrorsFormSchFDOPThreePage_Test10_Tap1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormDopSchF.DopSchF("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();
            CheckSchFDOPPage3("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
            CheckdateThreepage("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
            Thread.sleep(500);
            Checkdate("#dateUPD");
            Page3ACT("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
            Page3ACT("#shipment-info");
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void L_ErrorsFormSchFDOPThreePage_Test11_Tap2() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormDopSchF.DopSchF("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();

            driver.findElement(By.cssSelector(".edit_but")).click();
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
            Thread.sleep(500);
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

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void M_ErrorsFormSchFDOPThreePage_Test12_Tap3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#editorFiles")).click();
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add счф
            CompleteFormDopSchF.DopSchF("NO",driver);
            System.out.println(date);
            Thread.sleep(1500);
            Cabinet.Up(driver);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".edit_but")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
            driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > i:nth-child(1)")).click();
            Page3ACTTap3("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
            Page3ACTTap3("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
            driver.quit();

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void Check(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }

    void CheckACT(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("mandatory-save", test2, driver);


    }

    void CheckACTPage3(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("mandatory-save", test2, driver);
        Cabinet.Up(driver);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }

    void Checkdate(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Thread.sleep(1500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        Thread.sleep(500);
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(500);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }

    void CheckdateFirstPage(String s) throws InterruptedException {
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
        Thread.sleep(500);
        s = s + getId;
        save = null;
        Thread.sleep(500);
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        Thread.sleep(500);
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        Cabinet.Up(driver);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }

    void CheckdateThreepage(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(2500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

    }

    void Region(String s) throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("125451241241", Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#seller-rusreg")).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }

    void inn(String s) throws InterruptedException {
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.cssSelector("#seller-compinn")).clear();
        test2 = driver.findElement(By.cssSelector("#seller-compinn")).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(500);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.cssSelector("#seller-compinn")).sendKeys("125451241241", Keys.ENTER);
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }

    void Region2(String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("125451241241", Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-rusreg")).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#change_buyer")).click();
        driver.findElement(By.cssSelector("#buyer-rusreg")).sendKeys("в");
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }

    void Inn2(String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(s)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys(Keys.ENTER);
        test2 = driver.findElement(By.cssSelector("#buyer-rusreg")).getAttribute("className");
        System.out.println(test2);
        Thread.sleep(500);
        Check.CheckingContains("inputFormat-not", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#change_buyer")).click();
        driver.findElement(By.cssSelector("#buyer-compinn")).sendKeys("1653001883", Keys.ENTER);
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

    }
    void page2NameMark(String s) throws InterruptedException {
        Thread.sleep(2500);
        Cabinet.Down(driver);

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        save = null;
        save = driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).clear();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).getAttribute("className");
        Thread.sleep(500);
        Check.CheckingContains("inputFormat-TOMPconstruct1-group", test2, driver);
        Thread.sleep(1000);
        Cabinet.Up(driver);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
        test2 = driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).getText();
        Thread.sleep(500);
        Check.Check("Просмотр интерактивной версии", test2, driver);

    }
    void page2Name(String s) throws InterruptedException {
        Thread.sleep(2500);
        Cabinet.Down(driver);

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        save = null;
        save = driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).clear();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).getAttribute("className");
        Thread.sleep(500);
        Check.CheckingContains("inputFormat-TOMPconstruct1-group", test2, driver);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(500);
        Cabinet.Up(driver);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(500);
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).sendKeys("500",Keys.ENTER);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys("500",Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();

    }
    void page2NumberCustomDeclarationMakr() throws InterruptedException {
        driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1)")).click();
        Cabinet.Down(driver);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.row:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("500");
//        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Cabinet.Up(driver);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(1000);
        test2 = driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).getText();
        Check.Check("Просмотр интерактивной версии", test2, driver);
    }
    void page2NumberCustomDeclaration() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).clear();
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();

        Cabinet.Up(driver);
        Thread.sleep(1000);
        test2 = driver.findElement(By.cssSelector(".list-group > a:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).getText();
        Check.Check("Просмотр интерактивной версии", test2, driver);
    }
    void page2NameDOPSCHF(String open, String element, String close) throws InterruptedException {

        Thread.sleep(3500);
        driver.findElement(By.cssSelector(open)).click();
        save = null;
        save = driver.findElement(By.cssSelector(element)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(element)).clear();
        test2 = driver.findElement(By.cssSelector(element)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(close)).click();
        Thread.sleep(500);
        Cabinet.Up(driver);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys(save);
        driver.findElement(By.cssSelector(close)).click();
    }

    void page2NumberNotNumFeeDOPSCHF(String open, String element, String close) throws InterruptedException {
        driver.findElement(By.cssSelector(open)).click();
        String Element = element;
        save = null;
        save = driver.findElement(By.cssSelector(Element)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(Element)).clear();
        test2 = driver.findElement(By.cssSelector(Element)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(close)).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(open)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys(save);
        driver.findElement(By.cssSelector(close)).click();
    }

    void Page3ACT(String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    void Page3ACTTap2(String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        Thread.sleep(500);

        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    void Page3ACTTap3(String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".edit_but")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
        Thread.sleep(500);

        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        driver.findElement(By.cssSelector(s)).clear();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Thread.sleep(500);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Thread.sleep(500);
        Cabinet.Up(driver);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        driver.findElement(By.cssSelector(".edit_but")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    }

    void CheckSchFDOPPage3(String s) throws InterruptedException {
        save = null;
        save = driver.findElement(By.cssSelector(s)).getAttribute("value");
        System.out.println(save);
        driver.findElement(By.cssSelector(s)).clear();
        test2 = driver.findElement(By.cssSelector(s)).getAttribute("className");
        System.out.println(test2);
        Check.CheckingContains("inputFormat-error", test2, driver);
        Cabinet.Up(driver);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Check.Check("Одно или несколько обязательных полей не были заполнены!", test2, driver);
        driver.findElement(By.cssSelector(".subbtn")).click();
        driver.findElement(By.cssSelector(s)).sendKeys(save);
    }
}
