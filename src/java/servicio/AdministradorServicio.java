package servicio;

import java.util.List;

public interface AdministradorServicio {

    public String grabar(String IDadm, String nbadm,
            String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm);

    public Object[] validar(String usuadm, String passadm);

    public Object[] buscar(String IDadm);

    public List listar();

    public String Actualizar(String IDadm, String nbadm,
            String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm);

    public String eliminar(String IDadm, String nbadm,
            String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm);
}
