package iitFirefox.User.SoapTest1;


import iitAdd.iit8077;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public class AddDocumentUPDUserASChF_Test5 extends iit8077 {
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
        serviceId.addTextNode("00000000-0000-0000-0000-000000000059");
        cabinetId.addTextNode("0f95391c-1129-459b-a7d9-1af8f80df38d");
        name.addTextNode("oldСЧФ.xml");
        comment.addTextNode("" + date);
        orgName.addTextNode("Тест Все хорошо");
        inn.addTextNode("1561561651");
        kpp.addTextNode("156156165");
        xml.addTextNode("PNCk0LDQudC7INCY0LTQpNCw0LnQuz0iIiDQktC10YDRgdCk0L7RgNC8PSI1LjAxIiDQktC10YDRgdCf0YDQvtCzPSI1LjAxIj4NCiAgPNCh0LLQo9GH0JTQvtC60J7QsdC+0YAg0JjQtNCe0YLQv9GAPSIiINCY0LTQn9C+0Ls9IiIgPg0KICAgIDzQodCy0J7QrdCU0J7RgtC/0YAg0J3QsNC40LzQntGA0LM9ItCe0J7QniAmcXVvdDvQmNCY0KImcXVvdDsiINCY0J3QndCu0Js9Ijc3MDg3MTMyNTkiINCY0LTQrdCU0J49IiIvPg0KICA8L9Ch0LLQo9GH0JTQvtC60J7QsdC+0YA+DQogIDzQlNC+0LrRg9C80LXQvdGCINCa0J3QlD0iMTExNTEzMSIg0KTRg9C90LrRhtC40Y89ItCh0KfQpCIg0J/QvtCk0LDQutGC0KXQlj0i0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0YLQs9GA0YPQt9C60LUg0YLQvtCy0LDRgNC+0LIgKNCy0YvQv9C+0LvQvdC10L3QuNC4INGA0LDQsdC+0YIpLCDQv9C10YDQtdC00LDRh9C1INC40LzRg9GJ0LXRgdGC0LLQtdC90L3Ri9GFINC/0YDQsNCyICjQtNC+0LrRg9C80LXQvdGCINC+0LEg0L7QutCw0LfQsNC90LjQuCDRg9GB0LvRg9CzKSIg0J3QsNC40LzQlNC+0LrQntC/0YA9ItCU0L7QutGD0LzQtdC90YIg0L7QsSDQvtGC0LPRgNGD0LfQutC1INGC0L7QstCw0YDQvtCyICjQstGL0L/QvtC70L3QtdC90LjQuCDRgNCw0LHQvtGCKSwg0L/QtdGA0LXQtNCw0YfQtSDQuNC80YPRidC10YHRgtCy0LXQvdC90YvRhSDQv9GA0LDQsiAo0JTQvtC60YPQvNC10L3RgiDQvtCxINC+0LrQsNC30LDQvdC40Lgg0YPRgdC70YPQsykiINCU0LDRgtCw0JjQvdGE0J/RgD0iMTYuMDguMjAxOCIg0JLRgNC10LzQmNC90YTQn9GAPSIwOS4yOC4zMCIg0J3QsNC40LzQrdC60L7QvdCh0YPQsdCh0L7RgdGCPSLQntGC0LrRgNGL0YLQvtC1INCQ0LrRhtC40L7QvdC10YDQvdC+0LUg0J7QsdGJ0LXRgdGC0LLQviAmcXVvdDvQoNC+0YHRgdC40LnRgdC60LjQtSDQttC10LvQtdC30L3Ri9C1INC00L7RgNC+0LPQuCZxdW90OyIgPg0KICAgIDzQodCy0KHRh9Ck0LDQutGCINCd0L7QvNC10YDQodGH0KQ9IjEzLzMwMzItMiIg0JTQsNGC0LDQodGH0KQ9IjE5LjAxLjIwMTgiINCa0L7QtNCe0JrQkj0iNjQzIj4NCiAgICAgIDzQodCy0J/RgNC+0LQ+DQogICAgICAgIDzQmNC00KHQsj4NCiAgICAgICAgICAgICAgPNCh0LLQrtCb0KPRhyDQmtCf0J89IjE1NjE1NjE2NSIg0JjQndCd0K7Qmz0iMTU2MTU2MTY1MSIg0J3QsNC40LzQntGA0LM9ItCi0LXRgdGCINCS0YHQtSDRhdC+0YDQvtGI0L4iLz4NCiAgICAgICAgPC/QmNC00KHQsj4NCiAgICAgIDwv0KHQstCf0YDQvtC0Pg0KICAgICAgPNCh0LLQn9C+0LrRg9C/Pg0KICAgICAgICA80JjQtNCh0LI+DQoJCTzQodCy0K7Qm9Cj0Ycg0JrQn9CfPSI1NTU1NTU1NTUiINCY0J3QndCu0Js9IjU1NTU1NTU1NTUiINCd0LDQuNC80J7RgNCzPSLQktGB0LUg0YXQvtGA0L7RiNC+IDIsMCIvPg0KICAgICAgICA8L9CY0LTQodCyPg0KICAgICAgPC/QodCy0J/QvtC60YPQvz4NCiAgICA8L9Ch0LLQodGH0KTQsNC60YI+DQogICAgPNCi0LDQsdC70KHRh9Ck0LDQutGCPg0KICAgICAgPNCh0LLQtdC00KLQvtCyINCd0L7QvNCh0YLRgD0iMSIg0J3QsNC40LzQotC+0LI9ItCe0YTQvtGA0LzQu9C10L3QuNC1INGA0LXQutC70LDQvNCw0YbQuNC+0L3QvdC+LdC/0YDQtdGC0LXQvdC30LjQvtC90L3QvtC5INC00L7QutGD0LzQtdC90YLQsNGG0LjQuCIg0J7QmtCV0Jhf0KLQvtCyPSI3OTYiINCa0L7Qu9Ci0L7Qsj0iMSIg0KbQtdC90LDQotC+0LI9IjE2MjguMDAiINCh0YLQotC+0LLQkdC10LfQndCU0KE9IjE2MjguMDAiINCd0LDQu9Ch0YI9IjE4JSIg0KHRgtCi0L7QstCj0YfQndCw0Ls9IjE5MjEuMDQiPg0KICAgICAgICA80JDQutGG0LjQtz4NCiAgICAgICAgICA80JHQtdC30JDQutGG0LjQtz7QsdC10Lcg0LDQutGG0LjQt9CwPC/QkdC10LfQkNC60YbQuNC3Pg0KICAgICAgICA8L9CQ0LrRhtC40Lc+DQogICAgICAgIDzQodGD0LzQndCw0Ls+DQogICAgICAgICAgPNCh0YPQvNCd0LDQuz4yOTMuMDQ8L9Ch0YPQvNCd0LDQuz4NCiAgICAgICAgPC/QodGD0LzQndCw0Ls+DQogICAgICA8L9Ch0LLQtdC00KLQvtCyPg0KICAgICAgPNCS0YHQtdCz0L7QntC/0Lsg0KHRgtCi0L7QstCR0LXQt9Cd0JTQodCS0YHQtdCz0L49IjE2MjguMDAiINCh0YLQotC+0LLQo9GH0J3QsNC70JLRgdC10LPQvj0iMTkyMS4wNCI+DQogICAgICAgIDzQodGD0LzQndCw0LvQktGB0LXQs9C+Pg0KICAgICAgICAgIDzQodGD0LzQndCw0Ls+MjkzLjA0PC/QodGD0LzQndCw0Ls+DQogICAgICAgIDwv0KHRg9C80J3QsNC70JLRgdC10LPQvj4NCiAgICAgICAgPNCa0L7Qu9Cd0LXRgtGC0L7QktGBPjA8L9Ca0L7Qu9Cd0LXRgtGC0L7QktGBPg0KICAgICAgPC/QktGB0LXQs9C+0J7Qv9C7Pg0KICAgIDwv0KLQsNCx0LvQodGH0KTQsNC60YI+DQogICAgPNCh0LLQn9GA0L7QtNCf0LXRgD4NCiAgICAgIDzQodCy0J/QtdGAINCh0L7QtNCe0L/QtdGAPSLQnNGLLCDQvdC40LbQtdC/0L7QtNC/0LjRgdCw0LLRiNC40LXRgdGPLCDQv9GA0LXQtNGB0YLQsNCy0LjRgtC10LvRjCDQmNCh0J/QntCb0J3QmNCi0JXQm9CvINGBINC+0LTQvdC+0Lkg0YHRgtC+0YDQvtC90Ysg0Lgg0L/RgNC10LTRgdGC0LDQstC40YLQtdC70Ywg0JfQkNCa0JDQl9Cn0JjQmtCQINGBINC00YDRg9Cz0L7QuSDRgdGC0L7RgNC+0L3Riywg0YHQvtGB0YLQsNCy0LjQu9C4INC90LDRgdGC0L7Rj9GJ0LjQuSDQsNC60YIg0LIg0YLQvtC8LCDRh9GC0L4g0JjQodCf0J7Qm9Cd0JjQotCV0JvQrCDQstGL0L/QvtC70L3QuNC7LCDQsCDQl9CQ0JrQkNCX0KfQmNCaINC/0YDQuNC90Y/QuyDRgdC70LXQtNGD0Y7RidC40LUg0YDQsNCx0L7RgtGLICjRg9GB0LvRg9Cz0LgpIiDQlNCw0YLQsNCf0LXRgD0iMTkuMDEuMjAxOCI+DQogICAgICAgIDzQntGB0L3Qn9C10YAg0J3QsNC40LzQntGB0L09ItCU0L7Qs9C+0LLQvtGAIiDQlNCw0YLQsNCe0YHQvT0iMjIuMTEuMjAxNyIg0J3QvtC80J7RgdC9PSLQotCe0KAt0KbQlNCY0KbQki84My/QkNCeLdCU0JQv0JItNzYwLzE3Ii8+DQogICAgICA8L9Ch0LLQn9C10YA+DQogICAgPC/QodCy0J/RgNC+0LTQn9C10YA+DQogIDwv0JTQvtC60YPQvNC10L3Rgj4NCjwv0KTQsNC50Ls+");
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
