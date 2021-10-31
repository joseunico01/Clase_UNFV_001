package oct_10_manejo_sesion.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oct_10_manejo_sesion.modelo.*;

public class ArregloObjectosControlador extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      HttpSession misesion =request.getSession(true);//Iniciando la sesion
      ArregloObjetosDAO objeto=new ArregloObjetosDAO();
      objeto.CargarDatos();
      
      String resultado=objeto.MostrarDatos1();
      ArregloObjetos y[]=objeto.MostrarDatos2();
      misesion.setAttribute("misesion", resultado);//estoy guardando la sesion
      misesion.setAttribute("sesion", y);//estoy guardando la sesion


      //para rediregirno a esta pagina
      getServletContext().getRequestDispatcher("/oct_10_manejoSesiones/resultado.jsp").forward(request, response);
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
