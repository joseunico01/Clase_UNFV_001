package ses07_tarea.UTIL;

import java.sql.*;
import java.sql.DriverManager;

public class ConexionBD {
   
   public static Connection getConexionBD(){
      Connection cn=null;
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://localhost/bdmantenimiento", "root", "vasquez");
         System.out.println("Se conecto");
         
      } catch (Exception e) {
         System.out.println("NO SE CONECTO");
      }
      return cn;
   }
   
   public static void main(String[] args) {
      ConexionBD obj=new ConexionBD();
      obj.getConexionBD();
   }
   
}
