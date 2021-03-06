package edosf.iitFirefox.user8077;

import edosf.settingsEdo.Drivers;
import edosf.methods.Cabinet;
import edosf.methods.Element;
import edosf.methods.EnterAndExit;
import edosf.settingsEdo.Iit8077;
import edosf.methods.Check;
import edosf.methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;

import static edosf.methods.Path.GetPathTools;
import static edosf.settingsEdo.Settings.NUM_FAIL;
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class B_File_CreateAndLoading_Test2 implements Iit8077 {
    public WebDriver driver;
    public String test;
    public String test2;
    public String testid;
    public String path;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass(LOG_USER, PASS, driver);
            Thread.sleep(1500);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void A_AddFilePositive_Test1() {
        try {
            //�������� ����� ��������� ����������� � �������� �����
            testid = FileCreateAndLoading.AddFile("1.html", driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + testid + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(4)")).getText();
            System.out.println(test);
            Check.Check("������� 1", test, driver);
            test2 = driver.findElement(By.cssSelector("#grid-basic2-row-" + testid + "> table:nth-child(1) > tr:nth-child(1) > td:nth-child(3)")).getText();
            System.out.println(test2);
            Check.CheckExit("1.html", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void B_AddFileComment_Test2() {
        try {
            //�������� �����������
            Date date = new Date();
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            path = GetPathTools();
            upload.sendKeys(path + "1.html");
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[@id=\"uploadComm\"]")).sendKeys("" + date);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            Check.CheckExit(date.toString(), test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void C_AddFileOtherFolder_Test3() {
        try {
            //�������� ����������� ����� � ������ �����.
            Date date = new Date();
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            path = GetPathTools("1.html");
            upload.sendKeys(path);
            Thread.sleep(100);
            driver.findElement(By.cssSelector("#uploadFiles > div:nth-child(4) > span > span.selection > span > span.select2-selection__arrow")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("2");
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"uploadComm\"]")).sendKeys("" + date);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();

            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(3000);
            //Change folder
            driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("li.collapsed > div:nth-child(2) > a:nth-child(1)")).click();
            Thread.sleep(500);
            String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            Check.CheckExit(date.toString(), test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void D_AddFileMore50mbError_Test4() {
        try {
            //���� ������ 50 �������� �������� ������
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            path = GetPathTools("File2.txt");
            upload.sendKeys(path);
            Thread.sleep(100);
            test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
            System.out.println(test);
            Check.CheckExit("���� \"File2.txt\" (50001.00 KB) ��������� ������������ ������ 50000 KB.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void E_AddFileMore400files_Test5() {
        try {
            //�������� ������ ������ 400
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Thread.sleep(200);
            path = GetPathTools("1.html");
            for (int i = 0; i < 27; i++) {
                upload.sendKeys(path);
            }
            Thread.sleep(220000);
            upload.sendKeys(path);
            Thread.sleep(100);
            test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
            Check.CheckExit("���������� ��������� ������ (406) ��������� ����������� ���������� ���������� 400.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void F_AddFile400files_Test6() {
        try {
            //�������� ������ = 400
            Add();
            Thread.sleep(200);
            for (int i = 0; i < 400; i++) {
                WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
                path = GetPathTools("1.html");
                upload.sendKeys(path);
                upload.clear();
                Thread.sleep(1);
            }
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#uploadModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Element.VisibleElement180SecToWait(".glyphicon-ok-sign", driver);
            Thread.sleep(20000);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Check.CheckExit("����� 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html, 1.html ���� ������� ���������", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void J_AddWrongFile_Test7() {
        try {
            //�������� ������ = 400
            Add();
            Thread.sleep(200);
            String[] scripts = {"1.ade", "1.adp", "1.app", "1.asa", "1.ashx", "1.asmx", "1.asp", "1.bat", "1.cdx", "1.chm", "1.class", "1.cmd", "1.com", "1.config", "1.cpl", "1.crt", "1.der", "1.dll", "1.exe", "1.fxp", "1.hlp", "1.hta", "1.htr", "1.htw", "1.ida", "1.idq", "1.ins", "1.isp", "1.its", "1.jse", "1.ksh", "1.mad", "1.maf", "1.mam", "1.maq", "1.mar", "1.mas", "1.mat", "1.mau", "1.mav", "1.maw", "1.mda", "1.mde", "1.mdt", "1.mdw", "1.mdz", "1.msc", "1.msh", "1.msh1", "1.msh1xml", "1.msh2", "1.mshxml", "1.msi", "1.msp", "1.mst", "1.ops", "1.pcd", "1.prg", "1.prt", "1.pst", "1.reg", "1.rem", "1.scr", "1.sct", "1.shb", "1.shs", "1.shtm", "1.shtml", "1.soap", "1.stm", "1.txt", "1.vb", "1.vbe", "1.vbs", "1.ws", "1.wsc", "1.wsf", "12.pif", "13.scf", "14.url", "15.lnk"};

            for (int i = 0; i < 80; i++) {
                WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
                System.out.println(scripts[i]);
                path = GetPathTools("wrongFiles\\");
                upload.sendKeys(path + scripts[i]);
                Thread.sleep(20);
                if (i == 0) {
                    test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
                    Check.Check("����������� ���������� ��� ����� \"1.ade\". ������ ����������: \"ade, adp, app, asa, ashx, asmx, asp, bat, cdx, chm, class, cmd, com, config, cpl, crt, der, dll, exe, fxp, hlp, hta, htr, htw, ida, idq, ins, isp, its, jse, ksh, lnk, mad, maf, mam, maq, mar, mas, mat, mau, mdw, mdz, msc, msh, mav, maw, mda, shtm, mde, mdt, msh1, msh1xml, msh2, mshxml, msi, msp, mst, ops, pcd, pif, prt, prg, pst, reg, rem, scf, scr, sct, shb, shs, shtml, soap, stm, url, vb, vbe, vbs, ws, wsc, wsf, url\" ���������.", test, driver);
                }
              //  upload.clear();
            }

            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector(".file-drop-zone > div:nth-child(2)")).getAttribute("nodeType");

            System.out.println(test);
            Check.CheckExit("1", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void Add() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
    }
}
