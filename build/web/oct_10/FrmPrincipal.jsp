<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
      
      <script>
         function Escribir(){
            document.form.action="<%= request.getContextPath()%>/LecturaEscritura";
            doucment.form.method="GET";
            doucment.form.op.value="1";
            document.form.submit();
         }
         function Leer(){
            document.form.action="<%= request.getContextPath()%>/LecturaEscritura";
            doucment.form.method="GET";
            doucment.form.op.value="2";
            document.form.submit();
         }
      </script>
   </head>
   <body>
   <center>
      <form name="form">
         <input type="hidden" name="op">

      <table border="10">
         <tr>
            <th><input type="submit" value="Escribir Archivo" onclick="Escribir()"></th>
            <th><input type="submit" value="Leer Archivo" onclick="Leer()"></th>
         </tr>
      </table>
      </form>
   </center>
   </body>
</html>
