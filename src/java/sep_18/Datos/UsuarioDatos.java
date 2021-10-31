
package sep_18.Datos;

public class UsuarioDatos
{   
    
   public boolean    ValidarUsuario(String  usuario  ,  String   clave )
   {
       boolean  estado ;
      
       if(usuario.equals("ivan") &&   clave.equals("1234"))
       {
           estado=true;
       }
       else
       {
           estado=false;
       }
       return estado ;  
       
   }
    
}
