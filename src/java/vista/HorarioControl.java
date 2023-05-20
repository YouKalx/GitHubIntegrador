
package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicio.HorarioServicioImp;


@WebServlet(name = "HorarioControl", urlPatterns = {"/HorarioControl"})
public class HorarioControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc= request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String codho=request.getParameter("codho");
            String tur=request.getParameter("tur");
            String hoini=request.getParameter("hoini");
            String hofin=request.getParameter("hofin");
            String lun=request.getParameter("lun");
            String mar=request.getParameter("mar");
            String mie=request.getParameter("mie");
            String jue=request.getParameter("jue");        
            String vie=request.getParameter("vie");
            String msg =new HorarioServicioImp().grabar(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_horario_mensaje.jsp");   
        }
        if (acc.equals("Iniciar Sesion")) {
            String codho=request.getParameter("codho");
            String tur=request.getParameter("tur");
            Object[]fil=new HorarioServicioImp().validar(codho, tur);
            if (fil!=null) {
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("1_AdmiPortalPrincipal.jsp");   
            }else{
                request.getSession().setAttribute("msg", "Acceso no permitido");
                response.sendRedirect("AdmiPortal_horario_mensaje.jsp");     
            }  
        }
        if (acc.equals("Buscar")) {
            String codho=request.getParameter("codho");
            Object[]f=new HorarioServicioImp().buscar(codho);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AdmiPortal_horario_modificar.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe el horario solicitado");
                response.sendRedirect("AdmiPortal_horario_mensaje.jsp");  
            }
        }
        if (acc.equals("Listar")) {
            List lis=new HorarioServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_horario_listar.jsp");
        }
        
        if (acc.equals("Actualizar")) {
            String codho=request.getParameter("codho");
            String tur=request.getParameter("tur");
            String hoini=request.getParameter("hoini");
            String hofin=request.getParameter("hofin");
            String lun=request.getParameter("lun");
            String mar=request.getParameter("mar");
            String mie=request.getParameter("mie");
            String jue=request.getParameter("jue");        
            String vie=request.getParameter("vie");
            String msg =new HorarioServicioImp().Actualizar(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_horario_mensaje.jsp");  
        }
        
        if (acc.equals("Eliminar")) {
            String codho=request.getParameter("codho");
            String tur=request.getParameter("tur");
            String hoini=request.getParameter("hoini");
            String hofin=request.getParameter("hofin");
            String lun=request.getParameter("lun");
            String mar=request.getParameter("mar");
            String mie=request.getParameter("mie");
            String jue=request.getParameter("jue");        
            String vie=request.getParameter("vie");
            String msg =new HorarioServicioImp().eliminar(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_horario_mensaje.jsp");   
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
