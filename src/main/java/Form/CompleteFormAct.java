package Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CompleteFormAct {
    public static WebDriver driver;

    public static String Act(String ClickYesNoOrIP,WebDriver driver) throws InterruptedException {
        SimpleDateFormat  dateFormat = new SimpleDateFormat("d MMMM yyyy k mm ss");
        String date = dateFormat.format( new Date());
        driver.findElement(By.cssSelector("#numberActEW")).sendKeys("Act " + date);
//        driver.findElement(By.cssSelector("#numbercorActEW")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateActEW")).click();
        driver.findElement(By.cssSelector("#dateActEW_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
//        driver.findElement(By.cssSelector("#datecorActEW")).click();
//        driver.findElement(By.cssSelector("#datecorActEW_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#change_seller")).click();
        Thread.sleep(500);
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
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        if(ClickYesNoOrIP.equals("IP")){
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-formaction")).click();
            driver.findElement(By.cssSelector("#buyer-formaction > option:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Г");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(),'Гнучих')]")).click();
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
        }else {
            driver.findElement(By.cssSelector("#change_buyer")).click();

            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Все хорошо 2,0");
            Thread.sleep(1500);
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
        Thread.sleep(500);
        //GoodsRecipient
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
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
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
        //add
        driver.findElement(By.cssSelector("#interactiveTable-addButton")).click();

        driver.findElement(By.cssSelector(".inputFormat-TOMPconstruct1-group")).sendKeys("Name " + date);

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("500");

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("12563115621536112563151621531");

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        //3 page
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Наименование документа");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Номер документа");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(2) > textarea:nth-child(1)")).sendKeys("Дополнительные сведения");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(4) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#interActEWdoc > div:nth-child(1) > div:nth-child(6) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("1");
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#delivery-info-additional")).sendKeys("Дополнительные сведения");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#itemTransfer-info")).sendKeys("Сведения о  передаче вещи");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#itemTransfer-date")).click();
        driver.findElement(By.cssSelector("div.acceptanceCert-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
        //Работник организации
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Фамилия");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Имя");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Отчество");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Должность");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Иные сведения");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(7) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Основание полномочий");
        driver.findElement(By.cssSelector("#shipment-info")).sendKeys("Сведения об отгрузке");
        driver.findElement(By.cssSelector("#shipment-type")).sendKeys("Вид операции");
        driver.findElement(By.cssSelector("#shipment-date")).click();
        driver.findElement(By.cssSelector("#shipment-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Связанный документ не заполненно.
/*        driver.findElement(By.cssSelector(".select2-container--focus > span:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("1.html");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(1) > option:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".inputFormat-docConnectDescriptions-group-optional")).sendKeys("Описание");*/
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(4500);
        if (!ClickYesNoOrIP.equals("NO")){
            driver.findElement(By.cssSelector(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)")).click();
            driver.findElement(By.id("commentActEW")).sendKeys("" + date);

            driver.findElement(By.cssSelector("#commentActEWModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(4000);
            driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector(".active-file > span:nth-child(2)")).click();
        }
        String test2 = "" + date;
        return test2;

    }
}

