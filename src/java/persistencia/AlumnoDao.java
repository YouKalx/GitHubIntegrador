package persistencia;
import java.util.List;
import negocio.Alumno;

public interface AlumnoDao {
    public String grabar(Alumno emp);
    public String actualizar(Alumno emp);
    public String eliminar(Alumno emp);
    public Alumno buscar(String cod);
    public List listar();
    public Alumno validar(String usu, String pas);
}
