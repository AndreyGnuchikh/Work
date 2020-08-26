package iitFirefox.UserTestedo;

import iitAdd.Drivers;
import iitAdd.iit8077;
import iitAdd.testedo;
import methods.Cabinet;
import methods.Check;
import methods.EnterAndExit;
import methods.FileCreateAndLoading;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class M_SkipDocument_Test13 extends testedo {
    WebDriver driver;
    String test, test2;

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

    @Test
    @Order(1)
    void A_SkipDocument_DOP_Test1() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "2", driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#signModal-title")).getText();
            Check.Check("Подписать ЭД", test, driver);
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("Подписание было пропущено пользователем.", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(2)
    void B_SkipDocument_SchfDOP_Test2() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "3", driver);
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalShowDoc")).click();
            Thread.sleep(1500);
            driver.findElement(By.cssSelector("#serviceModalQuestUPDModalSpace")).click();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#signModal-title")).getText();
            Check.Check("Подписать ЭД", test, driver);
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#sign-fname-error > li:nth-child(1) > i:nth-child(2)")).getAttribute("textContent");
            Check.CheckExit("Подписание было пропущено пользователем.", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    @Order(3)
    void C_SkipDocument_Schf_Test3() {
        try {
            test2 = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndTwo(url, upd2, "1", driver);
            Actions builder2 = new Actions(driver);
            driver.findElement(By.cssSelector("#grid-basic2-row-" + test2)).click();
            builder2.contextClick(driver.findElement(By.cssSelector("#grid-basic2-row-" + test2))
            ).moveByOffset(-15, -15).sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(1000);
            test = driver.findElement(By.cssSelector("#cm-sign")).getAttribute("aria-disabled");
            Check.CheckExit("true", test, driver);

        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
