package persistencia;

import java.util.List;
import negocio.Profesor;

public class ProfesorDaoImp implements ProfesorDao{

    @Override
    public String grabar(Profesor emp) {
        String sql="insert into profesor values('"+emp.getCod()+"','"+emp.getNom()+"',"
                + "'"+emp.getApe()+"','"+emp.getDni()+"','"+emp.getCel()+"','"+emp.getNiv()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Profesor emp) {
        String sql="update profesor set nom='"+emp.getNom()+"'ape="+emp.getApe()+"'dni='"+emp.getDni()+"'cel="+emp.getCel()+"'niv="+emp.getNiv()+
                "'usu='"+emp.getUsu()+"'pas='"+emp.getPas()+
                "'where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Profesor emp) {
        String sql="delete from profesor where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Profesor buscar(String cod) {
        String sql="select * from profesor where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Profesor emp = new Profesor();
           emp.setCod(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setApe(fil[2].toString());
           emp.setDni(fil[3].toString());
           emp.setCel(fil[4].toString());
           emp.setNiv(fil[5].toString());
           emp.setUsu(fil[6].toString());
           emp.setPas(fil[7].toString());
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from profesor";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

    @Override
    public Profesor validar(String usu, String pas) {
        String sql="select * from profesor where usu like '"+usu+"' and pas like '"+pas+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Profesor emp=new Profesor();
           emp.setCod(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setApe(fil[2].toString());
           emp.setDni(fil[3].toString());
           emp.setCel(fil[4].toString());
           emp.setNiv(fil[5].toString());
           emp.setUsu(fil[6].toString());
           emp.setPas(fil[7].toString());
           return emp;
        }
        return null;
    }
    
}
