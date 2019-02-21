<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalculatorServiceProxyid" scope="session" class="com.metacube.soap.service.CalculatorServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalculatorServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalculatorServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalculatorServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.metacube.soap.service.CalculatorService getCalculatorService10mtemp = sampleCalculatorServiceProxyid.getCalculatorService();
if(getCalculatorService10mtemp == null){
%>
<%=getCalculatorService10mtemp %>
<%
}else{
        if(getCalculatorService10mtemp!= null){
        String tempreturnp11 = getCalculatorService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String a_1id=  request.getParameter("a16");
        int a_1idTemp  = Integer.parseInt(a_1id);
        String b_2id=  request.getParameter("b18");
        int b_2idTemp  = Integer.parseInt(b_2id);
        int multiply13mtemp = sampleCalculatorServiceProxyid.multiply(a_1idTemp,b_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiply13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String a_3id=  request.getParameter("a23");
        int a_3idTemp  = Integer.parseInt(a_3id);
        String b_4id=  request.getParameter("b25");
        int b_4idTemp  = Integer.parseInt(b_4id);
        int addy20mtemp = sampleCalculatorServiceProxyid.addy(a_3idTemp,b_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addy20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        java.lang.String sayHello27mtemp = sampleCalculatorServiceProxyid.sayHello();
if(sayHello27mtemp == null){
%>
<%=sayHello27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>