    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import negocio.Alumno;
import persistencia.*;

public class AlumnoServicioImp  implements AlumnoServicio {
    
    @Override
    public String grabar(String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu){
        Alumno emp=new Alumno(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
        AlumnoDao empDao=new AlumnoDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Alumno Registrado";
        }
        return msg;
    }
    @Override
    public Object[]validar(String usualu, String passalu){
                AlumnoDao empDao=new AlumnoDaoImp();
        Alumno emp=empDao.validar(usualu, passalu);
        if (emp!=null) {
            Object[]fil=new Object[2];
            fil[0]=emp.getUsualu();
            fil[1]=emp.getPassalu();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String IDalu) {
        Alumno emp=new AlumnoDaoImp().buscar(IDalu);
        if (emp!=null) {
            Object[]f=new Object[10];
            f[0] = emp.getIDalu();
            f[1] = emp.getNbalu();
            f[2] = emp.getApalu();
            f[3] = emp.getNdni();
            f[4] = emp.getGen();
            f[5] = emp.getNiv();
            f[6] = emp.getEmail();
            f[7] = emp.getNcel();
            f[8] = emp.getUsualu();
            f[9] = emp.getPassalu();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new AlumnoDaoImp().listar();
    }

    @Override
    public String Actualizar(String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu) {
        Alumno emp=new Alumno(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
        AlumnoDao empDao=new AlumnoDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String IDalu, String nbalu, String apalu, String ndni, String gen, String niv, String email, String ncel, String usualu, String passalu) {
        Alumno emp=new Alumno(IDalu, nbalu, apalu, ndni, gen, niv, email, ncel, usualu, passalu);
        AlumnoDao empDao=new AlumnoDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Alumno Eliminado";
        }
        return msg;
    }
}
