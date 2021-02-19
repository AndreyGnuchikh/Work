package OFD.stand;

import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test8_Receipt extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url, log2, pass2);
            login.start(driver);
            try {
                GetDateFD.getData("19.02.2021 15:29:00", "19.02.2021 15:30:00", "Кассовый чек", "19.02.2021 15:30", driver);
                Thread.sleep(500);
            } catch (Throwable throwable) {
                GetDateFD.getData("19.02.2021 15:29:00", "19.02.2021 15:30:00", "Кассовый чек", "19.02.2021 15:30", driver);
                Thread.sleep(500);
            }

        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_Receipt_Teg_C1018() {
        try {
            Check.checkExit(driver.findElement(By.id("C1018")).getText(), "2318023846", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_Receipt_Teg_C1048() {
        try {
            Check.checkExit(driver.findElement(By.id("C1048")).getText(), "ЗАО ТОРГОВЫЙ ОБЪЕКТ N1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_Receipt_Teg_C1000() {
        try {
            Check.checkExit(driver.findElement(By.id("C1000")).getText(), "Кассовый чек", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_Receipt_Teg_C1054() {
        try {
            Check.checkExit(driver.findElement(By.id("C1054")).getText(), "Приход", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_Receipt_Teg_C1077() {
        try {
            Check.checkExit(driver.findElement(By.id("C1077")).getText(), "1325752557", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_Receipt_Teg_C1040() {
        try {
            Check.checkExit(driver.findElement(By.id("C1040")).getText(), "16", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_Receipt_Teg_C1012() {
        try {
            Check.checkExit(driver.findElement(By.id("C1012")).getText(), "19.02.2021 15:30", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_Receipt_Teg_C1042() {
        try {
            Check.checkExit(driver.findElement(By.id("C1042")).getText(), "2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_Receipt_Teg_C1038() {
        try {
            Check.checkExit(driver.findElement(By.id("C1038")).getText(), "3", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_Receipt_Teg_C1021() {
        try {
            Check.checkExit(driver.findElement(By.id("C1021")).getText(), "СИСТ. АДМИН.", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_Receipt_Teg_C1203() {
        try {
            Check.checkExit(driver.findElement(By.id("C1203")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_Receipt_Teg_C1187() {
        try {
            Check.checkExit(driver.findElement(By.id("C1187")).getText(), "Торговый зал", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_Receipt_Teg_C1009() {
        try {
            Check.checkExit(driver.findElement(By.id("C1009")).getText(), "109097, Москва, ул. Лубянка, 10", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_Receipt_Teg_C1037() {
        try {
            Check.checkExit(driver.findElement(By.id("C1037")).getText(), "0000000044044953", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_Receipt_Teg_C1036() {
        try {
            Check.checkExit(driver.findElement(By.id("C1036")).getText(), "-", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(16)
    public void Test16_Receipt_Teg_C1041() {
        try {
            Check.checkExit(driver.findElement(By.id("C1041")).getText(), "9999078900007902", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(17)
    public void Test17_Receipt_Teg_C1055() {
        try {
            Check.checkExit(driver.findElement(By.id("C1055")).getText(), "УСН доход", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(18)
    public void Test18_Receipt_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1103")).getText(), "90.91", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(19)
    public void Test19_Receipt_Teg_C1020() {
        try {
            Check.checkExit(driver.findElement(By.id("C1020")).getText(), "1000.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(20)
    public void Test20_Receipt_Teg_C1215() {
        try {
            Check.checkExit(driver.findElement(By.id("C1215")).getText(), "0.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(21)
    public void Test21_Receipt_Teg_C1216() {
        try {
            Check.checkExit(driver.findElement(By.id("C1216")).getText(), "0.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(22)
    public void Test22_Receipt_Teg_C1217() {
        try {
            Check.checkExit(driver.findElement(By.id("C1216")).getText(), "0.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(23)
    public void Test23_Receipt_Teg_C1031() {
        try {
            Check.checkExit(driver.findElement(By.id("C1031")).getText(), "800.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(24)
    public void Test24_Receipt_Teg_C1081() {
        try {
            Check.checkExit(driver.findElement(By.id("C1081")).getText(), "200.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(25)
    public void Test25_Receipt_Teg_C1008() {
        try {
            Check.checkExit(driver.findElement(By.id("C1008")).getText(), "Электронный адрес покупателя: nixehe9756@botfed.com", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(26)
    public void Test26_Receipt_Teg_C1084() {
        try {
            Check.checkExit(driver.findElement(By.id("C1084")).getText(), "1: { \"webOrderNumber\":\"1234567890\", \"barcode\": 2770349001122660, \"loyaltyID\":\"12323456789\", \"objectId\":\"S025\",\"bonusCode\":\"MRM YK7 MUG8\", \"bonusAdded\":\"1234567.89\", \"bonusUsed\":\"1234567.89\"}", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(27)
    public void Test27_Receipt_Teg_C1057() {
        try {
            Check.checkExit(driver.findElement(By.id("C1057")).getText(), "ПОВЕРЕННЫЙ", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(28)
    public void Test28_Receipt_Teg_C1044() {
        try {
            Check.checkExit(driver.findElement(By.id("C1044")).getText(), "Опер плат агента", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(29)
    public void Test29_Receipt_Teg_C1073() {
        try {
            Check.checkExit(driver.findElement(By.id("C1073")).getText(), "+77777777772, +77777777772, +77777777772", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(30)
    public void Test30_Receipt_Teg_C1074() {
        try {
            Check.checkExit(driver.findElement(By.id("C1074")).getText(), "+77777777773, +77777777773, +77777777773", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(31)
    public void Test31_Receipt_Teg_C1026() {
        try {
            Check.checkExit(driver.findElement(By.id("C1026")).getText(), "Наим операт перевода", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(32)
    public void Test32_Receipt_Teg_C1016() {
        try {
            Check.checkExit(driver.findElement(By.id("C1016")).getText(), "1234567890", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(33)
    public void Test33_Receipt_Teg_C1005() {
        try {
            Check.checkExit(driver.findElement(By.id("C1005")).getText(), "Адр операт перевода", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(34)
    public void Test34_Receipt_Teg_C1075() {
        try {
            Check.checkExit(driver.findElement(By.id("C1075")).getText(), "+77777777779, +77777777779", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(35)
    public void Test35_Receipt_Teg_C1171() {
        try {
            Check.checkExit(driver.findElement(By.id("C1171")).getText(), "+77777777774, +77777777774, +77777777774, +77777777774", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(36)
    public void Test36_Receipt_Teg_C1209() {
        try {
            Check.checkExit(driver.findElement(By.id("C1209")).getText(), "1.05", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(37)
    public void Test37_Receipt_Teg_C1117() {
        try {
            Check.checkExit(driver.findElement(By.id("C1117")).getText(), "test2@test.com", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(38)
    public void Test38_Receipt_documentKktVersion() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div:nth-child(1) > span:nth-child(1)")).getText(), "3", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(39)
    public void Test39_Receipt_DescriptionFFD() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div:nth-child(1) > span:nth-child(4) > a")).getText(), "publication.pravo.gov.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);

        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(40)
    public void Test40_Receipt_SiteFNS() {
        try {
            Check.checkExit(driver.findElement(By.cssSelector("body > div > div > div.modal-scroll-area > div.row.footer > div.col-sm-6.text-right.sender_email_div > span:nth-child(3) > a")).getText(), "www.nalog.ru", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(41)
    public void Test41_Receipt_Item_Num() {
        try {

            Check.checkExit( getElement(0,0,driver),"1", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(42)
    public void Test42_Receipt_Item_SubjectAttribute() {
        try {

            Check.checkExit(getElement(0,1,driver),"Подакцизный товар", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(43)
    public void Test43_Receipt_Item_SubjectName() {
        try {

            Check.checkExit(getElement(0,2,driver),"Товар", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(44)
    public void Test44_Receipt_Item_Quantity() {
        try {

            Check.checkExit(getElement(0,3,driver),"2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(45)
    public void Test45_Receipt_Item_Price() {
        try {

            Check.checkExit(getElement(0,4,driver),"500.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(46)
    public void Test46_Receipt_Item_NDS() {
        try {

            Check.checkExit(getElement(0,5,driver),"НДС 10%", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(47)
    public void Test47_Receipt_Item_NumNDS() {
        try {

            Check.checkExit(getElement(0,6,driver),"90.91", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(48)
    public void Test48_Receipt_Item_MethodAttribute() {
        try {

            Check.checkExit(getElement(0,7,driver),"ПРЕДОПЛАТА 100%", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(49)
    public void Test49_Receipt_Item_Sum() {
        try {

            Check.checkExit(getElement(0,8,driver),"1000.00", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(50)
    public void Test50_Receipt_Item_MarkBox() {
        try {

            Check.checkExit(getElement(1,1,driver),"Код маркировки 444D 04607027768263 2\n" +
                    "Код товара RE0EMKhA68cy\n" +
                    "GTIN 04607027768263\n" +
                    "S/N 2", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(51)
    public void Test51_Receipt_Item_Agent() {
        try {
            driver.findElement(By.cssSelector(".ext-info")).click();
            Check.checkExit(getElement(2,1,driver),"Данные агента: АГЕНТ. Операция платежного агента: Опер плат агента. Телефон платежного агента: [+77777777772, +77777777772, +77777777772]. Телефон оператора по приему платежей: [+77777777773, +77777777773, +77777777773]. Наименование оператора перевода: Наим операт перевода. ИНН оператора перевода: 1234567890. Адрес оператора перевода: Адр операт перевода. Телефон оператора перевода: [+77777777779, +77777777779]. Наименование поставщика: Наим поставщика. ИНН поставщика: 1234567891. Телефон поставщика: [+77777777774, +77777777774, +77777777774, +77777777774].", driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    public static String  getElement(int NumRow,int NumElementArray,WebDriver driver){
        ArrayList<WebElement> GetFirstBlockElements =  (ArrayList<WebElement>) driver.findElements(By.className("noNeedRowBackground"));
        ArrayList<WebElement> getItemsElement = (ArrayList<WebElement>) GetFirstBlockElements.get(NumRow).findElements(By.tagName("td"));
        return getItemsElement.get(NumElementArray).getText();
    }
}
