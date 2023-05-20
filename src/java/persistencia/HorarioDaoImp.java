package persistencia;

import java.util.List;
import negocio.Horario;

public class HorarioDaoImp implements HorarioDao{

    @Override
    public String grabar(Horario emp) {
        String sql="insert into calen values('"+emp.getCodho()+"','"+emp.getTur()+"','"+emp.getHoini()+"','"+emp.getHofin()+"',"
                + "'"+emp.getLun()+"','"+emp.getMar()+"','"+emp.getMie()+"','"+emp.getJue()+"','"+emp.getVie()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Horario emp) {
        String sql="update calen set turno="+emp.getTur()+"'hoini='"+emp.getHoini()+"'hofin='"+emp.getHofin()+
                "'lun='"+emp.getLun()+"'mar='"+emp.getMar()+"'mie='"+emp.getMie()+"'jue='"+emp.getJue()+
                "'vie='"+emp.getVie()+"'where codho='"+emp.getCodho();
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Horario emp) {
        String sql="delete from calen where codho='"+emp.getCodho()+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Horario buscar(String codho) {
        String sql="select * from calen where codho='"+codho+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Horario emp=new Horario();
           emp.setCodho(fil[0].toString());
           emp.setTur(fil[1].toString());
           emp.setHoini(fil[2].toString());
           emp.setHofin(fil[3].toString());
           emp.setLun(fil[4].toString());
           emp.setMar(fil[5].toString());
           emp.setMie(fil[6].toString());
           emp.setJue(fil[7].toString());
           emp.setVie(fil[8].toString());
           
           return emp;
        }
        return null;         
    }

    @Override
    public List listar() {
        String sql="select * from calen";
        List lis=Operacion.listar(sql);
        if (lis!=null) {
            return lis;
        }
        return null;
    }

    @Override
    public Horario validar(String codho, String tur) {
        String sql="select * from calen where codho like '"+codho+"' and turno like '"+tur+"'";
        Object[]fil=Operacion.buscar(sql);
        if (fil!=null) {
           Horario emp=new Horario();
           emp.setCodho(fil[0].toString());
           emp.setTur(fil[1].toString());
           emp.setHoini(fil[2].toString());
           emp.setHofin(fil[3].toString());
           emp.setLun(fil[4].toString());
           emp.setMar(fil[5].toString());
           emp.setMie(fil[6].toString());
           emp.setJue(fil[7].toString());
           emp.setVie(fil[8].toString());

           return emp;
        }
        return null;
    }
    
}
