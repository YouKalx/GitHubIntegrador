package persistencia;
import java.util.List;
import negocio.Horario;

public interface HorarioDao {
    public String grabar(Horario emp);
    public String actualizar(Horario emp);
    public String eliminar(Horario emp);
    public Horario buscar(String codho);
    public List listar();
    public Horario validar(String codho, String tur);
}
