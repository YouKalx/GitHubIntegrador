package servicio;
import java.util.List;

public interface TramiteServicio {
    public String grabar(String cod, String tipo, String archi);
    public Object[]buscar(String codac);
    public List listar();
    public  String Actualizar(String cod, String tipo, String archia);
    public String eliminar(String cod, String tipo, String archi);
}
