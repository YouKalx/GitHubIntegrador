package persistencia;

import java.util.List;
import negocio.Alumno;

public class AlumnoDaoImp implements AlumnoDao {

    @Override
    public String grabar(Alumno emp) {
        String sql = "insert into estudiante values('" + emp.getIDalu()
                + "','" + emp.getNbalu() + "','" + emp.getApalu() + "','" + emp.getNdni() + "','" + emp.getGen() + "','"
                + emp.getNiv() + "','" + emp.getEmail() + "','" + emp.getNcel() + "','" + emp.getUsualu() + "','" + emp.getPassalu() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Alumno emp) {
        String sql = "update estudiante set nbalu='" + emp.getNbalu() + "'where IDalu='" + emp.getIDalu() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Alumno emp) {
        String sql = "delete from estudiante where IDalu='" + emp.getIDalu() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Alumno buscar(String IDalu) {
        String sql = "select * from estudiante where IDalu='" + IDalu + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Alumno emp = new Alumno();
            emp.setIDalu(fil[0].toString());
            emp.setNbalu(fil[1].toString());
            emp.setApalu(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsualu(fil[8].toString());
            emp.setPassalu(fil[9].toString());
            return emp;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from estudiante";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Alumno validar(String usualu, String passalu) {
        String sql = "select * from estudiante where usualu like '" + usualu + "' and passalu like '" + passalu + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Alumno emp = new Alumno();
            emp.setIDalu(fil[0].toString());
            emp.setNbalu(fil[1].toString());
            emp.setApalu(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsualu(fil[8].toString());
            emp.setPassalu(fil[9].toString());
            return emp;
        }
        return null;
    }
    @Override
    public Alumno perfil() {
        String sql = "select * from estudiante where IDalu='A001'" + "";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Alumno emp = new Alumno();
            emp.setIDalu(fil[0].toString());
            emp.setNbalu(fil[1].toString());
            emp.setApalu(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNiv(fil[5].toString());
            emp.setNcel(fil[6].toString());
            emp.setEmail(fil[7].toString());
            emp.setUsualu(fil[8].toString());
            emp.setPassalu(fil[9].toString());
            return emp;
        }
        return null;
    }

}
