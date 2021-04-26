package edosf.iitFirefox.userTestedo;

import edosf.methods.*;
import edosf.settingsEdo.Drivers;
import edosf.settingsEdo.Testedo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edosf.settingsEdo.Settings.NUM_FAIL;

public class C_CorrectiveOrRevised_Test3 implements Testedo {
    WebDriver driver;
    String var;
    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            driver.get(URL);
            EnterAndExit.loggingCerts(UPD, driver);
            EnterAndExit.RoleSwitch(2, driver);
            EnterAndExit.startEndingCertAndSendingFiles(driver);
            Thread.sleep(2000);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание корректировки к СЧФ.")
    void A_AddFileUPDCorrectionSchfDownload_Successful_Test1() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "1", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(1,"1",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Корректировочный счет-фактура", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание корректировки к ДОП.")
    void B_AddFileUPDCorrectionDopDownload_Successful_Test2() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "2", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(1,"2",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Документ об изменении стоимости", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание корректировки к СЧФДОП.")
    void C_AddFileUPDCorrectionSchfDopDownload_Successful_Test3() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "3", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(1,"3",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Универсальный корректировочный документ", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание испавления к СЧФ.")
    void D_AddFileUPDRevisedSchfDownload_Successful_Test4() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "1", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(2,"1",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Счет-фактура исправленный", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание испавления к ДОП.")
    void E_AddFileUPDRevisedDopDownload_Successful_Test5() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "2", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(2,"2",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Акт сдачи-приемки исправленный", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @DisplayName("Создание испавления к СЧФДОП.")
    void F_AddFileUPDRevisedSchfDopDownload_Successful_Test6() {
        try {
            var = FileCreateAndLoading.CreateFirstUDPDocumentAndSignOneAndSignTwo(UPD2, "3", driver);
            Clarification.SetClarificationAndSign(driver);
            Thread.sleep(2000);
            Clarification.OpenOldFileAndSelectCorOrRevAndGetNewFile(2,"3",driver);
            Cabinet.ClickMenuFirstElement(3, driver);
            var = driver.findElement(By.cssSelector(".pad > h1:nth-child(1)")).getText();

            Check.CheckExit("Универсальный передаточный документ исправленный", var, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}
