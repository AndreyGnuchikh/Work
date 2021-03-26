package EDOSF.iitFirefox.login8077;

import EDOSF.SettingsEDOSF.Drivers;
import EDOSF.methods.Cabinet;
import EDOSF.methods.HelpUser;
import EDOSF.SettingsEDOSF.iit8077;
import EDOSF.methods.Check;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static EDOSF.methods.Path.GetPathTools;
import static EDOSF.SettingsEDOSF.Settings.NUM_FAIL;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class K_DownloadMaterial_Test11 extends iit8077 {
    public WebDriver driver;
    public Boolean test;
    public String checking;

    public static File dir;


    @BeforeEach
    void setUp() {
        try {
            driver = Drivers.ff();
            String path = GetPathTools();
            path = path.concat("TestFile");
            dir = new File(path);
            HelpUser.DeletedFiles(dir);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(1)
    void A_TestDownloadFile_Test1() {
        try {
            driver.get(url10);
            //������� ����� � �����
            driver.findElement(By.xpath("//*[contains(text(), '����������� ������������')]")).click();
            Thread.sleep(22000);
            // ����� ���� � �����.
            File[] arrFiles = dir.listFiles();
            List<File> lst = Arrays.asList(arrFiles);
            String test = lst.get(0).toString();
            Check.CheckingContainsExit("�����������_������������_�������_���_��.doc", test, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }

    @RetryingTest(NUM_FAIL)
    @Order(2)
    void B_TestLink_Test2() {
        try {
            driver.get(url10);
            driver.findElement(By.xpath("//*[contains(text(), '����������� �� ����������� ������� ���������')]")).click();
            Thread.sleep(2000);
            checking = driver.findElement(By.xpath("/html/body/div/h1")).getText();
            Check.CheckingContainsExit("��������� ��������� ��� Browser plug-in � Windows", checking, driver);
        } catch (Throwable e) {
            Cabinet.Catch(driver, e);
        }
    }
}