package servicio;

import java.util.List;
import negocio.Horario;
import persistencia.*;

public class HorarioServicioImp implements HorarioServicio{
    @Override
    public String grabar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jue, String vie){
        Horario emp=new Horario(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
        HorarioDao empDao=new HorarioDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Horario Registrado";
        }
        return msg;
    }
    @Override
    public Object[]validar(String codho, String tur){
        HorarioDao empDao=new HorarioDaoImp();
        Horario emp=empDao.validar(codho, tur);
        if (emp!=null) {
            Object[]fil=new Object[2];
            fil[0]=emp.getCodho();
            fil[1]=emp.getTur();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String codho) {
        Horario emp=new HorarioDaoImp().buscar(codho);
        if (emp!=null) {
            Object[]f=new Object[9];
            f[0]=emp.getCodho();
            f[1]=emp.getTur();
            f[2]=emp.getHoini();
            f[3]=emp.getHofin();
            f[4]=emp.getLun();
            f[5]=emp.getMar();
            f[6]=emp.getMie();
            f[7]=emp.getJue();
            f[8]=emp.getVie();
            
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new HorarioDaoImp().listar();
    }

    @Override
    public String Actualizar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jue, String vie) {
        Horario emp=new Horario(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
        HorarioDao empDao=new HorarioDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String codho, String tur, String hoini,String hofin,String lun,String mar,String mie,String jue, String vie) {
        Horario emp=new Horario(codho, tur, hoini, hofin, lun, mar, mie, jue, vie);
        HorarioDao empDao=new HorarioDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Horario Eliminado";
        }
        return msg;
    }


}
