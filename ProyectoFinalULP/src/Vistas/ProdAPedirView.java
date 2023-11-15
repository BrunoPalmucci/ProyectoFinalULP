/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CompraData;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valentino
 */
public class ProdAPedirView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProdAPedirView
     */
    
    private DefaultTableModel modelo;
    private CompraData compData;
    private ProductoData prodData;
    
    public ProdAPedirView() {
        initComponents();
        modelo = new DefaultTableModel();
        compData = new CompraData();
        prodData = new ProductoData();
        int x = (int) (160/2);
        int y = (int) (40 / 2);
        this.setLocation(x, y);
        armarTablaProductos();
        limpiarRows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextDescripcion = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextStock = new javax.swing.JTextField();
        jRadioEstado = new javax.swing.JRadioButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonBuscarProd = new javax.swing.JButton();
        jTextbuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("PROD CON STOCK DEBAJO DE 3 UNIDADES");

        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseClicked(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        jLabel2.setText("Registrar Producto");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Precio");

        jLabel6.setText("Stock");

        jLabel7.setText("Estado");

        jTextPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioKeyTyped(evt);
            }
        });

        jRadioEstado.setSelected(true);

        jButtonModificar.setText("Modificar");
        jButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseClicked(evt);
            }
        });

        jButtonBuscarProd.setText("Buscar");
        jButtonBuscarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarProdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButtonRegistrar)
                                .addGap(84, 84, 84)
                                .addComponent(jButtonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(43, 43, 43))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jTextDescripcion)
                            .addComponent(jTextPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonBuscarProd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextbuscar)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscar)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioEstado)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarProd)
                    .addComponent(jTextbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonModificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonSalirMouseClicked

    private void jButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseClicked
        HashMap<String, Integer> productos = compData.obtenerProductosPorDebajoDelStockMinimo(3);
        cargarATabla(productos);
    }//GEN-LAST:event_jButtonBuscarMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        try{
            String nombre = jTextNombre.getText();
            String descripcion = jTextDescripcion.getText();
            double precio = Double.parseDouble(jTextPrecio.getText());
            int stock = Integer.parseInt(jTextStock.getText());
            boolean estado = jRadioEstado.isSelected();
            Producto prod = new Producto(nombre,descripcion,precio,stock,estado);
            prodData.agregarProducto(prod);
            limpiarCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jTextPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextPrecioKeyTyped

    private void jButtonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarMouseClicked
            
                    
        try {
           Producto producto = prodData.buscarProducto(Integer.parseInt(jTextbuscar.getText()));
            if (producto!=null) {
               String nombre = jTextNombre.getText();
            String descripcion = jTextDescripcion.getText();
            double precio = Double.parseDouble(jTextPrecio.getText());
            int stock = Integer.parseInt(jTextStock.getText());
            boolean estado = jRadioEstado.isSelected();
            int id = Integer.parseInt(jTextbuscar.getText());
            
            Producto prod = new Producto(id,nombre,descripcion,precio,stock,estado);
            prodData.modificarProducto(prod);
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Producto modificado."); 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo modificar el producto.");
        }
            
        
    }//GEN-LAST:event_jButtonModificarMouseClicked

    private void jButtonBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarProdMouseClicked
        
        Producto prod = prodData.buscarProducto(Integer.parseInt(jTextbuscar.getText()));
        if (prod != null) {
            String nombre = prod.getNombreProducto();
            String descripcion = prod.getDescripcion();
            Double precio = prod.getPrecioActual();
            boolean estado = prod.isEstado();
            Integer stock = prod.getStock();
            int id = prod.getIdProducto();
            jTextNombre.setText(nombre);
            jTextDescripcion.setText(descripcion);
            jTextPrecio.setText(precio.toString());
            jRadioEstado.setSelected(estado);
            jTextStock.setText(stock.toString());
            JOptionPane.showMessageDialog(this, "Producto encontrado");
            
        }else JOptionPane.showMessageDialog(this, "No se pudo encontrar el producto");
        
        
    }//GEN-LAST:event_jButtonBuscarProdMouseClicked

    private void limpiarCampos(){
        jTextDescripcion.setText("");
        jTextNombre.setText("");
        jTextPrecio.setText("");
        jTextStock.setText("");
        jRadioEstado.setSelected(true);
    }
    private void cargarATabla(HashMap<String, Integer> productos){
        limpiarRows();
         TreeMap<String, Integer> sortedProductos = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int compare = productos.get(o2).compareTo(productos.get(o1));
            if (compare == 0) return 1;  // Esto es para evitar que se sobrescriban claves con el mismo valor
            else return compare;
        }
        });
    
    // Agregamos todos los productos al TreeMap
    sortedProductos.putAll(productos);
    
    // Ahora iteramos sobre el TreeMap en lugar del HashMap
    for (Map.Entry<String, Integer> entry : sortedProductos.entrySet()) {
        modelo.addRow(new Object[]{
        entry.getKey(),
        entry.getValue()
        });
    }
    
     jTable1.setModel(modelo);
    }
    
    void armarTablaProductos(){
        modelo.setColumnCount(0);
        modelo.addColumn("Nombre del Producto");
        modelo.addColumn("Cantidad Restante");
        jTable1.setModel(modelo);
    }
    
    void limpiarRows(){
        modelo.setRowCount(0);
        jTable1.setModel(modelo);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarProd;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextStock;
    private javax.swing.JTextField jTextbuscar;
    // End of variables declaration//GEN-END:variables
}
