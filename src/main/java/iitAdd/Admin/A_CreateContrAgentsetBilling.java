package iitAdd.Admin;

import iitAdd.Drivers; 
import methods.Cabinet;
import methods.EnterAndExit;
import iitAdd.iit8077;
import methods.Check;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    void setUp() throws InterruptedException {
        driver = Drivers.ff();
        driver.get(url);

    }

    @Test
    void A_CreateContragent_Test1() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        EnterAndExit.RoleSwitch(4, driver);
        CreateContr();
        inn(driver);
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.xpath("//*[@id=\"addContragModal\"]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        test = driver.findElement(By.cssSelector(".resptext")).getText();

        driver.findElement(By.xpath("/html/body/div[14]/div/div/div[3]/button")).click();
        Check.Check("����� ���������� ��� ������ �������", test, driver);
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
        EnterAndExit.RoleSwitch(4, driver);
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
        Check.CheckExit("���������� � ������ ����������� ��� ����������", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void C_CreateContragentServiceiden_Test3() throws NoSuchElementException {
        try {
        EnterAndExit.LogPass(log1log, pass, driver);
        EnterAndExit.RoleSwitch(4, driver);
        // first contract
        CreateContr();
        inn(driver);
        test2 = ("0000" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-" + nextInt() + "-000000000000");
        driver.findElement(By.cssSelector("#newcontr-serviceiden")).sendKeys(test2);

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        test3 = driver.findElement(By.cssSelector(".resptext")).getText();
        Thread.sleep(1000);
        Check.Check("����� ���������� ��� ������ �������", test3, driver);
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
        Check.CheckExit("���������� � ����� ��������������� ������� ��� ����������.", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void D_CreateContragentGreateCabinet1_Test4() throws NoSuchElementException {
        try {

        EnterAndExit.LogPass(log1log, pass, driver);
        EnterAndExit.RoleSwitch(4, driver);
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
        Check.CheckExit("������� 1", test2, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @Test
    void D_CreateContragentGreatePersonalManager_Test5() throws NoSuchElementException {
        try {

            EnterAndExit.LogPass(log1log, pass, driver);
        EnterAndExit.RoleSwitch(4, driver);
        CreateContr();
        driver.findElement(By.cssSelector("span.select2:nth-child(3)")).click();
        Thread.sleep(1000);

        List<WebElement> myElements = driver.findElements(By.cssSelector("#newcontr-persman.Form-control.select2-hidden-accessible"));
        Map<Integer, String> map = new HashMap<Integer, String>();
        int i = 0;
        for (WebElement e : myElements) {
            System.out.println(e.getText());
            //split �������� ��� ��� ������� �� ���� ����������� \n
            String vals[] = e.getText().split("\\n");

            for (String s : vals) {
                i++;
                map.put(i, s);
            }
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Check.CheckExit("������� ���� ������������", map.get(2), driver);
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

    void CreateContr() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#contrag")).click();
        driver.findElement(By.cssSelector(".createDocument")).click();
        driver.findElement(By.cssSelector("#newcontr-fname")).sendKeys("������ ������������ " + date);
        NameContragenta = ("������ ������������ " + date);
        driver.findElement(By.cssSelector("#newcontr-sname")).sendKeys("������� ������������ " + date);
        contract(driver, "#newcontr-signname", "��������� � ������ �������� ������������");
        contract(driver, "#newcontr-address", "������� ���������� ���., 4 ��� 1, ������, 125009");

        contract(driver, "#newcontr-kpp", "784101001");
        contract(driver, "#newcontr-bankRS", "30101810400000000111");
        contract(driver, "#newcontr-bankName", "�� ���� ��� ��ѻ");
        contract(driver, "#newcontr-bankBIK", "044525225");
        contract(driver, "#newcontr-bankKS", "30101810400000000222");
        contract(driver, "#newcontr-servicename", "�������� �������");
        contract(driver, "#newcontr-edoiden", "������������� ��������� ���");

    }

    void inn(WebDriver driver) throws InterruptedException {
        test = ("" + nextInt() + nextInt() + nextInt());
        while (test.length() != 12) {
            test = ("" + nextInt() + nextInt() + nextInt());
        }
        driver.findElement(By.cssSelector("#newcontr-inn")).sendKeys(test);
    }
}