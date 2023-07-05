package persistencia;

import java.util.List;
import negocio.Profesor;

public class ProfesorDaoImp implements ProfesorDao {

    @Override
    public String grabar(Profesor emp) {
        String sql = "insert into Docente values('" + emp.getIDpro()
                + "','" + emp.getNbpro() + "','" + emp.getAppro() + "','" + emp.getNdni() + "','" + emp.getGen() + "','"
                + emp.getNiv() + "','" + emp.getEmail() + "','" + emp.getNcel() + "','" + emp.getUsupro() + "','" + emp.getPasspro() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Profesor emp) {
        String sql = "update Docente set nbpro='" + emp.getNbpro() + "'where IDpro='" + emp.getIDpro() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Profesor emp) {
        String sql = "delete from Docente where IDpro='" + emp.getIDpro() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Profesor buscar(String getIDpro) {
        String sql = "select * from Docente where IDpro='" + getIDpro + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Profesor emp = new Profesor();
            emp.setIDpro(fil[0].toString());
            emp.setNbpro(fil[1].toString());
            emp.setAppro(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsupro(fil[8].toString());
            emp.setPasspro(fil[9].toString());
            return emp;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from Docente";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Profesor validar(String usupro, String passpro) {
        String sql = "select * from Docente where usupro like '" + usupro + "' and passpro like '" + passpro + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Profesor emp = new Profesor();
            emp.setIDpro(fil[0].toString());
            emp.setNbpro(fil[1].toString());
            emp.setAppro(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsupro(fil[8].toString());
            emp.setPasspro(fil[9].toString());
            return emp;
        }
        return null;
    }
    
    @Override
    public Profesor perfil() {
        String sql = "select * from Docente where IDpro='D001'"+"";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Profesor emp = new Profesor();
            emp.setIDpro(fil[0].toString());
            emp.setNbpro(fil[1].toString());
            emp.setAppro(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsupro(fil[8].toString());
            emp.setPasspro(fil[9].toString());
            return emp;
        }
        return null;
    }

}
