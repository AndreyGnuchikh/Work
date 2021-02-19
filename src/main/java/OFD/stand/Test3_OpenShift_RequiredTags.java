package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test3_OpenShift_RequiredTags extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log1, pass1);
            login.start(driver);
            try {
                GetDateFD.getData("25.01.2021 10:33:00", "25.01.2021 10:33:59", "Отчёт об открытии смены","25.01.2021 10:33", driver);
            } catch (Throwable throwable) {
                GetDateFD.getData("25.01.2021 10:33:00", "25.01.2021 10:33:59", "Отчёт об открытии смены","25.01.2021 10:33", driver);
            }
            Thread.sleep(500);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_OpenShift_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "1453527421", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_OpenShift_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "25.01.2021 10:33", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_OpenShift_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "2218469606", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_OpenShift_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "5", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_OpenShift_Teg_C1038() {
        try {
            Check.checkExit(driver.findElement(By.id("C1038")).getText(), "2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_OpenShift_Teg_C1021() {
        try {
            Check.checkExit(driver.findElement(By.id("C1021")).getText(), "СИСТ. АДМИН.", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_OpenShift_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "Адрес расчетов: -", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_OpenShift_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "0000054679047669", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_OpenShift_Teg_C1188() {
        try {
            Check.checkExit(driver.findElement(By.id("C1188")).getText(), "001", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_OpenShift_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_OpenShift_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_OpenShift_documentKktVersion() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector(".col-xs-12 > span:nth-child(2)")).getText(), "2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_OpenShift_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector(".col-xs-12 > span:nth-child(6) > span:nth-child(1) > a:nth-child(1)")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_RegisterDocument_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Отчёт об открытии смены", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }


}
