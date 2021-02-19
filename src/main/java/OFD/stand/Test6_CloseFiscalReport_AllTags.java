package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test6_CloseFiscalReport_AllTags extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log1, pass1);
            login.start(driver);
            try {
                GetDateFD.getData("20.07.2020 17:22:00", "20.07.2020 17:22:59", "Отчёт о закрытии фискального накопителя","20.07.2020 17:22", driver);
            } catch (Throwable throwable) {
                GetDateFD.getData("20.07.2020 17:22:00", "20.07.2020 17:22:59", "Отчёт о закрытии фискального накопителя","20.07.2020 17:22", driver);
            }
            Thread.sleep(500);

        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_CloseFiscalReport_Teg_C1048() {
        try {
            Check.checkExit(driver.findElement(By.id("C1048")).getText(), "Пользователь", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);

        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_CloseFiscalReport_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "1453527421", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_CloseFiscalReport_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "3609924377", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_CloseFiscalReport_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "8", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_CloseFiscalReport_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "20.07.2020 17:22", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_CloseFiscalReport_Teg_C1038() {
        try {
            Check.checkExit(driver.findElement(By.id("C1038")).getText(), "1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_CloseFiscalReport_Teg_C1021() {
        try {
            Check.checkExit(driver.findElement(By.id("C1021")).getText(), "СИСТ. АДМИН.", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_CloseFiscalReport_Teg_C1203() {
        try {
            Check.checkExit(driver.findElement(By.id("C1203")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_CloseFiscalReport_Teg_C1187() {
        try {
            Check.checkExit(driver.findElement(By.id("C1187")).getText(), "Торговый зал", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_CloseFiscalReport_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "Ямало-Ненецкий АО, г Новый Уренгой, Восточный мкр, д 2 к 2в", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_CloseFiscalReport_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "1453527431053425", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_CloseFiscalReport_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    //

    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_CloseFiscalReport_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_CloseFiscalReport_documentKktVersion() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(1)")).getText(), "6", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_CloseFiscalReport_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div > span:nth-child(4) > a")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);

        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(16)
    public void Test16_CloseFiscalReport_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Отчёт о закрытии фискального накопителя", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

}
