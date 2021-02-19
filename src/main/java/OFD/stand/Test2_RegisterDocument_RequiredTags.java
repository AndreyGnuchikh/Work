package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test2_RegisterDocument_RequiredTags extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() throws InterruptedException {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log1, pass1);
            login.start(driver);
            Thread.sleep(200);
            try {
                GetDateFD.getData("27.01.2021 10:00:00", "27.01.2021 23:59:59", "Отчёт о регистрации", "27.01.2021 12:36", driver);
            } catch (Throwable throwable) {
                GetDateFD.getData("27.01.2021 10:00:00", "27.01.2021 23:59:59", "Отчёт о регистрации", "27.01.2021 12:36", driver);
            }
            Thread.sleep(500);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }

    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_RegisterDocument_Teg_C1048() {
        try {
            Check.checkExit(driver.findElement(By.id("C1048")).getText(), "ЗАО ТОРГОВЫЙ ОБЪЕКТ N1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_RegisterDocument_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "1453527421", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_RegisterDocument_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "3179314280", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_RegisterDocument_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_RegisterDocument_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "27.01.2021 12:36", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_RegisterDocument_Teg_C1021() {
        try {
            Check.checkExit(driver.findElement(By.id("C1021")).getText(), "Директор Иванов П.М.", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_RegisterDocument_Teg_C1203() {
        try {
            Check.checkExit(driver.findElement(By.id("C1203")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_RegisterDocument_Teg_C1187() {
        try {
            Check.checkExit(driver.findElement(By.id("C1187")).getText(), "Торговый зал", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_RegisterDocument_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "109097, Москва, ул. Ильинка, 9", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_RegisterDocument_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "0000054680023737", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_RegisterDocument_Teg_C1056() {
        try {
            Check.checkExit(driver.findElement(By.id("C1056")).getText(), "ШФД: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_RegisterDocument_Teg_C1056() {
        try {
            Check.checkExit(driver.findElement(By.id("C1002")).getText(), "Автономн. режим: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_RegisterDocument_Teg_C1013() {
        try {
            Check.checkExit(driver.findElement(By.id("C1013")).getText(), "0639610004045160", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_RegisterDocument_Teg_C1188() {
        try {
            Check.checkExit(driver.findElement(By.id("C1188")).getText(), "001", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_RegisterDocument_Teg_C1189() {
        try {
            Check.checkExit(driver.findElement(By.id("C1189")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(16)
    public void Test16_RegisterDocument_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(17)
    public void Test17_RegisterDocument_Teg_C1062() {
        try {
            Check.checkExit(driver.findElement(By.id("C1062")).getText(), "ОСН", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(18)
    public void Test18_RegisterDocument_Teg_C1001() {
        try {
            Check.checkExit(driver.findElement(By.id("C1001")).getText(), "Автомат. режим: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(19)
    public void Test19_RegisterDocument_Teg_C1036() {
        try {
            Check.checkExit(driver.findElement(By.id("C1036")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(20)
    public void Test20_RegisterDocument_Teg_C1221() {
        try {
            Check.checkExit(driver.findElement(By.id("C1221")).getText(), "Принтер в автомате: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(21)
    public void Test21_RegisterDocument_Teg_C1057() {
        try {
            Check.checkExit(driver.findElement(By.id("C1057")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(22)
    public void Test22_RegisterDocument_Teg_C1108() {
        try {
            Check.checkExit(driver.findElement(By.id("C1108")).getText(), "ККТ для Интернет: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(23)
    public void Test23_RegisterDocument_Teg_C1110() {
        try {
            Check.checkExit(driver.findElement(By.id("C1110")).getText(), "АС БСО: Нет", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(24)
    public void Test24_RegisterDocument_Teg_C1117() {
        try {
            Check.checkExit(driver.findElement(By.id("C1117")).getText(), "example@example.org", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(25)
    public void Test25_RegisterDocument_Teg_C1046() {
        try {
            Check.checkExit(driver.findElement(By.id("C1046")).getText(), "ООО \"Ярус\" (\"ОФД-Я\")", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(26)
    public void Test26_RegisterDocument_Teg_C1017() {
        try {
            Check.checkExit(driver.findElement(By.id("C1017")).getText(), "7728699517", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(27)
    public void Test27_RegisterDocument_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(28)
    public void Test28_RegisterDocument_documentKktVersion() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector(".footer > div:nth-child(1) > span:nth-child(1)")).getText(), "1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(29)
    public void Test29_RegisterDocument_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector(".footer > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > a:nth-child(1)")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);

        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(30)
    public void Test30_RegisterDocument_SiteFNS() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector(".\\31 060 > a:nth-child(1)")).getText(), "www.nalog.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(31)
    public void Test31_RegisterDocument_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Отчёт о регистрации", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

}
