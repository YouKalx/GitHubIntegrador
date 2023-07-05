
package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicio.ActividadesServicioImp;


@WebServlet(name = "ActividadesControl", urlPatterns = {"/ActividadesControl"})
public class ActividadesControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc= request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String codac=request.getParameter("codac");
            String nom=request.getParameter("nom");
            String des=request.getParameter("des");
            String dia=request.getParameter("dia");
            String hora=request.getParameter("hora");
            String msg =new ActividadesServicioImp().grabar(codac, nom, des,dia, hora);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");   
        }
        if (acc.equals("Iniciar Sesion")) {
            String usu=request.getParameter("usu");
            String pas=request.getParameter("pas");
            Object[]fil=new ActividadesServicioImp().validar(usu, pas);
            if (fil!=null) {
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("1_AdmiPortalPrincipal.jsp");   
            }else{
                request.getSession().setAttribute("msg", "Acceso no permitido");
                response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");     
            }  
        }
        if (acc.equals("Buscar")) {
            String codac=request.getParameter("codac");
            Object[]f=new ActividadesServicioImp().buscar(codac);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AdmiPortal_actividad_modificar.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe el actividad solicitado");
                response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");  
            }
        }
        if (acc.equals("Listar")) {
            List lis=new ActividadesServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_actividad_listar.jsp");
        }
        
        if (acc.equals("Actualizar")) {
            String codac=request.getParameter("codac");
            String nom=request.getParameter("nom");
            String des=request.getParameter("des");
            String dia=request.getParameter("dia");
            String hora=request.getParameter("hora");
            String msg =new ActividadesServicioImp().Actualizar(codac, nom, des,dia, hora);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");  
        }
        
        if (acc.equals("Eliminar")) {
            String codac=request.getParameter("codac");
            String nom=request.getParameter("nom");
            String des=request.getParameter("des");
            String dia=request.getParameter("dia");
            String hora=request.getParameter("hora");
            String msg =new ActividadesServicioImp().eliminar(codac, nom, des,dia, hora);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");   
        }
        
        if (acc.equals("Eventos Doc")) {
            List lis=new ActividadesServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("ProPortal_Eventos.jsp");
        }
        
        if (acc.equals("Eventos Est")) {
            List lis=new ActividadesServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AlumPortal_Eventos.jsp");
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
