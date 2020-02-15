
package cuentacheques;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author axel
 */
public class ConexionSQL {
    
    private Connection conn = null;
    
    public Connection conexion(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Abuelita","root","Rossitta"); 
         //System.out.print("Conexion establecida...");
     }catch(ClassNotFoundException |SQLException e){
         System.out.print("no se puedo establecer conexion..");
     }
     return conn;     
    }
   
}
