
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String resultado={String}request.getAttribute("resultado");
%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
   <center>
      <%= resultado%>
   </center>
   </body>
</html>
