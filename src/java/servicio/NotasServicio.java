package servicio;

import java.util.List;

public interface NotasServicio {

    public String grabar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado);

    public Object[] buscar(String codac);

    public List listar();

    public String Actualizar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado);

    public String eliminar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado);
}
