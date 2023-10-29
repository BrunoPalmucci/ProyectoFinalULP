
package proyectofinalulp;

import AccesoADatos.Conexion;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.sql.Connection;


public class ProyectoFinalULP {


    public static void main(String[] args) {
        ProductoData prD = new ProductoData();
        Producto pr = new Producto("Papas Fritas","Son ricas :D",1599.99,666,true);
        prD.agregarProducto(pr);
        System.out.println(prD.buscarProducto(pr.getIdProducto()));
    }
    
}
