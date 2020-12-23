package iitFirefox.UserTestedo.SoapTest1;


import iitAdd.testedo;
import methods.Soup;

import java.io.IOException;

public class AddDocumentUPDUserASChF_Test2 extends testedo {

    public static String responseString;

    public static String add() throws IOException {
        responseString = Soup.send("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <tem:CreateUPDseller>\r\n         <tem:serviceId>00000000-0000-0000-0000-000000000060</tem:serviceId>\r\n         <tem:cabinetId>34e39aa3-a1d9-4cbe-8823-caeab4d79073</tem:cabinetId>\r\n         <!--Optional:-->\r\n         <tem:name>oldÑ×Ô.xml.xml</tem:name>\r\n         <!--Optional:-->\r\n         <tem:comment>soup oldÑ×Ô.xml</tem:comment>\r\n         <!--Optional:-->\r\n         <tem:orgName>Âñå õîðîøî 2,0</tem:orgName>\r\n         <tem:inn>1653001883</tem:inn>\r\n         <tem:kpp>555555555</tem:kpp>\r\n         <tem:xml>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIj8+DQo81ODp6yDI5NTg6es9Ik9OX05TQ0hGRE9QUFJfMkpIVDA3M18ySkhUMDc0XzIwMjAwODAzXzY4NDkyNmFmLWY2OGUtNDkyNS05ZGRiLTRmNzJhMGE5MGM4ZSIgwuXw8dTu8Ow9IjUuMDEiIMLl8PHP8O7jPSIxLjAiPgogICAgPNHi0/fE7urO4e7wIMjkzvLv8D0iMkpIVDA3NCIgyOTP7us9IjJKSFQwNzMiPgogICAgICAgIDzR4s7dxM7y7/AgzeDo7M7w4z0izs7OICZxdW90O8jI0iZxdW90OyIgyM3N3ss9Ijc3MDg3MTMyNTkiIMjk3cTOPSIySkgiLz4KICAgIDwv0eLT98Tu6s7h7vA+CiAgICA8xO7q8+zl7fIgys3EPSIxMTE1MTMxIiDU8+3q9uj/PSLR19QiIMTg8uDI7fTP8D0iMDMuMDguMjAyMCIgwvDl7Mjt9M/wPSIxNS4zMS4yNSIgzeDo7N3q7u3R8+HR7vHyPSLC8eUg9e7w7vjuIDIsMCI+CiAgICAgICAgPNHi0ffU4OryIM3u7OXw0ffUPSIxIiDE4PLg0ffUPSIwMy4wOC4yMDIwIiDK7uTOysI9IjY0MyI+CiAgICAgICAgICAgIDzI8e/w0ffUIMTl9M3u7Mjx7/DR99Q9Ii0iIMTl9MTg8uDI8e/w0ffUPSItIi8+CiAgICAgICAgICAgIDzR4s/w7uQ+CiAgICAgICAgICAgICAgICA8yOTR4j4KICAgICAgICAgICAgICAgICAgICA80eLey9P3IM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIiDIzc3eyz0iMTY1MzAwMTg4MyIgys/PPSI1NTU1NTU1NTUiLz4KICAgICAgICAgICAgICAgIDwvyOTR4j4KICAgICAgICAgICAgICAgIDzA5PDl8T4KICAgICAgICAgICAgICAgICAgICA8wOTw0NQgyu7k0OXj6O7tPSI4MCIg0ODp7u09IuIiLz4KICAgICAgICAgICAgICAgIDwvwOTw5fE+CiAgICAgICAgICAgIDwv0eLP8O7kPgogICAgICAgICAgICA80eLP7urz7z4KICAgICAgICAgICAgICAgIDzI5NHiPgogICAgICAgICAgICAgICAgICAgIDzR4t7L0/cgzeDo7M7w4z0i0uXx8iDC8eUg9e7w7vjuIiDIzc3eyz0iNTA0NzA3MTAyMCIgys/PPSIxNTYxNTYxNjUiLz4KICAgICAgICAgICAgICAgIDwvyOTR4j4KICAgICAgICAgICAgICAgIDzA5PDl8T4KICAgICAgICAgICAgICAgICAgICA8wOTw0NQgyu7k0OXj6O7tPSIyOCIvPgogICAgICAgICAgICAgICAgPC/A5PDl8T4KICAgICAgICAgICAgPC/R4s/u6vPvPgogICAgICAgIDwv0eLR99Tg6vI+CiAgICAgICAgPNLg4evR99Tg6vI+CiAgICAgICAgICAgIDzR4uXk0u7iIM3u7NHy8D0iMSIgzeDo7NLu4j0iMSIgxOX0zsrFyF/S7uI9Ii0iINHy0u7iweXnzcTRPSIxIiDN4OvR8j0iMjAlIiDR8tLu4tP3zeDrPSIxLjIiPgogICAgICAgICAgICAgICAgPMDq9ujnPgogICAgICAgICAgICAgICAgICAgIDzB5efA6vbo5z7h5ecg4Or26OfgPC/B5efA6vbo5z4KICAgICAgICAgICAgICAgIDwvwOr26Oc+CiAgICAgICAgICAgICAgICA80fPszeDrPgogICAgICAgICAgICAgICAgICAgIDzR8+zN4Os+MC4yPC/R8+zN4Os+CiAgICAgICAgICAgICAgICA8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDzR4tLEIMTl9Mru5M/w7ujx9T0iLSIgze7s5fDSxD0iLSIvPgogICAgICAgICAgICAgICAgPMTu79Hi5eTS7uIvPgogICAgICAgICAgICA8L9Hi5eTS7uI+CiAgICAgICAgICAgIDzC8eXj7s7v6yDR8tLu4sHl583E0cLx5ePuPSIxIiDR8tLu4tP3zeDrwvHl4+49IjEuMiI+CiAgICAgICAgICAgICAgICA80fPszeDrwvHl4+4+CiAgICAgICAgICAgICAgICAgICAgPNHz7M3g6z4wLjI8L9Hz7M3g6z4KICAgICAgICAgICAgICAgIDwv0fPszeDrwvHl4+4+CiAgICAgICAgICAgIDwvwvHl4+7O7+s+CiAgICAgICAgPC/S4OHr0ffU4OryPgogICAgICAgIDzP7uTv6PHg7fIgzuHrz+7r7T0iMyIg0fLg8vPxPSIxIiDO8e3P7uvtPSJkIj4KICAgICAgICAgICAgPN7LIMjNzd7LPSIxNjUzMDAxODgzIiDN4OjszvDjPSLC8eUg9e7w7vjuIDIsMCIgxO7r5u09IsTu6+bt7vHy/CAyIj4KICAgICAgICAgICAgICAgIDzUyM4g1ODs6Ovo/z0i08/EIiDI7P89IjIiIM7y9+Xx8uLuPSLz8ejr5e3t4P8iLz4KICAgICAgICAgICAgPC/eyz4KICAgICAgICA8L8/u5O/o8eDt8j4KICAgIDwvxO7q8+zl7fI+Cjwv1ODp6z4=</tem:xml>\r\n        </tem:CreateUPDseller>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>");
        return responseString;
    }


}

