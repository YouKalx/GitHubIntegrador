package persistencia;
import java.util.List;
import negocio.Tramites;

public interface TramiteDao {
    public String grabar(Tramites emp);
    public String actualizar(Tramites emp);
    public String eliminar(Tramites emp);
    public Tramites buscar(String cod);
    public List listar();
}
