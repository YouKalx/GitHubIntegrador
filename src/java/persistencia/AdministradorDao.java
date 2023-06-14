package persistencia;
import java.util.List;
import negocio.Administrador;

public interface AdministradorDao {
    public String grabar(Administrador emp);
    public String actualizar(Administrador emp);
    public String eliminar(Administrador emp);
    public Administrador buscar(String IDadm);
    public List listar();
    public Administrador validar(String usuadm, String passadm);
}
