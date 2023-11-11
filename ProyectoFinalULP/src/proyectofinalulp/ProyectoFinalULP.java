
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
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import splashScreen.pantallaDeCarga;
import Vistas.MenuPrincipal;
import javax.swing.JOptionPane;

public class ProyectoFinalULP {
pantallaDeCarga pantallaCarga;
MenuPrincipal menuPrincipal;

    public static void main(String[] args) {
        
        
        // Crear una instancia de la pantalla de carga
        final pantallaDeCarga sp = new pantallaDeCarga();
        
        // Mostrar la pantalla de carga
        sp.setVisible(true);
        
        // Crear un nuevo hilo para actualizar la interfaz gráfica
        new Thread(new Runnable() {
            public void run() {
                try {
                    for(int i = 0; i<101;i++){
                        Thread.sleep(50);
                        sp.setPorcentajeCargado(i+ "%");
                        if (i == 10) {
                            sp.setTextoCargando("Cargando módulos...");
                        }
                        if (i == 20) {
                            sp.setTextoCargando("Módulos cargados...");
                        }
                        if (i == 50) {
                            sp.setTextoCargando("Conectando a base de datos...");
                        }
                        if (i == 70) {
                            sp.setTextoCargando("Conexión establecida...");
                        }
                        if (i == 80) {
                            sp.setTextoCargando("Lanzando aplicación...");
                        }
                        sp.setBarraProgreso(i);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                sp.setVisible(false);
                
                // Crear una instancia del menú principal
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                
                // Mostrar el menú principal
                menuPrincipal.setVisible(true);
            }
        }).start();
    }
        
      
//        pantallaDeCarga carga = new pantallaDeCarga();
//        MenuPrincipal menu = new MenuPrincipal();
//        int contador = 0;
////        if (contador == 0) {
////          carga.setVisible(true);
////          contador = 1;
////        }
//        
////        if (contador == 1) {
//    menu.setVisible(true);
//        }
        
        
        /*ProductoData prD = new ProductoData();
        Producto pr = new Producto("Papas Fritas","Son ricas :D",1599.99,666,true);
        prD.agregarProducto(pr);
        System.out.println(prD.buscarProducto(pr.getIdProducto()));
    */
        
//crear instancia de compraData y proveedorData
//    CompraData compraData = new CompraData();
//  ProveedorData proveedorData = new ProveedorData();
//   ProductoData productoData = new ProductoData();
//        System.out.println(productoData.buscarProducto(1));
////    //crear proveedor y agregarlo a bd
//    Proveedor proveedor = new Proveedor("Musimundo", "Rivadavia 200", "334455");
//   proveedorData.agregarProveedor(proveedor);
// //      System.out.println("ID del proveedor:");
////        System.out.println(proveedor.getIdProveedor());
////    
////    //crear compra y agregarla a la base de datos
//    Compra compra = new Compra(proveedor, LocalDate.now());
//    compraData.agregarCompra(compra);
//    System.out.println("id de compra"+compra.getIdCompra());
//    //obtenerCompra por ID
   // List<Compra> compras= compraData.obtenerComprasPorFecha(LocalDate.of(2023, Month.NOVEMBER, 02));
    //    for (Compra compra1 : compras) {
     //       System.out.println(compra1);
      //  }
        //System.out.println(compraData.obtenerProveedoresDeProducto("Sal"));
        
    
//        System.out.println(compraData.obtenerCompraPorId(compra.getIdCompra()));
    
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
//LocalDate fechaInicio = LocalDate.of(2023, 11, 1);
//    LocalDate fechaFin = LocalDate.of(2023, 11, 30);
//
//    List<String> productosMasComprados = compraData.obtenerProductosMasCompradosEntreFechas(fechaInicio, fechaFin);
//
//    System.out.println("Los productos más comprados entre " + fechaInicio + " y " + fechaFin + " son:");
//    for (String producto : productosMasComprados) {
//        System.out.println(producto);
//    }
//}




//}
    }

