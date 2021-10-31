package oct_10.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oct_10.modelo.EscribeLeeFichero;

public class LecturaEscritura extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out=response.getWriter();
      
      EscribeLeeFichero objeto=new EscribeLeeFichero();

      int op=Integer.parseInt(request.getParameter("op"));
      switch(op){
         
         case 1: objeto.EscribeFichero();
            getServletContext().getRequestDispatcher("/oct_10/FrmPrincipal.jsp").forward(request, response);
         break;
         
         case 2: {
            String resultado=objeto.LeeFichero();
            //out.print("<center>"+resultado+"</center>");
            request.setAttribute("resultado", resultado);
            getServletContext().getRequestDispatcher("/oct_10/FrmPrincipal.jsp").forward(request, response);
            break;}

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
