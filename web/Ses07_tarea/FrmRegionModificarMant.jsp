<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ses07_tarea.BEAN.RegionBean" %>

<%!
   RegionBean objregionBean=null;
%>
<%
objregionBean=(RegionBean)request.getAttribute("datos");
%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
      <script>
         function salir(){
            document.form.action="<%=request.getContextPath()%>/RegionServlet";
            document.form.method="GET";
            document.form.op.value="5";
            document.form.submit();
         }
         function modificar(){
            document.form.action="<%=request.getContextPath()%>/RegionServlet";
            document.form.method="GET";
            document.form.op.value="7";
            document.form.submit();
         }
      </script>
   </head>
   <body>
      <form name="form">
         <input type="hidden" name="op">
         <input type="hidden" name="CODIGO" value="<%=objregionBean.getCODREGION()%>">

         <center>
            <table>
               <tr>
                  <td colspan="2">Modificar Tabla Region</td>
               </tr>
               <tr>
                  <td>Codigo:</td>
                  <td>
                     <input type="text" disabled="false" name="txtcodigo" value="<%=objregionBean.getCODREGION()%>">
                  </td>
               </tr>
               <tr>
                  <td>Nombre:</td>
                  <td>
                     <input type="text" disabled="false" name="txtcodigo" value="<%=objregionBean.getNOMBREGION()%>">
                  </td>
               </tr>
            </table>

                  <table border="1">
                     <tr>
                        <td><button onclick="modificar()">Modificar</button></td>
                        <td><button onclick="salir()">Salir</button></td>
                     </tr>
                  </table>
                  <font>
                     <%
                     if(request.getAttribute("mensaje")!=null){
                        String msj=(String)request.getAttribute("mensaje");
                        out.print(msj);
                     }
                     %>
                  </font>
         </center>
      </form>
      
   </body>
</html>
