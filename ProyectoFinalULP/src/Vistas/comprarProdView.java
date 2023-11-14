/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Valentino
 */
public class comprarProdView extends javax.swing.JInternalFrame {
    
    private ProveedorData provData;
    private CompraData compData;
    private DetalleCompraData detCompraData;
    private ProductoData prodData;
    
    
    /**
     * Creates new form comprarProdView
     */
    public comprarProdView() {
        initComponents();
        provData = new ProveedorData();
        compData = new CompraData();
        detCompraData = new DetalleCompraData();
        prodData = new ProductoData();
        llenarComboProveedores();
        llenarComboIdPedidoCompra();
        int x = (int) (160/2);
        int y = (int) (40 / 2);
        this.setLocation(x, y);
    }
    Connection con;

    public void CompraData() {
        con = Conexion.getConnection();
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fechaCompra = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        RealizarCompra = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        comboProveedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboIdCompra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonCOMPRAR = new javax.swing.JButton();
        textoCantidad = new javax.swing.JTextField();
        textoPrecioCosto = new javax.swing.JTextField();
        textoIdProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pedido de compra");

        RealizarCompra.setText("REALIZAR PEDIDO DE COMPRA");
        RealizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RealizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RealizarCompraMouseClicked(evt);
            }
        });
        RealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCompraActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        comboProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboProveedorMouseClicked(evt);
            }
        });

        jLabel3.setText("Proveedor:");

        jLabel5.setText("Fecha:");

        jLabel2.setText("ID de compra");

        jLabel4.setText("Cantidad");

        jLabel6.setText("Precio costo");

        botonCOMPRAR.setText("COMPRAR");
        botonCOMPRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCOMPRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCOMPRARMouseClicked(evt);
            }
        });

        textoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCantidadActionPerformed(evt);
            }
        });
        textoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCantidadKeyTyped(evt);
            }
        });

        textoPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoPrecioCostoKeyTyped(evt);
            }
        });

        textoIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdProductoKeyTyped(evt);
            }
        });

        jLabel8.setText("ID producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(textoPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCOMPRAR)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(RealizarCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(comboProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(fechaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(comboIdCompra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboProveedor)
                    .addComponent(fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RealizarCompra))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonCOMPRAR))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarCompraActionPerformed

    private void comboProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProveedorMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboProveedorMouseClicked

    private void textoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCantidadActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonSalirMouseClicked

    private void RealizarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RealizarCompraMouseClicked
        // TODO add your handling code here:
        try {
            String proveedor = comboProveedor.getSelectedItem().toString();
        java.util.Date utilDate = fechaCompra.getDate();
        
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        LocalDate fecha = sqlDate.toLocalDate();
        Proveedor proveedorObjeto = provData.obtenerProveedorPorNombre(proveedor);
        Compra compra = new Compra();
        compra.setProveedor(proveedorObjeto);
        compra.setFecha(fecha);
        compData.agregarCompra(compra);
        comboIdCompra.removeAllItems();
        llenarComboIdPedidoCompra();
        JOptionPane.showMessageDialog(this, "Id de compra: "+compra.getIdCompra());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida.");
        }
 
        
              
        
    }//GEN-LAST:event_RealizarCompraMouseClicked

    private void botonCOMPRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCOMPRARMouseClicked
        // TODO add your handling code here:
        
        try {
        int idCompra = Integer.parseInt(comboIdCompra.getSelectedItem().toString());
        int cantidad = Integer.parseInt(textoCantidad.getText());
        double precioCosto = Double.parseDouble(textoPrecioCosto.getText());
        int idProducto = Integer.parseInt(textoIdProducto.getText());

        Compra compra = compData.obtenerCompraPorId(idCompra);
        Producto producto = prodData.buscarProducto(idProducto);

        DetalleCompra detalle = new DetalleCompra();
        detalle.setCompra(compra);
        detalle.setCantidad(cantidad);
        detalle.setPrecioCosto(precioCosto);

       //detalle.getProducto().setIdProducto(idProducto);
       //detalle.setIdProducto(producto.getIdProducto());
       
         detalle.setProducto(producto);
             if (producto !=null) {
                 detCompraData.agregarDetalleCompra(detalle);
                 JOptionPane.showMessageDialog(null, "Compra realizada con éxito.");
             }
             else JOptionPane.showMessageDialog(null, "Error");
             
        } catch (Exception e) {
            
        }
       
        

        
    }//GEN-LAST:event_botonCOMPRARMouseClicked

    private void textoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCantidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_textoCantidadKeyTyped

    private void textoPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPrecioCostoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_textoPrecioCostoKeyTyped

    private void textoIdProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIdProductoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_textoIdProductoKeyTyped

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    private void llenarComboProveedores(){
        List<Proveedor> listarProveedores = provData.obtenerProveedores();
        for (Proveedor listarProveedore : listarProveedores) {
            comboProveedor.addItem(listarProveedore.getRazonSocial());
        }
    }
    private void llenarComboIdPedidoCompra(){
    List<Integer> listaIdPedido = compData.obtenerCompraPorId();
    for (Integer id : listaIdPedido) {
        comboIdCompra.addItem(Integer.toString(id));
    }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RealizarCompra;
    private javax.swing.JButton botonCOMPRAR;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboIdCompra;
    private javax.swing.JComboBox<String> comboProveedor;
    private com.toedter.calendar.JDateChooser fechaCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textoCantidad;
    private javax.swing.JTextField textoIdProducto;
    private javax.swing.JTextField textoPrecioCosto;
    // End of variables declaration//GEN-END:variables

    private static class utilDate {

        private static long getTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public utilDate() {
        }
    }
}
