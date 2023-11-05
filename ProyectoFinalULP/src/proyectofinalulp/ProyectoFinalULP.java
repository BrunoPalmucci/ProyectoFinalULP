
package proyectofinalulp;

import AccesoADatos.CompraData;
import AccesoADatos.Conexion;
import AccesoADatos.DetalleCompraData;
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
import java.util.function.Consumer;


public class ProyectoFinalULP {


    public static void main(String[] args) {
        /*ProductoData prD = new ProductoData();
        Producto pr = new Producto("Papas Fritas","Son ricas :D",1599.99,666,true);
        prD.agregarProducto(pr);
        System.out.println(prD.buscarProducto(pr.getIdProducto()));
    */
        
//    //crear instancia de compraData y proveedorData
//    CompraData compraData = new CompraData();
//    ProveedorData proveedorData = new ProveedorData();
//    ProductoData productoData = new ProductoData();
//    
//    //crear proveedor y agregarlo a bd
//    Proveedor proveedor = new Proveedor("Musimundo", "Rivadavia 200", "334455");
//    proveedorData.agregarProveedor(proveedor);
//        System.out.println("ID del proveedor:");
//        System.out.println(proveedor.getIdProveedor());
//    
//    //crear compra y agregarla a la base de datos
//    Compra compra = new Compra(proveedor, LocalDate.now());
//    compraData.agregarCompra(compra);
//    System.out.println("id de compra"+compra.getIdCompra());
//    
//    //obtener compras del proveedor creado
//    List<Compra> comprasDelProveedor = compraData.obtenerComprasPorProveedor(proveedor);
//    System.out.println("Compras del proveedor:"+comprasDelProveedor.get(0));
//    
//    //nuevo producto
//    Producto producto = new Producto("PRODUCTO A", "DESCRIPCION PRODUCTO A", 2220, 5, true);
//
//    if (producto.getIdProducto() > 0) {
//            System.out.println("Producto agregado con éxito. ID del producto: " + producto.getIdProducto());
//        } else {
//            System.out.println("No se pudo agregar el producto.");
//        }        
//    }
    

    //crear proveedor y agregarlo a bd
//    Proveedor proveedor = new Proveedor("Musimundo", "Rivadavia 200", "334455");
//    proveedorData.agregarProveedor(proveedor);
//        System.out.println("ID del proveedor:");
//        System.out.println(proveedor.getIdProveedor());
//    
//    //crear compra y agregarla a la base de datos
//    Compra compra = new Compra(proveedor, LocalDate.now());
//    compraData.agregarCompra(compra);
//    System.out.println("id de compra"+compra.getIdCompra());
//    
//    //obtener compras del proveedor creado
//    List<Compra> comprasDelProveedor = compraData.obtenerComprasPorProveedor(proveedor);
//    System.out.println("Compras del proveedor:"+comprasDelProveedor.get(0));
//    
//    //nuevo producto
//    Producto producto = new Producto("PRODUCTO A", "DESCRIPCION PRODUCTO A", 2220, 5, true);
//    productoData.agregarProducto(producto);
//
//    CompraData compData = new CompraData();
//    Compra comp = compData.obtenerCompraPorId(1);
//    DetalleCompraData detCompData = new DetalleCompraData();
//    detCompData.buscarDetallePorCompra(comp).forEach((Object t) -> {
//        DetalleCompra item = (DetalleCompra)t;
//        System.out.println(item.getIdDetalle());
//        System.out.println(item.getCantidad());
//        System.out.println(item.getPrecioCosto());
//        System.out.println(item.getProducto().getNombreProducto());
//    });

////  MODIFICAR PROVEEDOR
//        
//    Proveedor proveedor = proveedorData.obtenerProveedorPorId(1); 
//    proveedor.setRazonSocial("Nuevo Nombre"); 
//    proveedorData.modificarProveedor(proveedor); 
//
////   ELIMINAR PROVEEDOR
//
//     int idProveedorAEliminar = 1; 
//    proveedorData.eliminarProveedor(idProveedorAEliminar); 
//    
////  OBTENER PROVEEDORES
//    
//    List<Proveedor> proveedores = proveedorData.obtenerProveedores(); 
//    for (Proveedor proveedor : proveedores) {
//    System.out.println("ID: " + proveedor.getIdProveedor() + ", Nombre: " + proveedor.getRazonSocial());
//}
//    
////    OBTENER PROVEEDORES DE UN PRODUCTO
//
//    String nombreProducto = "Nombre del Producto"; 
//    List<String> proveedores = compraData.obtenerProveedoresDeProducto(nombreProducto); 
//    for (String proveedor : proveedores) {
//    System.out.println("Proveedor que provee " + nombreProducto + ": " + proveedor);
//}
//    
////   PRODUCTOS MAS COMPRADOS ENTRE FECHAS
//
//    LocalDate fechaInicio = LocalDate.parse("2023-11-01"); 
//    LocalDate fechaFin = LocalDate.parse("2023-12-31"); 
//    List<String> productos = compraData.obtenerProductosMasCompradosEntreFechas(fechaInicio, fechaFin); 
//    for (String producto : productos) {
//    System.out.println("Producto más comprado entre " + fechaInicio + " y " + fechaFin + ": " + producto);
//}
//
////    OBTENER PRODUCTOS DEBAJO DEL STOCK MINIMO
//
//    int stockMinimo = 10; 
//    List<String> productos = compraData.obtenerProductosPorDebajoDelStockMinimo(stockMinimo); 
//    for (String producto : productos) {
//    System.out.println("Producto por debajo del stock mínimo (" + stockMinimo + "): " + producto);
//}



}
    
}
