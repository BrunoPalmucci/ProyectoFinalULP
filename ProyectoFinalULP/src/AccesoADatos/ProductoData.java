/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 * 
 *   Registrar productos: Los usuarios podrán agregar nuevos productos al inventario proporcionando información como nombre, descripción, precio y cantidad disponible. 
 *   Sería un plus adicional, si el sistema enviara un recordatorio emergente sobre aquellos productos por debajo del mínimo.
 */
public class ProductoData {
    Connection con;

    public ProductoData() {
        con = Conexion.getConnection(); 
        
    }
        public void agregarProducto(Producto producto){
            String sql = "INSERT INTO productos (nombreProducto, descripcion, precioActual, stock, estado) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
               producto.setIdProducto(rs.getInt(1));
               System.out.println(producto.getIdProducto());
               JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            } 
        ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

        
        public Producto buscarProducto(int id){
            Producto prod = null;
            String sql = "SELECT nombre, descripcion, precioActual, stock, estado FROM productos WHERE idProducto=? AND estado =1";
            PreparedStatement ps = null;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    prod=new Producto();
                    prod.setIdProducto(id);
                    prod.setNombreProducto(rs.getString("nombre"));
                    prod.setDescripcion(rs.getString("descripcion"));
                    prod.setPrecioActual(rs.getInt("precioActual"));
                    prod.setStock(rs.getInt("stock"));
                    prod.setEstado(true);
       
                }else {
                    JOptionPane.showMessageDialog(null, "No existe el producto");
                    ps.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto. "+ex.getMessage()); 
            }
            return prod;
        }
        
    }
    
    

   
//    public Alumno buscarAlumno(int id){
//    Alumno alumno = null;
//    String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
//    PreparedStatement ps = null;