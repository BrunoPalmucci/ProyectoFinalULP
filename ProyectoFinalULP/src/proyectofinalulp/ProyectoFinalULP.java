/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalulp;

import AccesoADatos.Conexion;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.sql.Connection;

/**
 *
 * @author Bruno
 */
public class ProyectoFinalULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoData prD = new ProductoData();
        Producto pr = new Producto("Papas Fritas","Son ricas :D",1599.99,666,true);
        prD.agregarProducto(pr);
    }
    
}
