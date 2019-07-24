package iitFirefox.login_8080;

import iitAdd.Drivers;
import iitAdd.Me;
import iitAdd.p;
import iitAdd.p8080;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class K_DownloadMaterial_Test11 {
    public WebDriver driver;
    public Boolean test;
    public String checking;
    @Before
    public void setUp() {

        driver = Drivers.ff();
        File dir = new File("C:\\Tools\\TestFile");
        Me.DeletedFiles(dir);
    }

    @Test
    public void A_TestDownloadFile_Test1() {
        driver.get(p8080.url10);
        //������� ����� � �����
        File dir = new File("C:\\Tools\\TestFile\\"); //path ��������� �� ����������
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
        driver.findElement(By.xpath("//*[contains(text(), '���������� ������������')]")).click();
        Me.Sleep(10000);
        // ����� ���� � �����.
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        String test = lst.get(0).toString();
        test = test.substring(18);
        Me.CheckExit("�����������_������������_�������_���_��.doc", test, driver);


    }

    @Test
    public void B_TestLink_Test2() {
        driver.get(p8080.url10);
        driver.findElement(By.xpath("//*[contains(text(), '����������� �� ����������� ������� ���������')]")).click();
        Me.Sleep(2000);
        checking = driver.findElement(By.xpath("/html/body/div/h1")).getText();
        System.out.println(checking);
        Me.CheckExit("��������� ��������� ��� Browser plug-in � Windows", checking, driver);

    }
}