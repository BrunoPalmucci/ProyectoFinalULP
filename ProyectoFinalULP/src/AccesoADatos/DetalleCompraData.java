/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class DetalleCompraData {
    Connection con;
    ProductoData prodData;
    public DetalleCompraData(){
        con = Conexion.getConnection();
        prodData = new ProductoData();
    }
    
    public List<DetalleCompra> buscarDetallePorCompra(Compra compra){
        //String sql = "SELECT  idDetalleCompra, `idCompra`, `cantidad`, `precioCosto`, `idProducto` FROM `detallecompra` WHERE idCompra = ?";
        String sql = "SELECT  idDetalleCompra, `idCompra`, `cantidad`, `precioCosto`, "
                   + "productos.* FROM `detallecompra` JOIN productos \n" +
                     "ON (productos.idProducto = detallecompra.idProducto) WHERE idCompra = ?";
        List <DetalleCompra> detalles = new ArrayList<DetalleCompra>();
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdCompra());
            
            ResultSet rs = ps.executeQuery();
            DetalleCompra detCompra;
            Producto prod;
            while (rs.next()) {
               prod = new Producto(rs.getInt("idProducto"),
                       rs.getString("nombreProducto"),
                       rs.getDouble("precioActual"),
                       rs.getInt("stock"),
                       rs.getBoolean("estado"));
               
               detCompra = new DetalleCompra(rs.getInt("idDetalleCompra"),
                       rs.getInt("cantidad"),rs.getDouble("precioCosto"),
                       compra,prod);
               detalles.add(detCompra);
            } 
        ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sql: " +ex.getMessage());
        }
        return detalles;
    }
    
    void agregarDetalleCompra(DetalleCompra detalle){
        String sql = "INSERT INTO `detallecompra`( `idCompra`, `cantidad`, `precioCosto`, `idProducto`) "
                   + "VALUES (?,?,?,?)";
         try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
              detalle.setIdDetalle(rs.getInt("idDetalleCompra"));
            } 
        ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sql: " +ex.getMessage());
        }
    }
    
    List <Producto> productosPorCompra(Compra compra){
        List <Producto> productos = new ArrayList<Producto>();
        String sql = "SELECT * FROM productos JOIN detallecompra "
                + "ON(detallecompra.idProducto = productos.idProducto) "
                + "AND detallecompra.idCompra = ?;";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
             ResultSet rs = ps.executeQuery();
           
            
            while (rs.next()) {
              Producto prod = new Producto(rs.getInt("idProducto"),
              rs.getString("nombreProducto"),
              rs.getDouble("precioActual"),
              rs.getInt("stock"),
              rs.getBoolean("estado"));
              productos.add(prod);
            } 
        ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sql: " +ex.getMessage());
        }
        return productos;
    }
    
    
    

}
