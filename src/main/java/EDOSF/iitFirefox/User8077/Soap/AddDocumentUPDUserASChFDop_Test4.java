package EDOSF.iitFirefox.User8077.Soap;


import EDOSF.SettingsEDOSF.iit8077;
import EDOSF.methods.Soup;

import java.io.IOException;


public class AddDocumentUPDUserASChFDop_Test4 extends iit8077 {

    public static String responseString;

    public static String add() throws IOException {
        responseString = Soup.send(soupURL,"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <tem:CreateUPDseller>\r\n         <tem:serviceId>00000000-0000-0000-0000-000000000060</tem:serviceId>\r\n         <tem:cabinetId>718c47e2-c08a-43e6-88e9-6053750e7581</tem:cabinetId>\r\n         <!--Optional:-->\r\n         <tem:name>820���DOP.xml</tem:name>\r\n         <!--Optional:-->\r\n         <tem:comment>soup 820���DOP.xml</tem:comment>\r\n         <!--Optional:-->\r\n         <tem:orgName>��� ������ 2,0</tem:orgName>\r\n         <tem:inn>1653001883</tem:inn>\r\n         <tem:kpp>555555555</tem:kpp>\r\n         <tem:xml>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIj8+DQo81ODp6yDI5NTg6es9Ik9OX05TQ0hGRE9QUFJfMkpINDQ0XzJKSDMzM18yMDIwMDMyN181M2Q5NzUzOS0wYzc1LTQyMzgtYWNiZS01MGI3ODA1MTVlYmUiIMLl8PHU7vDsPSI1LjAxIiDC5fDxz/Du4z0iMS4wIj4KICAgIDzR4tP3xO7qzuHu8CDI5M7y7/A9IjJKSDMzMyIgyOTP7us9IjJKSDQ0NCI+CiAgICAgICAgPNHizt3EzvLv8CDN4OjszvDjPSLOzs4gJnF1b3Q7yMjSJnF1b3Q7IiDIzc3eyz0iNzcwODcxMzI1OSIgyOTdxM49IjJKSCIvPgogICAgPC/R4tP3xO7qzuHu8D4KICAgIDzE7urz7OXt8iDKzcQ9IjExMTUxMzEiINTz7er26P89ItHX1MTOzyIgzeDo7MTu6s7v8D0i0ffl8i304Ory8/DgIOgg5O7q8+zl7fIg7uEg7vLj8PPn6uUg8u7i4PDu4iAo4vvv7uvt5e3o6CDw4OHu8iksIO/l8OXk4PflIOjs8/nl8fLi5e3t+/Ug7/Dg4iAo5O7q8+zl7fIg7uEg7urg5+Dt6Ogg8/Hr8+MpIiDE4PLgyO30z/A9IjI3LjAzLjIwMjAiIMLw5ezI7fTP8D0iMTkuMTIuMjMiIM3g6Ozd6u7t0fPh0e7x8j0iwvHlIPXu8O747iAyLDAiPgogICAgICAgIDzR4tH31ODq8iDN7uzl8NH31D0iMTIzIiDE4PLg0ffUPSIxMi4wMy4yMDIwIiDK7uTOysI9IjY0MyI+CiAgICAgICAgICAgIDzI8e/w0ffUIMTl9M3u7Mjx7/DR99Q9Ii0iIMTl9MTg8uDI8e/w0ffUPSItIi8+CiAgICAgICAgICAgIDzR4s/w7uQ+CiAgICAgICAgICAgICAgICA8yOTR4j4KICAgICAgICAgICAgICAgICAgICA80eLey9P3IM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIiDIzc3eyz0iMTY1MzAwMTg4MyIgys/PPSI1NTU1NTU1NTUiLz4KICAgICAgICAgICAgICAgIDwvyOTR4j4KICAgICAgICAgICAgICAgIDzA5PDl8T4KICAgICAgICAgICAgICAgICAgICA8wOTw0NQgyu7k0OXj6O7tPSI4MCIg0ODp7u09IuIiLz4KICAgICAgICAgICAgICAgIDwvwOTw5fE+CiAgICAgICAgICAgIDwv0eLP8O7kPgogICAgICAgICAgICA80eLP7urz7z4KICAgICAgICAgICAgICAgIDzI5NHiPgogICAgICAgICAgICAgICAgICAgIDzR4t7L0/cgzeDo7M7w4z0i0uXx8iDC8eUg9e7w7vjuIiDIzc3eyz0iNTA0NzA3MTAyMCIgys/PPSIxNTYxNTYxNjUiLz4KICAgICAgICAgICAgICAgIDwvyOTR4j4KICAgICAgICAgICAgICAgIDzA5PDl8T4KICAgICAgICAgICAgICAgICAgICA8wOTw0NQgyu7k0OXj6O7tPSIzOCIvPgogICAgICAgICAgICAgICAgPC/A5PDl8T4KICAgICAgICAgICAgPC/R4s/u6vPvPgogICAgICAgIDwv0eLR99Tg6vI+CiAgICAgICAgPNLg4evR99Tg6vI+CiAgICAgICAgICAgIDzR4uXk0u7iIM3u7NHy8D0iMSIgzeDo7NLu4j0iMSIgxOX0zsrFyF/S7uI9Ii0iINHy0u7iweXnzcTRPSIxIiDN4OvR8j0iMjAlIiDR8tLu4tP3zeDrPSIxLjIiPgogICAgICAgICAgICAgICAgPMDq9ujnPgogICAgICAgICAgICAgICAgICAgIDzB5efA6vbo5z7h5ecg4Or26OfgPC/B5efA6vbo5z4KICAgICAgICAgICAgICAgIDwvwOr26Oc+CiAgICAgICAgICAgICAgICA80fPszeDrPgogICAgICAgICAgICAgICAgICAgIDzR8+zN4Os+MC4yPC/R8+zN4Os+CiAgICAgICAgICAgICAgICA8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDzR4tLEIMTl9Mru5M/w7ujx9T0iLSIgze7s5fDSxD0iLSIvPgogICAgICAgICAgICAgICAgPMTu79Hi5eTS7uIvPgogICAgICAgICAgICA8L9Hi5eTS7uI+CiAgICAgICAgICAgIDzC8eXj7s7v6yDR8tLu4sHl583E0cLx5ePuPSIxIiDR8tLu4tP3zeDrwvHl4+49IjEuMiI+CiAgICAgICAgICAgICAgICA80fPszeDrwvHl4+4+CiAgICAgICAgICAgICAgICAgICAgPNHz7M3g6z4wLjI8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDwv0fPszeDrwvHl4+4+CiAgICAgICAgICAgIDwvwvHl4+7O7+s+CiAgICAgICAgPC/S4OHr0ffU4OryPgogICAgICAgIDzR4s/w7uTP5fA+CiAgICAgICAgICAgIDzR4s/l8CDR7uTO7+XwPSI0Ij4KICAgICAgICAgICAgICAgIDzO8e3P5fAgzeDo7M7x7T0iMSIgxODy4M7x7T0iMTAuMDMuMjAyMCIvPgogICAgICAgICAgICAgICAgPNHiy+j2z+XwPgogICAgICAgICAgICAgICAgICAgIDzQ4OHO8OPP8O7kIMTu6+bt7vHy/D0iMyI+CiAgICAgICAgICAgICAgICAgICAgICAgIDzUyM4g1ODs6Ovo/z0iMSIgyOz/PSIyIi8+CiAgICAgICAgICAgICAgICAgICAgPC/Q4OHO8OPP8O7kPgogICAgICAgICAgICAgICAgPC/R4svo9s/l8D4KICAgICAgICAgICAgPC/R4s/l8D4KICAgICAgICA8L9Hiz/Du5M/l8D4KICAgICAgICA8z+7k7+jx4O3yIM7h68/u6+09IjMiINHy4PLz8T0iMSIgzvHtz+7r7T0iZCI+CiAgICAgICAgICAgIDzeyyDIzc3eyz0iMTY1MzAwMTg4MyIgzeDo7M7w4z0iwvHlIPXu8O747iAyLDAiIMTu6+btPSLE7uvm7e7x8vwiPgogICAgICAgICAgICAgICAgPNTIziDU4Ozo6+j/PSLTz8QiIMjs/z0iMiIgzvL35fHy4u49IijjMjAxMikiLz4KICAgICAgICAgICAgPC/eyz4KICAgICAgICA8L8/u5O/o8eDt8j4KICAgIDwvxO7q8+zl7fI+Cjwv1ODp6z4=</tem:xml>\r\n        </tem:CreateUPDseller>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>");
        return responseString;
    }


}