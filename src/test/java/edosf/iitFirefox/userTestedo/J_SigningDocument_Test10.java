package edosf.iitFirefox.userTestedo;

import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import edosf.methods.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static edosf.methods.Path.GetPathTools;
import static edosf.settingsEdo.Settings.NUM_FAIL;

 import org.junitpioneer.jupiter.RetryingTest;

import static edosf.methods.EnterAndExit.getCert;
import static java.lang.Runtime.getRuntime;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class J_SigningDocument_Test10 implements Testedo {

    public WebDriver driver;
    public String test, test2, checking;





    @RetryingTest(NUM_FAIL)
    void A_Signing_Schf_Document_Test1() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("\\0.xml", driver);
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

    @RetryingTest(NUM_FAIL)
    void B_Signing_Dop_Document_Test2() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("\\Dop.xml", driver);
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

    @RetryingTest(NUM_FAIL)
    void C_Signing_Schf_DopDocument_Test3() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("\\SchfDop.xml", driver);
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

    @RetryingTest(NUM_FAIL)
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

    @RetryingTest(NUM_FAIL)
    void E_Signing_Dop_Documentml2_Test5() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("\\Dop.xml", driver);
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
            File dir = new File(GetPathTools("testFile"));
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            test = test.substring(test.length()-14);
            System.out.println(test);
            test2 = "C:\\Program Files\\7-Zip\\7z.exe e "+GetPathTools("testFile\\")+ test + " -o\""+GetPathTools("testFile")+"\\";
            System.out.println(test2);
            getRuntime().exec(test2);
            Thread.sleep(1500);
            File dir2 = new File(GetPathTools("testFile"));
            File[] arrFiles2 = dir2.listFiles();
            List<File> lst2 = Arrays.asList(arrFiles2);
            String getingLst2 = lst2.get(1).toString();
            System.out.println(getingLst2);
            HelpUser.DeletedFiles(dir);
            System.out.println(getingLst2);
            Check.CheckingContainsExit("ON_NSCHFDOPPOK_2JH", getingLst2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void F_Signing_SchfDop_Documentxml2_Test6() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("\\SchfDop.xml", driver);
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
            File dir = new File(GetPathTools("testFile"));
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            test = test.substring(test.length()-14);
            System.out.println(test);
            test2 = "C:\\Program Files\\7-Zip\\7z.exe e "+GetPathTools("testFile\\")+ test + " -o\""+GetPathTools("testFile")+"\\";
            System.out.println(test2);
            getRuntime().exec(test2);
            Thread.sleep(3500);
            File dir2 = new File(GetPathTools("testFile"));
            File[] arrFiles2 = dir2.listFiles();
            List<File> lst2 = Arrays.asList(arrFiles2);
            System.out.println(lst2.size());
            Integer s = lst2.size();
            String getingLst2 = null;
            if (s > 5) {
                getingLst2 = lst2.get(5).toString();
                System.out.println(getingLst2);
                HelpUser.DeletedFiles(dir);
            } else {
                getingLst2 = lst2.get(1).toString();
                System.out.println(getingLst2);
                HelpUser.DeletedFiles(dir);
            }
            System.out.println(getingLst2);
            Check.CheckingContainsExit("ON_NSCHFDOPPOK_2JH", getingLst2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

//    @RetryingTest(NUM_FAIL)
//    @Order(7)
//    void G_NoCerts_Test7() {
//        try {
//            driver = Drivers.ff();
//            driver.get(url);
//            Thread.sleep(500);
//            EnterAndExit.LogPass(pass5log, pass5log, driver);
//            Thread.sleep(2000);
//            FileCreateAndLoading.AddFile("1.html", driver);
//            Cabinet.ClickMenuFirstElement(5, driver);
//            Thread.sleep(1500);
//            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
//            System.out.println(test2);
//            Check.CheckingContainsExit("10: ������! ���������� �� ����������� ������������ testiit.test2@yandex.ru!", test2, driver);
//
//        } catch (Throwable e) {
//            Cabinet.Catch(driver, e);
//        }
//    }

    @RetryingTest(NUM_FAIL)
    void G_No_Second_Signing_Test7() {
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
            Check.CheckExit("14: ������! �������� ��� �������� ����.", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void H_Error_Test8() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.LogPass("��������", "��������", driver);
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#sign-readers")).click();

            String certsName = driver.findElement(By.id("sign-readers")).getAttribute("outerHTML");
            ArrayList CertList = getCert(certsName);
            //If element some name cert
            for (int i = 0; i <CertList.size() ; i++) {
                if(CertList.get(i).toString().contains(FIO10)){
                    System.out.println("Find cert " +CertList.get(i).toString() + " number"+i);
                    Element.WaitElementToBeClickableAndClick(1, "//*[@id=\"sign-readers\"]/option[" + ++i + "]", driver);
                    break;
                }

            }

            driver.findElement(By.cssSelector(".glyphicon-edit")).click();
            Thread.sleep(2000);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(4000);
            getRuntime().exec("taskkill /im nmcades.exe");
            Thread.sleep(2500);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
            Check.CheckExit("3: ������ ��� �������� �������", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void I_CloseWindow_Test9() {
        try {
            setUp();
            FileCreateAndLoading.AddFile("1.html", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            Thread.sleep(1500);
            test2 = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();
            Check.CheckExit("��������������� �������", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    void J_NoPermitSigningUPD_Test10() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(FIO9, driver);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(1000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            FileCreateAndLoading.AddFile("\\Dop.xml", driver);
            Cabinet.ClickMenuFirstElement(5, driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#signModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(5000);
            test2 = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("��� 9 1, ��� ��� �� ��������� ����������, ����������� ��� ���������� ���.\n" +
                    "��� ���������� ����������� �������� ������� �� ���� ��� � ������ ������� ���� ������� �������� � ��������� ���� \"��������� ������� ����������\" � ��������� ���������.\n" +
                    "���� ��������� � ����������� ���������� ��� \"���\":\n" +
                    "e-mail: support@iit.ru\n" +
                    "���: 8 (499) 262-24-25", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            Thread.sleep(1500);
            EnterAndExit.RoleSwitch(2, driver);
            Thread.sleep(2000);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            File dir = new File(GetPathTools("testFile"));
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
