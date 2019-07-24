package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C_Download_Files_Test3 {
    WebDriver driver;
    String test2;

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
    public void A_AddFileUPDDownload_Successful_Test1() {
        Me.AddFileUPDError("0.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Файл 0.xml был успешно сохранен", test2, driver);
    }

    //Download Wrong
    @Test
    public void B_AddFileUPDDownloadWrong_Seller_Test2() {
        Me.AddFileUPDError("1.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Не удалось найти данные продавца в системе. Файл 1.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void C_AddFileUPDDownloadWrong_Validation156651_Test3() {
        Me.AddFileUPDError("2.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации: cvc-pattern-valid: Value '156651' is not facet-valid with respect to pattern '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}' for type 'ИННЮЛТип'. Файл 2.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void D_AddFileUPDDownloadWrong_IDOTPR_Test4() {
        Me.AddFileUPDError("3.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации, ИдФайла указан не правильно. Файл 3.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void E_AddFileUPDDownloadWrong_IDPOL_Test5() {
        Me.AddFileUPDError("4.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("ИдПол не соответствует реквизитам покупателя. Файл 4.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void F_AddFileUPDDownloadWrong_DoesNotFindSellerInSystem_Test6() {
        Me.AddFileUPDError("5.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Не удалось найти данные продавца в системе. Файл 5.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void G_AddFileUPDDownloadWrong_DoesNotFindTypeDocument_Test7() {
        Me.AddFileUPDError("6.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Не удалось опознать тип формализованного документа. Файл 6.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void H_AddFileUPDDownloadWrong_IDEDO_Test8() {
        Me.AddFileUPDError("7.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации, в xml отсутствует поле ИдЭДО Файл 7.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void I_AddFileUPDDownloadWrong_IDFILE_Test9() {
        Me.AddFileUPDError("8.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации, в xml отсутствует поле ИдФайл Файл 8.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void J_AddFileUPDDownloadWrong_IDFILEWrongFilled_Test10() {
        Me.AddFileUPDError("9.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации, ИдФайла указан не правильно. Файл 9.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void K_AddFileUPDDownloadWrong__Test11() {
        Me.AddFileUPDError("10.xml", driver);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.CheckExit("Ошибка валидации: cvc-complex-type.4: Attribute 'ИННЮЛ' must appear on element 'СвОЭДОтпр'. Файл 10.xml был успешно сохранен на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void L_AddFileUPDDownloadWrong_ValidationFile_Test12() {
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
        Me.CheckExit("Файлы были успешно загружены Файлы 10.xml не прошли проверку на валидность. Файлы были успешно сохранены на Портал как неформализованный документ.", test2, driver);
    }

    @Test
    public void M_AddFileUPDDownloadWrong_andCheckReceipts_Test13() {
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
    }

}
