package servicio;

import java.util.List;

public interface ProfesorServicio {

    public String grabar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro);

    public Object[] validar(String usupro, String passpro);

    public Object[] buscar(String IDpro);

    public List listar();

    public String Actualizar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro);

    public String eliminar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro);
    
    public Object[] perfil();
}
