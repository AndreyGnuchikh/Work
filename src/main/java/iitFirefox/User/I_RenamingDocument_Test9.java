package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class I_RenamingDocument_Test9 {
    public WebDriver driver;
    public String test;
    public String row;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.LogPass(p.q1ulog, p.q1upass, driver);
        Me.Sleep(1500);

    }

    @Test
    public void A_RenamingDocument_Test1() {
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
    }

    @Test
    public void B_SignDocumentAndCheck_Test2() {
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
    }

    @Test
    public void C_DoteInName_Test3() {
        Me.AddFileAndClickMenu(4, "1.html", driver);
        driver.findElement(By.cssSelector("#rename-newName")).sendKeys(".");
        Me.Sleep(1200);
        driver.findElement(By.cssSelector("#rename-btn")).click();
        Me.Sleep(1200);
        test = driver.findElement(By.cssSelector("h3.resptext")).getText();
        System.out.println(test);
        Me.CheckExit("Новое имя файла указывается без расширения! Точки в имени файла запрещены!", test, driver);
    }

    @Test
    public void D_WrongSymbols_Test4() {
        String[] d = {"/", "\\", ":", "*", "?", "«", "<", ">", "|"};
        Me.AddFileAndClickMenu(4, "1.html", driver);
        for (int i = 0; i < d.length; i++) {
            driver.findElement(By.cssSelector("#rename-newName")).sendKeys(d[i]);
            Me.Sleep(400);
            test = driver.findElement(By.cssSelector("#rename-newName")).getAttribute("data-content");
            System.out.println(test);
            Me.Check("Поле не может быть пустым и не может содержать /,\\,:,*,?,«,<,>,|,\\", test, driver);
            driver.findElement(By.cssSelector("#rename-newName")).clear();
            Me.Sleep(400);
        }
        Me.CheckExit("Поле не может быть пустым и не может содержать /,\\,:,*,?,«,<,>,|,\\", test, driver);
    }

    @Test
    public void E_WrongNames_Test5() {
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
    }

    @Test
    public void F_EmptyNameFile_Test6() {
        Me.AddFileAndClickMenu(4, "1.html", driver);
        driver.findElement(By.cssSelector("#rename-newName")).sendKeys(" ");
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#rename-btn")).click();
        Me.Sleep(400);
        test = driver.findElement(By.cssSelector("h3.resptext")).getText();
        System.out.println(test);
        Me.CheckExit("Введите новое имя документа!", test, driver);
    }

}
