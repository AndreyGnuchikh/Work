package edosf.forms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CompleteForm {
    public static WebDriver driver;

    public static String SCHF(String ClickYesNoOrIP, WebDriver driver) throws InterruptedException {
        SimpleDateFormat  dateFormat = new SimpleDateFormat("d MMMM yyyy k mm ss");
        String date = dateFormat.format( new Date());
        driver.findElement(By.cssSelector("#numberSf")).sendKeys("SCHF " + date);
//        driver.findElement(By.cssSelector("#numbercorSf")).sendKeys("1");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#dateSf")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#dateSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
//        driver.findElement(By.cssSelector("#datecorSf")).click();
//        driver.findElement(By.cssSelector("#datecorSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        driver.findElement(By.cssSelector("#change_seller")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        //driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("г. Москва");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("Район Тверской");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("Красная площадь");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");
        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#sf_step > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        if(ClickYesNoOrIP.equals("IP")) {
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-formaction")).click();
            driver.findElement(By.cssSelector("#buyer-formaction > option:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Гнучих");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[contains(text(),'ИП Гнучих')]")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#buyer-persokpo")).sendKeys("1231231231");
            driver.findElement(By.cssSelector("#buyer-rusarea")).sendKeys("Район");
            driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("Населенный пункт");
            driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("Улица");
            driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
            driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
            driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
            driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        }else{
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Все хорошо 2,0");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(),'Все хорошо 2')]")).click();
            driver.findElement(By.cssSelector("#buyer-compokpo")).sendKeys("1231241251");
            driver.findElement(By.cssSelector("#buyer-rusindex")).sendKeys("140057");
            driver.findElement(By.cssSelector("#buyer-ruscity")).sendKeys("г. Санкт-Петербург");
            driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("г. Санкт-Петербург");
            driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("Адмиралтейский пр-д");
            driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
            driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
            driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
            driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        }
        //GoodsRecipient
        driver.findElement(By.cssSelector("#sf_step > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input.col-md-12")).sendKeys("555");
        String test = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        test = test.substring(256, 267);

        while (test.contains("\"")) {
            int length = test.length();
            test = test.substring(0, length-1);
        }

        System.out.println(test);
        Thread.sleep(3000);
        driver.findElement(By.id(test)).click();
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //new block
        driver.findElement(By.cssSelector(".row-pay-docs-input-sum > input:nth-child(1)")).sendKeys("1234567890123456789");
        driver.findElement(By.cssSelector("#idgoscontr")).sendKeys("1234567890123456789012345");
        //info
        driver.findElement(By.cssSelector("#change_gosbuyinfo")).click();
        driver.findElement(By.cssSelector("#gosConNumber")).sendKeys("12345678901234567890");
        driver.findElement(By.cssSelector("#gosConNumber-date")).click();
        driver.findElement(By.cssSelector("#gosConNumber-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#numberLS")).sendKeys("11111111111");
/*        driver.findElement(By.cssSelector("#budgetClassificationCode")).sendKeys("12345678901234567890");
        driver.findElement(By.cssSelector("#territorialFKName")).sendKeys("12345678901234567890");
        driver.findElement(By.cssSelector("#targetCode")).sendKeys("12345678901234567890");
        driver.findElement(By.cssSelector("#territorialFKCode")).sendKeys("1234");*/
        driver.findElement(By.cssSelector(".editing > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //2 Page#
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.row:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(500);
        //add
        driver.findElement(By.cssSelector("#interactiveTable-addButton")).click();

        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Характеристика/описание товара");
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("Артикул");
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("Sort");
/*
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys("1234515212");
*/
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("123451521212345152121234515");
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("123451521212345152121234512");

        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector(".error_border > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("12312312312312312412151251251");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(2000);
        if (!ClickYesNoOrIP.equals("NO")){
        driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
        driver.findElement(By.id("commentSF")).sendKeys("" + date);

        driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        }
        String test2 = "" + date;
        return test2;

    }
}

