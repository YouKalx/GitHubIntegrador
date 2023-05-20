package servicio;
import java.util.List;

public interface HorarioServicio {
    public String grabar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jueve, String vie);
    public Object[]validar(String codho, String tur);
    public Object[]buscar(String codho);
    public List listar();
    public  String Actualizar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jueve, String vie);
    public String eliminar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jueve, String vie);
}
