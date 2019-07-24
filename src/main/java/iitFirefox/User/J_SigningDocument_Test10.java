package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.lang.Runtime.getRuntime;

public class J_SigningDocument_Test10 {

    public WebDriver driver;
    public String test, test2, checking;


    @Test
    public void A_Signing_Schf_Document_Test1() {
        setUp();
        Me.AddFile("upd\\0.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(5, driver);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);
    }

    @Test
    public void B_Signing_Dop_Document_Test2() {
        setUp();
        Me.AddFile("upd\\Dop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(5, driver);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);
    }

    @Test
    public void C_Signing_Schf_DopDocument_Test3() {
        setUp();
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(5, driver);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);

    }

    @Test
    public void D_SigningDocument_Test4() {
        setUp();
        Me.AddFile("1.html", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(14, driver);
        test2 = driver.findElement(By.cssSelector("#cm-del-full")).getAttribute("aria-disabled");
        System.out.println(test2);
        Me.CheckExit("true", test2, driver);
    }

    @Test
    public void E_Signing_Dop_Documentml2_Test5() throws InterruptedException, IOException {
        setUp();
        Me.AddFile("upd\\Dop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.Sleep(500);
        Me.ClickMenuFirstElement(6, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        File dir = new File("C:\\Tools\\TestFile");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        String test = lst.get(0).toString();
        test = test.substring(18);
        System.out.println(test);
        test2 = "C:\\Program Files\\7-Zip\\7z.exe e C:\\Tools\\TestFile\\" + test + " -o\"C:\\Tools\\TestFile\\\"";
        System.out.println(test2);
        getRuntime().exec(test2);
        Me.Sleep(1500);
        File dir2 = new File("C:\\Tools\\TestFile");
        File[] arrFiles2 = dir2.listFiles();
        List<File> lst2 = Arrays.asList(arrFiles2);
        String getingLst2 = lst2.get(1).toString();
        System.out.println(getingLst2);
        Me.DeletedFiles(dir);
        getingLst2 = getingLst2.substring(18, 45);
        System.out.println(getingLst2);
        Me.CheckExit("ON_SCHFDOPPOK_2JH333_2JH444", getingLst2, driver);
    }

    @Test
    public void F_Signing_SchfDop_Documentxml2_Test6() throws InterruptedException, IOException {
        setUp();
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(6, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#downloadp7s")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#queued-download-button")).click();
        File dir = new File("C:\\Tools\\TestFile");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        String test = lst.get(0).toString();
        test = test.substring(18);
        System.out.println(test);
        test2 = "C:\\Program Files\\7-Zip\\7z.exe e C:\\Tools\\TestFile\\" + test + " -o\"C:\\Tools\\TestFile\\\"";
        System.out.println(test2);
        getRuntime().exec(test2);
        Me.Sleep(3500);
        File dir2 = new File("C:\\Tools\\TestFile");
        File[] arrFiles2 = dir2.listFiles();
        List<File> lst2 = Arrays.asList(arrFiles2);
        System.out.println(lst2.size());
        Integer s = lst2.size();
        String getingLst2 = null;
        if (s > 5) {
            getingLst2 = lst2.get(5).toString();
            System.out.println(getingLst2);
            Me.DeletedFiles(dir);
            getingLst2 = getingLst2.substring(18, 45);
        } else {
            getingLst2 = lst2.get(1).toString();
            System.out.println(getingLst2);
            Me.DeletedFiles(dir);
            getingLst2 = getingLst2.substring(18, 45);
        }
        System.out.println(getingLst2);
        Me.CheckExit("ON_SCHFDOPPOK_2JH333_2JH444", getingLst2, driver);
    }

    @Test
    public void G_NoCerts_Test7() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.LogPass(p.pass5log, p.pass5log, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        System.out.println(test2);
        Me.CheckExit("Для авторизованного пользователя Тест 5ть отсутствуют сведения о сертификате. Для прикрепления сертификата к Вашей учетной записи обратитесь в техническую поддержку ООО \"ИИТ\":\n" +
                "тел: 8 (499) 262 24 25\n" +
                "e-mail: support@iit.ru", test2, driver);

    }

    @Test
    public void H_No_Second_Signing_Test8() {
        setUp();
        Me.AddFile("1.html", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(5, driver);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);
    }

    @Test
    public void I_Error_Test9() throws InterruptedException, IOException {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.LogPass("вваываыв", "вваываыв", driver);
        Me.AddFile("1.html", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Me.Sleep(1000);
        getRuntime().exec("taskkill /im nmcades.exe");
        Me.Sleep(1000);
        test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
        Me.CheckExit("3: Ошибка при создании подписи", test2, driver);
    }

    @Test
    public void J_CloseWindow_Test10() {
        setUp();
        Me.AddFile("1.html", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        Me.Sleep(1500);
        test2 = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("Переименованный кабинет", test2, driver);
    }

    @Test
    public void K_NoPermitSingingUPD_Test11() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.fio11, driver);
        Me.RoleSwitch(2, driver);
        driver.findElement(By.cssSelector("#enter")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFile("upd\\Dop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Me.Sleep(1500);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);
    }

    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        File dir = new File("C:\\Tools\\TestFile");
        Me.DeletedFiles(dir);
    }
}
