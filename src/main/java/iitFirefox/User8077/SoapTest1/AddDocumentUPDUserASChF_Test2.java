package iitFirefox.User8077.SoapTest1;


import iitAdd.iit8077;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public class AddDocumentUPDUserASChF_Test2 extends iit8077 {
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
        name.addTextNode("820СЧФ.xml");
        comment.addTextNode("" + date);
        orgName.addTextNode("Все хорошо 2,0");
        inn.addTextNode("1653001883");
        kpp.addTextNode("555555555");
        xml.addTextNode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIiBzdGFuZGFsb25lPSJ5ZXMiPz4NCjzQpNCw0LnQuyDQmNC00KTQsNC50Ls9IiIg0JLQtdGA0YHQpNC+0YDQvD0iNS4wMSIg0JLQtdGA0YHQn9GA0L7Qsz0iNS4wMSI+DQogIDzQodCy0KPRh9CU0L7QutCe0LHQvtGAINCY0LTQntGC0L/RgD0iIiDQmNC00J/QvtC7PSIiID4NCiAgICA80KHQstCe0K3QlNCe0YLQv9GAINCd0LDQuNC80J7RgNCzPSLQntCe0J4gJnF1b3Q70JjQmNCiJnF1b3Q7IiDQmNCd0J3QrtCbPSI3NzA4NzEzMjU5IiDQmNC00K3QlNCePSIiLz4NCiAgPC/QodCy0KPRh9CU0L7QutCe0LHQvtGAPg0KICA80JTQvtC60YPQvNC10L3RgiDQmtCd0JQ9IjExMTUxMzEiINCk0YPQvdC60YbQuNGPPSLQodCn0KQiINCf0L7QpNCw0LrRgtCl0JY9ItCU0L7QutGD0LzQtdC90YIg0L7QsSDQvtGC0LPRgNGD0LfQutC1INGC0L7QstCw0YDQvtCyICjQstGL0L/QvtC70L3QtdC90LjQuCDRgNCw0LHQvtGCKSwg0L/QtdGA0LXQtNCw0YfQtSDQuNC80YPRidC10YHRgtCy0LXQvdC90YvRhSDQv9GA0LDQsiAo0LTQvtC60YPQvNC10L3RgiDQvtCxINC+0LrQsNC30LDQvdC40Lgg0YPRgdC70YPQsykiINCd0LDQuNC80JTQvtC60J7Qv9GAPSLQlNC+0LrRg9C80LXQvdGCINC+0LEg0L7RgtCz0YDRg9C30LrQtSDRgtC+0LLQsNGA0L7QsiAo0LLRi9C/0L7Qu9C90LXQvdC40Lgg0YDQsNCx0L7RgiksINC/0LXRgNC10LTQsNGH0LUg0LjQvNGD0YnQtdGB0YLQstC10L3QvdGL0YUg0L/RgNCw0LIgKNCU0L7QutGD0LzQtdC90YIg0L7QsSDQvtC60LDQt9Cw0L3QuNC4INGD0YHQu9GD0LMpIiDQlNCw0YLQsNCY0L3RhNCf0YA9IjE2LjA4LjIwMTgiINCS0YDQtdC80JjQvdGE0J/RgD0iMDkuMjguMzAiINCd0LDQuNC80K3QutC+0L3QodGD0LHQodC+0YHRgj0i0J7RgtC60YDRi9GC0L7QtSDQkNC60YbQuNC+0L3QtdGA0L3QvtC1INCe0LHRidC10YHRgtCy0L4gJnF1b3Q70KDQvtGB0YHQuNC50YHQutC40LUg0LbQtdC70LXQt9C90YvQtSDQtNC+0YDQvtCz0LgmcXVvdDsiID4NCiAgICA80KHQstCh0YfQpNCw0LrRgiDQndC+0LzQtdGA0KHRh9CkPSIxMy8zMDMyLTIiINCU0LDRgtCw0KHRh9CkPSIxOS4wMS4yMDE4IiDQmtC+0LTQntCa0JI9IjY0MyI+DQogICAgICA80KHQstCf0YDQvtC0Pg0KICAgICAgICA80JjQtNCh0LI+DQogICAgICAgICAgICA80KHQstCu0JvQo9GHINCa0J/Qnz0iNTU1NTU1NTU1IiDQmNCd0J3QrtCbPSIxNjUzMDAxODgzIiDQndCw0LjQvNCe0YDQsz0i0JLRgdC1INGF0L7RgNC+0YjQviAyLDAiLz4NCiAgICAgICAgPC/QmNC00KHQsj4NCiAgICAgIDwv0KHQstCf0YDQvtC0Pg0KICAgICAgPNCh0LLQn9C+0LrRg9C/Pg0KICAgICAgICA80JjQtNCh0LI+DQoJCSAgICAgICA80KHQstCu0JvQo9GHINCa0J/Qnz0iMTU2MTU2MTY1IiDQmNCd0J3QrtCbPSI1MDQ3MDcxMDIwIiDQndCw0LjQvNCe0YDQsz0i0KLQtdGB0YIg0JLRgdC1INGF0L7RgNC+0YjQviIvPg0KICAgICANCiAgICAgICAgPC/QmNC00KHQsj4NCiAgICAgIDwv0KHQstCf0L7QutGD0L8+DQogICAgPC/QodCy0KHRh9Ck0LDQutGCPg0KICAgIDzQotCw0LHQu9Ch0YfQpNCw0LrRgj4NCgkgPNCh0LLQtdC00KLQvtCyINCd0L7QvNCh0YLRgD0iMiIg0J3QsNC40LzQotC+0LI9ItCe0YTQvtGA0LzQu9C10L3QuNC1INGA0LXQutC70LDQvNCw0YbQuNC+0L3QvdC+LdC/0YDQtdGC0LXQvdC30LjQvtC90L3QvtC5INC00L7QutGD0LzQtdC90YLQsNGG0LjQuCIg0J7QmtCV0Jhf0KLQvtCyPSI3OTYiINCa0L7Qu9Ci0L7Qsj0iMSIg0KbQtdC90LDQotC+0LI9IjE2MjguMDAiINCh0YLQotC+0LLQkdC10LfQndCU0KE9IjE2MjguMDAiINCd0LDQu9Ch0YI9IjE4JSIg0KHRgtCi0L7QstCj0YfQndCw0Ls9IjE5MjEuMDQiPg0KICAgICAgICA80JDQutGG0LjQtz4NCiAgICAgICAgICA80JHQtdC30JDQutGG0LjQtz7QsdC10Lcg0LDQutGG0LjQt9CwPC/QkdC10LfQkNC60YbQuNC3Pg0KICAgICAgICA8L9CQ0LrRhtC40Lc+DQogICAgICAgIDzQodGD0LzQndCw0Ls+DQogICAgICAgICAgPNCh0YPQvNCd0LDQuz4yOTMuMDQ8L9Ch0YPQvNCd0LDQuz4NCiAgICAgICAgPC/QodGD0LzQndCw0Ls+DQogICAgICA8L9Ch0LLQtdC00KLQvtCyPg0KICAgICAgPNCh0LLQtdC00KLQvtCyINCd0L7QvNCh0YLRgD0iMSIg0J3QsNC40LzQotC+0LI9ItCe0YTQvtGA0LzQu9C10L3QuNC1INGA0LXQutC70LDQvNCw0YbQuNC+0L3QvdC+LdC/0YDQtdGC0LXQvdC30LjQvtC90L3QvtC5INC00L7QutGD0LzQtdC90YLQsNGG0LjQuCIg0J7QmtCV0Jhf0KLQvtCyPSI3OTYiINCa0L7Qu9Ci0L7Qsj0iMSIg0KbQtdC90LDQotC+0LI9IjE2MjguMDAiINCh0YLQotC+0LLQkdC10LfQndCU0KE9IjE2MjguMDAiINCd0LDQu9Ch0YI9IjE4JSIg0KHRgtCi0L7QstCj0YfQndCw0Ls9IjE5MjEuMDQiPg0KICAgICAgICA80JDQutGG0LjQtz4NCiAgICAgICAgICA80JHQtdC30JDQutGG0LjQtz7QsdC10Lcg0LDQutGG0LjQt9CwPC/QkdC10LfQkNC60YbQuNC3Pg0KICAgICAgICA8L9CQ0LrRhtC40Lc+DQogICAgICAgIDzQodGD0LzQndCw0Ls+DQogICAgICAgICAgPNCh0YPQvNCd0LDQuz4yOTMuMDQ8L9Ch0YPQvNCd0LDQuz4NCiAgICAgICAgPC/QodGD0LzQndCw0Ls+DQogICAgICA8L9Ch0LLQtdC00KLQvtCyPg0KICAgICAgPNCS0YHQtdCz0L7QntC/0Lsg0KHRgtCi0L7QstCR0LXQt9Cd0JTQodCS0YHQtdCz0L49IjE2MjguMDAiINCh0YLQotC+0LLQo9GH0J3QsNC70JLRgdC10LPQvj0iMTkyMS4wNCI+DQogICAgICAgIDzQodGD0LzQndCw0LvQktGB0LXQs9C+Pg0KICAgICAgICAgIDzQodGD0LzQndCw0Ls+MjkzLjA0PC/QodGD0LzQndCw0Ls+DQogICAgICAgIDwv0KHRg9C80J3QsNC70JLRgdC10LPQvj4NCiAgICAgICAgPNCa0L7Qu9Cd0LXRgtGC0L7QktGBPjA8L9Ca0L7Qu9Cd0LXRgtGC0L7QktGBPg0KICAgICAgPC/QktGB0LXQs9C+0J7Qv9C7Pg0KICAgIDwv0KLQsNCx0LvQodGH0KTQsNC60YI+DQogICAgPNCh0LLQn9GA0L7QtNCf0LXRgD4NCiAgICAgIDzQodCy0J/QtdGAINCh0L7QtNCe0L/QtdGAPSLQnNGLLCDQvdC40LbQtdC/0L7QtNC/0LjRgdCw0LLRiNC40LXRgdGPLCDQv9GA0LXQtNGB0YLQsNCy0LjRgtC10LvRjCDQmNCh0J/QntCb0J3QmNCi0JXQm9CvINGBINC+0LTQvdC+0Lkg0YHRgtC+0YDQvtC90Ysg0Lgg0L/RgNC10LTRgdGC0LDQstC40YLQtdC70Ywg0JfQkNCa0JDQl9Cn0JjQmtCQINGBINC00YDRg9Cz0L7QuSDRgdGC0L7RgNC+0L3Riywg0YHQvtGB0YLQsNCy0LjQu9C4INC90LDRgdGC0L7Rj9GJ0LjQuSDQsNC60YIg0LIg0YLQvtC8LCDRh9GC0L4g0JjQodCf0J7Qm9Cd0JjQotCV0JvQrCDQstGL0L/QvtC70L3QuNC7LCDQsCDQl9CQ0JrQkNCX0KfQmNCaINC/0YDQuNC90Y/QuyDRgdC70LXQtNGD0Y7RidC40LUg0YDQsNCx0L7RgtGLICjRg9GB0LvRg9Cz0LgpIiDQlNCw0YLQsNCf0LXRgD0iMTkuMDEuMjAxOCI+DQogICAgICAgIDzQntGB0L3Qn9C10YAg0J3QsNC40LzQntGB0L09ItCU0L7Qs9C+0LLQvtGAIiDQlNCw0YLQsNCe0YHQvT0iMjIuMTEuMjAxNyIg0J3QvtC80J7RgdC9PSLQotCe0KAt0KbQlNCY0KbQki84My/QkNCeLdCU0JQv0JItNzYwLzE3Ii8+DQogICAgICA8L9Ch0LLQn9C10YA+DQogICAgPC/QodCy0J/RgNC+0LTQn9C10YA+DQogIDwv0JTQvtC60YPQvNC10L3Rgj4NCjwv0KTQsNC50Ls+");
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
