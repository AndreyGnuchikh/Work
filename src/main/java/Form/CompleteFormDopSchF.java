package Form;

import methods.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CompleteFormDopSchF {
    public static WebDriver driver;

    public static String DopSchF(String ClickYesNoOrIP, WebDriver driver) throws InterruptedException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy k mm ss");
        String date = dateFormat.format( new Date());
        driver.findElement(By.cssSelector("#numberUPD")).sendKeys("DopSchF " + date);
//        driver.findElement(By.cssSelector("#numbercorUPD")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateUPD")).click();
        driver.findElement(By.cssSelector("#dateUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
//        Thread.sleep(500);
//        driver.findElement(By.cssSelector("#datecorUPD")).click();
//        driver.findElement(By.cssSelector("#datecorUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //Seller
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#change_seller")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        //driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("�. ������");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("����� ��������");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("������");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("������");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("������� �������");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");

        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
        if(ClickYesNoOrIP.equals("IP")) {
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-formaction")).click();
            driver.findElement(By.cssSelector("#buyer-formaction > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("������");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(),'������')]")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#buyer-persokpo")).sendKeys("1231231231");
            driver.findElement(By.cssSelector("#buyer-rusarea")).sendKeys("�����");
            driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("���������� �����");
            driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("�����");
            driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
            driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
            driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
            driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        }else{
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("��� ������ 2,0");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(),'��� ������ 2')]")).click();
            driver.findElement(By.cssSelector("#buyer-compokpo")).sendKeys("1231241251");
            driver.findElement(By.cssSelector("#buyer-rusindex")).sendKeys("140057");
            driver.findElement(By.cssSelector("#buyer-ruscity")).sendKeys("�. �����-���������");
            driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("�. �����-���������");
            driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("�������������� ��-�");
            driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
            driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
            driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
            driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        }
        //GoodsRecipient
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input.col-md-12")).sendKeys("555");
        String test = driver.findElement(By.cssSelector("div.input-group:nth-child(1)")).getAttribute("outerHTML");
        test = test.substring(256, 267);
        if (test.contains("\"")) {
            test = test.substring(0, 10);
        }
        if (test.contains("\"")) {
            test = test.substring(0, 9);
        }
        if (test.contains("\"")) {
            test = test.substring(0, 8);
        }
        System.out.println(test);
        Thread.sleep(1500);
        driver.findElement(By.id(test)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //2 Page#
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
        //add
        driver.findElement(By.cssSelector("#interactiveTable-addButton")).click();
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("12312312311421354112531156213");

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();

        //3 page
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("������������ ���������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("����� ���������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(2) > textarea:nth-child(1)")).sendKeys("�������������� ��������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(4) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.col-sm-5:nth-child(3) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("1");
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#delivery-info-additional")).sendKeys("�������������� ��������");
        driver.findElement(By.cssSelector("#itemTransfer-info")).sendKeys("�������� �  �������� ����");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#itemTransfer-date")).click();
        driver.findElement(By.cssSelector("#itemTransfer-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".edit_but")).click();
        //�������� �����������
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("�������");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���������");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���� ��������");
        driver.findElement(By.cssSelector("#recvInfo_worker > div:nth-child(7) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������� ����������");
        driver.findElement(By.cssSelector("#shipment-info")).sendKeys("�������� �� ��������");
        driver.findElement(By.cssSelector("#shipment-type")).sendKeys("��� ��������");
        driver.findElement(By.cssSelector("#shipment-date")).click();
        driver.findElement(By.cssSelector("#shipment-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //��������� �������� �� ����������.
/*        driver.findElement(By.cssSelector("#acceptanceCert-block > div:nth-child(2) > div:nth-child(8) > div > div.col-md-10.col-sm-10 > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("1.html");
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(1) > option:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".inputFormat-docConnectDescriptions-group-optional")).sendKeys("��������");*/

        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(4500);
        if (!ClickYesNoOrIP.equals("NO")){
        Element.WaitElementToBeClickableAndClick(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)",driver);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#commentUPD")).sendKeys("" + date);
        driver.findElement(By.cssSelector("#commentUPDModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(3000);
        }
        String test2 = "" + date;
        return test2;
    }
    public static String DopSchF_IP_3Page(Integer twoOrThree, WebDriver driver) throws InterruptedException {
        SimpleDateFormat  dateFormat = new SimpleDateFormat("d MMMM yyyy k mm ss");
        String date = dateFormat.format( new Date());
        driver.findElement(By.cssSelector("#numberUPD")).sendKeys("DopSchF " + date);
        //driver.findElement(By.cssSelector("#numbercorUPD")).sendKeys("1");
        driver.findElement(By.cssSelector("#dateUPD")).click();
        driver.findElement(By.cssSelector("#dateUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
      /*  driver.findElement(By.cssSelector("#datecorUPD")).click();
        driver.findElement(By.cssSelector("#datecorUPD_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
   */     //Seller
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#change_seller")).click();
        driver.findElement(By.cssSelector("#seller-compokpo")).sendKeys("1424512512");
        driver.findElement(By.cssSelector("#seller-rusindex")).sendKeys("140056");
        //driver.findElement(By.cssSelector("#seller-rusreg")).sendKeys("�. ������");
        driver.findElement(By.cssSelector("#seller-rusarea")).sendKeys("����� ��������");
        driver.findElement(By.cssSelector("#seller-ruscity")).sendKeys("������");
        driver.findElement(By.cssSelector("#seller-ruslocality")).sendKeys("������");
        driver.findElement(By.cssSelector("#seller-russtreet")).sendKeys("������� �������");
        driver.findElement(By.cssSelector("#seller-rushouse")).sendKeys("1");
        driver.findElement(By.cssSelector("#seller-rusbuild")).sendKeys("2");
        driver.findElement(By.cssSelector("#seller-rusflat")).sendKeys("2019");

        driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        //GoodsSender
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //Buyer
            driver.findElement(By.cssSelector("#change_buyer")).click();
            driver.findElement(By.cssSelector("#buyer-formaction")).click();
            driver.findElement(By.cssSelector("#buyer-formaction > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#buyer-block > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div.col-md-9.col-sm-9 > span > span.selection > span")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("������");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[contains(text(),'������')]")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg")).click();
            driver.findElement(By.cssSelector("#buyer-rusreg > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#buyer-persokpo")).sendKeys("1231231231");
            driver.findElement(By.cssSelector("#buyer-rusarea")).sendKeys("�����");
            driver.findElement(By.cssSelector("#buyer-ruslocality")).sendKeys("���������� �����");
            driver.findElement(By.cssSelector("#buyer-russtreet")).sendKeys("�����");
            driver.findElement(By.cssSelector("#buyer-rushouse")).sendKeys("3");
            driver.findElement(By.cssSelector("#buyer-rusbuild")).sendKeys("4");
            driver.findElement(By.cssSelector("#buyer-rusflat")).sendKeys("2020");
            driver.findElement(By.cssSelector(".editing > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();

        //GoodsRecipient
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
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
        Thread.sleep(1500);
        driver.findElement(By.id(test)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#" + test + "_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //2 Page#
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(4) > div:nth-child(10) > div:nth-child(3) > div:nth-child(1)")).click();
        //add
        driver.findElement(By.cssSelector("#interactiveTable-addButton")).click();
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Name " + date);

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)")).sendKeys("500");
        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")).sendKeys("12312312311421354112531156213");

        driver.findElement(By.cssSelector("div.infoblock:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#interUPDdoc > div:nth-child(1) > div:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1)")).click();

        //3 page
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("������������ ���������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("����� ���������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(2) > textarea:nth-child(1)")).sendKeys("�������������� ��������");
        driver.findElement(By.cssSelector("div.deliveryAcceptance-table-row:nth-child(2) > div:nth-child(2) > div:nth-child(4) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.col-sm-5:nth-child(3) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("1");
        driver.findElement(By.cssSelector("div.delivery-info-table-row:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".picker--opened > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#delivery-info-additional")).sendKeys("�������������� ��������");
        driver.findElement(By.cssSelector("#itemTransfer-info")).sendKeys("�������� �  �������� ����");
        driver.findElement(By.cssSelector("#itemTransfer-date")).click();
        driver.findElement(By.cssSelector(".edit_but")).click();
        //�������� �����������
        if(twoOrThree.equals(1)){
        driver.findElement(By.cssSelector("#receiverInfo_groupSelector_2")).click();
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("�������");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���������");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���� ��������");
        driver.findElement(By.cssSelector("#recvInfo_representative > div:nth-child(7) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������� ����������");
        driver.findElement(By.cssSelector("#shipment-info")).sendKeys("�������� �� ��������");
        driver.findElement(By.cssSelector("#shipment-type")).sendKeys("��� ��������");
        driver.findElement(By.cssSelector("#shipment-date")).click();
        driver.findElement(By.cssSelector("#shipment-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        //��������� �������� �� ����������.
/*        driver.findElement(By.cssSelector("#acceptanceCert-block > div:nth-child(2) > div:nth-child(8) > div > div.col-md-10.col-sm-10 > span > span.selection > span")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("1.html");
        driver.findElement(By.cssSelector("li.select2-results__option:nth-child(1) > option:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".inputFormat-docConnectDescriptions-group-optional")).sendKeys("��������");*/
        } if(twoOrThree.equals(2)){
            driver.findElement(By.cssSelector("#receiverInfo_groupSelector_3")).click();
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("�������");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")).sendKeys("���� ��������");
            driver.findElement(By.cssSelector("#recvInfo_individual > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)")).sendKeys("��������� ����������");
            driver.findElement(By.cssSelector("#shipment-info")).sendKeys("�������� �� ��������");
            driver.findElement(By.cssSelector("#shipment-type")).sendKeys("��� ��������");
            driver.findElement(By.cssSelector("#shipment-date")).click();
            driver.findElement(By.cssSelector("#shipment-date_root > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        }
        driver.findElement(By.cssSelector("div.col-md-9:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".list-group > a:nth-child(1) > li:nth-child(1) > span:nth-child(2)")).click();
        Thread.sleep(4500);
        Element.WaitElementToBeClickableAndClick(".list-group > a:nth-child(3) > li:nth-child(1) > span:nth-child(2)",driver);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#commentUPD")).sendKeys("" + date);
        driver.findElement(By.cssSelector("#commentUPDModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".modal-sm > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(3000);
        String test2 = "" + date;
        return test2;
    }

}
