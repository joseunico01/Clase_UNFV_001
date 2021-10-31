
package oct_9.Util;
  import   java.sql.*;
public class ConexionBD 
{    
    public static Connection  getConexionBD()
    {   Connection  cn=null;
        try 
        {   Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdunfvsamanta","root","vasquez");
            System.out.println(" Se conecto  !!!!!!");
            
        } 
         catch (Exception e) 
        {
            System.out.println(" No Se conecto  !!!!!!" +e);
        }
        return   cn;
    }
    /*
    public static void main(String[] args) {
      getConexionBD();
   }
    */
    
}
