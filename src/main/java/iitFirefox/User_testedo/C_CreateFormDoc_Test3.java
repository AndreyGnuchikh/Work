package iitFirefox.User_testedo;

import iitAdd.*;
import iitFirefox.User.Form.CompleteForm;
import iitFirefox.User.Form.CompleteFormAct;
import iitFirefox.User.Form.CompleteFormDopSchF;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class C_CreateFormDoc_Test3 extends testedo {
    WebDriver driver;
    String test2;

     @BeforeEach
    void setUp() {
         try {
        driver = Drivers.ff();
        driver.get(url);
        Me.loggingCerts8080(upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
     }

    //Add UPD
    @Test
    @Order(1)
    void A_AddSCHF_Test1() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add ρχτ
        test2 = CompleteForm.SCHF(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(2)
    void B_AddACT_Test2() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add act
        test2 = CompleteFormAct.Act(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(3)
    void C_AddSChFDOP_Test3() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        // Add ρχτ
        test2 = CompleteFormDopSchF.DopSchF(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    //Add UPD IP
    @Test
    @Order(4)
    void D_AddSCHF_IP_Test4() {
         try {
        Me.Sleep(2500);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add ρχτ
        test2 = CompleteForm.SCHFIP(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(5)
    void E_AddACT_IP_Test5() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1000);
        // Add ρχτ
        test2 = CompleteFormAct.ActIP(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

    @Test
    @Order(6)
    void F_AddSChFDOP_IP_Test6() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        // Add ρχτ
        test2 = CompleteFormDopSchF.DopSchF_IP(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    //3 page blocs
    @Test
    @Order(7)
    void G_AddSChFDOP_IP_3Page_2bloc_Test7() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        // Add ρχτ
        test2 = CompleteFormDopSchF.DopSchF_IP_3Page(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }
    @Test
    @Order(8)
    void H_AddSChFDOP_IP_3Page_3bloc_Test8() {
         try {
        Me.Sleep(2000);
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#create")).click();
        Me.Sleep(1500);
        // Add ρχτ
        test2 = CompleteFormDopSchF.DopSchF_IP_3Page_bloc3(driver);
        Me.Sleep(2000);
        String row;
        row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        row = row.substring(0, 36);
        Me.Sleep(1500);
        System.out.println(row);
        driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
        String arrive, test;
        int numberElement = 35;
        arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
        test = Me.Krutilka(arrive, numberElement).substring(0, 28);
        System.out.println(test);
        Me.CheckExit(test2, test, driver);
    }catch (Throwable e) {
             Me.Catch(driver,e);
         }
    }

}

