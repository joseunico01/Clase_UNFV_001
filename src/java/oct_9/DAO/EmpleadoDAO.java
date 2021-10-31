
package oct_9.DAO;

import java.util.ArrayList;
import java.sql.*;

import oct_9.Bean.EmpleadoBean ;
import oct_9.Util.ConexionBD ;
public class EmpleadoDAO
{  Connection cn=null;
   PreparedStatement pt=null; // permite prepar el SQL
   ResultSet rs=null; //  me  permite manipular los  registros
   ArrayList<EmpleadoBean> listado =null;
   EmpleadoBean  objEmpleadoBean =null;
   
   public ArrayList<EmpleadoBean> ListarEmpleados()
   {
       try {
         cn=  ConexionBD.getConexionBD();
         pt=cn.prepareStatement("select * from  empleado ;");
         rs=pt.executeQuery(); //  ejecutar  la  sentencia SQL
         listado=new ArrayList<EmpleadoBean>();
         while(rs.next())
         {   objEmpleadoBean=new EmpleadoBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
             listado.add(objEmpleadoBean);            
         }
         pt.close();
         rs.close();
         cn.close();           
       } catch (Exception e) {
       }       
       return  listado;
   }   
   public  void EliminarEmpleado (EmpleadoBean objEmple)
   {   try {
         cn=  ConexionBD.getConexionBD();
         pt=cn.prepareStatement("delete   from  empleado  where  codigo =? ;");
         pt.setInt(1, objEmple.getCodigo());
         pt.executeUpdate(); //  ejecutar  la  sentencia SQL
         pt.close();       
         cn.close();            
       } catch (Exception e) {
       }       
   }     
}
