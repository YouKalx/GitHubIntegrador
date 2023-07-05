package persistencia;

import java.util.List;
import negocio.Tramites;

public class TramiteDaoImp implements TramiteDao{

    @Override
    public String grabar(Tramites emp) {
        String sql="insert into tramites values('"+emp.getCod()+"','"+emp.getTipo()+"','"+emp.getArchi()+"')";
        return Operacion.ejecutar(sql);
    }
    
    @Override
    public String actualizar(Tramites emp) {
        String sql="update tramites set tipo="+emp.getTipo()+
                "' where tipo='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Tramites emp) {
        String sql="delete from tramites where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Tramites buscar(String cod) {
        String sql="select * from tramites where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Tramites emp=new Tramites();
           emp.setCod(fil[0].toString());
           emp.setTipo(fil[1].toString());
           emp.setArchi(fil[2].toString());
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from tramites";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }
    
}
