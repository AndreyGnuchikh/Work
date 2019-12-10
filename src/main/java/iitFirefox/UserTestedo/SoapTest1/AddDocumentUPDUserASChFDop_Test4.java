package iitFirefox.UserTestedo.SoapTest1;


import iitAdd.testedo;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public class AddDocumentUPDUserASChFDop_Test4 extends testedo {
    static String DocumentAddResult;

    public static String add() {

        String soapEndpointUrl = urlsoap;
        String soapAction = urlsoap;
        callSoapWebService(soapEndpointUrl, soapAction);


        return DocumentAddResult;
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        Date date = new Date();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String tem = "tem";
        String temURI = "http://tempuri.org/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(tem, temURI);

            /*
     <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tem="http://tempuri.org/">
   <soapenv:Header/>
   <soapenv:Body>
      <tem:DocumentAdd>
         <tem:serviceId>00000000-0000-0000-0000-000000000059</tem:serviceId>
        <tem:cabinetId>02cfa741-4b64-45cc-a5fa-c0964a9c0335</tem:cabinetId>
         <tem:name>ЭД с сервиса.xml</tem:name>
         <tem:comment>10.10.2018 тест</tem:comment>
  <tem:data>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA</tem:data>
      </tem:DocumentAdd>
   </soapenv:Body>
</soapenv:Envelope>
            */

        // SOAP Body Смотреть на вложенность. Если элементы вложенные то их надо вкладывать в другой элемент.
        SOAPBody soapBody = envelope.getBody();
        SOAPElement CreateUPDseller = soapBody.addChildElement("CreateUPDseller", tem);
        SOAPElement serviceId = CreateUPDseller.addChildElement("serviceId", tem);
        SOAPElement cabinetId = CreateUPDseller.addChildElement("cabinetId", tem);
        SOAPElement name = CreateUPDseller.addChildElement("name", tem);
        SOAPElement comment = CreateUPDseller.addChildElement("comment", tem);
        SOAPElement orgName = CreateUPDseller.addChildElement("orgName", tem);
        SOAPElement inn = CreateUPDseller.addChildElement("inn", tem);
        SOAPElement kpp = CreateUPDseller.addChildElement("kpp", tem);
        SOAPElement xml = CreateUPDseller.addChildElement("xml", tem);
        serviceId.addTextNode("00000000-0000-0000-0000-000000000060");
        // Изменяем только кабинет для testedo
        cabinetId.addTextNode("34e39aa3-a1d9-4cbe-8823-caeab4d79073");
        name.addTextNode("oldСЧФDOP.xml");
        comment.addTextNode("" + date);
        orgName.addTextNode("Все хорошо 2,0");
        inn.addTextNode("1653001883");
        kpp.addTextNode("555555555");
        xml.addTextNode("PNCk0LDQudC7INCY0LTQpNCw0LnQuz0iIiDQktC10YDRgdCk0L7RgNC8PSI1LjAxIiDQktC10YDRgdCf0YDQvtCzPSI1LjAxIj4NCiAgPNCh0LLQo9GH0JTQvtC60J7QsdC+0YAg0JjQtNCe0YLQv9GAPSIiINCY0LTQn9C+0Ls9IiIgPg0KICAgIDzQodCy0J7QrdCU0J7RgtC/0YAg0J3QsNC40LzQntGA0LM9ItCe0J7QniAmcXVvdDvQmNCY0KImcXVvdDsiINCY0J3QndCu0Js9Ijc3MDg3MTMyNTkiINCY0LTQrdCU0J49IiIvPg0KICA8L9Ch0LLQo9GH0JTQvtC60J7QsdC+0YA+DQogIDzQlNC+0LrRg9C80LXQvdGCINCa0J3QlD0iMTExNTEyNSIg0KTRg9C90LrRhtC40Y89ItCh0KfQpNCU0J7QnyIg0J/QvtCk0LDQutGC0KXQlj0i0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0YLQs9GA0YPQt9C60LUg0YLQvtCy0LDRgNC+0LIgKNCy0YvQv9C+0LvQvdC10L3QuNC4INGA0LDQsdC+0YIpLCDQv9C10YDQtdC00LDRh9C1INC40LzRg9GJ0LXRgdGC0LLQtdC90L3Ri9GFINC/0YDQsNCyICjQtNC+0LrRg9C80LXQvdGCINC+0LEg0L7QutCw0LfQsNC90LjQuCDRg9GB0LvRg9CzKSIg0J3QsNC40LzQlNC+0LrQntC/0YA9ItCU0L7QutGD0LzQtdC90YIg0L7QsSDQvtGC0LPRgNGD0LfQutC1INGC0L7QstCw0YDQvtCyICjQstGL0L/QvtC70L3QtdC90LjQuCDRgNCw0LHQvtGCKSwg0L/QtdGA0LXQtNCw0YfQtSDQuNC80YPRidC10YHRgtCy0LXQvdC90YvRhSDQv9GA0LDQsiAo0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0LrQsNC30LDQvdC40Lgg0YPRgdC70YPQsykiINCU0LDRgtCw0JjQvdGE0J/RgD0iMTYuMDguMjAxOCIg0JLRgNC10LzQmNC90YTQn9GAPSIwOS4yOC4zMCIg0J3QsNC40LzQrdC60L7QvdCh0YPQsdCh0L7RgdGCPSLQntGC0LrRgNGL0YLQvtC1INCQ0LrRhtC40L7QvdC10YDQvdC+0LUg0J7QsdGJ0LXRgdGC0LLQviAmcXVvdDvQoNC+0YHRgdC40LnRgdC60LjQtSDQttC10LvQtdC30L3Ri9C1INC00L7RgNC+0LPQuCZxdW90OyIgPg0KICAgIDzQodCy0KHRh9Ck0LDQutGCINCd0L7QvNC10YDQodGH0KQ9IjEzLzMwMzItMiIg0JTQsNGC0LDQodGH0KQ9IjE5LjAxLjIwMTgiINCa0L7QtNCe0JrQkj0iNjQzIj4NCiAgICAgIDzQodCy0J/RgNC+0LQ+DQogICAgICAgIDzQmNC00KHQsj4KCQkgICAgICAgICAgPNCh0LLQrtCb0KPRhyDQmtCf0J89IjU1NTU1NTU1NSIg0JjQndCd0K7Qmz0iMTY1MzAwMTg4MyIg0J3QsNC40LzQntGA0LM9ItCS0YHQtSDRhdC+0YDQvtGI0L4gMiwwIi8+DQogICAgICAgICAgICAgDQogICAgICAgIDwv0JjQtNCh0LI+DQogICAgICA8L9Ch0LLQn9GA0L7QtD4NCiAgICAgIDzQodCy0J/QvtC60YPQvz4NCiAgICAgICAgPNCY0LTQodCyPg0KCQkJCSAgPNCh0LLQrtCb0KPRhyDQmtCf0J89IjE1NjE1NjE2NSIg0JjQndCd0K7Qmz0iNTA0NzA3MTAyMCIg0J3QsNC40LzQntGA0LM9ItCi0LXRgdGCINCS0YHQtSDRhdC+0YDQvtGI0L4iLz4NCiAgICAgICAgPC/QmNC00KHQsj4NCiAgICAgIDwv0KHQstCf0L7QutGD0L8+DQogICAgPC/QodCy0KHRh9Ck0LDQutGCPg0KICAgIDzQotCw0LHQu9Ch0YfQpNCw0LrRgj4NCiAgICAgIDzQodCy0LXQtNCi0L7QsiDQndC+0LzQodGC0YA9IjEiINCd0LDQuNC80KLQvtCyPSLQntGE0L7RgNC80LvQtdC90LjQtSDRgNC10LrQu9Cw0LzQsNGG0LjQvtC90L3Qvi3Qv9GA0LXRgtC10L3Qt9C40L7QvdC90L7QuSDQtNC+0LrRg9C80LXQvdGC0LDRhtC40LgiINCe0JrQldCYX9Ci0L7Qsj0iNzk2IiDQmtC+0LvQotC+0LI9IjEiINCm0LXQvdCw0KLQvtCyPSIxNjI4LjAwIiDQodGC0KLQvtCy0JHQtdC30J3QlNChPSIxNjI4LjAwIiDQndCw0LvQodGCPSIxOCUiINCh0YLQotC+0LLQo9GH0J3QsNC7PSIxOTIxLjA0Ij4NCiAgICAgICAgPNCQ0LrRhtC40Lc+DQogICAgICAgICAgPNCR0LXQt9CQ0LrRhtC40Lc+0LHQtdC3INCw0LrRhtC40LfQsDwv0JHQtdC30JDQutGG0LjQtz4NCiAgICAgICAgPC/QkNC60YbQuNC3Pg0KICAgICAgICA80KHRg9C80J3QsNC7Pg0KICAgICAgICAgIDzQodGD0LzQndCw0Ls+MjkzLjA0PC/QodGD0LzQndCw0Ls+DQogICAgICAgIDwv0KHRg9C80J3QsNC7Pg0KICAgICAgPC/QodCy0LXQtNCi0L7Qsj4NCiAgICAgIDzQktGB0LXQs9C+0J7Qv9C7INCh0YLQotC+0LLQkdC10LfQndCU0KHQktGB0LXQs9C+PSIxNjI4LjAwIiDQodGC0KLQvtCy0KPRh9Cd0LDQu9CS0YHQtdCz0L49IjE5MjEuMDQiPg0KICAgICAgICA80KHRg9C80J3QsNC70JLRgdC10LPQvj4NCiAgICAgICAgICA80KHRg9C80J3QsNC7PjI5My4wNDwv0KHRg9C80J3QsNC7Pg0KICAgICAgICA8L9Ch0YPQvNCd0LDQu9CS0YHQtdCz0L4+DQogICAgICAgIDzQndC10YLRgtC+0JLRgT4wPC/QndC10YLRgtC+0JLRgT4NCiAgICAgIDwv0JLRgdC10LPQvtCe0L/Quz4NCiAgICA8L9Ci0LDQsdC70KHRh9Ck0LDQutGCPg0KICAgIDzQodCy0J/RgNC+0LTQn9C10YA+DQogICAgICA80KHQstCf0LXRgCDQodC+0LTQntC/0LXRgD0i0JzRiywg0L3QuNC20LXQv9C+0LTQv9C40YHQsNCy0YjQuNC10YHRjywg0L/RgNC10LTRgdGC0LDQstC40YLQtdC70Ywg0JjQodCf0J7Qm9Cd0JjQotCV0JvQryDRgSDQvtC00L3QvtC5INGB0YLQvtGA0L7QvdGLINC4INC/0YDQtdC00YHRgtCw0LLQuNGC0LXQu9GMINCX0JDQmtCQ0JfQp9CY0JrQkCDRgSDQtNGA0YPQs9C+0Lkg0YHRgtC+0YDQvtC90YssINGB0L7RgdGC0LDQstC40LvQuCDQvdCw0YHRgtC+0Y/RidC40Lkg0LDQutGCINCyINGC0L7QvCwg0YfRgtC+INCY0KHQn9Ce0JvQndCY0KLQldCb0Kwg0LLRi9C/0L7Qu9C90LjQuywg0LAg0JfQkNCa0JDQl9Cn0JjQmiDQv9GA0LjQvdGP0Lsg0YHQu9C10LTRg9GO0YnQuNC1INGA0LDQsdC+0YLRiyAo0YPRgdC70YPQs9C4KSIg0JTQsNGC0LDQn9C10YA9IjE5LjAxLjIwMTgiPg0KICAgICAgICA80J7RgdC90J/QtdGAINCd0LDQuNC80J7RgdC9PSLQlNC+0LPQvtCy0L7RgCIg0JTQsNGC0LDQntGB0L09IjIyLjExLjIwMTciINCd0L7QvNCe0YHQvT0i0KLQntCgLdCm0JTQmNCm0JIvODMv0JDQni3QlNCUL9CSLTc2MC8xNyIvPg0KICAgICAgPC/QodCy0J/QtdGAPg0KICAgIDwv0KHQstCf0YDQvtC00J/QtdGAPg0KICA8L9CU0L7QutGD0LzQtdC90YI+DQo8L9Ck0LDQudC7Pg");
    }

    private static String callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            // Добавляем наш ответ в строку.
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            soapResponse.writeTo(outputStream);
            DocumentAddResult = new String(outputStream.toByteArray());
            System.out.println(DocumentAddResult);
            // Вывод строки
            DocumentAddResult = DocumentAddResult.substring(216, 252);
            System.out.println(DocumentAddResult);
            soapConnection.close();

        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
        return DocumentAddResult;
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");
        return soapMessage;
    }

}
