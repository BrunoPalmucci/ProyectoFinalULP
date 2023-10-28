package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {
    Connection con;

    public CompraData() {
        con = Conexion.getConnection();
    }

    public void agregarCompra(Compra compra, List<DetalleCompra> detallesCompra) {
        //agrega compra y detalle 
        try {
            String sqlCompra = "INSERT INTO compras (idProveedor, fecha) VALUES (?, ?)";
            PreparedStatement psCompra = con.prepareStatement(sqlCompra, Statement.RETURN_GENERATED_KEYS);                        
            psCompra.setInt(1, compra.getProveedor().getIdProveedor());   //el 1 y 2 refieren a los valores de los parametros en SQL
            psCompra.setDate(2, java.sql.Date.valueOf(compra.getFecha()));
            psCompra.executeUpdate();
            ResultSet rs = psCompra.getGeneratedKeys();
            int idCompra = -1;
            if (rs.next()) {
                idCompra = rs.getInt(1);
            }

            String sqlDetalle = "INSERT INTO detalles_compra (idCompra, idProducto, cantidad, precioCosto) VALUES (?, ?, ?, ?)";
            for (DetalleCompra detalle : detallesCompra) {
                PreparedStatement psDetalle = con.prepareStatement(sqlDetalle);
                psDetalle.setInt(1, idCompra);
                psDetalle.setInt(2, detalle.getProducto().getIdProducto());
                psDetalle.setInt(3, detalle.getCantidad());
                psDetalle.setDouble(4, detalle.getPrecioCosto());
                psDetalle.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra: "+ex.getMessage());
        }
    }

    
}
