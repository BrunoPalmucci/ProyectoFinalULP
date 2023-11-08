package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
            JOptionPane.showMessageDialog(null, "Compra realizada con éxito.");
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
        
        public Compra obtenerCompraPorId(int id) {
        // Obtener todas las compras de un proveedor
        Compra compra = null;
        try {
            String sql = "SELECT * FROM compras WHERE idCompra = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(id);
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra: "+ex.getMessage());
        }
        return compra;
    }
        
        public List<Compra> obtenerComprasPorFecha(LocalDate fecha){
            List<Compra> compras = new ArrayList<>();
            
            try {
                  String sql = "SELECT * FROM compras JOIN proveedores ON "
                          + "(compras.idProveedor = proveedores.idProveedor)"
                          + " AND compras.fecha = ?";
                  PreparedStatement ps = con.prepareStatement(sql);
                  ps.setDate(1, Date.valueOf(fecha));
                  ResultSet rs = ps.executeQuery();
                  while(rs.next()){
                      Compra compra = new Compra();
                      Proveedor prov = new Proveedor();
                      prov.setIdProveedor(rs.getInt("idProveedor"));
                      prov.setDomicilio(rs.getString("domicilio"));
                      prov.setRazonSocial(rs.getString("razonSocial"));
                      prov.setTelefono(rs.getString("telefono"));
                      
                      compra.setIdCompra(rs.getInt("idCompra"));
                      compra.setFecha(rs.getDate("fecha").toLocalDate());
                      compra.setProveedor(prov);
                      compras.add(compra);
                  }
                    rs.close();
                    ps.close();
                  
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            
            return compras;
        }
//                String sql = "SELECT * FROM compras WHERE idProveedor = 1 AND `fecha` BETWEEN '2023-10-31' AND '2023-11-02'";
    
        
        public List<Proveedor> obtenerProveedoresDeProducto(String nombreProducto) {
            List<Proveedor> proveedores = new ArrayList<Proveedor>();

           try {
                     String sql = "SELECT DISTINCT p.idProveedor, p.razonSocial, p.domicilio, p.telefono "+
                        "FROM proveedores p "+
                        "JOIN compras c ON p.idProveedor = c.idProveedor "+
                        "JOIN detallecompra dc ON c.idCompra = dc.idCompra "+
                        "JOIN productos pr ON dc.idProducto = pr.idProducto "+
                        "WHERE pr.nombreProducto = ? "; 

               PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, nombreProducto);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   Proveedor prov = new Proveedor();
                    prov.setIdProveedor(rs.getInt("idProveedor"));
                    prov.setDomicilio(rs.getString("domicilio"));
                    prov.setRazonSocial(rs.getString("razonSocial"));
                    prov.setTelefono(rs.getString("telefono"));
                    proveedores.add(prov);
                    
               }

               rs.close();
               ps.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }

            return proveedores;
        }
        
        
        public List<String> obtenerProductosMasCompradosEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {
               List<String> productosMasComprados = new ArrayList<>();

            try {
                String sql = "SELECT p.nombreProducto, SUM(dc.cantidad) AS totalComprado " +
                             "FROM productos p " +
                             "JOIN detallecompra dc ON p.idProducto = dc.idProducto " +
                             "JOIN compras c ON dc.idCompra = c.idCompra " +
                             "WHERE c.fecha BETWEEN ? AND ? " +
                             "GROUP BY p.nombreProducto " +
                             "ORDER BY totalComprado DESC ;";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setDate(1, Date.valueOf(fechaInicio));
                ps.setDate(2, Date.valueOf(fechaFin));

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String nombreProducto = rs.getString("nombreProducto");
                    productosMasComprados.add(nombreProducto);
                }

                rs.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            }

            return productosMasComprados;
            }
        
        public List<String> obtenerProductosPorDebajoDelStockMinimo(int stockMinimo) {
               List<String> productosPorDebajoDelStockMinimo = new ArrayList<>();

            try {
                String sql = "SELECT nombreProducto " +
                             "FROM productos " +
                             "WHERE stock < ?";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, stockMinimo);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String nombreProducto = rs.getString("nombreProducto");
                    productosPorDebajoDelStockMinimo.add(nombreProducto);
                }

                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return productosPorDebajoDelStockMinimo;
        }
        
}
