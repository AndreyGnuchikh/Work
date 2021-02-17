package EDOSF.iitFirefox.User8077;

import EDOSF.iitAdd.*;
import EDOSF.Forms.CompleteForm;
import EDOSF.Forms.CompleteFormAct;
import EDOSF.Forms.CompleteFormDopSchF;
import EDOSF.methods.Cabinet;
import EDOSF.methods.Check;
import EDOSF.methods.EnterAndExit;
import EDOSF.methods.HelpUser;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EDOSF.iitAdd.Settings.NUM_FAIL; 
 import org.junitpioneer.jupiter.RetryingTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class C_CreateFormDoc_Test3 extends iit8077 {
    WebDriver driver;
    String test2;




    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    //Add UPD
    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_AddSCHF_Test1() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add ρχτ
            test2 = CompleteForm.SCHF("Yes",driver);
            Thread.sleep(2000);
            String row;
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);


        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_AddACT_Test2() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add act
            test2 = CompleteFormAct.Act("Yes",driver);
            Thread.sleep(2000);
            String row;
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);


        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    void C_AddSChFDOP_Test3() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            // Add ρχτ
            test2 = CompleteFormDopSchF.DopSchF("YES",driver);
            Thread.sleep(2000);
            String row;
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    //Add UPD IP
    @RetryingTest(NUM_FAIL)
    @Order(4)
    void D_AddSCHF_IP_Test4() {
        try {
            Thread.sleep(2500);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add ρχτ
            test2 = CompleteForm.SCHF("IP",driver);
            Thread.sleep(2000);
            String row;
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    void E_AddACT_IP_Test5() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(2)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1000);
            // Add ρχτ
            test2 = CompleteFormAct.Act("IP",driver);
            Thread.sleep(2000);
            String row;
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            Thread.sleep(500);
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    void F_AddSChFDOP_IP_Test6() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            // Add ρχτ
            test2 = CompleteFormDopSchF.DopSchF("IP",driver);
            Thread.sleep(2000);
            String row;
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    //3 page blocs
    @RetryingTest(NUM_FAIL)
    @Order(7)
    void G_AddSChFDOP_IP_3Page_2bloc_Test7() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            // Add ρχτ
            test2 = CompleteFormDopSchF.DopSchF_IP_3Page(1,driver);
            Thread.sleep(2000);
            String row;
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            System.out.println(test);
            Check.CheckExit(test2, test, driver);


        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    void H_AddSChFDOP_IP_3Page_3bloc_Test8() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".createDocument")).click();
            driver.findElement(By.cssSelector("div.pan-create:nth-child(1)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#uploadForm > option:nth-child(3)")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(1500);
            // Add ρχτ
            test2 = CompleteFormDopSchF.DopSchF_IP_3Page(2,driver);
            Thread.sleep(2000);
            String row;
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
            Thread.sleep(500);
            row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
            row = row.substring(0, 36);
            Thread.sleep(1500);
            System.out.println(row);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).click();
            String arrive, test;
            int numberElement = 35;
            arrive = driver.findElement(By.cssSelector("#grid-basic2-row-" + row)).getAttribute("innerHTML");
            test = HelpUser.Krutilka(arrive, numberElement);
            Check.CheckExit(test2, test, driver);


        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

}

