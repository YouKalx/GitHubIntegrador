package servicio;

import java.util.List;
import negocio.Administrador;
import persistencia.*;

public class AdministradorServicioImp implements AdministradorServicio{
    @Override
    public String grabar(String cod, String nom, String dni, String tip, String usu, String pas){
        Administrador emp=new Administrador(cod, nom, dni,tip, usu, pas);
        AdministradorDao empDao=new AdministradorDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Administrador Registrado";
        }
        return msg;
    }
    @Override
    public Object[]validar(String usu, String pas){
        AdministradorDao empDao=new AdministradorDaoImp();
        Administrador emp=empDao.validar(usu, pas);
        if (emp!=null) {
            Object[]fil=new Object[2];
            fil[0]=emp.getCod();
            fil[1]=emp.getNom();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String cod) {
        Administrador emp=new AdministradorDaoImp().buscar(cod);
        if (emp!=null) {
            Object[]f=new Object[6];
            f[0]=emp.getCod();
            f[1]=emp.getNom();
            f[2]=emp.getApe();
            f[3]=emp.getDni();
            f[4]=emp.getUsu();
            f[5]=emp.getPas();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new AdministradorDaoImp().listar();
    }

    @Override
    public String Actualizar(String cod, String nom,String ape, String dni, String usu, String pas) {
        Administrador emp=new Administrador(cod, nom, ape,dni, usu, pas);
        AdministradorDao empDao=new AdministradorDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String cod, String nom,String ape, String dni, String usu, String pas) {
        Administrador emp=new Administrador(cod, nom, ape,dni, usu, pas);
        AdministradorDao empDao=new AdministradorDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Administrador Eliminado";
        }
        return msg;
    }


}
