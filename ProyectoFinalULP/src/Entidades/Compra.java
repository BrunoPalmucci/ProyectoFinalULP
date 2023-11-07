
package Entidades;

import java.time.LocalDate;


public class Compra {
    private int idCompra;
    Proveedor proveedor;
    LocalDate fecha;

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public Compra(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public Compra() {
    }
    

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", id proveedor=" + proveedor.getIdProveedor() + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
