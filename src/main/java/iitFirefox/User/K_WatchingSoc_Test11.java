package iitFirefox.User;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static iitAdd.Me.CreateFirstUDPDocumentAndSignOneAndTwo;

public class K_WatchingSoc_Test11 {
    WebDriver driver;
    String test, test2;

    @Before
    public void setUp() {
        driver = Drivers.ff();
        driver.get(p.url);
        Me.loggingCerts(p.upd, driver);
        Me.RoleSwitch(2, driver);
        Me.startEndingCertAndSendingFiles(driver);
    }

    @Test
    public void A_CheckAllButton_Test1() {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).getText();
        Me.Check("Просмотреть", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
        Me.Check("Заполнить", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
        Me.Check("Подписать", test2, driver);
        test2 = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
        Me.CheckExit("Пропустить", test2, driver);
    }

    @Test
    public void B_CheckFill_Test2() {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).getText();
        Me.Check("Заполнить", test, driver);
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).getText();
        Me.Check("Подписать", test, driver);
        test = driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).getText();
        Me.Check("Пропустить", test, driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalEdit")).click();
        Me.Sleep(500);
        test = driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).getAttribute("value");
        System.out.println(test);
        Me.CheckExit("УПД", test, driver);
    }

    @Test
    public void C_CheckSign_Test3() {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSign")).click();
        Me.Sleep(2500);
        test = driver.findElement(By.cssSelector(".result > h4:nth-child(1)")).getText();
        System.out.println(test);
        Me.CheckExit("Все документы успешно подписаны УСИЛЕННОЙ ЭП!", test, driver);
    }

    @Test
    public void D_CheckSkip_Test4() {
        test2 = CreateFirstUDPDocumentAndSignOneAndTwo("2",driver);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
        Me.Sleep(500);
        driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
        Me.Sleep(2500);
        test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getText();
        System.out.println(test);
        Me.CheckExit("Подписание было пропущено пользователем.", test, driver);
    }

}