package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.AlumnoServicioImp;

@WebServlet(name = "AlumnoControl", urlPatterns = {"/AlumnoControl"})
public class AlumnoControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String IDalu = request.getParameter("IDalu");
            String nbalu = request.getParameter("nbalu");
            String apalu = request.getParameter("apalu");
            String ndni = request.getParameter("ndni");
            String gen = request.getParameter("gen");
            String niv = request.getParameter("niv");
            String email = request.getParameter("email");
            String ncel = request.getParameter("ncel");
            String usualu = request.getParameter("usualu");
            String passalu = request.getParameter("passalu");
            String msg = new AlumnoServicioImp().grabar(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_alum_mensaje.jsp");
        }
        if (acc.equals("Iniciar Sesion")) {
            String usualu = request.getParameter("usualu");
            String passalu = request.getParameter("passalu");
            Object[] fil = new AlumnoServicioImp().validar(usualu, passalu);
            if (fil != null) {
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("AlumPortal_Inicio.jsp");
            } else {
                request.getSession().setAttribute("msg", "Acceso no permitido");
                response.sendRedirect("Alumno_Intranet_mensaje.jsp");
            }
        }
        if (acc.equals("Buscar")) {
            String IDalu = request.getParameter("IDalu");
            Object[] f = new AlumnoServicioImp().buscar(IDalu);
            if (f != null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AdmiPortal_alum_modificar.jsp");
            } else {
                request.getSession().setAttribute("msg", "No existe el alumno solicitado");
                response.sendRedirect("AdmiPortal_alum_mensaje.jsp");
            }
        }
        if (acc.equals("Listar")) {
            List lis = new AlumnoServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_alum_listar.jsp");
        }

        if (acc.equals("Actualizar")) {
            String IDalu = request.getParameter("IDalu");
            String nbalu = request.getParameter("nbalu");
            String apalu = request.getParameter("apalu");
            String ndni = request.getParameter("ndni");
            String gen = request.getParameter("gen");
            String niv = request.getParameter("niv");
            String email = request.getParameter("email");
            String ncel = request.getParameter("ncel");
            String usualu = request.getParameter("usualu");
            String passalu = request.getParameter("passalu");
            String msg = new AlumnoServicioImp().Actualizar(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_alum_mensaje.jsp");
        }

        if (acc.equals("Eliminar")) {
            String IDalu = request.getParameter("IDalu");
            String nbalu = request.getParameter("nbalu");
            String apalu = request.getParameter("apalu");
            String ndni = request.getParameter("ndni");
            String gen = request.getParameter("gen");
            String niv = request.getParameter("niv");
            String email = request.getParameter("email");
            String ncel = request.getParameter("ncel");
            String usualu = request.getParameter("usualu");
            String passalu = request.getParameter("passalu");
            String msg = new AlumnoServicioImp().eliminar(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_alum_mensaje.jsp");
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
