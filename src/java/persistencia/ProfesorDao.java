package persistencia;
import java.util.List;
import negocio.Profesor;

public interface ProfesorDao {
    public String grabar(Profesor emp);
    public String actualizar(Profesor emp);
    public String eliminar(Profesor emp);
    public Profesor buscar(String cod);
    public List listar();
    public Profesor validar(String usu, String pas);
}
