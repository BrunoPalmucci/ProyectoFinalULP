/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;

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
    
    
}
