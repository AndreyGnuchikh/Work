package iitFirefox.User_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p8080;
import iitFirefox.User_8080.form.CompleteForm;
import iitFirefox.User_8080.form.CompleteFormAct;
import iitFirefox.User_8080.form.CompleteFormDopSchF;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C_CreateFormDoc_Test3 {
    WebDriver driver;
    String test2;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p8080.url);
        Me.loggingCerts8080(p8080.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.Sleep(2000);
        Me.startEndingCertAndSendingFiles(driver);

    }

    //Add UPD
    @Test
    public void A_AddSCHF_Test1() {
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


    }
    @Test
    public void B_AddACT_Test2() {
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


    }
    @Test
    public void C_AddSChFDOP_Test3() {
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


    }

    //Add UPD IP
    @Test
    public void D_AddSCHF_IP_Test4() {
        Me.Sleep(2000);
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


    }
    @Test
    public void E_AddACT_IP_Test5() {
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


    }
    @Test
    public void F_AddSChFDOP_IP_Test6() {
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


    }

    //3 page blocs
    @Test
    public void G_AddSChFDOP_IP_3Page_2bloc_Test7() {
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


    }
    @Test
    public void H_AddSChFDOP_IP_3Page_3bloc_Test8() {
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
    }

}

