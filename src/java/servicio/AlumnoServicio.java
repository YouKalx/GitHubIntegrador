package servicio;
import java.util.List;

public interface AlumnoServicio {
    public String grabar(String cod, String nom, String ape, String dni, String cel, String niv, String usu, String pas);
    public Object[] validar(String usu, String pas);
    public Object[] buscar(String cod);
    public List listar();
    public  String Actualizar(String cod, String nom, String ape, String dni,String cel, String niv, String usu, String pas);
    public String eliminar (String cod, String nom, String ape, String dni,String cel, String niv, String usu, String pas);
}
