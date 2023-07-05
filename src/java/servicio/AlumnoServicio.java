package servicio;
import java.util.List;

public interface AlumnoServicio {
    public String grabar(String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu);
    public Object[] validar(String usualu, String passalu);
    public Object[] buscar(String IDalu);
    public List listar();
    public  String Actualizar(String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu);
    public String eliminar (String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu);
    public Object[] perfil();
}
