
package Entidades;


public class DetalleCompra {
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private Producto producto;
    

    public DetalleCompra() {
    }
    
    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, Compra compra, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public DetalleCompra(int cantidad, double precioCosto, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public Compra getCompra() {
        return compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
//    public void setIdProducto(int idProducto) {
//        if (this.producto != null) {
//            this.producto.setIdProducto(idProducto);
//        } else {
//            throw new IllegalStateException("El producto es null");
//        }
//    }
    
}
