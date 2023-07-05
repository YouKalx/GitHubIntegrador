
package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicio.NotasServicioImp;


@WebServlet(name = "NotaControl", urlPatterns = {"/NotaControl"})
public class NotaControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc= request.getParameter("acc");
        if (acc.equals("Registrar")) {
            String IDalu=request.getParameter("IDalu");
            String nbalu=request.getParameter("nbalu");
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            String n3=request.getParameter("n3");
            String n4=request.getParameter("n4");
            String n5=request.getParameter("n5");
            String nf=request.getParameter("nf");
            String estado=request.getParameter("estado");
            String msg =new NotasServicioImp().grabar(IDalu, nbalu, n1,n2, n3,n4,n5,nf,estado);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("ProPortal_Nota_mensaje.jsp");   
        }

        if (acc.equals("Buscar")) {
            String IDalu=request.getParameter("IDalu");
            Object[]f=new NotasServicioImp().buscar(IDalu);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("ProPortal_Nota.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe la nota solicitado");
                response.sendRedirect("ProPortal_Nota_mensaje.jsp");  
            }
        }
        if (acc.equals("Listar")) {
            List lis=new NotasServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("AdmiPortal_actividad_listar.jsp");
        }
        
        if (acc.equals("Actualizar")) {
            String IDalu=request.getParameter("IDalu");
            String nbalu=request.getParameter("nbalu");
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            String n3=request.getParameter("n3");
            String n4=request.getParameter("n4");
            String n5=request.getParameter("n5");
            String nf=request.getParameter("nf");
            String estado=request.getParameter("estado");
            String msg =new NotasServicioImp().Actualizar(IDalu, nbalu, n1,n2, n3,n4,n5,nf,estado);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");  
        }
        
        if (acc.equals("Eliminar")) {
            String IDalu=request.getParameter("IDalu");
            String nbalu=request.getParameter("nbalu");
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            String n3=request.getParameter("n3");
            String n4=request.getParameter("n4");
            String n5=request.getParameter("n5");
            String nf=request.getParameter("nf");
            String estado=request.getParameter("estado");
            String msg =new NotasServicioImp().eliminar(IDalu, nbalu, n1,n2, n3,n4,n5,nf,estado);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("AdmiPortal_actividad_mensaje.jsp");   
        }
        if (acc.equals("Notas")) {
            String IDalu=request.getParameter("IDalu");
            Object[]f=new NotasServicioImp().buscar(IDalu);
            if (f!=null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("AlumPortal_Nota.jsp");
            }else{
                request.getSession().setAttribute("msg", "No existe la nota solicitado");
                response.sendRedirect("AlumPortal_Nota_mensaje.jsp");  
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
