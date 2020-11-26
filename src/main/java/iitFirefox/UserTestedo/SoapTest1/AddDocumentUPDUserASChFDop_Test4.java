package iitFirefox.UserTestedo.SoapTest1;


import iitAdd.testedo;

import org.apache.xmlbeans.impl.soap.*;
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
        xml.addTextNode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIj8+DQo81ODp6yDI5NTg6es9Ik9OX05TQ0hGRE9QUFJfMkpIVDA3M18ySkhUMDc0XzIwMjAwODAzX2EzY2E0MTg3LWM5MjctNDNiMC04ZTQ0LThhNWZjMTkxMmQzNyIgwuXw8dTu8Ow9IjUuMDEiIMLl8PHP8O7jPSIxLjAiPgogICAgPNHi0/fE7urO4e7wIMjkzvLv8D0iMkpIVDA3NCIgyOTP7us9IjJKSFQwNzMiPgogICAgICAgIDzR4s7dxM7y7/AgzeDo7M7w4z0izs7OICZxdW90O8jI0iZxdW90OyIgyM3N3ss9Ijc3MDg3MTMyNTkiIMjk3cTOPSIySkgiLz4KICAgIDwv0eLT98Tu6s7h7vA+CiAgICA8xO7q8+zl7fIgys3EPSIxMTE1MTMxIiDU8+3q9uj/PSLR19TEzs8iIM3g6OzE7urO7/A9ItH35fIt9ODq8vPw4CDoIOTu6vPs5e3yIO7hIO7y4/Dz5+rlIPLu4uDw7uIgKOL77+7r7eXt6Ogg8ODh7vIpLCDv5fDl5OD35SDo7PP55fHy4uXt7fv1IO/w4OIgKOTu6vPs5e3yIO7hIO7q4Ofg7ejoIPPx6/PjKSIgxODy4Mjt9M/wPSIwMy4wOC4yMDIwIiDC8OXsyO30z/A9IjE1LjM5LjM2IiDN4Ojs3eru7dHz4dHu8fI9IsLx5SD17vDu+O4gMiwwIj4KICAgICAgICA80eLR99Tg6vIgze7s5fDR99Q9IjEiIMTg8uDR99Q9IjAzLjA4LjIwMjAiIMru5M7Kwj0iNjQzIj4KICAgICAgICAgICAgPMjx7/DR99QgxOX0ze7syPHv8NH31D0iLSIgxOX0xODy4Mjx7/DR99Q9Ii0iLz4KICAgICAgICAgICAgPNHiz/Du5D4KICAgICAgICAgICAgICAgIDzI5NHiPgogICAgICAgICAgICAgICAgICAgIDzR4t7L0/cgzeDo7M7w4z0iwvHlIPXu8O747iAyLDAiIMjNzd7LPSIxNjUzMDAxODgzIiDKz889IjU1NTU1NTU1NSIvPgogICAgICAgICAgICAgICAgPC/I5NHiPgogICAgICAgICAgICAgICAgPMDk8OXxPgogICAgICAgICAgICAgICAgICAgIDzA5PDQ1CDK7uTQ5ePo7u09IjgwIiDQ4Onu7T0i4iIvPgogICAgICAgICAgICAgICAgPC/A5PDl8T4KICAgICAgICAgICAgPC/R4s/w7uQ+CiAgICAgICAgICAgIDzR4s/u6vPvPgogICAgICAgICAgICAgICAgPMjk0eI+CiAgICAgICAgICAgICAgICAgICAgPNHi3svT9yDN4OjszvDjPSLS5fHyIMLx5SD17vDu+O4iIMjNzd7LPSI1MDQ3MDcxMDIwIiDKz889IjE1NjE1NjE2NSIvPgogICAgICAgICAgICAgICAgPC/I5NHiPgogICAgICAgICAgICAgICAgPMDk8OXxPgogICAgICAgICAgICAgICAgICAgIDzA5PDQ1CDK7uTQ5ePo7u09IjI4Ii8+CiAgICAgICAgICAgICAgICA8L8Dk8OXxPgogICAgICAgICAgICA8L9Hiz+7q8+8+CiAgICAgICAgPC/R4tH31ODq8j4KICAgICAgICA80uDh69H31ODq8j4KICAgICAgICAgICAgPNHi5eTS7uIgze7s0fLwPSIxIiDN4Ojs0u7iPSIxIiDE5fTOysXIX9Lu4j0iLSIg0fLS7uLB5efNxNE9IjEiIM3g69HyPSIyMCUiINHy0u7i0/fN4Os9IjEuMiI+CiAgICAgICAgICAgICAgICA8wOr26Oc+CiAgICAgICAgICAgICAgICAgICAgPMHl58Dq9ujnPuHl5yDg6vbo5+A8L8Hl58Dq9ujnPgogICAgICAgICAgICAgICAgPC/A6vbo5z4KICAgICAgICAgICAgICAgIDzR8+zN4Os+CiAgICAgICAgICAgICAgICAgICAgPNHz7M3g6z4wLjI8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDwv0fPszeDrPgogICAgICAgICAgICAgICAgPNHi0sQgxOX0yu7kz/Du6PH1PSItIiDN7uzl8NLEPSItIi8+CiAgICAgICAgICAgICAgICA8xO7v0eLl5NLu4i8+CiAgICAgICAgICAgIDwv0eLl5NLu4j4KICAgICAgICAgICAgPMLx5ePuzu/rINHy0u7iweXnzcTRwvHl4+49IjEiINHy0u7i0/fN4OvC8eXj7j0iMS4yIj4KICAgICAgICAgICAgICAgIDzR8+zN4OvC8eXj7j4KICAgICAgICAgICAgICAgICAgICA80fPszeDrPjAuMjwv0fPszeDrPgogICAgICAgICAgICAgICAgPC/R8+zN4OvC8eXj7j4KICAgICAgICAgICAgPC/C8eXj7s7v6z4KICAgICAgICA8L9Lg4evR99Tg6vI+CiAgICAgICAgPNHiz/Du5M/l8D4KICAgICAgICAgICAgPNHiz+XwINHu5M7v5fA9IjEiPgogICAgICAgICAgICAgICAgPM7x7c/l8CDN4OjszvHtPSIxIiDE4PLgzvHtPSIwMy4wOC4yMDIwIi8+CiAgICAgICAgICAgIDwv0eLP5fA+CiAgICAgICAgPC/R4s/w7uTP5fA+CiAgICAgICAgPM/u5O/o8eDt8iDO4evP7uvtPSIzIiDR8uDy8/E9IjEiIM7x7c/u6+09ImQiPgogICAgICAgICAgICA83ssgyM3N3ss9IjE2NTMwMDE4ODMiIM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIiDE7uvm7T0ixO7r5u3u8fL8IDIiPgogICAgICAgICAgICAgICAgPNTIziDU4Ozo6+j/PSLTz8QiIMjs/z0iMiIgzvL35fHy4u49IvPx6Ovl7e3g/yIvPgogICAgICAgICAgICA8L97LPgogICAgICAgIDwvz+7k7+jx4O3yPgogICAgPC/E7urz7OXt8j4KPC/U4OnrPg==");
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
