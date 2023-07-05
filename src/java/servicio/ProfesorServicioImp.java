/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import negocio.Profesor;
import persistencia.*;

public class ProfesorServicioImp implements ProfesorServicio {

    @Override
    public String grabar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro) {
        Profesor emp = new Profesor(IDpro, nbpro, appro, ndni, gen, niv, email, ncel, usupro, passpro);
        ProfesorDao empDao = new ProfesorDaoImp();
        String msg = empDao.grabar(emp);
        if (msg == null) {
            msg = "Profesor Registrado";
        }
        return msg;
    }

    @Override
    public Object[] validar(String usupro, String passpro) {
        ProfesorDao empDao = new ProfesorDaoImp();
        Profesor emp = empDao.validar(usupro, passpro);
        if (emp != null) {
            Object[] fil = new Object[2];
            fil[0] = emp.getUsupro();
            fil[1] = emp.getPasspro();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String IDpro) {
        Profesor emp = new ProfesorDaoImp().buscar(IDpro);
        if (emp != null) {
            Object[] f = new Object[10];
            f[0] = emp.getIDpro();
            f[1] = emp.getNbpro();
            f[2] = emp.getAppro();
            f[3] = emp.getNdni();
            f[4] = emp.getGen();
            f[5] = emp.getNiv();
            f[6] = emp.getEmail();
            f[7] = emp.getNcel();
            f[8] = emp.getUsupro();
            f[9] = emp.getPasspro();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ProfesorDaoImp().listar();
    }

    @Override
    public String Actualizar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro) {
        Profesor emp = new Profesor(IDpro, nbpro, appro, ndni, gen, niv, email, ncel, usupro, passpro);
        ProfesorDao empDao = new ProfesorDaoImp();
        String msg = empDao.actualizar(emp);
        if (msg == null) {
            msg = "Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro) {
        Profesor emp = new Profesor(IDpro, nbpro, appro, ndni, gen, niv, email, ncel, usupro, passpro);
        ProfesorDao empDao = new ProfesorDaoImp();
        String msg = empDao.eliminar(emp);
        if (msg == null) {
            msg = "Profesor Eliminado";
        }
        return msg;
    }
    
    @Override
    public Object[] perfil() {
        Profesor emp = new ProfesorDaoImp().perfil();
        if (emp != null) {
            Object[] f = new Object[10];
            f[0] = emp.getIDpro();
            f[1] = emp.getNbpro();
            f[2] = emp.getAppro();
            f[3] = emp.getNdni();
            f[4] = emp.getGen();
            f[5] = emp.getNiv();
            f[6] = emp.getEmail();
            f[7] = emp.getNcel();
            f[8] = emp.getUsupro();
            f[9] = emp.getPasspro();
            return f;
        }
        return null;
    }
}
