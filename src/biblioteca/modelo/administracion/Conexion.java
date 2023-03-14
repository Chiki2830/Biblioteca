package biblioteca.modelo.administracion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    
    String url = "jdbc:mysql://localhost:3307/biblioteca";   
    String user = "root";//root    
    String pass = "";//sin clave
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
          
        } catch (Exception e) {
        }
        return con;
    }
    
    
}