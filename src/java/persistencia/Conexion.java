package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConexion(){
        Connection cn;
        try{
          Class.forName("com.mysql.jdbc.Driver");  
          cn=DriverManager.getConnection("jdbc:mysql://localhost/proyintegrador?user=root&password=");
        }catch(ClassNotFoundException e){
            cn=null;
        }catch(SQLException e){
            cn=null;
        }
        return cn;
    }
}
