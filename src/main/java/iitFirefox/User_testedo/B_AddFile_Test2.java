package iitFirefox.User_testedo;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.testedo;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class B_AddFile_Test2 extends testedo {
    public WebDriver driver;
    public String test;
    public String test2;
    public String testid;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.LogPass(logUser, pass, driver);
            Me.Sleep(1500);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_AddFilePositive_Test1() {
        try {
            //Проверка имени Сотрудник отправителя и названия файла
            testid = Me.AddFile("1.html", driver);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + testid + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(4)")).getText();
            System.out.println(test);
            Me.Check("Кабинет Тест Вход 1", test, driver);
            test2 = driver.findElement(By.cssSelector("#grid-basic2-row-" + testid + "> table:nth-child(1) > tr:nth-child(1) > td:nth-child(3)")).getText();
            System.out.println(test2);
            Me.CheckExit("1.html", test2, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_AddFileComment_Test2() {
        try {
            //Проверка комментария
            Date date = new Date();
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Me.Sleep(200);
            upload.sendKeys("C:\\Tools\\1.html");
            Me.Sleep(100);
            driver.findElement(By.xpath("//*[@id=\"uploadComm\"]")).sendKeys("" + date);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();
            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            Me.CheckExit(date.toString(), test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_AddFileOtherFolder_Test3() {
        try {
            //Проверка перемещения файла в другую папку.
            Date date = new Date();
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Me.Sleep(200);
            upload.sendKeys("C:\\Tools\\1.html");
            Me.Sleep(100);
            driver.findElement(By.cssSelector("#uploadFiles > div:nth-child(4) > span > span.selection > span > span.select2-selection__arrow")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("2");
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"uploadComm\"]")).sendKeys("" + date);
            driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();

            Me.Sleep(3000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.Sleep(3000);
            //Change folder
            driver.findElement(By.cssSelector("ul.jqueryFileTree:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).click();
            driver.findElement(By.cssSelector("li.collapsed > div:nth-child(2) > a:nth-child(1)")).click();
            String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + " > table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
            Me.CheckExit(date.toString(), test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_AddFileMore50mbError_Test4() {
        try {
            //Файл больше 50 мегабайт выпадает ошибка
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Me.Sleep(200);
            upload.sendKeys("C:\\Tools\\" + "File2.txt");
            Me.Sleep(100);
            test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
            System.out.println(test);
            Me.CheckExit("Файл \"File2.txt\" (50001.00 KB) превышает максимальный размер 50000 KB.", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_AddFileMore400files_Test5() {
        try {
            //Загрузка файлов больше 400
            Add();
            WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
            Me.Sleep(200);
            for (int i = 0; i < 27; i++) {
                upload.sendKeys("C:\\Tools\\" + "1.html");
            }
            Me.Sleep(11000);
            upload.sendKeys("C:\\Tools\\" + "1.html");
            Me.Sleep(100);
            test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
            Me.CheckExit("Количество выбранных файлов (406) превышает максимально допустимое количество 400.", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_AddFile400files_Test6() {
        try {
            //Загрузка файлов = 400
            Add();
            Me.Sleep(200);
            for (int i = 0; i < 400; i++) {
                WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
                upload.sendKeys("C:\\Tools\\" + "1.html");
                upload.clear();
                Me.Sleep(1);
            }
            Me.Sleep(2000);
            driver.findElement(By.cssSelector("#uploadModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Me.visibleElement180SecToWait(".glyphicon-ok-sign", driver);
            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Me.CheckExit("Файлы были успешно загружены", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(7)
    void J_AddWrongFile_Test7() {
        try {
            //Загрузка файлов = 400
            Add();
            Me.Sleep(200);
            String[] scripts = {"1.ade", "1.adp", "1.app", "1.asa", "1.ashx", "1.asmx", "1.asp", "1.bat", "1.cdx", "1.chm", "1.class", "1.cmd", "1.com", "1.config", "1.cpl", "1.crt", "1.der", "1.dll", "1.exe", "1.fxp", "1.hlp", "1.hta", "1.htr", "1.htw", "1.ida", "1.idq", "1.ins", "1.isp", "1.its", "1.jse", "1.ksh", "1.mad", "1.maf", "1.mam", "1.maq", "1.mar", "1.mas", "1.mat", "1.mau", "1.mav", "1.maw", "1.mda", "1.mde", "1.mdt", "1.mdw", "1.mdz", "1.msc", "1.msh", "1.msh1", "1.msh1xml", "1.msh2", "1.mshxml", "1.msi", "1.msp", "1.mst", "1.ops", "1.pcd", "1.prg", "1.prt", "1.pst", "1.reg", "1.rem", "1.scr", "1.sct", "1.shb", "1.shs", "1.shtm", "1.shtml", "1.soap", "1.stm", "1.txt", "1.vb", "1.vbe", "1.vbs", "1.ws", "1.wsc", "1.wsf", "12.pif", "13.scf", "14.url", "15.lnk"};

            for (int i = 0; i < 80; i++) {
                WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
                System.out.println(scripts[i]);
                upload.sendKeys("C:\\Tools\\WrongFiles\\" + scripts[i]);
                Me.Sleep(20);
                if (i == 0) {
                    test = driver.findElement(By.cssSelector("#errorBlock > ul:nth-child(2) > li:nth-child(1)")).getText();
                    Me.Check("Запрещенное расширение для файла \"1.ade\". Данные расширения: \"ade, adp, app, asa, ashx, asmx, asp, bat, cdx, chm, class, cmd, com, config, cpl, crt, der, dll, exe, fxp, hlp, hta, htr, htw, ida, idq, ins, isp, its, jse, ksh, lnk, mad, maf, mam, maq, mar, mas, mat, mau, mdw, mdz, msc, msh, mav, maw, mda, shtm, mde, mdt, msh1, msh1xml, msh2, mshxml, msi, msp, mst, ops, pcd, pif, prt, prg, pst, reg, rem, scf, scr, sct, shb, shs, shtml, soap, stm, url, vb, vbe, vbs, ws, wsc, wsf, url\" запрещены.", test, driver);
                }
                upload.clear();
            }

            Me.Sleep(1000);
            test = driver.findElement(By.cssSelector(".file-drop-zone > div:nth-child(2)")).getAttribute("nodeType");

            System.out.println(test);
            Me.CheckExit("1", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    void Add() {
        Me.Sleep(1500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create-doc-panel > div:nth-child(2) > i")).click();
    }
}
