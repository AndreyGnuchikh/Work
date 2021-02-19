package OFD.stand;


import OFD.methods.*;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test1_loginAndLogout extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url,log1,pass1);
            login.start(driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_EnterCabinet(){
        try {
            Check.checkExit(Element.getNameElement("Выход",driver),"Выход",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_CheckNameFDTab(){
        try {

            Element.clickElementByName("Фискальные документы",driver);
            Check.checkExit(Element.getNameElement("Найти",driver),"Найти",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_CheckNameRequestsTab(){
        try {
            Element.clickElementByName("Заявки",driver);
            Check.checkExit(Element.getNameElement("Тип заявки",driver),"Тип заявки",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_CheckNameDocumentsTab(){
        try {
            Element.clickElementByName("Документы",driver);
            Thread.sleep(200);
            Check.checkExit(Element.getNameElement("Счета",driver),"Счета",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_CheckNameAnalyticTab(){
        try {

            Element.clickElementByName("Аналитика",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Check.checkExit(Element.getNameElement("Выручка",driver),"Выручка",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_CheckNameAnalytic_IncomeTab(){
        try {
            Element.clickElementByName("Аналитика",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Check.checkExit(Element.getNameElement("График",driver),"График",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_CheckNameAnalytic_ShiftsTab(){
        try {
            Element.clickElementByName("Аналитика",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Element.clickElementByName("Смены",driver);
            Check.checkExit(Element.getNameElement("Выбрать ККТ",driver),"Выбрать ККТ",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_CheckNameAnalytic_NDSTab(){
        try {
            Element.clickElementByName("Аналитика",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Element.clickElementByName("НДС",driver);
            Check.checkExit(Element.getNameElement("Вся ККТ",driver),"Вся ККТ",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_CheckNameMarking(){
        try {
            Element.clickElementByName("Маркировка",driver);
            Check.checkExit(Element.getNameElement("Товары",driver),"Товары",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_CheckNameOrganisation(){
        try {
            Element.clickElementByName("Организация",driver);
            Check.checkExit(Element.getNameElement("Подразделения",driver),"Подразделения",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_CheckNameUsers_User(){
        try {
            Element.clickElementByName("Пользователи",driver);
            Check.checkExit(Element.getNameElement("Добавить пользователя",driver),"Добавить пользователя",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_CheckName_GroupUsers(){
        try {
            Element.clickElementByName("Пользователи",driver);
            Element.clickElementByName("Группы пользователей",driver);
            Check.checkExit(Element.getNameElement("Создать группу",driver),"Создать группу",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_CheckName_OnlineRegisterKKT(){
        try {
            Element.clickElementByName("Онлайн регистрация ККТ",driver);
            Check.checkExit(Element.getNameElement(urlRegKKTToFNS,driver),urlRegKKTToFNS,driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_CheckName_Profile(){
        try {
            Element.clickElementByName("Профиль",driver);
            Check.checkExit(Element.getNameElement("Основная информация",driver),"Основная информация",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_Check_Exit(){
        try {
            Element.clickElementByName("Выход",driver);
            Check.checkExit(driver.getCurrentUrl(),url,driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
}
