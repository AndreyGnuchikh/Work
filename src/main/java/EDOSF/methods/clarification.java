package edosf.methods;

import edosf.settingsEdo.Iit8077;
import edosf.settingsEdo.Testedo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Clarification {
    public static void SetClarificationAndSign(WebDriver driver) throws InterruptedException {
        int num = driver.findElements(By.cssSelector("#sign-pretension-select-key > label > strong")).size();
        Thread.sleep(2000);
        Cabinet.ClickMenuFirstElement(13, driver);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pretension-text")).sendKeys("ClarificationFile");
        if (num>0) {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#pretension-modal-button")).click();
        }else {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#pretension-modal-button-text")).click();
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#ErrorOkMessageModal > div > div > div.modal-footer > button > span")).click();
        EnterAndExit.startEndingCertAndSendingFiles(driver);
        EnterAndExit.Exit(driver);
        String name = driver.getCurrentUrl();
        if(name.contains(Iit8077.URL)){
            EnterAndExit.loggingCerts(Iit8077.UPD, driver);
        }
        if(name.equals(Testedo.URL)){
            EnterAndExit.loggingCerts(Testedo.UPD, driver);
        }
        EnterAndExit.RoleSwitch(2,driver);
        Thread.sleep(2000);
        EnterAndExit.startEndingCertAndSendingFiles(driver);
    }
    public static String OpenOldFileAndSelectCorOrRevAndGetNewFile(int CorrectionOrRevised,String upd, WebDriver driver) throws InterruptedException {
        Cabinet.ClickMenuFirstElement(2, driver);
        Cabinet.Down(driver);
        Cabinet.Down(driver);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#docReviewModal-pretension-info-button-edit")).click();
        Thread.sleep(3000);
        if(CorrectionOrRevised==1){
            driver.findElement(By.cssSelector("#correctiveDoc")).click();
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(2000);
        if(upd=="1"){
            driver.findElement(By.cssSelector("#numberSf")).sendKeys("1");
            driver.findElement(By.cssSelector("#dateSf")).sendKeys("01.04.2021");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#dateSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        }
        if(upd=="2"){
            driver.findElement(By.cssSelector("#numberActEW")).sendKeys("2");
            driver.findElement(By.cssSelector("#dateActEW")).sendKeys("02.04.2021");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#dateActEW_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        }
        if(upd=="3"){
            driver.findElement(By.cssSelector("#numberUPD")).sendKeys("3");
            driver.findElement(By.cssSelector("#dateUPD")).sendKeys("03.04.2021");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#dateUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#commentUPDModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        }
        }else{
            driver.findElement(By.cssSelector("#revisedDoc")).click();
            driver.findElement(By.cssSelector("#create")).click();
            Thread.sleep(2000);
            if(upd=="1"){
                driver.findElement(By.cssSelector("#numbercorSf")).sendKeys("1");
                driver.findElement(By.cssSelector("#datecorSf")).sendKeys("01.04.2021");
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#datecorSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            }
            if(upd=="2"){
                driver.findElement(By.cssSelector("#numbercorActEW")).sendKeys("2");
                driver.findElement(By.cssSelector("#datecorActEW")).sendKeys("02.04.2021");
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#datecorActEW_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            }
            if(upd=="3"){
                driver.findElement(By.cssSelector("#numbercorUPD")).sendKeys("3");
                driver.findElement(By.cssSelector("#datecorUPD")).sendKeys("03.04.2021");
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("#datecorUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
                driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("#commentUPDModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        String row = driver.findElement(By.cssSelector("#grid-basic2 > div:nth-child(2) > div:nth-child(1)")).getAttribute("textContent");
        return row;
    }
}
