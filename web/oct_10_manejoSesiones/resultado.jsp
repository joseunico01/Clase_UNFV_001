<%@page import="oct_10_manejo_sesion.modelo.ArregloObjetos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%
String resultado =(String)session.getAttribute("misesion");
ArregloObjetos y[]=(ArregloObjetos[]) session.getAttribute("sesion");
%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <%=resultado%>
      <br><br>
      <table border="10">
         <tr>
            <td>Resultados: </td>
         </tr>
      <%
      for(int i=0;i<y.length;i++){ 
      %>
      <tr>
         <td><%=y[i].getNumero()%></td>
      </tr>
         <% } %>
   </body>
</html>
