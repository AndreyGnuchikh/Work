package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class I_RenamingDocument_Test9 extends iit8077 {
    public WebDriver driver;
    public String test;
    public String row;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            Me.Sleep(500);
            driver.get(url);
            Me.LogPass(logUser, pass, driver);
            Me.Sleep(1500);

        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_RenamingDocument_Test1() {
        try {
            row = Me.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.id("rename-newName")).sendKeys("123");
            Me.Sleep(1500);
            driver.findElement(By.id("rename-btn")).click();
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            System.out.println(row);
            test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + "> table:nth-child(1) > tr:nth-child(1)")).getAttribute("innerText");
            // Cut elements split
            String[] text = test.split("\\t");
            System.out.println(text[1]);
            Me.CheckExit("123.html", text[1], driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_SignDocumentAndCheck_Test2() {
        try {
            row = null;
            row = Me.AddFile("1.html", driver);
            Me.SingFirstFile(driver);
            Me.Sleep(1000);
            driver.findElement(By.cssSelector(".fa-thumbs-up")).click();
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            Actions builder = new Actions(driver);
            builder.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + row))
            ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
            // Get perentElement Disabled menu
            Me.Sleep(2000);
            test = driver.findElement(By.id("cm-sign")).getAttribute("class");
            System.out.println(test);
            Me.CheckExit("dijitReset dijitMenuItem dijitMenuItemDisabled dijitDisabled", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_DoteInName_Test3() {
        try {
            Me.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.cssSelector("#rename-newName")).sendKeys(".");
            Me.Sleep(1200);
            driver.findElement(By.cssSelector("#rename-btn")).click();
            Me.Sleep(1200);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Me.CheckExit("Новое имя файла указывается без расширения! Точки в имени файла запрещены!", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_WrongSymbols_Test4() {
        try {
            String[] d = {"/", "\\", ":", "*", "?", "«", "<", ">", "|"};
            Me.AddFileAndClickMenu(4, "1.html", driver);
            for (int i = 0; i < d.length; i++) {
                driver.findElement(By.cssSelector("#rename-newName")).sendKeys(d[i]);
                Me.Sleep(400);
                test = driver.findElement(By.cssSelector("#rename-newName")).getAttribute("data-content");
                System.out.println(test);
                Me.Check("Поле не может быть пустым и не может содержать /,\\,:,*,?,«,<,>,|,\"", test, driver);
                driver.findElement(By.cssSelector("#rename-newName")).clear();
                Me.Sleep(400);
            }
            Me.CheckExit("Поле не может быть пустым и не может содержать /,\\,:,*,?,«,<,>,|,\"", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_WrongNames_Test5() {
        try {
            String[] d = {"+", "#", "%", "&", "{", "}", "$", "!", "‘", "`", "@", "="};
            Me.AddFileAndClickMenu(4, "1.html", driver);
            for (int i = 0; i < d.length; i++) {
                driver.findElement(By.cssSelector("#rename-newName")).sendKeys(d[i]);
                Me.Sleep(1000);
                driver.findElement(By.cssSelector("#rename-btn")).click();
                Me.Sleep(400);
                test = driver.findElement(By.cssSelector("h3.resptext")).getAttribute("innerText");
                System.out.println(test);
                Me.Sleep(400);
                Me.Check("Обнаружен недопустимый символ в имени документа! Символы \\, /, *, ?, <, >, |, +, #, %, &, {, }, $, !, ‘, `, @, =, : недопустимы для ввода.", test, driver);
                driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                Me.Sleep(400);
            }
            Me.CheckExit("Обнаружен недопустимый символ в имени документа! Символы \\, /, *, ?, <, >, |, +, #, %, &, {, }, $, !, ‘, `, @, =, : недопустимы для ввода.", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_EmptyNameFile_Test6() {
        try {
            Me.AddFileAndClickMenu(4, "1.html", driver);
            driver.findElement(By.cssSelector("#rename-newName")).sendKeys(" ");
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#rename-btn")).click();
            Me.Sleep(400);
            test = driver.findElement(By.cssSelector("h3.resptext")).getText();
            System.out.println(test);
            Me.CheckExit("Введите новое имя документа!", test, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

}
