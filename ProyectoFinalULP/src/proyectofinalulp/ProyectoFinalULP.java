
package proyectofinalulp;

import AccesoADatos.CompraData;
import AccesoADatos.Conexion;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ProyectoFinalULP {


    public static void main(String[] args) {
        /*ProductoData prD = new ProductoData();
        Producto pr = new Producto("Papas Fritas","Son ricas :D",1599.99,666,true);
        prD.agregarProducto(pr);
        System.out.println(prD.buscarProducto(pr.getIdProducto()));
    */
        
    //crear instancia de compraData y proveedorData
    CompraData compraData = new CompraData();
    ProveedorData proveedorData = new ProveedorData();
    ProductoData productoData = new ProductoData();
    
    //crear proveedor y agregarlo a bd
    Proveedor proveedor = new Proveedor("Musimundo", "Rivadavia 200", "334455");
    proveedorData.agregarProveedor(proveedor);
        System.out.println("ID del proveedor:");
        System.out.println(proveedor.getIdProveedor());
    
    //crear compra y agregarla a la base de datos
    Compra compra = new Compra(proveedor, LocalDate.now());
    compraData.agregarCompra(compra);
    System.out.println("id de compra"+compra.getIdCompra());
    
    //obtener compras del proveedor creado
    List<Compra> comprasDelProveedor = compraData.obtenerComprasPorProveedor(proveedor);
    System.out.println("Compras del proveedor:"+comprasDelProveedor.get(0));
    
    //nuevo producto
    Producto producto = new Producto("PRODUCTO A", "DESCRIPCION PRODUCTO A", 2220, 5, true);
    productoData.agregarProducto(producto);

    if (producto.getIdProducto() > 0) {
            System.out.println("Producto agregado con éxito. ID del producto: " + producto.getIdProducto());
        } else {
            System.out.println("No se pudo agregar el producto.");
        }        
    }
}
