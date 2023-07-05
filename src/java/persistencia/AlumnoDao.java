package persistencia;

import java.util.List;
import negocio.Alumno;

public interface AlumnoDao {

    public String grabar(Alumno emp);

    public String actualizar(Alumno emp);

    public String eliminar(Alumno emp);

    public Alumno buscar(String IDalu);

    public List listar();

    public Alumno validar(String usualu, String passalu);
    
    public Alumno perfil();
}
