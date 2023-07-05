package persistencia;
import java.util.List;
import negocio.Notas;

public interface NotaDao {
    public String grabar(Notas emp);
    public String actualizar(Notas emp);
    public String eliminar(Notas emp);
    public Notas buscar(String cod);
    public List listar();
    
    
}
