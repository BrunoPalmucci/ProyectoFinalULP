
package Entidades;


public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precioActual;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }
    

    public Producto(String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public int getStock() {
        return stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
    
}
