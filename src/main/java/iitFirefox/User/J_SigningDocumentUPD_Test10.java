package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import static iitAdd.Me.Sleep;

public class J_SigningDocumentUPD_Test10 {

    public WebDriver driver;
    public String test, test2, checking;


    @Test
    public void A_Signing_Schf_Document_Test1() {
        setUp();
        Me.AddFile("upd\\0.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
        Me.startEndingCertAndSendingFiles(driver);
        Me.ClickMenuFirstElement(5, driver);
        test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
        Me.CheckExit("true", test2, driver);
    }

    @Test
    public void B_Signing_Dop_Document_Test2() {
        setUp();
        test2 = Me.CreateFirstDocumentAndSign("2", driver);
        driver.quit();
        Me.Sleep(2000);
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(3000);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(1000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'���')]")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Me.SingFirstFileUDPSecondSing(test2, driver);
        String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("��� ������ 2.0", test, driver);
    }

    @Test
    public void C_Signing_SchfDOP_Document_Test3() {
        setUp();
        test2 = Me.CreateFirstDocumentAndSign("3", driver);
        driver.quit();
        Me.Sleep(2000);
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);

        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(3000);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(32000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'���')]")).click();

        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Sleep(2000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Sleep(1000);
        Me.SingFirstFileUDPSecondSing(test2, driver);
        String test = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
        Me.CheckExit("��� ������ 2.0", test, driver);
    }

    @Test
    public void D_Signing_Schf_Error_Test4() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.fio9, driver);
        Sleep(1500);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(500);
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Sleep(1500);
        test2 = driver.findElement(By.cssSelector(".resptext")).getAttribute("innerText");
        System.out.println(test2);
        Me.CheckExit("D_Signing_Schf_Error_Test4, ��� ��� �� ��������� ����������, ����������� ��� ���������� ���.\n" +
                "��� ���������� ����������� �������� ������� �� ���� ��� � ������ ������� ���� ������� �������� � ��������� ���� \"��������� ������� ����������\" � ��������� ���������.\n" +
                "���� ��������� � ����������� ���������� ��� \"���\":\n" +
                "e-mail: support@iit.ru\n" +
                "���: 8 (499) 262-24-25", test2, driver);
    }

    @Test
    public void E_Signing_SchfDOP_Error_Test5() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.fio, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);

        Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Sleep(500);
        test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        System.out.println(test2);
        Me.CheckExit("������! � ����������� ������������ ����������� ���������� � ���������", test2, driver);
    }

    @Test
    public void F_Signing_ErrorCertRole_Test6() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.fio, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFile("upd\\SchfDop.xml", driver);
        Me.ClickMenuFirstElement(5, driver);
        Sleep(1500);
        driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Sleep(500);
        test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
        System.out.println(test2);
        Me.CheckExit("������! � ����������� ������������ ����������� ���������� � ���������", test2, driver);
    }

    @Test
    public void G_Signing_Dop_5_seconds_Test7() {
        //Test 2 Sign Whit
        setUp();
        test2 = Me.CreateFirstDocumentAndSign("3", driver);
        driver.quit();
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(3000);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(1000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'���')]")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        System.out.println(test2);
        for (int i = 0; i < 20; i++) {
            Sleep(500);
            driver.findElement(By.cssSelector(".active-file")).click();
            Sleep(500);
            driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
            Sleep(2000);
            Actions builder = new Actions(driver);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
            Sleep(500);
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
            ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
            test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            System.out.println(test);
            driver.findElement(By.id("cm-sign_text")).click();
            Sleep(500);
            if (test.equals("false")) {
                i = 21;
                System.out.println(i);
            }
        }
        Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        Sleep(6500);
        String test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
        Me.CheckExit("��� ��������� ������� ��������� ��������� ��!", test, driver);
    }

    @Test
    public void H_Signing_Dop_Elements_Test8() {
        setUp();
        test2 = Me.CreateFirstDocumentAndSign("2", driver);
        driver.quit();
        Me.Sleep(2000);
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(3000);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(1000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'���')]")).click();
        Sleep(5000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        secondSing();
        test = null;
        Sleep(500);
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Sleep(500);
        Me.Check("���", test, driver);
        Sleep(500);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Sleep(500);
        Me.Check("2", test, driver);
        Sleep(500);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Sleep(500);
        Me.Check("��������� 2", test, driver);
        Sleep(500);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Sleep(500);
        Me.Check("d", test, driver);
        Sleep(500);
        String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("��������� ���", test, driver);
    }

    @Test
    public void I_Signing_SchfDOP_Elements_Test9() {
        setUp();
        test2 = Me.CreateFirstDocumentAndSign("3", driver);
        driver.quit();
        Me.Sleep(2000);
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd2, driver);

        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(3000);
        Me.startEndingCertAndSendingFiles(driver);
        Sleep(32000);
        driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
        Sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'���')]")).click();

        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Sleep(2000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        Sleep(1000);
        secondSing();
        test = null;
        test = driver.findElement(By.id("surname")).getAttribute("value");
        Me.Check("���", test, driver);
        test = driver.findElement(By.id("name")).getAttribute("value");
        Me.Check("2", test, driver);
        test = driver.findElement(By.id("position")).getAttribute("value");
        Me.Check("��������� 2", test, driver);
        test = driver.findElement(By.id("authority")).getAttribute("value");
        Me.Check("d", test, driver);
        String test = driver.findElement(By.id("shipment-info")).getAttribute("value");
        Me.CheckExit("��������� ���", test, driver);
    }

    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Sleep(1500);
        Me.RoleSwitch(2, driver);
        Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        File dir = new File("C:\\Tools\\TestFile");
        Me.DeletedFiles(dir);
    }

    public void secondSing() {
        Actions builder = new Actions(driver);
        Sleep(3000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        driver.findElement(By.cssSelector("#grid-basic2-header > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
        Sleep(1000);
        System.out.println(test2);

        driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
        Sleep(1000);

        builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
        ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.id("cm-sign_text")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".glyphicon-edit")).click();
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
    }
}
