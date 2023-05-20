package persistencia;

import java.util.List;
import negocio.Administrador;

public class AdministradorDaoImp implements AdministradorDao{

    @Override
    public String grabar(Administrador emp) {
        String sql="insert into administrador values('"+emp.getCod()+"','"+emp.getNom()+"','"+emp.getApe()+"','"+emp.getDni()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Administrador emp) {
        String sql="update administrador set nom='"+emp.getNom()+","+"ape='"+emp.getApe()+","+"dni='"+emp.getDni()+","+"usu='"+emp.getUsu()+","+"pas='"+emp.getPas()+"where cod="+emp.getPas()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Administrador emp) {
        String sql="delete from administrador where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Administrador buscar(String cod) {
        String sql="select * from administrador where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Administrador emp=new Administrador();
           emp.setCod(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setApe(fil[2].toString());
           emp.setDni(fil[3].toString());
           emp.setUsu(fil[4].toString());
           emp.setPas(fil[5].toString());
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from administrador";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

    @Override
    public Administrador validar(String usu, String pas) {
        String sql="select * from administrador where usu like '"+usu+"' and pas like '"+pas+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Administrador emp=new Administrador();
           emp.setCod(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setApe(fil[2].toString());
           emp.setDni(fil[3].toString());
           emp.setUsu(fil[4].toString());
           emp.setPas(fil[5].toString());
           return emp;
        }
        return null;
    }
    
}
