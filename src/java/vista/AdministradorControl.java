
package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import negocio.Administrador;
import servicio.AdministradorServicioImp;

@WebServlet(name = "AdministradorControl", urlPatterns = {"/AdministradorControl"})
public class AdministradorControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc= request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String ape=request.getParameter("ape");
            String dni=request.getParameter("dni");
            String usu=request.getParameter("usu");
            String pas=request.getParameter("pas");
            String msg =new AdministradorServicioImp().grabar(cod, nom,ape, dni, usu, pas);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_admi_mensaje.jsp");   
        }
        if (acc.equals("Iniciar Sesion")) {
            String usu=request.getParameter("usu");
            String pas=request.getParameter("pas");
            Object[]fil=new AdministradorServicioImp().validar(usu, pas);
            if (fil!=null) {
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("1_AdmiPortalPrincipal.jsp");   
            }else{
                request.getSession().setAttribute("msg", "Acceso no permitido");
                response.sendRedirect("Admin_Intranet_mensaje.jsp");     
            }  
        }
        if (acc.equals("Buscar")) {
            String cod=request.getParameter("cod");
            Object[]f=new AdministradorServicioImp().buscar(cod);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AdmiPortal_admi_modificar.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe el empleado solicitado");
                response.sendRedirect("AdmiPortal_admi_mensaje.jsp");  
            }
        }
        if (acc.equals("Listar")) {
            List lis=new AdministradorServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_admi_listar.jsp");
        }
        
        if (acc.equals("Actualizar")) {
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String ape=request.getParameter("ape");
            String dni=request.getParameter("dni");
            String usu=request.getParameter("usu");
            String pas=request.getParameter("pas");
            String msg =new AdministradorServicioImp().Actualizar(cod, nom,ape, dni, usu, pas);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_admi_mensaje.jsp");  
        }
        
        if (acc.equals("Eliminar")) {
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String ape=request.getParameter("ape");
            String dni=request.getParameter("dni");
            String usu=request.getParameter("usu");
            String pas=request.getParameter("pas");
            String msg =new AdministradorServicioImp().eliminar(cod, nom,ape, dni, usu, pas);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_admi_mensaje.jsp");   
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
