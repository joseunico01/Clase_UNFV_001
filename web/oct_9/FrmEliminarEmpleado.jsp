<%@page import="java.util.ArrayList" %>
<%@page import="oct_9.Bean.EmpleadoBean" %>
<%!  
     ArrayList<EmpleadoBean>  lista ;
     EmpleadoBean objEmpleadoBean=null;    
  %>
<%    
   lista=(ArrayList<EmpleadoBean>)request.getAttribute("lista");    
 %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
             function   eliminar(codigo)
             {   document.form.action="<%=request.getContextPath()%>/EmpleadoServlet";
                 document.form.method="GET";                
                 document.form.op.value="2";
                 document.form.codigo1.value=codigo;
                 document.form.submit();
             }            
        </script>  
    </head>
    <body>
    <center>
        <form  name="form">
            <input type="hidden" name="op"> 
             <input type="hidden" name="codigo1"> 
            <table border="10">
                <tr>
                   <td>Eligir</td>
                   <td>Codigo</td>
                   <td>Nombre</td>
                   <td>Apellido</td>
                   <td>DNI</td>
                </tr>
                <%    for(EmpleadoBean   obj:lista){    %>
                 <tr             >
                     <td><input type="radio"   onclick="eliminar('<%=obj.getCodigo()%>')"></td>
                   <td><%=obj.getCodigo()%></td>
                   <td><%=obj.getNombre()%></td>
                   <td><%=obj.getApellido()%></td>
                   <td><%=obj.getDNI()%></td>
                </tr>                
                 <%    }  %>
            </table>
            
        </form>
    </center>  
    </body>
</html>
