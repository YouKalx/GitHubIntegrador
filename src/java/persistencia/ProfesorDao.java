package persistencia;

import java.util.List;
import negocio.Profesor;

public interface ProfesorDao {

    public String grabar(Profesor emp);

    public String actualizar(Profesor emp);

    public String eliminar(Profesor emp);

    public Profesor buscar(String IDpro);

    public List listar();

    public Profesor validar(String usupro, String passpro);
}
