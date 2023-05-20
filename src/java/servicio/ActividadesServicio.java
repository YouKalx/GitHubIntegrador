package servicio;
import java.util.List;

public interface ActividadesServicio {
    public String grabar(String codac, String nom, String des,String dia,String hora);
    public Object[]validar(String usu, String pas);
    public Object[]buscar(String codac);
    public List listar();
    public  String Actualizar(String codac, String nom, String des,String dia,String hora);
     public String eliminar(String codac, String nom, String des,String dia,String hora);
}
