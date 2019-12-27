package iitFirefox.User8077.SoapTest1;


import iitAdd.iit8077;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public class AddDocumentUPDUserASChFDop_Test4 extends iit8077 {
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
        cabinetId.addTextNode("718c47e2-c08a-43e6-88e9-6053750e7581");
        name.addTextNode("820СЧФDOP.xml");
        comment.addTextNode("" + date);
        orgName.addTextNode("Все хорошо 2,0");
        inn.addTextNode("1653001883");
        kpp.addTextNode("555555555");
        xml.addTextNode("PNCk0LDQudC7INCY0LTQpNCw0LnQuz0iIiDQktC10YDRgdCk0L7RgNC8PSI1LjAxIiDQktC10YDRgdCf0YDQvtCzPSI1LjAxIj4NCiAgPNCh0LLQo9GH0JTQvtC60J7QsdC+0YAg0JjQtNCe0YLQv9GAPSIiINCY0LTQn9C+0Ls9IiIgPg0KICAgIDzQodCy0J7QrdCU0J7RgtC/0YAg0J3QsNC40LzQntGA0LM9ItCe0J7QniAmcXVvdDvQmNCY0KImcXVvdDsiINCY0J3QndCu0Js9Ijc3MDg3MTMyNTkiINCY0LTQrdCU0J49IiIvPg0KICA8L9Ch0LLQo9GH0JTQvtC60J7QsdC+0YA+DQogIDzQlNC+0LrRg9C80LXQvdGCINCa0J3QlD0iMTExNTEzMSIg0KTRg9C90LrRhtC40Y89ItCh0KfQpNCU0J7QnyIg0J/QvtCk0LDQutGC0KXQlj0i0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0YLQs9GA0YPQt9C60LUg0YLQvtCy0LDRgNC+0LIgKNCy0YvQv9C+0LvQvdC10L3QuNC4INGA0LDQsdC+0YIpLCDQv9C10YDQtdC00LDRh9C1INC40LzRg9GJ0LXRgdGC0LLQtdC90L3Ri9GFINC/0YDQsNCyICjQtNC+0LrRg9C80LXQvdGCINC+0LEg0L7QutCw0LfQsNC90LjQuCDRg9GB0LvRg9CzKSIg0J3QsNC40LzQlNC+0LrQntC/0YA9ItCU0L7QutGD0LzQtdC90YIg0L7QsSDQvtGC0LPRgNGD0LfQutC1INGC0L7QstCw0YDQvtCyICjQstGL0L/QvtC70L3QtdC90LjQuCDRgNCw0LHQvtGCKSwg0L/QtdGA0LXQtNCw0YfQtSDQuNC80YPRidC10YHRgtCy0LXQvdC90YvRhSDQv9GA0LDQsiAo0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0LrQsNC30LDQvdC40Lgg0YPRgdC70YPQsykiINCU0LDRgtCw0JjQvdGE0J/RgD0iMTYuMDguMjAxOCIg0JLRgNC10LzQmNC90YTQn9GAPSIwOS4yOC4zMCIg0J3QsNC40LzQrdC60L7QvdCh0YPQsdCh0L7RgdGCPSLQntGC0LrRgNGL0YLQvtC1INCQ0LrRhtC40L7QvdC10YDQvdC+0LUg0J7QsdGJ0LXRgdGC0LLQviAmcXVvdDvQoNC+0YHRgdC40LnRgdC60LjQtSDQttC10LvQtdC30L3Ri9C1INC00L7RgNC+0LPQuCZxdW90OyIgPg0KICAgIDzQodCy0KHRh9Ck0LDQutGCINCd0L7QvNC10YDQodGH0KQ9IjEzLzMwMzItMiIg0JTQsNGC0LDQodGH0KQ9IjE5LjAxLjIwMTgiINCa0L7QtNCe0JrQkj0iNjQzIj4NCiAgICAgIDzQodCy0J/RgNC+0LQ+IA0KICAgICAgICA80JjQtNCh0LI+CgkJICAgICAgICAgIDzQodCy0K7Qm9Cj0Ycg0JrQn9CfPSI1NTU1NTU1NTUiINCY0J3QndCu0Js9IjE2NTMwMDE4ODMiINCd0LDQuNC80J7RgNCzPSLQktGB0LUg0YXQvtGA0L7RiNC+IDIsMCIvPg0KICAgICAgICAgICAgIA0KICAgICAgICA8L9CY0LTQodCyPg0KICAgICAgPC/QodCy0J/RgNC+0LQ+DQogICAgICA80KHQstCf0L7QutGD0L8+DQogICAgICAgIDzQmNC00KHQsj4NCgkJCQkgIDzQodCy0K7Qm9Cj0Ycg0JrQn9CfPSIxNTYxNTYxNjUiINCY0J3QndCu0Js9IjUwNDcwNzEwMjAiINCd0LDQuNC80J7RgNCzPSLQotC10YHRgiDQktGB0LUg0YXQvtGA0L7RiNC+Ii8+DQogICAgICAgIDwv0JjQtNCh0LI+DQogICAgICA8L9Ch0LLQn9C+0LrRg9C/Pg0KICAgIDwv0KHQstCh0YfQpNCw0LrRgj4NCiAgICA80KLQsNCx0LvQodGH0KTQsNC60YI+DQogICAgICA80KHQstC10LTQotC+0LIg0J3QvtC80KHRgtGAPSIxIiDQndCw0LjQvNCi0L7Qsj0i0J7RhNC+0YDQvNC70LXQvdC40LUg0YDQtdC60LvQsNC80LDRhtC40L7QvdC90L4t0L/RgNC10YLQtdC90LfQuNC+0L3QvdC+0Lkg0LTQvtC60YPQvNC10L3RgtCw0YbQuNC4IiDQntCa0JXQmF/QotC+0LI9Ijc5NiIg0JrQvtC70KLQvtCyPSIxIiDQptC10L3QsNCi0L7Qsj0iMTYyOC4wMCIg0KHRgtCi0L7QstCR0LXQt9Cd0JTQoT0iMTYyOC4wMCIg0J3QsNC70KHRgj0iMTglIiDQodGC0KLQvtCy0KPRh9Cd0LDQuz0iMTkyMS4wNCI+DQogICAgICAgIDzQkNC60YbQuNC3Pg0KICAgICAgICAgIDzQkdC10LfQkNC60YbQuNC3PtCx0LXQtyDQsNC60YbQuNC30LA8L9CR0LXQt9CQ0LrRhtC40Lc+DQogICAgICAgIDwv0JDQutGG0LjQtz4NCiAgICAgICAgPNCh0YPQvNCd0LDQuz4NCiAgICAgICAgICA80KHRg9C80J3QsNC7PjI5My4wNDwv0KHRg9C80J3QsNC7Pg0KICAgICAgICA8L9Ch0YPQvNCd0LDQuz4NCiAgICAgIDwv0KHQstC10LTQotC+0LI+DQogICAgICA80JLRgdC10LPQvtCe0L/QuyDQodGC0KLQvtCy0JHQtdC30J3QlNCh0JLRgdC10LPQvj0iMTYyOC4wMCIg0KHRgtCi0L7QstCj0YfQndCw0LvQktGB0LXQs9C+PSIxOTIxLjA0Ij4NCiAgICAgICAgPNCh0YPQvNCd0LDQu9CS0YHQtdCz0L4+DQogICAgICAgICAgPNCh0YPQvNCd0LDQuz4yOTMuMDQ8L9Ch0YPQvNCd0LDQuz4NCiAgICAgICAgPC/QodGD0LzQndCw0LvQktGB0LXQs9C+Pg0KICAgICAgICA80JrQvtC70J3QtdGC0YLQvtCS0YE+MDwv0JrQvtC70J3QtdGC0YLQvtCS0YE+DQogICAgICA8L9CS0YHQtdCz0L7QntC/0Ls+DQogICAgPC/QotCw0LHQu9Ch0YfQpNCw0LrRgj4NCiAgICA80KHQstCf0YDQvtC00J/QtdGAPg0KICAgIDzQodCy0J/QtdGAINCh0L7QtNCe0L/QtdGAPSLQnNGLLCDQvdC40LbQtdC/0L7QtNC/0LjRgdCw0LLRiNC40LXRgdGPLCDQv9GA0LXQtNGB0YLQsNCy0LjRgtC10LvRjCDQmNCh0J/QntCb0J3QmNCi0JXQm9CvINGBINC+0LTQvdC+0Lkg0YHRgtC+0YDQvtC90Ysg0Lgg0L/RgNC10LTRgdGC0LDQstC40YLQtdC70Ywg0JfQkNCa0JDQl9Cn0JjQmtCQINGBINC00YDRg9Cz0L7QuSDRgdGC0L7RgNC+0L3Riywg0YHQvtGB0YLQsNCy0LjQu9C4INC90LDRgdGC0L7Rj9GJ0LjQuSDQsNC60YIg0LIg0YLQvtC8LCDRh9GC0L4g0JjQodCf0J7Qm9Cd0JjQotCV0JvQrCDQstGL0L/QvtC70L3QuNC7LCDQsCDQl9CQ0JrQkNCX0KfQmNCaINC/0YDQuNC90Y/QuyDRgdC70LXQtNGD0Y7RidC40LUg0YDQsNCx0L7RgtGLICjRg9GB0LvRg9Cz0LgpIiDQlNCw0YLQsNCf0LXRgD0iMTkuMDEuMjAxOCI+DQogICAgICAgIDzQntGB0L3Qn9C10YAg0J3QsNC40LzQntGB0L09ItCU0L7Qs9C+0LLQvtGAIiDQlNCw0YLQsNCe0YHQvT0iMjIuMTEuMjAxNyIg0J3QvtC80J7RgdC9PSLQotCe0KAt0KbQlNCY0KbQki84My/QkNCeLdCU0JQv0JItNzYwLzE3Ii8+DQogICAgICA8L9Ch0LLQn9C10YA+DQogICAgPC/QodCy0J/RgNC+0LTQn9C10YA+DQogIDwv0JTQvtC60YPQvNC10L3Rgj4NCjwv0KTQsNC50Ls+");
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
