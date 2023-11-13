
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB= "proyectofinal";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;
                    
    //Metodo constructor.
    private Conexion(){}
    
           
    public static Connection getConnection(){
        if(connection == null){
        
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //Setup connection with the DB
                connection= DriverManager
                        .getConnection(URL+DB + "?useLegacyDatetimeCode = false&serverTimezone=UTC"
                        + "&user="+ USUARIO + "&password="+PASSWORD);

                        



            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD "+ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
        
     return connection;   
    }
    
}

