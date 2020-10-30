package iitFirefox.User8077.SoapTest1;


import iitAdd.iit8077;
import org.openqa.selenium.WebDriver;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public class AddDocumentUPDUserASChF_Test2 extends iit8077 {
    static String DocumentAddResult;

    public static String add(WebDriver driver) {

        String soapEndpointUrl = urlsoap;
        String soapAction = urlsoap;
        callSoapWebService(soapEndpointUrl, soapAction,driver);


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
        name.addTextNode("820СЧФ.xml");
        comment.addTextNode("" + date);
        orgName.addTextNode("Все хорошо 2,0");
        inn.addTextNode("1653001883");
        kpp.addTextNode("555555555");
        xml.addTextNode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIj8+DQo81ODp6yDI5NTg6es9Ik9OX05TQ0hGRE9QUFJfMkpINDQ0XzJKSDMzM18yMDIwMDMyN19jYTQ3ZmI2Zi0wODUxLTRmNWItYmU0MS0zM2EyYTA5MzcyNmMiIMLl8PHU7vDsPSI1LjAxIiDC5fDxz/Du4z0iMS4wIj4KICAgIDzR4tP3xO7qzuHu8CDI5M7y7/A9IjJKSDMzMyIgyOTP7us9IjJKSDQ0NCI+CiAgICAgICAgPNHizt3EzvLv8CDN4OjszvDjPSLOzs4gJnF1b3Q7yMjSJnF1b3Q7IiDIzc3eyz0iNzcwODcxMzI1OSIgyOTdxM49IjJKSCIvPgogICAgPC/R4tP3xO7qzuHu8D4KICAgIDzE7urz7OXt8iDKzcQ9IjExMTUxMzEiINTz7er26P89ItHX1CIgxODy4Mjt9M/wPSIyNy4wMy4yMDIwIiDC8OXsyO30z/A9IjE4LjU2LjA2IiDN4Ojs3eru7dHz4dHu8fI9IsLx5SD17vDu+O4gMiwwIj4KICAgICAgICA80eLR99Tg6vIgze7s5fDR99Q9IjEiIMTg8uDR99Q9IjExLjAzLjIwMjAiIMru5M7Kwj0iNjQzIj4KICAgICAgICAgICAgPMjx7/DR99QgxOX0ze7syPHv8NH31D0iLSIgxOX0xODy4Mjx7/DR99Q9Ii0iLz4KICAgICAgICAgICAgPNHiz/Du5D4KICAgICAgICAgICAgICAgIDzI5NHiPgogICAgICAgICAgICAgICAgICAgIDzR4t7L0/cgzeDo7M7w4z0iwvHlIPXu8O747iAyLDAiIMjNzd7LPSIxNjUzMDAxODgzIiDKz889IjU1NTU1NTU1NSIvPgogICAgICAgICAgICAgICAgPC/I5NHiPgogICAgICAgICAgICAgICAgPMDk8OXxPgogICAgICAgICAgICAgICAgICAgIDzA5PDQ1CDK7uTQ5ePo7u09IjgwIiDQ4Onu7T0i4iIvPgogICAgICAgICAgICAgICAgPC/A5PDl8T4KICAgICAgICAgICAgPC/R4s/w7uQ+CiAgICAgICAgICAgIDzR4s/u6vPvPgogICAgICAgICAgICAgICAgPMjk0eI+CiAgICAgICAgICAgICAgICAgICAgPNHi3svT9yDN4OjszvDjPSLS5fHyIMLx5SD17vDu+O4iIMjNzd7LPSI1MDQ3MDcxMDIwIiDKz889IjE1NjE1NjE2NSIvPgogICAgICAgICAgICAgICAgPC/I5NHiPgogICAgICAgICAgICAgICAgPMDk8OXxPgogICAgICAgICAgICAgICAgICAgIDzA5PDQ1CDK7uTQ5ePo7u09IjM3Ii8+CiAgICAgICAgICAgICAgICA8L8Dk8OXxPgogICAgICAgICAgICA8L9Hiz+7q8+8+CiAgICAgICAgPC/R4tH31ODq8j4KICAgICAgICA80uDh69H31ODq8j4KICAgICAgICAgICAgPNHi5eTS7uIgze7s0fLwPSIxIiDN4Ojs0u7iPSIxIiDE5fTOysXIX9Lu4j0iLSIg0fLS7uLB5efNxNE9IjEiIM3g69HyPSIyMCUiINHy0u7i0/fN4Os9IjEuMiI+CiAgICAgICAgICAgICAgICA8wOr26Oc+CiAgICAgICAgICAgICAgICAgICAgPMHl58Dq9ujnPuHl5yDg6vbo5+A8L8Hl58Dq9ujnPgogICAgICAgICAgICAgICAgPC/A6vbo5z4KICAgICAgICAgICAgICAgIDzR8+zN4Os+CiAgICAgICAgICAgICAgICAgICAgPNHz7M3g6z4wLjI8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDwv0fPszeDrPgogICAgICAgICAgICAgICAgPNHi0sQgxOX0yu7kz/Du6PH1PSItIiDN7uzl8NLEPSItIi8+CiAgICAgICAgICAgICAgICA8xO7v0eLl5NLu4i8+CiAgICAgICAgICAgIDwv0eLl5NLu4j4KICAgICAgICAgICAgPMLx5ePuzu/rINHy0u7iweXnzcTRwvHl4+49IjEiINHy0u7i0/fN4OvC8eXj7j0iMS4yIj4KICAgICAgICAgICAgICAgIDzR8+zN4OvC8eXj7j4KICAgICAgICAgICAgICAgICAgICA80fPszeDrPjAuMjwv0fPszeDrPgogICAgICAgICAgICAgICAgPC/R8+zN4OvC8eXj7j4KICAgICAgICAgICAgPC/C8eXj7s7v6z4KICAgICAgICA8L9Lg4evR99Tg6vI+CiAgICAgICAgPM/u5O/o8eDt8iDO4evP7uvtPSIzIiDR8uDy8/E9IjEiIM7x7c/u6+09ImQiPgogICAgICAgICAgICA83ssgyM3N3ss9IjE2NTMwMDE4ODMiIM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIiDE7uvm7T0ixO7r5u3u8fL8Ij4KICAgICAgICAgICAgICAgIDzUyM4g1ODs6Ovo/z0i08/EIiDI7P89IjIiIM7y9+Xx8uLuPSIo4zIwMTIpIi8+CiAgICAgICAgICAgIDwv3ss+CiAgICAgICAgPC/P7uTv6PHg7fI+CiAgICA8L8Tu6vPs5e3yPgo8L9Tg6es+");
    }

    private static String callSoapWebService(String soapEndpointUrl, String soapAction,WebDriver driver) {
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
            driver.quit();
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
