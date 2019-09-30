package iitChrome.login;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.iit8077;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class K_DownloadMaterial_Test11 extends iit8077{
    public WebDriver driver;
    public Boolean test;
    public String checking;
     @BeforeEach
    void setUp() {

        driver = Drivers.chrome();
    }

    @Test
    void A_TestDownloadFile_Test1() {
        driver.get(url10);
        //Удалить файлы в папке
        File dir = new File("C:\\Tools\\TestFile\\"); //path указывает на директорию
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div[1]/div[3]/p[2]/a")).click();
        Me.Sleep(10000);
        // Взять файл в папке.
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        String test = lst.get(0).toString();
        test = test.substring(18);
        Me.CheckExit("Руководство_пользователя_Портала_ЭДО_СФ.doc", test, driver);


    }

    @Test
    void B_TestLink_Test2() {
        driver.get(url10);
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div[5]/div[3]/p[2]/a")).click();
        Me.Sleep(2000);
        checking = driver.findElement(By.xpath("/html/body/div/h1")).getText();
        System.out.println(checking);
        Me.CheckExit("Установка КриптоПро ЭЦП Browser plug-in в Windows", checking, driver);

    }
}