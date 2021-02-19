package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test7_ReportOnTheCurrentStatusOfSettlements_RequiredTags extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log1, pass1);
            login.start(driver);
            try {
                GetDateFD.getData("20.07.2020 17:22:00", "20.07.2020 17:22:59", "Отчёт о текущем состоянии расчетов","20.07.2020 17:22", driver);
            } catch (Throwable throwable) {
                GetDateFD.getData("20.07.2020 17:22:00", "20.07.2020 17:22:59", "Отчёт о текущем состоянии расчетов","20.07.2020 17:22", driver);
            }
            Thread.sleep(500);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }


    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_ReportOnTheCurrentStatusOfSettlements_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "1453527421", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_ReportOnTheCurrentStatusOfSettlements_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "517405202", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_ReportOnTheCurrentStatusOfSettlements_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "7", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_ReportOnTheCurrentStatusOfSettlements_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "20.07.2020 17:22", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_ReportOnTheCurrentStatusOfSettlements_Teg_C1038() {
        try {
            Check.checkExit(driver.findElement(By.id("C1038")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_ReportOnTheCurrentStatusOfSettlements_Teg_C1097() {
        try {
            Check.checkExit(driver.findElement(By.id("C1097")).getText(), "0", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_ReportOnTheCurrentStatusOfSettlements_Teg_C1098() {
        try {
            Check.checkExit(driver.findElement(By.id("C1098")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_ReportOnTheCurrentStatusOfSettlements_Teg_C1116() {
        try {
            Check.checkExit(driver.findElement(By.id("C1116")).getText(), "0", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_ReportOnTheCurrentStatusOfSettlements_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "Адрес расчетов: -", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_ReportOnTheCurrentStatusOfSettlements_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "1453527431053425", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_ReportOnTheCurrentStatusOfSettlements_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    //

    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_ReportOnTheCurrentStatusOfSettlements_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_ReportOnTheCurrentStatusOfSettlements_documentKktVersion() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(1)")).getText(), "21", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_ReportOnTheCurrentStatusOfSettlements_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(4) > a")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);

        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_ReportOnTheCurrentStatusOfSettlements_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Отчёт о текущем состоянии расчетов", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

}
