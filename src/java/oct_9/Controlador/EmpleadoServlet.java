package oct_9.Controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oct_9.Bean.EmpleadoBean;
import oct_9.DAO.EmpleadoDAO;

public class EmpleadoServlet extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
          int  op=Integer.parseInt(request.getParameter("op"));
          String  pagina="";
          
          switch(op)
          {  case 1: {
                  EmpleadoDAO objEmpleadoDAO=new EmpleadoDAO();
                  ArrayList<EmpleadoBean>  lista=objEmpleadoDAO.ListarEmpleados();
                  request.setAttribute("lista",lista);
                  pagina="/oct_9/FrmEliminarEmpleado.jsp";
                  break;} 
              case 2: {
                   int  codigo =Integer.parseInt(request.getParameter("codigo1"));
                   EmpleadoBean  objEmpleadoBean=new EmpleadoBean(codigo,null,null,null);
                    EmpleadoDAO   objEmpleadoDAO=new EmpleadoDAO();
                                  objEmpleadoDAO.EliminarEmpleado(objEmpleadoBean);
                                  ArrayList<EmpleadoBean>  lista=objEmpleadoDAO.ListarEmpleados();
                  request.setAttribute("lista",lista);                  
                  pagina="/oct_9/FrmEliminarEmpleado.jsp"; 
                  break;} 
          }            
       getServletContext().getRequestDispatcher(pagina).forward(request, response);
            
            
      
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
