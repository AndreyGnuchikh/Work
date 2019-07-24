package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class O_AppointmentOfResponsibleExecutive_Test15 {
    WebDriver driver;
    String test,test2;
    public String checkbox1, checkbox2, checkbox3;
    public String check;
    public String row;
    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
    }
    @Test
    public void A_AppointmentTable_Test1(){
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFileAndClickMenu(7,"1.html",driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#select2-select-trust-container")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[contains(text(), 'Иванов')][contains(@class, 'select2-results__option')]")).click();
        driver.findElement(By.cssSelector("#modalSetTrust")).click();
        Me.Sleep(2500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        String row = null;
        Me.Sleep(2500);
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        System.out.println(row);
        Me.Sleep(1500);
        test = driver.findElement(By.cssSelector("#grid-basic2-row-" + row + "> table:nth-child(1) > tr:nth-child(1) > td:nth-child(9)")).getText();
        Me.CheckExit("Иванов",test,driver);
        driver.quit();
    }
    @Test
    public void B_AppointmentCard_Test2(){
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFileAndClickMenu(7,"1.html",driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#select2-select-trust-container")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[contains(text(), 'Иванов')][contains(@class, 'select2-results__option')]")).click();
        driver.findElement(By.cssSelector("#modalSetTrust")).click();
        Me.Sleep(2500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.ClickMenuFirstElement(8,driver);
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#cf-perf")).getText();
        Me.CheckExit("Иванов",test,driver);
        driver.quit();
    }
    /*
    @Test
    public void C_AppointmentExecutive_Test3(){
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFileAndClickMenu(7,"1.html",driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#select2-select-trust-container")).click();
        Me.Sleep(500);

        test = driver.findElement(By.cssSelector("#select-trust")).getAttribute("childElementCount");
        System.out.println("Qty Executive"+test);
        Integer numberElement = Integer.valueOf(test)+1;
        Map<Integer ,String> myMap = new HashMap<Integer, String>();
        for (int i = 1; i < numberElement; i++) {
            test = driver.findElement(By.cssSelector("#select-trust > option:nth-child("+i+")")).getText();
            myMap.put(i,test);
            System.out.println(myMap.get(i));
        }

        Me.CheckExit("Иванов",test,driver);
        driver.quit();

    @Test
    public void D_AppointmentEmailSend_Test4() throws Exception{
    Me.LogPass(p.pass5log, p.pass5log, driver);
    Me.Sleep(2000);
    Me.startEndingCertAndSendingFiles(driver);
         driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
         driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        checkbox3 = driver.findElement(By.xpath("//*[@id=\"not-3\"]")).getAttribute("checked");
        if (checkbox3 == null) {
            driver.findElement(By.cssSelector("#not-3")).click();
        }
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)")).click();
        ////////////////////////////////////////////////////////////////////////////////
        Me.Exit(driver);
        Me.loggingCerts(p.upd, driver);
        Me.Sleep(1500);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);
        Me.AddFileAndClickMenu(7,"1.html",driver);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#select2-select-trust-container")).click();
        Me.Sleep(500);
        driver.findElement(By.xpath("//*[contains(text(), 'Тест 5ть')][contains(@class, 'select2-results__option')]")).click();
        driver.findElement(By.cssSelector("#modalSetTrust")).click();
        Me.Sleep(2500);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Me.SingFirstFile(driver);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        Me.Email(driver);
        Me.visibleElement60SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
        Me.Sleep(500);
        String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
        if (test1.equals("Портал ЭДО ИИТ: Изменение ответственного исполнителя")) {
            System.out.println("Successful");
            Me.Sleep(500);
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
            driver.quit();
        } else {
            System.out.println(test1);
            driver.quit();
            Assert.fail();
        }
}*/
}

