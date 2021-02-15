package EDOSF.iitFirefox.User8077;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import EDOSF.methods.FileCreateAndLoading;
import OFD.methods.RetryRule;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static EDOSF.iitAdd.Settings.NumFail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class C_Download_Files_Test3 extends iit8077 {
    WebDriver driver;
    String test2;

    @Rule
    public RetryRule rule = new RetryRule(NumFail);

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_AddFileUPDDownload_Successful_Test1() throws NoSuchElementException {
        try {
            FileCreateAndLoading.AddFileUPDError("0.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Файл 0.xml был успешно сохранен", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    //Download Wrong
    @Test
    @Order(2)
    void B_AddFileUPDDownloadWrong_Seller_Test2() {
        try {
            FileCreateAndLoading.AddFileUPDError("1.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Не удалось найти данные продавца в системе. Файл 1.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_AddFileUPDDownloadWrong_Validation820and189_Test3() {
        try {
            FileCreateAndLoading.AddFileUPDError("2.xml", driver);
            test2 = driver.findElement(By.cssSelector("h3.resptext:nth-child(4)")).getText();
            Check.CheckExit("Направляемый xml не соответствует xsd-схемам приказов: ФНС России от 19.12.2018г. № ММВ-7-15/820, ФНС России от 13.04.2016г. № ММВ-7-15/189. Файл 2.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_AddFileUPDDownloadWrong_IDOTPR_Test4() {
        try {
            FileCreateAndLoading.AddFileUPDError("3.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("ИдОтпр не соответствует реквизитам продавца. Файл 3.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_AddFileUPDDownloadWrong_IDPOL_Test5() {
        try {
            FileCreateAndLoading.AddFileUPDError("4.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("ИдПол не соответствует реквизитам покупателя. Файл 4.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_AddFileUPDDownloadWrong_DoesNotFindSellerInSystem_Test6() {
        try {
            FileCreateAndLoading.AddFileUPDError("5.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Не удалось найти данные продавца в системе. Файл 5.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void G_AddFileUPDDownloadWrong_DoesNotFindTypeDocument_Test7() {
        try {
            FileCreateAndLoading.AddFileUPDError("6.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Направляемый xml не соответствует xsd-схемам приказов: ФНС России от 19.12.2018г. № ММВ-7-15/820, ФНС России от 13.04.2016г. № ММВ-7-15/189. Файл 6.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(8)
    void H_AddFileUPDDownloadWrong_IDEDO_Test8() {
        try {
            FileCreateAndLoading.AddFileUPDError("7.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Направляемый xml не соответствует xsd-схемам приказов: ФНС России от 19.12.2018г. № ММВ-7-15/820, ФНС России от 13.04.2016г. № ММВ-7-15/189. Файл 7.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_AddFileUPDDownloadWrong_IDFILE_Test9() {
        try {
            FileCreateAndLoading.AddFileUPDError("8.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Направляемый xml не соответствует xsd-схемам приказов: ФНС России от 19.12.2018г. № ММВ-7-15/820, ФНС России от 13.04.2016г. № ММВ-7-15/189. Файл 8.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

     @Test
    @Order(10)
    void J_AddFileUPDDownloadWrong_IDFILEWrongFilled_Test10() {
        try {
            FileCreateAndLoading.AddFileUPDError("9.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Ошибка валидации, ИдФайла указан не правильно. Файл 9.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }



    @Test
    @Order(11)
    void К_AddFileUPDDownloadWrong_ValidationFile_Test11() {
        try {
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".createDocument")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            upload.sendKeys("C:\\Tools\\upd\\" + "0.xml");
            upload.sendKeys("C:\\Tools\\upd\\" + "10.xml");
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
            Thread.sleep(3000);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Файлы 10.xml, 0.xml, 0.xml были успешно загружены", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(12)
    void L_AddFileUPDDownloadWrong_andCheckReceipts_Test12() {
        try {
            FileCreateAndLoading.AddFileUPDError("2.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
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
            test2 = driver.findElement(By.id("cm-operator")).getAttribute("className");
            System.out.println(test2);
            Check.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @Test
    @Order(13)
    void M_AddFileUPDDownload_155_Test13() {
        try {
            FileCreateAndLoading.AddFileUPDError("11.xml", driver);
            test2 = driver.findElement(By.cssSelector(".resptext")).getText();
            Check.CheckExit("Документ оформлен по Приказу ФНС РФ № ММВ-7-15/155 от 24.03.2016. Файл 11.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
