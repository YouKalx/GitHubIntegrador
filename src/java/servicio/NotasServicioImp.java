package servicio;

import java.util.List;
import negocio.Notas;
import persistencia.*;

public class NotasServicioImp implements NotasServicio{
    @Override
    public String grabar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado){
        Notas emp=new Notas(IDalu, nbalu, n1,n2,n3,n4,n5,nf, estado);
        NotaDao empDao=new NotaDaoImp();
        String msg=empDao.grabar(emp);
        if (msg==null) {
            msg="Nota Registrado";
        }
        return msg;
    }

    @Override
    public Object[] buscar(String codac) {
        Notas emp=new NotaDaoImp().buscar(codac);
        if (emp!=null) {
            Object[]f=new Object[9];
            f[0]=emp.getIDalu();
            f[1]=emp.getNbalu();
            f[2]=emp.getN1();
            f[3]=emp.getN2();
            f[4]=emp.getN3();
            f[5]=emp.getN4();
            f[6]=emp.getN5();
            f[7]=emp.getNf();
            f[8]=emp.getEstado();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ActividadesDaoImp().listar();
    }

    @Override
    public String Actualizar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado) {
        Notas emp=new Notas(IDalu, nbalu, n1,n2,n3,n4,n5,nf, estado);
        NotaDao empDao=new NotaDaoImp();
        String msg=empDao.actualizar(emp);
        if (msg==null) {
            msg="Datos Actualizados";
        }
        return msg;
    }

    @Override
    public String eliminar(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado) {
        Notas emp=new Notas(IDalu, nbalu, n1,n2,n3,n4,n5,nf, estado);
        NotaDao empDao=new NotaDaoImp();
        String msg=empDao.eliminar(emp);
        if (msg==null) {
            msg="Nota Eliminada";
        }
        return msg;
    }


}
