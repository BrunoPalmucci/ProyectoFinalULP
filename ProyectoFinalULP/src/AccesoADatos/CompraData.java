package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {
    Connection con;

    public CompraData() {
        con = Conexion.getConnection();
    }

    public void agregarCompra(Compra compra) {
        //agrega compra y detalle 
        try {
            String sqlCompra = "INSERT INTO compras (idProveedor, fecha) VALUES (?, ?)";
            PreparedStatement psCompra = con.prepareStatement(sqlCompra, Statement.RETURN_GENERATED_KEYS);                        
            psCompra.setInt(1, compra.getProveedor().getIdProveedor());   //el 1 y 2 refieren a los valores de los parametros en SQL
            psCompra.setDate(2, java.sql.Date.valueOf(compra.getFecha()));
            psCompra.executeUpdate();
            ResultSet rs = psCompra.getGeneratedKeys();
            int idCompra;
            if (rs.next()) {
                idCompra = rs.getInt(1);
                compra.setIdCompra(idCompra);
            }
            
            psCompra.close();
            }

             catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra: "+ex.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());

        }
        
    }
    
        public List<Compra> obtenerComprasPorProveedor(Proveedor proveedor) {
        // Obtener todas las compras de un proveedor
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = "SELECT idCompra, fecha FROM compras WHERE idProveedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedor);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compras.add(compra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra: "+ex.getMessage());
        }
        return compras;
    }


    
}
