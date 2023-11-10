/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import splashScreen.pantallaDeCarga;



/**
 *
 * @author Valentino
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private pantallaDeCarga pantallaCargar;
    /**
     * Creates new form MenuPrincipal
     */
  
    public MenuPrincipal() {
        
        
       
        initComponents();                
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        fondoMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmDetalleCompra = new javax.swing.JMenu();
        jmProducto = new javax.swing.JMenu();
        jmCompra = new javax.swing.JMenu();
        jmProveedores = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo_1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo_1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmDetalleCompra.setText("Detalle Compras");
        jmDetalleCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmDetalleCompraMouseClicked(evt);
            }
        });
        jmDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDetalleCompraActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmDetalleCompra);

        jmProducto.setText("Productos");
        jmProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProductoMouseClicked(evt);
            }
        });
        jmProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductoActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmProducto);

        jmCompra.setText("Compras");
        jmCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCompraMouseClicked(evt);
            }
        });
        jmCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCompraActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmCompra);

        jmProveedores.setText("Proveedores");
        jmProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProveedoresMouseClicked(evt);
            }
        });
        jmProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedoresActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDetalleCompraActionPerformed
        limpiar();
        DetalleComprasView dtc = new DetalleComprasView();
        dtc.setVisible(true);
        jDesktopPane1.add(dtc);
        jDesktopPane1.moveToFront(dtc);    }//GEN-LAST:event_jmDetalleCompraActionPerformed

    private void jmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedoresActionPerformed
        limpiar();
        proveedoresView prov = new proveedoresView();
        prov.setVisible(true);
        jDesktopPane1.add(prov);
        jDesktopPane1.moveToFront(prov);        
    }//GEN-LAST:event_jmProveedoresActionPerformed

    private void jmCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCompraActionPerformed
        limpiar();
        comprarProdView comp = new comprarProdView();
        comp.setVisible(true);
        jDesktopPane1.add(comp);
        jDesktopPane1.moveToFront(comp); 
    }//GEN-LAST:event_jmCompraActionPerformed

    private void jmProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductoActionPerformed
        limpiar();
        ProdAPedirView prodaped = new ProdAPedirView();
        prodaped.setVisible(true);
        jDesktopPane1.add(prodaped);
        jDesktopPane1.moveToFront(prodaped); 
        System.out.println("Test");
    }//GEN-LAST:event_jmProductoActionPerformed

    private void jmDetalleCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmDetalleCompraMouseClicked
        limpiar();
        DetalleComprasView dtc = new DetalleComprasView();
        dtc.setVisible(true);
        jDesktopPane1.add(dtc);
        jDesktopPane1.moveToFront(dtc);  
    }//GEN-LAST:event_jmDetalleCompraMouseClicked

    private void jmProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProductoMouseClicked
        limpiar();
        ProdAPedirView prodaped = new ProdAPedirView();
        prodaped.setVisible(true);
        jDesktopPane1.add(prodaped);
        jDesktopPane1.moveToFront(prodaped); 
    }//GEN-LAST:event_jmProductoMouseClicked

    private void jmCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCompraMouseClicked
        limpiar();
        comprarProdView comp = new comprarProdView();
        comp.setVisible(true);
        jDesktopPane1.add(comp);
        jDesktopPane1.moveToFront(comp);
    }//GEN-LAST:event_jmCompraMouseClicked

    private void jmProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProveedoresMouseClicked
        limpiar();
        proveedoresView prov = new proveedoresView();
        prov.setVisible(true);
        jDesktopPane1.add(prov);
        jDesktopPane1.moveToFront(prov); 
    }//GEN-LAST:event_jmProveedoresMouseClicked

    private void limpiar(){
        //jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmCompra;
    private javax.swing.JMenu jmDetalleCompra;
    private javax.swing.JMenu jmProducto;
    private javax.swing.JMenu jmProveedores;
    // End of variables declaration//GEN-END:variables
}
