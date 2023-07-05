
package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicio.TramiteServicioImp;


@WebServlet(name = "TramitesControl", urlPatterns = {"/TramitesControl"})
public class TramitesControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc= request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String cod=request.getParameter("cod");
            String tipo=request.getParameter("tipo");
            String archi=request.getParameter("archi");
            String msg =new TramiteServicioImp().grabar(cod, tipo, archi);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AlumPortal_TraSol_mensaje.jsp");   
        }
       
        if (acc.equals("Buscar")) {
            String codac=request.getParameter("codac");
            Object[]f=new TramiteServicioImp().buscar(codac);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AdmiPortal_actividad_modificar.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe el actividad solicitado");
                response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");  
            }
        }
        if (acc.equals("Listar")) {
            List lis=new TramiteServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_actividad_listar.jsp");
        }
        
        if (acc.equals("Actualizar")) {
            String cod=request.getParameter("cod");
            String tipo=request.getParameter("tipo");
            String archi=request.getParameter("archi");
            String msg =new TramiteServicioImp().Actualizar(cod, tipo, archi);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");  
        }
        
        if (acc.equals("Eliminar")) {
            String cod=request.getParameter("cod");
            String tipo=request.getParameter("tipo");
            String archi=request.getParameter("archi");
            String msg =new TramiteServicioImp().eliminar(cod, tipo, archi);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");   
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
