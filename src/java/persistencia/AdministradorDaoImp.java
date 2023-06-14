package persistencia;

import java.util.List;
import negocio.Administrador;

public class AdministradorDaoImp implements AdministradorDao {

    @Override
    public String grabar(Administrador emp) {
        String sql = "insert into administrador values('" + emp.getIDadm()
                + "','" + emp.getNbadm() + "','" + emp.getApadm() + "','" + emp.getNdni() + "','" + emp.getGen() + "','"
                + emp.getEmail() + "','" + emp.getNcel() + "','" + emp.getUsuadm() + "','" + emp.getPassadm() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Administrador emp) {
        String sql = "update administrador set nbadm='" + emp.getNbadm() + "'where IDadm='" + emp.getIDadm() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Administrador emp) {
        String sql = "delete from administrador where IDadm='" + emp.getIDadm() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Administrador buscar(String IDadm) {
        String sql = "select * from administrador where IDadm ='" + IDadm + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Administrador emp = new Administrador();
            emp.setIDadm(fil[0].toString());
            emp.setNbadm(fil[1].toString());
            emp.setApadm(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNcel(fil[5].toString());
            emp.setEmail(fil[6].toString());
            emp.setUsuadm(fil[7].toString());
            emp.setPassadm(fil[8].toString());
            return emp;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from administrador";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Administrador validar(String usuadm, String passadm) {
        String sql = "select * from administrador where usuadm like '" + usuadm + "' and passadm like '" + passadm + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Administrador emp = new Administrador();
            emp.setIDadm(fil[0].toString());
            emp.setNbadm(fil[1].toString());
            emp.setApadm(fil[2].toString());
            emp.setNdni(fil[3].toString());
            emp.setGen(fil[4].toString());
            emp.setNcel(fil[5].toString());
            emp.setEmail(fil[6].toString());
            emp.setUsuadm(fil[7].toString());
            emp.setPassadm(fil[8].toString());
            return emp;
        }
        return null;
    }
}
