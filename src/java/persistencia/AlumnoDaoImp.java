package persistencia;

import java.util.List;
import negocio.Alumno;

public class AlumnoDaoImp implements AlumnoDao{

    @Override
    public String grabar(Alumno emp) {
        String sql="insert into alumno values('"+emp.getCod()+"','"+emp.getNom()+"',"
                + "'"+emp.getApe()+"','"+emp.getDni()+"','"+emp.getCel()+"','"+emp.getNiv()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Alumno emp) {
        String sql="update alumno set  nom='"+emp.getNom()+"'ape="+emp.getApe()+"'dni='"+emp.getDni()+"'cel="+emp.getCel()+"'niv="+emp.getNiv()+
                "'usu='"+emp.getUsu()+"'pas='"+emp.getPas()+
                "' where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Alumno emp) {
        String sql="delete from alumno where cod='"+emp.getCod()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Alumno buscar(String cod) {
        String sql="select * from alumno where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Alumno emp = new Alumno();
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
        String sql="select * from alumno";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

    @Override
    public Alumno validar(String usu, String pas) {
        String sql="select * from alumno where usu like '"+usu+"' and pas like '"+pas+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Alumno emp=new Alumno();
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
