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
        xml.addTextNode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIiBzdGFuZGFsb25lPSJ5ZXMiPz4NCjzU4OnrIMjk1ODp6z0iIiDC5fDx1O7w7D0iNS4wMSIgwuXw8c/w7uM9IjUuMDEiPg0KICA80eLT98Tu6s7h7vAgyOTO8u/wPSIiIMjkz+7rPSIiID4NCiAgICA80eLO3cTO8u/wIM3g6OzO8OM9Is7OziAmcXVvdDvIyNImcXVvdDsiIMjNzd7LPSI3NzA4NzEzMjU5IiDI5N3Ezj0iIi8+DQogIDwv0eLT98Tu6s7h7vA+DQogIDzE7urz7OXt8iDKzcQ9IjExMTUxMzEiINTz7er26P89ItHX1MTOzyIgz+7U4Ory1cY9IsTu6vPs5e3yIO7hIO7y4/Dz5+rlIPLu4uDw7uIgKOL77+7r7eXt6Ogg8ODh7vIpLCDv5fDl5OD35SDo7PP55fHy4uXt7fv1IO/w4OIgKOTu6vPs5e3yIO7hIO7q4Ofg7ejoIPPx6/PjKSIgzeDo7MTu6s7v8D0ixO7q8+zl7fIg7uEg7vLj8PPn6uUg8u7i4PDu4iAo4vvv7uvt5e3o6CDw4OHu8iksIO/l8OXk4PflIOjs8/nl8fLi5e3t+/Ug7/Dg4iAoxO7q8+zl7fIg7uEg7urg5+Dt6Ogg8/Hr8+MpIiDE4PLgyO30z/A9IjE2LjA4LjIwMTgiIMLw5ezI7fTP8D0iMDkuMjguMzAiIM3g6Ozd6u7t0fPh0e7x8j0izvLq8Pvy7uUgwOr26O7t5fDt7uUgzuH55fHy4u4gJnF1b3Q70O7x8ejp8ero5SDm5evl5+375SDk7vDu4+gmcXVvdDsiID4NCiAgICA80eLR99Tg6vIgze7s5fDR99Q9IjEzLzMwMzItMiIgxODy4NH31D0iMTkuMDEuMjAxOCIgyu7kzsrCPSI2NDMiPg0KICAgICAgPNHiz/Du5D4NCiAgICAgICAgPMjk0eI+DQoJCSAgPNHi3svT9yDKz889IjU1NTU1NTU1NSIgyM3N3ss9IjE2NTMwMDE4ODMiIM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIi8+DQogICAgICAgICAgICANCiAgICAgICAgPC/I5NHiPg0KICAgICAgPC/R4s/w7uQ+DQogICAgICA80eLP7urz7z4NCiAgICAgICAgPMjk0eI+DQogICAgICAgICAgPNHi3svT9yDKz889IjE1NjE1NjE2NSIgyM3N3ss9IjUwNDcwNzEwMjAiIM3g6OzO8OM9ItLl8fIgwvHlIPXu8O747iIvPg0KICAgICAgICA8L8jk0eI+DQogICAgICA8L9Hiz+7q8+8+DQogICAgPC/R4tH31ODq8j4NCiAgICA80uDh69H31ODq8j4NCiAgICAgIDzR4uXk0u7iIM3u7NHy8D0iMSIgzeDo7NLu4j0izvTu8Ozr5e3o5SDw5err4Ozg9uju7e3uLe/w5fLl7efo7u3t7ukg5O7q8+zl7fLg9ujoIiDOysXIX9Lu4j0iNzk2IiDK7uvS7uI9IjEiINbl7eDS7uI9IjE2MjguMDAiINHy0u7iweXnzcTRPSIxNjI4LjAwIiDN4OvR8j0iMTglIiDR8tLu4tP3zeDrPSIxOTIxLjA0Ij4NCiAgICAgICAgPMDq9ujnPg0KICAgICAgICAgIDzB5efA6vbo5z7h5ecg4Or26OfgPC/B5efA6vbo5z4NCiAgICAgICAgPC/A6vbo5z4NCiAgICAgICAgPNHz7M3g6z4NCiAgICAgICAgICA80fPszeDrPjI5My4wNDwv0fPszeDrPg0KICAgICAgICA8L9Hz7M3g6z4NCiAgICAgIDwv0eLl5NLu4j4NCiAgICAgIDzC8eXj7s7v6yDR8tLu4sHl583E0cLx5ePuPSIxNjI4LjAwIiDR8tLu4tP3zeDrwvHl4+49IjE5MjEuMDQiPg0KICAgICAgICA80fPszeDrwvHl4+4+DQogICAgICAgICAgPNHz7M3g6z4yOTMuMDQ8L9Hz7M3g6z4NCiAgICAgICAgPC/R8+zN4OvC8eXj7j4NCiAgICAgICAgPMru683l8vLuwvE+MDwvyu7rzeXy8u7C8T4NCiAgICAgIDwvwvHl4+7O7+s+DQogICAgPC/S4OHr0ffU4OryPg0KICAgIDzR4s/w7uTP5fA+DQogICAgICA80eLP5fAg0e7kzu/l8D0izPssIO3o5uXv7uTv6PHg4vjo5fH/LCDv8OXk8fLg4ujy5ev8IMjRz87LzcjSxcvfIPEg7uTt7ukg8fLu8O7t+yDoIO/w5eTx8uDi6PLl6/wgx8DKwMfXyMrAIPEg5PDz4+7pIPHy7vDu7fssIPHu8fLg4ujr6CDt4PHy7v/56Okg4OryIOIg8u7sLCD38u4gyNHPzsvNyNLFy9wg4vvv7uvt6OssIOAgx8DKwMfXyMog7/Do7f/rIPHr5eTz/vno5SDw4OHu8vsgKPPx6/Pj6CkiIMTg8uDP5fA9IjE5LjAxLjIwMTgiPg0KICAgICAgICA8zvHtz+XwIM3g6OzO8e09IsTu4+7i7vAiIMTg8uDO8e09IjIyLjExLjIwMTciIM3u7M7x7T0i0s7QLdbEyNbCLzgzL8DOLcTEL8ItNzYwLzE3Ii8+DQogICAgICA8L9Hiz+XwPg0KICAgIDwv0eLP8O7kz+XwPg0KICA8L8Tu6vPs5e3yPg0KPC/U4OnrPg");
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
