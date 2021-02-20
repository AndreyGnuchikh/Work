package EDOSF.iitFirefox.UserTestedo.Soap;


import EDOSF.SettingsEDOSF.testedo;
import EDOSF.methods.Soup;

import java.io.IOException;

public class AddDocumentUPDUserASChFDop_Test3 extends testedo {

    public static String responseString;

    public static String add() throws IOException {
        responseString = Soup.send("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <tem:CreateUPDseller>\r\n         <tem:serviceId>00000000-0000-0000-0000-000000000059</tem:serviceId>\r\n         <tem:cabinetId>2883e1ed-c6ad-4ab7-a61a-065ed827ccb3</tem:cabinetId>\r\n         <!--Optional:-->\r\n         <tem:name>oldÑ×ÔDOP.xml</tem:name>\r\n         <!--Optional:-->\r\n         <tem:comment>ñåðâèñ oldÑ×ÔDOP.xml</tem:comment>\r\n         <!--Optional:-->\r\n         <tem:orgName>Òåñò Âñå õîðîøî</tem:orgName>\r\n         <tem:inn>5047071020</tem:inn>\r\n         <tem:kpp>156156165</tem:kpp>\r\n         <tem:xml>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0id2luZG93cy0xMjUxIiBzdGFuZGFsb25lPSJ5ZXMiPz4NCjzU4OnrIMjk1ODp6z0iIiDC5fDx1O7w7D0iNS4wMSIgwuXw8c/w7uM9IjUuMDEiPg0KICA80eLT98Tu6s7h7vAgyOTO8u/wPSIiIMjkz+7rPSIiID4NCiAgICA80eLO3cTO8u/wIM3g6OzO8OM9Is7OziAmcXVvdDvIyNImcXVvdDsiIMjNzd7LPSI3NzA4NzEzMjU5IiDI5N3Ezj0iIi8+DQogIDwv0eLT98Tu6s7h7vA+DQogIDzE7urz7OXt8iDKzcQ9IjExMTUxMzEiINTz7er26P89ItHX1MTOzyIgz+7U4Ory1cY9IsTu6vPs5e3yIO7hIO7y4/Dz5+rlIPLu4uDw7uIgKOL77+7r7eXt6Ogg8ODh7vIpLCDv5fDl5OD35SDo7PP55fHy4uXt7fv1IO/w4OIgKOTu6vPs5e3yIO7hIO7q4Ofg7ejoIPPx6/PjKSIgzeDo7MTu6s7v8D0ixO7q8+zl7fIg7uEg7vLj8PPn6uUg8u7i4PDu4iAo4vvv7uvt5e3o6CDw4OHu8iksIO/l8OXk4PflIOjs8/nl8fLi5e3t+/Ug7/Dg4iAoxO7q8+zl7fIg7uEg7urg5+Dt6Ogg8/Hr8+MpIiDE4PLgyO30z/A9IjE2LjA4LjIwMTgiIMLw5ezI7fTP8D0iMDkuMjguMzAiIM3g6Ozd6u7t0fPh0e7x8j0izvLq8Pvy7uUgwOr26O7t5fDt7uUgzuH55fHy4u4gJnF1b3Q70O7x8ejp8ero5SDm5evl5+375SDk7vDu4+gmcXVvdDsiID4NCiAgICA80eLR99Tg6vIgze7s5fDR99Q9IjEzLzMwMzItMiIgxODy4NH31D0iMTkuMDEuMjAxOCIgyu7kzsrCPSI2NDMiPg0KICAgICAgPNHiz/Du5D4NCiAgICAgICAgPMjk0eI+DQogICAgICAgICAgICAgIDzR4t7L0/cgys/PPSIxNTYxNTYxNjUiIMjNzd7LPSI1MDQ3MDcxMDIwIiDN4OjszvDjPSLS5fHyIMLx5SD17vDu+O4iLz4NCiAgICAgICAgPC/I5NHiPg0KICAgICAgPC/R4s/w7uQ+DQogICAgICA80eLP7urz7z4NCiAgICAgICAgPMjk0eI+DQogICAgICAgICAgPNHi3svT9yDKz889IjU1NTU1NTU1NSIgyM3N3ss9IjE2NTMwMDE4ODMiIM3g6OzO8OM9IsLx5SD17vDu+O4gMiwwIi8+DQogICAgICAgIDwvyOTR4j4NCiAgICAgIDwv0eLP7urz7z4NCiAgICA8L9Hi0ffU4OryPg0KICAgIDzS4OHr0ffU4OryPg0KICAgICAgPNHi5eTS7uIgze7s0fLwPSIxIiDN4Ojs0u7iPSLO9O7w7Ovl7ejlIPDl6uvg7OD26O7t7e4t7/Dl8uXt5+ju7e3u6SDk7urz7OXt8uD26OgiIM7Kxchf0u7iPSI3OTYiIMru69Lu4j0iMSIg1uXt4NLu4j0iMTYyOC4wMCIg0fLS7uLB5efNxNE9IjE2MjguMDAiIM3g69HyPSIxOCUiINHy0u7i0/fN4Os9IjE5MjEuMDQiPg0KICAgICAgICA8wOr26Oc+DQogICAgICAgICAgPMHl58Dq9ujnPuHl5yDg6vbo5+A8L8Hl58Dq9ujnPg0KICAgICAgICA8L8Dq9ujnPg0KICAgICAgICA80fPszeDrPg0KICAgICAgICAgIDzR8+zN4Os+MjkzLjA0PC/R8+zN4Os+DQogICAgICAgIDwv0fPszeDrPg0KICAgICAgPC/R4uXk0u7iPg0KICAgICAgPMLx5ePuzu/rINHy0u7iweXnzcTRwvHl4+49IjE2MjguMDAiINHy0u7i0/fN4OvC8eXj7j0iMTkyMS4wNCI+DQogICAgICAgIDzR8+zN4OvC8eXj7j4NCiAgICAgICAgICA80fPszeDrPjI5My4wNDwv0fPszeDrPg0KICAgICAgICA8L9Hz7M3g68Lx5ePuPg0KICAgICAgICA8yu7rzeXy8u7C8T4wPC/K7uvN5fLy7sLxPg0KICAgICAgPC/C8eXj7s7v6z4NCiAgICA8L9Lg4evR99Tg6vI+DQogICAgPNHiz/Du5M/l8D4NCiAgICAgIDzR4s/l8CDR7uTO7+XwPSLM+ywg7ejm5e/u5O/o8eDi+Ojl8f8sIO/w5eTx8uDi6PLl6/wgyNHPzsvNyNLFy98g8SDu5O3u6SDx8u7w7u37IOgg7/Dl5PHy4OLo8uXr/CDHwMrAx9fIysAg8SDk8PPj7ukg8fLu8O7t+ywg8e7x8uDi6OvoIO3g8fLu//no6SDg6vIg4iDy7uwsIPfy7iDI0c/Oy83I0sXL3CDi++/u6+3o6ywg4CDHwMrAx9fIyiDv8Ojt/+sg8evl5PP++ejlIPDg4e7y+yAo8/Hr8+PoKSIgxODy4M/l8D0iMTkuMDEuMjAxOCI+DQogICAgICAgIDzO8e3P5fAgzeDo7M7x7T0ixO7j7uLu8CIgxODy4M7x7T0iMjIuMTEuMjAxNyIgze7szvHtPSLSztAt1sTI1sIvODMvwM4txMQvwi03NjAvMTciLz4NCiAgICAgIDwv0eLP5fA+DQogICAgPC/R4s/w7uTP5fA+DQogIDwvxO7q8+zl7fI+DQo8L9Tg6es+</tem:xml>\r\n        </tem:CreateUPDseller>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>");
        return responseString;
    }


}

