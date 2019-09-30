package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class C_Download_Files_Test3 extends iit8077 {
    WebDriver driver;
    String test2;

     @BeforeEach
    void setUp() {
         try {
        driver = Drivers.ff();
        driver.get(url);
        Me.loggingCerts(upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }

    @Test
    @Order(1)
    void A_AddFileUPDDownload_Successful_Test1() throws NoSuchElementException {
         try {
        Me.AddFileUPDError("0.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("���� 0.xml ��� ������� ��������", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    //Download Wrong
    @Test
    @Order(2)
    void B_AddFileUPDDownloadWrong_Seller_Test2() {
         try {
        Me.AddFileUPDError("1.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("�� ������� ����� ������ �������� � �������. ���� 1.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(3)
    void C_AddFileUPDDownloadWrong_Validation156651_Test3() {
         try {
        Me.AddFileUPDError("2.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������: cvc-pattern-valid: Value '156651' is not facet-valid with respect to pattern '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}' for type '��������'. ���� 2.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(4)
    void D_AddFileUPDDownloadWrong_IDOTPR_Test4() {
         try {
        Me.AddFileUPDError("3.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������, ������� ������ �� ���������. ���� 3.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(5)
    void E_AddFileUPDDownloadWrong_IDPOL_Test5() {
         try {
        Me.AddFileUPDError("4.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("����� �� ������������� ���������� ����������. ���� 4.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(6)
    void F_AddFileUPDDownloadWrong_DoesNotFindSellerInSystem_Test6() {
         try {
        Me.AddFileUPDError("5.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("�� ������� ����� ������ �������� � �������. ���� 5.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(7)
    void G_AddFileUPDDownloadWrong_DoesNotFindTypeDocument_Test7() {
         try {
        Me.AddFileUPDError("6.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("�� ������� �������� ��� ���������������� ���������. ���� 6.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(8)
    void H_AddFileUPDDownloadWrong_IDEDO_Test8() {
         try {
        Me.AddFileUPDError("7.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������, � xml ����������� ���� ����� ���� 7.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(9)
    void I_AddFileUPDDownloadWrong_IDFILE_Test9() {
         try {
        Me.AddFileUPDError("8.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������, � xml ����������� ���� ������ ���� 8.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(10)
    void J_AddFileUPDDownloadWrong_IDFILEWrongFilled_Test10() {
         try {
        Me.AddFileUPDError("9.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������, ������� ������ �� ���������. ���� 9.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
     @Order(11)
    void K_AddFileUPDDownloadWrong__Test11() {
         try {
        Me.AddFileUPDError("10.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("������ ���������: cvc-complex-type.4: Attribute '�����' must appear on element '���������'. ���� 10.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
     @Order(12)
    void L_AddFileUPDDownloadWrong_ValidationFile_Test12() {
         try {
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        Me.Sleep(200);
        upload.sendKeys("C:\\Tools\\upd\\" + "0.xml");
        upload.sendKeys("C:\\Tools\\upd\\" + "10.xml");
        Me.Sleep(100);
        driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
        Me.Sleep(3000);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("����� ���� ������� ��������� ����� 10.xml �� ������ �������� �� ����������. ����� ���� ������� ��������� �� ������ ��� ����������������� ��������.", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
     @Order(13)
    void M_AddFileUPDDownloadWrong_andCheckReceipts_Test13() {
         try {
        Me.AddFileUPDError("2.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        String row = null;
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        System.out.println(row);
        row = row.substring(0, 36);
        System.out.println(row);
        Actions builder = new Actions(driver);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");
        System.out.println(test2);
        Me.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test2, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

}
