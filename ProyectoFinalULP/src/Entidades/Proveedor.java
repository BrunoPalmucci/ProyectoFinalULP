
package Entidades;


public class Proveedor {
    private int idProveedor;
    private String razonSocial;
    private String domicilio;
    private String telefono;
    private boolean estado;

    
    
    public Proveedor(String razonSocial, String domicilio, String telefono) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    

    public Proveedor(int idProveedor, String razonSocial, String domicilio, String telefono, boolean estado) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Proveedor(String razonSocial, String domicilio, String telefono, boolean estado) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono= telefono;
        this.estado = estado;
    }

    public Proveedor() {
    }
    
    
    
    

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
    
    
    
}
