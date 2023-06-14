package servicio;

import java.util.List;
import negocio.Administrador;
import persistencia.*;

public class AdministradorServicioImp implements AdministradorServicio {

    @Override
    public String grabar(String IDadm, String nbadm,
           String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm) {
        Administrador emp = new Administrador(IDadm, nbadm, apadm, ndni, gen, email, ncel, usuadm, passadm);
        AdministradorDao empDao = new AdministradorDaoImp();
        String msg = empDao.grabar(emp);
        if (msg == null) {
            msg = "Administrador Registrado";
        }
        return msg;
    }

    @Override
    public Object[] validar(String usuadm, String passadm) {
        AdministradorDao empDao = new AdministradorDaoImp();
        Administrador emp = empDao.validar(usuadm, passadm);
        if (emp != null) {
            Object[] fil = new Object[2];
            fil[0] = emp.getUsuadm();
            fil[1] = emp.getPassadm();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String IDadm) {
        Administrador emp = new AdministradorDaoImp().buscar(IDadm);
        if (emp != null) {
            Object[] f = new Object[9];
            f[0] = emp.getIDadm();
            f[1] = emp.getNbadm();
            f[2] = emp.getApadm();
            f[3] = emp.getNdni();
            f[4] = emp.getGen();
            f[5] = emp.getEmail();
            f[6] = emp.getNcel();
            f[7] = emp.getUsuadm();
            f[8] = emp.getPassadm();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new AdministradorDaoImp().listar();
    }

    @Override
    public String Actualizar(String IDadm, String nbadm,
           String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm) {
        Administrador emp = new Administrador(IDadm, nbadm, apadm, ndni, gen, email, ncel, usuadm, passadm);
        AdministradorDao empDao = new AdministradorDaoImp();
        String msg = empDao.actualizar(emp);
        if (msg == null) {
            msg = "Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String IDadm, String nbadm,
           String apadm, String ndni, String gen, String email, String ncel, String usuadm, String passadm) {
        Administrador emp = new Administrador(IDadm, nbadm, apadm, ndni, gen, email, ncel, usuadm, passadm);
        AdministradorDao empDao = new AdministradorDaoImp();
        String msg = empDao.eliminar(emp);
        if (msg == null) {
            msg = "Administrador Eliminado";
        }
        return msg;
    }
}
