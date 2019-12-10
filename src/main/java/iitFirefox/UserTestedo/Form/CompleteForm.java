package iitFirefox.UserTestedo.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;


public class CompleteForm {
    public static WebDriver driver;

    public static String SCHF(WebDriver driver) throws InterruptedException {
        Date date = new Date();
        driver.findElement(By.cssSelector("#numberSf")).sendKeys("SCHF " + date);
        driver.findElement(By.cssSelector("#numbercorSf")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateSf")).click();
        driver.findElement(By.cssSelector("#dateSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#datecorSf")).click();
        driver.findElement(By.cssSelector("#datecorSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("г. Москва");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("Район Тверской");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("Красная площадь");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Бамба Лео");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[contains(text(),'Бамба Лео')]")).click();
        driver.findElement(By.cssSelector("#buyer-compokpo")).sendKeys("1231241251");
        driver.findElement(By.cssSelector("#buyer-rusindex")).sendKeys("140057");
        driver.findElement(By.cssSelector("#buyer-ruscity")).sendKeys("г. Санкт-Петербург");
        driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("г. Санкт-Петербург");
        driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("Адмиралтейский пр-д");
        driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
        driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
        driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsRecipient
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input.col-md-12")).sendKeys("555");
        String test = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        test = test.substring(256, 267);
        if (test.contains("\"")) {
            test = test.substring(0, 10);
        }
        if (test.contains("\"")) {
            test = test.substring(0, 9);
        }

        System.out.println(test);
        Thread.sleep(500);
        driver.findElement(By.id(test)).click();
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //2 Page#
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.row:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(500);
        //add
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);
        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();

        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(6)")).click();

        driver.findElement(By.cssSelector("input.count")).sendKeys("500");
        driver.findElement(By.cssSelector("input.price")).sendKeys("500");

        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(5) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("#select2-const-country-results > li:nth-child(6) > option")).click();
        driver.findElement(By.cssSelector("div.col-sm-4:nth-child(3) > input:nth-child(1)")).sendKeys("100500");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1)")).click();
        driver.findElement(By.id("commentSF")).sendKeys("" + date);
        driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        String test2 = "" + date;
        return test2;
    }

    public static String SCHFIP(WebDriver driver) throws InterruptedException {
        Date date = new Date();
        driver.findElement(By.cssSelector("#numberSf")).sendKeys("SCHFIP " + date);
        driver.findElement(By.cssSelector("#numbercorSf")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateSf")).click();
        driver.findElement(By.cssSelector("#dateSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#datecorSf")).click();
        driver.findElement(By.cssSelector("#datecorSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("г. Москва");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("Район Тверской");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("Красная площадь");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
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
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsRecipient
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input.col-md-12")).sendKeys("555");
        String test = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        test = test.substring(256, 267);
        if (test.contains("\"")) {
            test = test.substring(0, 10);
        }
        if (test.contains("\"")) {
            test = test.substring(0, 9);
        }

        System.out.println(test);
        Thread.sleep(500);
        driver.findElement(By.id(test)).click();
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //2 Page#
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.row:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(500);
        //add
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);
        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();

        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(6)")).click();

        driver.findElement(By.cssSelector("input.count")).sendKeys("500");
        driver.findElement(By.cssSelector("input.price")).sendKeys("500");

        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(5) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("#select2-const-country-results > li:nth-child(6) > option")).click();
        driver.findElement(By.cssSelector("div.col-sm-4:nth-child(3) > input:nth-child(1)")).sendKeys("100500");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1)")).click();
        driver.findElement(By.id("commentSF")).sendKeys("" + date);
        driver.findElement(By.cssSelector("#commentSFModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        String test2 = "" + date;
        return test2;
    }

    public static String SCHFNoClick(WebDriver driver) throws InterruptedException {
        Date date = new Date();
        driver.findElement(By.cssSelector("#numberSf")).sendKeys("SCHFNoClick " + date);
        driver.findElement(By.cssSelector("#numbercorSf")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateSf")).click();
        driver.findElement(By.cssSelector("#dateSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#datecorSf")).click();
        driver.findElement(By.cssSelector("#datecorSf_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("г. Москва");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("Район Тверской");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("Москва");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("Красная площадь");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Все хорошо 2,0");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[contains(text(),'Все хорошо 2,0')]")).click();
        driver.findElement(By.cssSelector("#buyer-compokpo")).sendKeys("1231241251");
        driver.findElement(By.cssSelector("#buyer-rusindex")).sendKeys("140057");

        driver.findElement(By.cssSelector("#buyer-ruscity")).sendKeys("г. Санкт-Петербург");
        driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("г. Санкт-Петербург");
        driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("Адмиралтейский пр-д");
        driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
        driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
        driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsRecipient
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input.col-md-12")).sendKeys("555");
        String test = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        test = test.substring(256, 267);
        if (test.contains("\"")) {
            test = test.substring(0, 10);
        }
        if (test.contains("\"")) {
            test = test.substring(0, 9);
        }

        System.out.println(test);
        Thread.sleep(500);
        driver.findElement(By.id(test)).click();
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //2 Page#
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.row:nth-child(8) > div:nth-child(3) > div:nth-child(1)")).click();
        Thread.sleep(500);
        //add
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);
        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();

        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(6)")).click();

        driver.findElement(By.cssSelector("input.count")).sendKeys("500");
        driver.findElement(By.cssSelector("input.price")).sendKeys("500");

        driver.findElement(By.cssSelector("#interSFdoc > div > div:nth-child(5) > div:nth-child(4) > div > div > div:nth-child(1) > div > div > div > div:nth-child(5) > div.wide_col.flex-center > div:nth-child(1) > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("в");
        driver.findElement(By.cssSelector("#select2-const-country-results > li:nth-child(6) > option")).click();
        driver.findElement(By.cssSelector("div.col-sm-4:nth-child(3) > input:nth-child(1)")).sendKeys("100500");
        driver.findElement(By.cssSelector("#interSFdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1)")).click();

        String test2 = "" + date;
        return test2;
    }
}

