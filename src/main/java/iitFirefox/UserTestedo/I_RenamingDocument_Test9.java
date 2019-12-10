package iitFirefox.UserTestedo;

import iitAdd.Drivers; 
import methods.Cabinet;
import methods.EnterAndExit;
import iitAdd.testedo;
import methods.Check;
import methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class I_RenamingDocument_Test9 extends testedo {
    public WebDriver driver;
    public String test;
    public String row;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass(logUser, pass, driver);
            Thread.sleep(1500);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_RenamingDocument_Test1() {
        try {
            row = FileCreateAndLoading.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.id("rename-newName")).sendKeys("123");
            Thread.sleep(1500);
            driver.findElement(By.id("rename-btn")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            System.out.println(row);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + "> table:nth-child(1) > tr:nth-child(1)")).getAttribute("innerText");
            // Cut elements split
            String[] text = test.split("\\t");
            System.out.println(text[1]);
            Check.CheckExit("123.html", text[1], driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

 /*   @Test
    @Order(2)
    void B_SignDocumentAndCheck_Test2() {
        try {
            EnterAndExit.Exit(driver);
            EnterAndExit.loggingCerts(fio9,driver);
            EnterAndExit.startEndingCertAndSendingFiles("Skip",driver);
            row = null;
            row = FileCreateAndLoading.AddFile("1.html", driver);
            Thread.sleep(500);
            Sign.SignFirstFile(driver);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".fa-thumbs-up")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            Actions builder = new Actions(driver);
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
            ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
            // Get perentElement Disabled menu
            Thread.sleep(2000);
            test = driver.findElement(By.id("cm-sign")).getAttribute("class");
            System.out.println(test);
            Check.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @Test
    @Order(3)
    void C_DoteInName_Test3() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.cssSelector("#rename-newName")).sendKeys(".");
            Thread.sleep(1200);
            driver.findElement(By.cssSelector("#rename-btn")).click();
            Thread.sleep(1200);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Check.CheckExit("����� ��� ����� ����������� ��� ����������! ����� � ����� ����� ���������!", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_WrongSymbols_Test4() {
        try {
            String[] d = {"/", "\\", ":", "*", "?", "�", "<", ">", "|"};
            FileCreateAndLoading.AddFileAndClickMenu(4, "1.html", driver);
            for (int i = 0; i < d.length; i++) {
                driver.findElement(By.cssSelector("#rename-newName")).sendKeys(d[i]);
                Thread.sleep(400);
                test = driver.findElement(By.cssSelector("#rename-newName")).getAttribute("data-content");
                System.out.println(test);
                Check.Check("���� �� ����� ���� ������ � �� ����� ��������� /,\\,:,*,?,�,<,>,|,\"", test, driver);
                driver.findElement(By.cssSelector("#rename-newName")).clear();
                Thread.sleep(400);
            }
            Check.CheckExit("���� �� ����� ���� ������ � �� ����� ��������� /,\\,:,*,?,�,<,>,|,\"", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_WrongNames_Test5() {
        try {
            String[] d = {"+", "#", "%", "&", "{", "}", "$", "!", "�", "`", "@", "="};
            FileCreateAndLoading.AddFileAndClickMenu(4, "1.html", driver);
            for (int i = 0; i < d.length; i++) {
                driver.findElement(By.cssSelector("#rename-newName")).sendKeys(d[i]);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#rename-btn")).click();
                Thread.sleep(400);
                test = driver.findElement(By.cssSelector("h3.resptext")).getAttribute("innerText");
                System.out.println(test);
                Thread.sleep(400);
                Check.Check("��������� ������������ ������ � ����� ���������! ������� \\, /, *, ?, <, >, |, +, #, %, &, {, }, $, !, �, `, @, =, : ����������� ��� �����.", test, driver);
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Thread.sleep(400);
            }
            Check.CheckExit("��������� ������������ ������ � ����� ���������! ������� \\, /, *, ?, <, >, |, +, #, %, &, {, }, $, !, �, `, @, =, : ����������� ��� �����.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_EmptyNameFile_Test6() {
        try {
            FileCreateAndLoading.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.cssSelector("#rename-newName")).sendKeys(" ");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#rename-btn")).click();
            Thread.sleep(1500);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Thread.sleep(500);
            Check.CheckExit("������� ����� ��� ���������!", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}