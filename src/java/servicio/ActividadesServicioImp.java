package servicio;

import java.util.List;
import negocio.Actividades;
import persistencia.*;

public class ActividadesServicioImp implements ActividadesServicio{
    @Override
    public String grabar(String codac, String nom, String des,String dia,String hora){
        Actividades emp=new Actividades(codac, nom, des,dia, hora);
        ActividadesDao empDao=new ActividadesDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Actividad o evento Registrado";
        }
        return msg;
    }
    @Override
    public Object[]validar(String usu, String pas){
        ActividadesDao empDao=new ActividadesDaoImp();
        Actividades emp=empDao.validar(usu, pas);
        if (emp!=null) {
            Object[]fil=new Object[2];
            fil[0]=emp.getCodac();
            fil[1]=emp.getNom();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String codac) {
        Actividades emp=new ActividadesDaoImp().buscar(codac);
        if (emp!=null) {
            Object[]f=new Object[5];
            f[0]=emp.getCodac();
            f[1]=emp.getNom();
            f[2]=emp.getDes();
            f[3]=emp.getDia();
            f[4]=emp.getHora();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ActividadesDaoImp().listar();
    }

    @Override
    public String Actualizar(String codac, String nom, String des,String dia,String hora) {
        Actividades emp=new Actividades(codac, nom, des,dia, hora);
        ActividadesDao empDao=new ActividadesDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String codac, String nom, String des,String dia,String hora) {
        Actividades emp=new Actividades(codac, nom, des,dia, hora);
        ActividadesDao empDao=new ActividadesDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Actividad o evento Eliminado";
        }
        return msg;
    }


}
