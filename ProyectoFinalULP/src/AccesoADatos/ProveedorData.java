package AccesoADatos;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ProveedorData {
    Connection con;

    public ProveedorData() {
        con = Conexion.getConnection();
    }
    
    public void configurarClaveExterna(){
        //Metodo realizado para que deje eliminar proveedores. No deja sino ya que idProveedores
        //es una clave externa en la tabla Compras. Entonces se usa "ON DELETE CASCADE"
        //para cuando se elimine un proveedores se eliminen todas las entradas relacionadas en compras
        String sql = "ALTER TABLE compras " +
                         "DROP FOREIGN KEY idProveedor, " +
                         "ADD CONSTRAINT idProveedor " +
                         "FOREIGN KEY (idProveedor) REFERENCES proveedores(idProveedor) ON DELETE CASCADE";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al configurar la clave externa: " + ex.getMessage());            
        }
        
    }

    public void agregarProveedor(Proveedor proveedor) {
        //Agrega nuevo proveedor a la BD
        String sql = "INSERT INTO proveedores (razonSocial, domicilio, telefono) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());                        
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: "+ex.getMessage());
        }
    }

    public void modificarProveedor(Proveedor proveedor) {
        //modifica proveedor existente
        String sql = "UPDATE proveedores SET razonSocial=?, domicilio=?, telefono=? WHERE idProveedor=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: "+ex.getMessage());
        }
    }

    public void eliminarProveedor(int idProveedor) {
        //elimina proveedor

    }
    
    
        public Proveedor obtenerProveedorPorId(int idProveedor) {
        
        Proveedor proveedor = null; //Se inicializa proveedor null para indicar q no se encontro ninguno
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedores WHERE idProveedor = ?";
        //el id proveedor se pasa como parametro
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: "+ex.getMessage());            
        }
        return proveedor;
        //si no se encuentra proveedor se devuelve null
    }
        
        public List<Proveedor> obtenerProveedores() {
                //se declara la lista y se inicializa vacia
        List<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedores WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedores.add(proveedor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: "+ex.getMessage());            
        }
        return proveedores;
    }
            
        public Proveedor obtenerProveedorPorNombre(String nombreProveedor) {
                   Proveedor proveedor = null;

        try {
            String sql = "SELECT * FROM proveedores WHERE razonSocial = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreProveedor);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error al obtener el proveedor: " + e.getMessage());
        }

    return proveedor;
}

 
}
