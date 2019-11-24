package iitFirefox.User8077;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class O_AppointmentOfResponsibleExecutive_Test15 extends iit8077 {
    WebDriver driver;
    String test, test2;
    public String check;
    public String row;

    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_AppointmentTable_Test1() {
        try {
            Me.loggingCerts(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.AddFileAndClickMenu(7, "1.html", driver);
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
            Me.CheckExit("Иванов", test, driver);
            driver.quit();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_AppointmentCard_Test2() {
        try {
            Me.loggingCerts(upd, driver);
            Me.RoleSwitch(2, driver);
            Me.startEndingCertAndSendingFiles(driver);
            Me.AddFileAndClickMenu(7, "1.html", driver);
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#select2-select-trust-container")).click();
            Me.Sleep(500);
            driver.findElement(By.xpath("//*[contains(text(), 'Иванов')][contains(@class, 'select2-results__option')]")).click();
            driver.findElement(By.cssSelector("#modalSetTrust")).click();
            Me.Sleep(2500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Me.ClickMenuFirstElement(8, driver);
            Me.Sleep(500);
            test = driver.findElement(By.cssSelector("#cf-perf")).getText();
            Me.CheckExit("Иванов", test, driver);
            driver.quit();
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
    /*
    @Test
    @Order(3)
    void C_AppointmentExecutive_Test3(){
    try {
        Me.loggingCerts(upd, driver);
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
}catch (Throwable e) {
        Me.Catch(driver,e);
    }
}
    @Test
    @Order(4)
    void D_AppointmentEmailSend_Test4() throws Exception{
    try {
    Me.LogPass(pass5log, pass5log, driver);
    Me.Sleep(2000);
    Me.startEndingCertAndSendingFiles(driver);
         driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
         driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
        checkbox3 = driver.findElement(By.xpath("//*[@id=\"not-3\"]")).getAttribute("checked");
        if (checkbox3 == null) {
            driver.findElement(By.cssSelector("#not-3")).click();
        }
        driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
        Me.WaitElementToBeClickableAndClick("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1)",driver);
        ////////////////////////////////////////////////////////////////////////////////
        Me.Exit(driver);
        Me.loggingCerts(upd, driver);
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
        Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
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
           Assertions.fail();
        }
}catch (Throwable e) {
        Me.Catch(driver,e);
    }
}*/
}

