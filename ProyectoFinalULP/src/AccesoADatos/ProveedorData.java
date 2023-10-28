package AccesoADatos;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProveedorData {
    Connection con;

    public ProveedorData() {
        con = Conexion.getConnection();
    }

    public void agregarProveedor(Proveedor proveedor) {
        //Agrega nuevo proveedor a la BD
        String sql = "INSERT INTO proveedores (razonSocial, domicilio, telefono) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();
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
        //elimina proveedor con su ID
        String sql = "DELETE FROM proveedores WHERE idProveedor=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: "+ex.getMessage());
        }
    }
}
