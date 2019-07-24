package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q_AddCommentsToDocumentFromCardED_Test17 {
    WebDriver driver;
    String test0,test,test2;

    @Before
    public void setUp(){
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd,driver);
        Me.RoleSwitch(2,driver);
        Me.startEndingCertAndSendingFiles(driver);
    }
    @Test
    public void A_add50Comments_Test1(){
    Me.AddFile("1.html",driver);
    Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(1500);
        for (int i = 0; i < 50; i++) {
    test0 = "Test";
    driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
    driver.findElement(By.cssSelector(".glyphicon-plus")).click();
    Me.Sleep(1000);
    if(i==0){
        test="Test";
    }
    else if(i==1){
        test="Test; Test";
    }else{
        test = "";
        for (int j = 0; j <i ; j++) {
            test=test+"Test; ";
        }
        test=test+test0;

    }
    test2 = driver.findElement(By.cssSelector("#cf-comm")).getAttribute("textContent");
    System.out.println(test2);
    Me.Check(test2,test,driver);
        }
    Me.CheckExit("Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test",test,driver);

    }
    @Test
    public void B_addLongComment_Test2(){
        Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(2500);
            test0 = "Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test;";
            driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
            driver.findElement(By.cssSelector(".glyphicon-plus")).click();
            Me.Sleep(1000);

            test2 = driver.findElement(By.cssSelector("#cf-comm")).getAttribute("textContent");
            System.out.println(test2);
            Me.CheckExit("Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; TestTest; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test; Test;",test2,driver);

    }
    @Test
    public void C_addCommentInCabinet_Test3(){

        String row = Me.AddFile("1.html",driver);
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(2500);
        test0 = "Добавление ком в блок Комментарии";
        driver.findElement(By.cssSelector("#cf-newcomm")).sendKeys(test0);
        driver.findElement(By.cssSelector(".glyphicon-plus")).click();
        Me.Sleep(1000);
        driver.findElement(By.cssSelector("#cardfileModal > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")).click();
        test2 =driver.findElement(By.cssSelector("#grid-basic2-row-" + row+"> table:nth-child(1) > tr:nth-child(1) > td:nth-child(13)")).getText();
        System.out.println(test2);
        Me.CheckExit("Добавление ком в блок Комментарии",test2,driver);

    }

}
