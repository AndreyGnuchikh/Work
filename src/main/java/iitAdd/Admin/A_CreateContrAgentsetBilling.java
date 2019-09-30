package iitAdd.Admin;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A_CreateContrAgentsetBilling extends iit8077{

    public WebDriver driver;
    public String NameContragenta;
    public String test;
    public String test2;
    public String test3;
    public Date date = new Date();

     @BeforeEach
    void setUp() {
        driver = Drivers.ff();
        driver.get(url);

    }

    @Test
    void A_CreateContragent_Test1() {

        Me.LogPass(log1log, pass, driver);
        Me.RoleSwitch(4, driver);
        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();

        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Me.Check("Новый контрагент был создан успешно", test, driver);
        driver.findElement(By.cssSelector("#contr-search")).sendKeys(NameContragenta);
        Me.Sleep(2000);
        test2 = driver.findElement(By.xpath("/html/body/div[15]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div[2]/table/tr/td[2]")).getText();
        Me.CheckExit(NameContragenta, test2, driver);
    }

    @Test
    void B_CreateContragentInn_Test2() {

        Me.LogPass(log1log, pass, driver);
        Me.RoleSwitch(4, driver);
        // first contract
        CreateContr();

        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");

        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Me.Sleep(1000);
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Me.Sleep(2000);
        // second contract
        CreateContr();
        driver.findElement(By.cssSelector("#newcontr-inn")).sendKeys(test);
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Me.Sleep(2000);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.CheckExit("Контрагент с такими реквизитами уже существует", test2, driver);
    }

    @Test
    void C_CreateContragentServiceiden_Test3() {

        Me.LogPass(log1log, pass, driver);
        Me.RoleSwitch(4, driver);
        // first contract
        CreateContr();
        inn(driver);
        test2 = ("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys(test2);

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button[1]")).click();
        Me.Sleep(1000);
        test3 = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.Check("Новый контрагент был создан успешно", test3, driver);
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Me.Sleep(1000);
        // second contract

        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys(test2);
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Me.Sleep(2000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();
        Me.Sleep(1000);
        Me.CheckExit("Контрагент с таким идентификатором сервиса уже существует.", test, driver);
    }

    @Test
    void D_CreateContragentGreateCabinet1_Test4() {

        Me.LogPass(log1log, pass, driver);
        Me.RoleSwitch(4, driver);
        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Me.Sleep(1000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        driver.findElement(By.cssSelector("#contr-search")).sendKeys(NameContragenta);
        Me.Sleep(2000);
        Me.MenuAdmin(5, "/html/body/div[15]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div[2]/table/tr/td[2]", driver);
        Me.Sleep(2000);
        test2 = driver.findElement(By.cssSelector("#cablist > li:nth-child(1)")).getText();
        Me.CheckExit("Кабинет 1", test2, driver);
    }

    @Test
    void D_CreateContragentGreatePersonalManager_Test5() {

        Me.LogPass(log1log, pass, driver);
        Me.RoleSwitch(4, driver);
        CreateContr();
        driver.findElement(By.cssSelector("span.select2:nth-child(3)")).click();
        Me.Sleep(1000);

        List<WebElement> myElements = driver.findElements(By.cssSelector("#newcontr-persman.Form-control.select2-hidden-accessible"));
        Map<Integer, String> map = new HashMap<Integer, String>();
        int i = 0;
        for (WebElement e : myElements) {
            System.out.println(e.getText());
            //split нарезает над Веб элемент на поля разделенные \n
            String vals[] = e.getText().split("\\n");

            for (String s : vals) {
                i++;
                map.put(i, s);
            }
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Me.CheckExit("Иванова Юлия Вячеславовна", map.get(2), driver);
    }


    void contract(WebDriver driver, String adress, String key) {
        driver.findElement(By.cssSelector(adress)).sendKeys(key);
    }

    public int nextInt() {
        return (int) (Math.random() * (9000 - 50) + 50);
    }

    void CreateContr() {
        Me.Sleep(3000);
        driver.findElement(By.cssSelector("#contrag")).click();
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("#newcontr-fname")).sendKeys("Полное наименование " + date);
        NameContragenta = ("Полное наименование " + date);
        driver.findElement(By.cssSelector("#newcontr-sname")).sendKeys("Краткое наименование " + date);
        contract(driver, "#newcontr-signname", "Должность и Иванов Владимир Владимирович");
        contract(driver, "#newcontr-address", "Большой Кисловский пер., 4 стр 1, Москва, 125009");

        contract(driver, "#newcontr-kpp", "784101001");
        contract(driver, "#newcontr-bankRS", "30101810400000000111");
        contract(driver, "#newcontr-bankName", "АО «НТЦ ФСК ЕЭС»");
        contract(driver, "#newcontr-bankBIK", "044525225");
        contract(driver, "#newcontr-bankKS", "30101810400000000222");
        contract(driver, "#newcontr-servicename", "Название сервиса");
        contract(driver, "#newcontr-edoiden", "Идентификатор участника ЭДО");

    }

    void inn(WebDriver driver) {
        test = ("" + nextInt() + nextInt() + nextInt());
        while (test.length() != 12) {
            test = ("" + nextInt() + nextInt() + nextInt());
        }
        driver.findElement(By.cssSelector("#newcontr-inn")).sendKeys(test);
    }
}