package iitFirefox.User8077;

import iitAdd.Drivers;
import methods.*;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static java.lang.Runtime.getRuntime;
import static methods.EnterAndExit.getCert;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J_SigningDocument_Test10 extends iit8077 {

    public WebDriver driver;
    public String test, test2, checking;


    @Test
    @Order(1)
    void A_Signing_Schf_Document_Test1() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\0.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("true", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_Signing_Dop_Document_Test2() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\Dop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("true", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_Signing_Schf_DopDocument_Test3() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("true", test2, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(4)
    void D_SigningDocument_Test4() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(14, driver);
            test2 = driver.findElement(By.cssSelector("#cm-del-full")).getAttribute("aria-disabled");
            System.out.println(test2);
            Check.CheckExit("true", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(5)
    void E_Signing_Dop_Documentml2_Test5() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\Dop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(500);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1500);
            File dir = new File("C:\\Tools\\TestFile");
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            test = test.substring(18);
            System.out.println(test);
            test2 = "C:\\Program Files\\7-Zip\\7z.exe e C:\\Tools\\TestFile\\" + test + " -o\"C:\\Tools\\TestFile\\\"";
            System.out.println(test2);
            getRuntime().exec(test2);
            Thread.sleep(1500);
            File dir2 = new File("C:\\Tools\\TestFile");
            File[] arrFiles2 = dir2.listFiles();
            List<File> lst2 = Arrays.asList(arrFiles2);
            String getingLst2 = lst2.get(1).toString();
            System.out.println(getingLst2);
            HelpUser.DeletedFiles(dir);
            getingLst2 = getingLst2.substring(18, 45);
            System.out.println(getingLst2);
            Check.CheckingContainsExit("ON_NSCHFDOPPOK_2JH", getingLst2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(6)
    void F_Signing_SchfDop_Documentxml2_Test6() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(6, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#downloadp7s")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#queued-download-button")).click();
            Thread.sleep(1500);
            File dir = new File("C:\\Tools\\TestFile");
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            test = test.substring(18);
            System.out.println(test);
            test2 = "C:\\Program Files\\7-Zip\\7z.exe e C:\\Tools\\TestFile\\" + test + " -o\"C:\\Tools\\TestFile\\\"";
            System.out.println(test2);
            getRuntime().exec(test2);
            Thread.sleep(3500);
            File dir2 = new File("C:\\Tools\\TestFile");
            File[] arrFiles2 = dir2.listFiles();
            List<File> lst2 = Arrays.asList(arrFiles2);
            System.out.println(lst2.size());
            Integer s = lst2.size();
            String getingLst2 = null;
            if (s > 5) {
                getingLst2 = lst2.get(5).toString();
                System.out.println(getingLst2);
                HelpUser.DeletedFiles(dir);
                getingLst2 = getingLst2.substring(18, 45);
            } else {
                getingLst2 = lst2.get(1).toString();
                System.out.println(getingLst2);
                HelpUser.DeletedFiles(dir);
                getingLst2 = getingLst2.substring(18, 45);
            }
            System.out.println(getingLst2);
            Check.CheckingContainsExit("ON_NSCHFDOPPOK_2JH", getingLst2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

     /*@Test
    @Order(7)
    void G_NoCerts_Test7() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Thread.sleep(500);
            Enter.LogPass(pass5log, pass5log, driver);
            Thread.sleep(2000);
            Enter.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
            System.out.println(test2);
            Check.CheckingContainsExit("10: Ошибка! Сертификат не принадлежит пользователю testiit.test2@yandex.ru!", test2, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }*/

    @Test
    @Order(8)
    void H_No_Second_Signing_Test8() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(15000);
            Element.WaitElementToBeClickableAndClick("button.btn:nth-child(5)",driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("14: Ошибка! Документ уже подписан Вами.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(9)
    void I_Error_Test9() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.LogPass("вваываыв", "вваываыв", driver);
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#sign-readers")).click();

            String certsName = driver.findElement(By.id("sign-readers")).getAttribute("outerHTML");
            ArrayList CertList = getCert(certsName);
            //If element some name cert
            for (int i = 0; i <CertList.size() ; i++) {
                if(CertList.get(i).toString().contains(fio10)){
                    System.out.println("Find cert " +CertList.get(i).toString() + " number"+i);
                    Element.WaitElementToBeClickableAndClick(1, "//*[@id=\"sign-readers\"]/option[" + ++i + "]", driver);
                    break;
                }

            }

            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(1000);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(1000);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(1000);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
            Check.CheckExit("3: Ошибка при создании подписи", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(10)
    void J_CloseWindow_Test10() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("Переименованный кабинет", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(11)
    void K_NoPermitSigningUPD_Test11() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(fio9, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(1000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFile("upd\\SchfDop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("false", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            EnterAndExit.loggingCerts(upd, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            File dir = new File("C:\\Tools\\TestFile");
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
