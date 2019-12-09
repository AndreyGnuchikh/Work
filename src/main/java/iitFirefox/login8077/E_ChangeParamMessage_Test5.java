package iitFirefox.login8077;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E_ChangeParamMessage_Test5 extends iit8077 {
    private WebDriver driver;
    public String sleep;
    public String check;
    public String row;

    @BeforeEach
    void A_DelatedCheckboxs() {
        try {
            Me.DeletedCabinetMarkerAndDeletedEmail(url, pass5log, testIitTest2, EmailPass, driver);
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(1)
    void A_SendingLetterAboutSendingFile_Test1() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.LogPass(pass5log, pass5log, driver);
            Me.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-1")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.Sleep(1000);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            Me.AddFileAndClickMenu(12, "1.html", driver);
            Me.Sleep(1000);
            Me.SendCabinet("���� ��� ������", "��������������� �������", driver);
            Me.Sleep(1000);
            Me.Email(iit8077.testIitTest2, iit8077.EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(500);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("������ ��� ���: ��������� � ��������� ���������")) {
                System.out.println("Successful");
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_SendingLetterAboutReportHarmonization_Test2() {
        try {
            Date date = new Date();
            driver = Drivers.ff();
            driver.get(url);
            Me.LogPass(pass5log, pass5log, driver);
            Me.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-2")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            Me.AddFileAndClickMenu(10, "1.html", driver);
            Me.Sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"cn-comment\"]")).sendKeys("������������ ", date.toString());
            Me.Sleep(1500);
            driver.findElement(By.cssSelector("#modalSendConfirm")).click();
            Me.Sleep(1000);
            Me.Email(iit8077.testIitTest2, iit8077.EmailPass, driver);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(500);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("������ ��� ���: ��������� � ������������ ���������")) {
                System.out.println("Successful");
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();

                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_SendingLetterAboutResponsibilityPerformer_Test3() {
        try {
            driver = Drivers.ff();
            driver.get(url);
            Me.LogPass(pass5log, pass5log, driver);
            Me.startEndingCertAndSendingFiles(driver);
            driver.findElement(By.xpath("//*[@id=\"user-nav\"]")).click();
            driver.findElement(By.cssSelector("div.statistic:nth-child(4) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#not-3")).click();
            driver.findElement(By.cssSelector("#collapseTwo > div:nth-child(2) > button:nth-child(1)")).click();
            Me.Sleep(500);
            driver.findElement(By.cssSelector("#ErrorOkMessageModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

            //add file
            Me.AddFileAndClickMenu(7, "1.html", driver);
            Me.Sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"modalSetTrust\"]")).click();
            Me.Sleep(1000);
            Me.Email(iit8077.testIitTest2, iit8077.EmailPass, driver);
            Me.Sleep(1000);
            Me.visibleElement180SecToWait(".mail-MessageSnippet-Item_subject > span:nth-child(1)", driver);
            Me.Sleep(1000);
            String test1 = driver.findElement(By.cssSelector(".mail-MessageSnippet-Item_subject > span:nth-child(1)")).getText();
            System.out.println(test1);
            if (test1.equals("������ ��� ���: ��������� �������������� �����������")) {
                System.out.println("Successful");
                Me.Sleep(500);
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-main-select-all > label:nth-child(1) > span:nth-child(2)")).click();
                driver.findElement(By.cssSelector(".ns-view-toolbar-button-delete")).click();
                driver.quit();
            } else {
                driver.quit();
                Assertions.fail();
            }
        } catch (Throwable e) {
            Me.Catch(driver, e);
        }
    }
}