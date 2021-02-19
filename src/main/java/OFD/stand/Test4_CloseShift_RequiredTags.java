package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test4_CloseShift_RequiredTags extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log1, pass1);
            login.start(driver);
            try {
                GetDateFD.getData("25.01.2021 10:33:00", "25.01.2021 10:33:59", "Отчёт о закрытии смены","25.01.2021 10:33", driver);
            } catch (Throwable throwable) {
                GetDateFD.getData("25.01.2021 10:33:00", "25.01.2021 10:33:59", "Отчёт о закрытии смены","25.01.2021 10:33", driver);
            }
            Thread.sleep(500);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_CloseShift_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "1453527421", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_CloseShift_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "25.01.2021 10:33", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_CloseShift_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "1836495466", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_CloseShift_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "4", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_CloseShift_Teg_C1038() {
        try {
            Check.checkExit(driver.findElement(By.id("C1038")).getText(), "1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_CloseShift_Teg_C1021() {
        try {
            Check.checkExit(driver.findElement(By.id("C1021")).getText(), "СИСТ. АДМИН.", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_CloseShift_Teg_C1203() {
        try {
            Check.checkExit(driver.findElement(By.id("C1203")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_CloseShift_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "Адрес расчетов: -", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_CloseShift_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "0000054679047669", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_CloseShift_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_CloseShift_Teg_C1118() {
        try {
            Check.checkExit(driver.findElement(By.id("C1118")).getText(), "1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_CloseShift_Teg_C1111() {
        try {
            Check.checkExit(driver.findElement(By.id("C1111")).getText(), "3", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_CloseShift_Teg_C1097() {
        try {
            Check.checkExit(driver.findElement(By.id("C1097")).getText(), "2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_CloseShift_Teg_C1097() {
        try {
            Check.checkExit(driver.findElement(By.id("C1098")).getText(), "22.01.2021 18:41", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    //
    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_CloseShift_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(16)
    public void Test16_CloseShift_CodForm() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(1)")).getText(), "5", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(17)
    public void Test17_CloseShift_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(4) > a")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(18)
    public void Test18_CloseShift_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Отчёт о закрытии смены", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

}
