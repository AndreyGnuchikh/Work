package OFD.stand;


import OFD.methods.Catch;
import OFD.methods.Check;
import OFD.methods.Element;
import OFD.methods.Login;
import OFD.ofdAdd.Drivers;
import OFD.ofdAdd.OfdStand;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A_loginAndLogout_test1 extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url,log1,pass1);
            login.Start(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(1)
    public void A_EnterCabinet_Test1(){
        try {
            Check.CheckExit(Element.GetElementByName("Выход",driver),"Выход",driver);
        } catch (Throwable e) {
            Catch.Catch(driver,e);
        }
    }
    @Test
    @Order(2)
    public void B_CheckNameFDTab_Test2(){
        try {
            Element.ClickElementByName("Фискальные документы",driver);
            Check.CheckExit(Element.GetElementByName("Найти",driver),"Найти",driver);
        } catch (Throwable e) {
            Catch.Catch(driver,e);
        }
    }
    @Test
    @Order(3)
    public void C_CheckNameRequestsTab_Test3(){
        try {
            Element.ClickElementByName("Заявки",driver);
            Check.CheckExit(Element.GetElementByName("Тип заявки",driver),"Тип заявки",driver);
        } catch (Throwable e) {
            Catch.Catch(driver,e);
        }
    }
    @Test
    @Order(4)
    public void D_CheckNameDocumentsTab_Test4(){
        try {
            Element.ClickElementByName("Документы",driver);
            Check.CheckExit(Element.GetElementByName("Счета",driver),"Счета",driver);
        } catch (Throwable e) {
            Catch.Catch(driver,e);
        }
    }
}
