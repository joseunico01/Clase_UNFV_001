package ses07_tarea.DAO;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ses07_tarea.BEAN.RegionBean;
import ses07_tarea.UTIL.ConexionBD;

public class RegionDAO {
   
   Connection cn=null;
   PreparedStatement pt=null;
   ResultSet rs=null;
   ArrayList<RegionBean> lista=null;
   RegionBean objRegionBean=null;
   public ArrayList<RegionBean> listarRegion(){
      try {
         cn=ConexionBD.getConexionBD();
         pt=cn.prepareStatement("select * from region;");
         rs=pt.executeQuery();
         lista=new ArrayList<RegionBean>();
         while(rs.next()){
            objRegionBean=new RegionBean();
            objRegionBean.setCODREGION(rs.getInt(1));
            objRegionBean.setNOMBREGION(rs.getString(2));
            lista.add(objRegionBean);
            
         }
         pt.close();
         rs.close();
         cn.close();
         
      } catch (Exception e) {
      }
      return lista;
   }

   public int InsertarRegion(RegionBean obRegionBean){
      int estado=0;
      try {
         cn=ConexionBD.getConexionBD();
         pt=cn.prepareStatement("INSERT INTO REGION(CODREGION, NOMBREGION) VALUES(?,?);");
         pt.setInt(1, objRegionBean.getCODREGION());
         pt.setString(2, objRegionBean.getNOMBREGION());
         estado=pt.executeUpdate();
         pt.close();
         cn.close();
         
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null , "Error"+e);
      }
      return estado;
   }

   public int ModificarRegion(RegionBean obRegionBean){
      int estado=0;
      try {
         cn=ConexionBD.getConexionBD();
         pt=cn.prepareStatement("UPADTE REGION SET NOMBREGION=? WHERE CODREGION=? ;");
         pt.setString(1, objRegionBean.getNOMBREGION());
         pt.setInt(2, objRegionBean.getCODREGION());
         estado=pt.executeUpdate();
         pt.close();
         cn.close();
         
      } catch (Exception e) {
      }
      return estado;
   }

   public int EliminarRegion(RegionBean objRegionBean){
      int estado=0;
      try {
         cn=ConexionBD.getConexionBD();
         pt=cn.prepareStatement("DELETE FROM REGION WHERE CODREGION=? ;");
         pt.setInt(1, objRegionBean.getCODREGION());
         estado=pt.executeUpdate();
         pt.close();
         cn.close();
         
      } catch (Exception e) {
      }
      return estado;
   }
}
