package persistencia;

import java.util.List;
import negocio.Actividades;

public class ActividadesDaoImp implements ActividadesDao{

    @Override
    public String grabar(Actividades emp) {
        String sql="insert into actividades values('"+emp.getCodac()+"','"+emp.getNom()+"','"+emp.getDes()+"','"+emp.getDia()+"','"+emp.getHora()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Actividades emp) {
        String sql="update actividades set nombre='"+emp.getNom()+"' where codac='"+emp.getCodac()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Actividades emp) {
        String sql="delete from actividades where codac='"+emp.getCodac()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Actividades buscar(String codac) {
        String sql="select * from actividades where codac='"+codac+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Actividades emp=new Actividades();
           emp.setCodac(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setDes(fil[2].toString());
           emp.setDia(fil[3].toString());
           emp.setHora(fil[4].toString());
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from actividades";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

    @Override
    public Actividades validar(String usu, String pas) {
        String sql="select * from actividades where usu like '"+usu+"' and pas like '"+pas+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Actividades emp=new Actividades();
           emp.setCodac(fil[0].toString());
           emp.setNom(fil[1].toString());
           emp.setDes(fil[2].toString());
           emp.setDia(fil[3].toString());
           emp.setHora(fil[4].toString());

           return emp;
        }
        return null;
    }
    
}
