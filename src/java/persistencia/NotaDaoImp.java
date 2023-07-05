package persistencia;

import java.util.List;
import negocio.Notas;

public class NotaDaoImp implements NotaDao{

    @Override
    public String grabar(Notas emp) {
        String sql="insert into nota values('"+emp.getIDalu()+"','"+emp.getNbalu()+"','"+emp.getN1()+"','"+emp.getN2()+"','"+emp.getN3
        ()+"','"+emp.getN4()+"','"+emp.getN5()+"','"+emp.getNf()+"','"+emp.getEstado()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Notas emp) {
        String sql="update nota set n1="+emp.getN1()+
                "' where IDalu='"+emp.getIDalu()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Notas emp) {
        String sql="delete from nota where IDalu='"+emp.getIDalu()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Notas buscar(String codac) {
        String sql="select * from nota where IDalu= 'A001'"+"";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Notas emp=new Notas();
           emp.setIDalu(fil[0].toString());
           emp.setNbalu(fil[1].toString());
           emp.setN1(fil[2].toString());
           emp.setN2(fil[3].toString());
           emp.setN3(fil[4].toString());
           emp.setN4(fil[5].toString());
           emp.setN5(fil[6].toString());
           emp.setNf(fil[7].toString());
           emp.setEstado(fil[8].toString());
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from nota";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

}
