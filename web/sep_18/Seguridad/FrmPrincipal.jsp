<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function   cerrar()
            {     document.form.action="<%=request.getContextPath()%>/CerrarControlador"; // destino  hacia  otra  pagina 
                  document.form.method="GET"; //  tipo redireccionamiento 
                  document.form.submit(); // es  un metodo para enviar los  parametros                
            }
            
        </script>        
    </head>
    <body>
        <center>
        <form name="form">
            <table style="width: 400px;height: 100px ;background-color: darkblue">               
                <tr >
                    <td  colspan="2">
                          <center>
                              <input type="button" name="bntcerrarSesion" value="cerrar Sesion"  onclick="cerrar()"/>
                          </center>                     
                    </td>
                </tr>
            </table>           
        </form>
    </center>
    </body>
</html>
