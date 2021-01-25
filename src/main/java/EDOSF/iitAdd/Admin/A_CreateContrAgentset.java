package EDOSF.iitAdd.Admin;

import EDOSF.iitAdd.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.EnterAndExit;
import EDOSF.iitAdd.iit8077;
import EDOSF.methods.Check;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A_CreateContrAgentset extends iit8077{

    public WebDriver driver;
    public String NameContragenta;
    public String test;
    public String test2;
    public String test3;
    public java.util.Date date = new Date();

    @BeforeEach
    void setUp() throws InterruptedException {
        driver = Drivers.ff();
        driver.get(url);

    }

    @Test
    void A_CreateContragent_Test1() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        driver.findElement(By.id("selectRole")).click();
        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();

        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Check.Check("Новый контрагент был создан успешно", test, driver);
        driver.findElement(By.cssSelector("#contr-search")).sendKeys(NameContragenta);
        Thread.sleep(2000);
        test2 = driver.findElement(By.xpath("/html/body/div[15]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div[2]/table/tr/td[2]")).getText();
        Check.CheckExit(NameContragenta, test2, driver);
    } catch (Throwable e) {
        Cabinet.Catch(driver, e);
    }
}

    @Test
    void B_CreateContragentInn_Test2()  throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        driver.findElement(By.id("selectRole")).click();
        // first contract
        CreateContr();

        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");

        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        // second contract
        CreateContr();
        driver.findElement(By.cssSelector("#newcontr-inn")).sendKeys(test);
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        test2 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.CheckExit("Контрагент с такими реквизитами уже существует", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void C_CreateContragentServiceiden_Test3() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        driver.findElement(By.id("selectRole")).click();
        // first contract
        CreateContr();
        inn(driver);
        test2 = ("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys(test2);

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        test3 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.Check("Новый контрагент был создан успешно", test3, driver);
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        // second contract

        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys(test2);
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.CheckExit("Контрагент с таким идентификатором сервиса уже существует.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void D_CreateContragentGreateCabinet1_Test4() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        driver.findElement(By.id("selectRole")).click();
        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();
        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        driver.findElement(By.cssSelector("#contr-search")).sendKeys(NameContragenta);
        Thread.sleep(2000);
        HelpAdmin.MenuAdmin(5, "/html/body/div[15]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div[2]/table/tr/td[2]", driver);
        Thread.sleep(2000);
        test2 = driver.findElement(By.cssSelector("#cablist > li:nth-child(1)")).getText();
        Check.CheckExit("Кабинет 1", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void D_CreateContragentGreatePersonalManager_Test5() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        driver.findElement(By.id("selectRole")).click();
        CreateContr();
        driver.findElement(By.cssSelector("span.select2:nth-child(3)")).click();
        Thread.sleep(1000);
        List<WebElement> myElements = driver.findElements(By.cssSelector("#select2-newcontr-persman-results"));
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

        Check.CheckExit("Никита", map.get(2), driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }


    void contract(WebDriver driver, String adress, String key) {
        driver.findElement(By.cssSelector(adress)).sendKeys(key);
    }

    public int nextInt() {
        return (int) (Math.random() * (9000 - 50) + 50);
    }

    void CreateContr() {
        driver.findElement(By.xpath("/html/body/div[15]/div[1]/div[2]/div[1]/button")).click();
        driver.findElement(By.cssSelector("#newcontr-fullname")).sendKeys("Полное наименование " + date);
        NameContragenta = ("Полное наименование " + date);
        driver.findElement(By.cssSelector("#newcontr-shortname")).sendKeys("Краткое наименование " + date);
        contract(driver, "#newcontr-signname", "Должность и Иванов Владимир Владимирович");
        contract(driver, "#newcontr-address", "Большой Кисловский пер., 4 стр 1, Москва, 125009");

        contract(driver, "#newcontr-kpp", "784101001");
        contract(driver, "#newcontr-bankRS", "30101810400000000111");
        contract(driver, "#newcontr-bankName", "АО «НТЦ ФСК ЕЭС»");
        contract(driver, "#newcontr-bankBIK", "044525225");
        contract(driver, "#newcontr-bankKS", "30101810400000000222");
        contract(driver, "#newcontr-servicename", "Название сервиса");
        Cabinet.Up(driver);
        contract(driver, "#newcontr-edoiden", "Идентификатор участника ЭДО");

    }

    void inn(WebDriver driver) throws InterruptedException {
        test = ("" + nextInt() + nextInt() + nextInt());
        while (test.length() != 12) {
            test = ("" + nextInt() + nextInt() + nextInt());
        }
        driver.findElement(By.cssSelector("#newcontr-inn")).sendKeys(test);
    }
}