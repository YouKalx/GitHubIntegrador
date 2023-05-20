package persistencia;
import java.util.List;
import negocio.Actividades;

public interface ActividadesDao {
    public String grabar(Actividades emp);
    public String actualizar(Actividades emp);
    public String eliminar(Actividades emp);
    public Actividades buscar(String cod);
    public List listar();
    public Actividades validar(String usu, String pas);
}
