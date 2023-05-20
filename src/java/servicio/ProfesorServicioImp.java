/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import negocio.Profesor;
import persistencia.*;

public class ProfesorServicioImp  implements ProfesorServicio {
    
    @Override
    public String grabar(String cod, String nom, String ape, String dni, String cel, String niv, String usu, String pas){
        Profesor emp=new Profesor(cod, nom, ape, dni,cel,niv, usu, pas);
        ProfesorDao empDao=new ProfesorDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Profesor Registrado";
        }
        return msg;
    }
    @Override
    public Object[]validar(String usu, String pas){
        ProfesorDao empDao=new ProfesorDaoImp();
        Profesor emp=empDao.validar(usu, pas);
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
        Profesor emp=new ProfesorDaoImp().buscar(cod);
        if (emp!=null) {
            Object[]f=new Object[8];
            f[0]=emp.getCod();
            f[1]=emp.getNom();
            f[2]=emp.getApe();
            f[3]=emp.getDni();
            f[4]=emp.getCel();
            f[5]=emp.getNiv();
            f[6]=emp.getUsu();
            f[7]=emp.getPas();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ProfesorDaoImp().listar();
    }

    @Override
    public String Actualizar(String cod, String nom, String ape, String dni, String cel, String niv, String usu, String pas) {
        Profesor emp=new Profesor(cod, nom, ape, dni,cel,niv, usu, pas);
        ProfesorDao empDao=new ProfesorDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String cod, String nom, String ape, String dni, String cel, String niv, String usu, String pas) {
        Profesor emp=new Profesor(cod, nom, ape, dni,cel,niv, usu, pas);
        ProfesorDao empDao=new ProfesorDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Profesor Eliminado";
        }
        return msg;
    }
}
