package servicio;

import java.util.List;
import negocio.Tramites;
import persistencia.*;

public class TramiteServicioImp implements TramiteServicio{
    @Override
    public String grabar(String cod, String tipo, String archi){
        Tramites emp=new Tramites(cod, tipo, archi);
        TramiteDao empDao=new TramiteDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Tramite Registrado";
        }
        return msg;
    }

    @Override
    public Object[] buscar(String codac) {
        Tramites emp=new TramiteDaoImp().buscar(codac);
        if (emp!=null) {
            Object[]f=new Object[3];
            f[0]=emp.getCod();
            f[1]=emp.getTipo();
            f[2]=emp.getArchi();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ActividadesDaoImp().listar();
    }

    @Override
    public String Actualizar(String cod, String tipo, String archi) {
        Tramites emp=new Tramites(cod, tipo, archi);
        TramiteDao empDao=new TramiteDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String cod, String tipo, String archi) {
        Tramites emp=new Tramites(cod, tipo, archi);
        TramiteDao empDao=new TramiteDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Tramite Eliminado";
        }
        return msg;
    }


}
