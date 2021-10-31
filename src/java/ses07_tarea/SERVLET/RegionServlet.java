package ses07_tarea.SERVLET;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ses07_tarea.BEAN.RegionBean;
import ses07_tarea.DAO.RegionDAO;

public class RegionServlet extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {

      String opcad=request.getParameter("op");
      int op=Integer.parseInt(opcad);
      switch(op){
         case 1:{
            RegionDAO objRegionDAO= new RegionDAO();
            ArrayList listaregion=objRegionDAO.listarRegion();
            request.setAttribute("listaregion", listaregion);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionMant.jsp").forward(request, response);
            break;
         }

         case 2:{
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmMenuMant.jsp").forward(request, response);
            break;
         }

         case 3:{
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionRegistrarMant.jsp").forward(request, response);
            break;
         }

         case 4:{
            String mensaje="";
            String codcad=request.getParameter("txtcodigo");
            int codigo=Integer.parseInt(codcad);
            String nombre=request.getParameter("txtnombre");
            RegionBean objRegionBean=new RegionBean();
            objRegionBean.setCODREGION(codigo);
            objRegionBean.setNOMBREGION(nombre);
            RegionDAO objRegionDAO=new RegionDAO();
            int estado=objRegionDAO.InsertarRegion(objRegionBean);
            if(estado==1){
               mensaje="Registro Insertado!!";
            }else{
               mensaje="Registro no Insertado!!";
            }
            request.setAttribute("mensaje", mensaje);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionRegistrarMant.jsp").forward(request, response);
            break;

         }

         case 5:{
            RegionDAO objRegionDAO=new RegionDAO();
            ArrayList listaregion=objRegionDAO.listarRegion();
            request.setAttribute("listaregion", listaregion);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionMant.jsp").forward(request, response);
            break;

         }

         case 6:{
            String codcad=request.getParameter("COD");
            int codigo=Integer.parseInt(codcad);
            String nombre=request.getParameter("NOM");
            RegionBean objRegionBean=new RegionBean();
            objRegionBean.setCODREGION(codigo);
            objRegionBean.setNOMBREGION(nombre);
            request.setAttribute("datos", objRegionBean);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionModificarMant.jsp").forward(request, response);
            break;
         }

         case 7:{
            String mensaje="";
            String codcad=request.getParameter("CODIGO");
            int codigo=Integer.parseInt(codcad);
            String nombre=request.getParameter("txtnombre");
            RegionBean objRegionBean=new RegionBean();
            objRegionBean.setCODREGION(codigo);
            objRegionBean.setNOMBREGION(nombre);
            RegionDAO objRegionDao=new RegionDAO();
            int estado=objRegionDao.ModificarRegion(objRegionBean);
            if(estado==1){
               mensaje="Registro Modificado!!!";
            }else{
               mensaje="Registro No Modificado!!!";
            }
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("datos", objRegionBean);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionModificarMant.jsp").forward(request, response);
            break;
         }
         
         case 8:{
            String codcad=request.getParameter("COD");
            int codigo=Integer.parseInt(codcad);

            RegionBean objRegionBean=new RegionBean();
            objRegionBean.setCODREGION(codigo);

            RegionDAO objRegionDao=new RegionDAO();
            objRegionDao.EliminarRegion(objRegionBean);

            ArrayList listaregion=objRegionDao.listarRegion();
            request.setAttribute("listaregion", listaregion);
            getServletContext().getRequestDispatcher("/Ses07_tarea/FrmRegionMant.jsp").forward(request, response);
            break;
         }
         
      }
      
   }

   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   /**
    * Handles the HTTP <code>GET</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }

   /**
    * Handles the HTTP <code>POST</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }

   /**
    * Returns a short description of the servlet.
    *
    * @return a String containing servlet description
    */
   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
