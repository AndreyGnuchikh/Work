package edosf.iitFirefox.userTestedo;

import edosf.methods.*;
import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static edosf.settingsEdo.Settings.NUM_FAIL;
import static edosf.methods.Path.GetPathTools;

import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class C_Download_Files_Test3 implements Testedo {
    WebDriver driver;
    String var;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(2000);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_AddFileUPDSchfDownload_Successful_Test1() throws NoSuchElementException {
        try {
            FileCreateAndLoading.AddFileUPDError("0.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("���� 0.xml ��� ������� ��������", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    //Download Wrong
    @RetryingTest(NUM_FAIL)
    void B_AddFileUPDDownloadWrong_Seller_Test2() {
        try {
            FileCreateAndLoading.AddFileUPDError("1.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("�� ������� ����� ������ �������� � �������. ���� 1.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_AddFileUPDDownloadWrong_Validation820and189_Test3() {
        try {
            FileCreateAndLoading.AddFileUPDError("2.xml", driver);
            var = driver.findElement(By.cssSelector("h3.resptext:nth-child(4)")).getText();
            Check.CheckExit("������������ xml �� ������������� xsd-������ ��������: ��� ������ �� 19.12.2018�. � ���-7-15/820, ��� ������ �� 13.04.2016�. � ���-7-15/189. ���� 2.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_AddFileUPDDownloadWrong_IDOTPR_Test4() {
        try {
            FileCreateAndLoading.AddFileUPDError("3.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("������ �� ������������� ���������� ��������. ���� 3.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_AddFileUPDDownloadWrong_IDPOL_Test5() {
        try {
            FileCreateAndLoading.AddFileUPDError("4.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("����� �� ������������� ���������� ����������. ���� 4.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void F_AddFileUPDDownloadWrong_DoesNotFindSellerInSystem_Test6() {
        try {
            FileCreateAndLoading.AddFileUPDError("5.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("�� ������� ����� ������ �������� � �������. ���� 5.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void G_AddFileUPDDownloadWrong_DoesNotFindTypeDocument_Test7() {
        try {
            FileCreateAndLoading.AddFileUPDError("6.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("������������ xml �� ������������� xsd-������ ��������: ��� ������ �� 19.12.2018�. � ���-7-15/820, ��� ������ �� 13.04.2016�. � ���-7-15/189. ���� 6.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void H_AddFileUPDDownloadWrong_IDEDO_Test8() {
        try {
            FileCreateAndLoading.AddFileUPDError("7.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("������������ xml �� ������������� xsd-������ ��������: ��� ������ �� 19.12.2018�. � ���-7-15/820, ��� ������ �� 13.04.2016�. � ���-7-15/189. ���� 7.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void I_AddFileUPDDownloadWrong_IDFILE_Test9() {
        try {
            FileCreateAndLoading.AddFileUPDError("8.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("������������ xml �� ������������� xsd-������ ��������: ��� ������ �� 19.12.2018�. � ���-7-15/820, ��� ������ �� 13.04.2016�. � ���-7-15/189. ���� 8.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void J_AddFileUPDDownloadWrong_IDFILEWrongFilled_Test10() {
        try {
            FileCreateAndLoading.AddFileUPDError("9.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("������ ���������, ������� ������ �� ���������. ���� 9.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }



    @RetryingTest(NUM_FAIL)
    void K_AddFileUPDDownloadWrong_ValidationFile_Test11() {
        try {
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".createDocument")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            String path = GetPathTools();
            upload.sendKeys(path+ UPD_OR_8080 +"\\0.xml");
            upload.sendKeys(path+ UPD_OR_8080 +"\\10.xml");
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
            Thread.sleep(3000);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckingContainsExit("�����", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void L_AddFileUPDDownloadWrong_andCheckReceipts_Test12() {
        try {
            FileCreateAndLoading.AddFileUPDError("2.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            String row = null;
            Thread.sleep(2500);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            System.out.println(row);
            row = row.substring(0, 36);
            System.out.println(row);
            Actions builder = new Actions(driver);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
            ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
            var = driver.findElement(By.id("cm-operator")).getAttribute("className");
            System.out.println(var);
            Check.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    void M_AddFileUPDDownload_155_Test13() {
        try {
            FileCreateAndLoading.AddFileUPDError("11.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("�������� �������� �� ������� ��� �� � ���-7-15/155 �� 24.03.2016. ���� 11.xml ��� ������� �������� �� ������ ��� ����������������� ��������.", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    void N_AddFileUPDDopDownload_Successful_Test14() {
        try {
            FileCreateAndLoading.AddFileUPDError("Dop.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("���� Dop.xml ��� ������� ��������", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    void O_AddFileUPDSchfDopDownload_Successful_Test15() {
        try {
            FileCreateAndLoading.AddFileUPDError("SchfDop.xml", driver);
            var = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("���� SchfDop.xml ��� ������� ��������", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}
