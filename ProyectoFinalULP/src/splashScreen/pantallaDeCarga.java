/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashScreen;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;


public class pantallaDeCarga extends javax.swing.JFrame {
   
  
    public pantallaDeCarga() {
        initComponents();
    }
        // Getter para barraProgreso
    public javax.swing.JProgressBar getBarraProgreso() {
        return this.barraProgreso;
    }

    // Setter para barraProgreso
    public void setBarraProgreso(int valor) {
        this.barraProgreso.setValue(valor);
    }

    // Getter para textoCargando
    public javax.swing.JLabel getTextoCargando() {
        return this.textoCargando;
    }

    // Setter para textoCargando
    public void setTextoCargando(String texto) {
        this.textoCargando.setText(texto);
    }

    // Getter para porcentajeCargado
    public javax.swing.JLabel getPorcentajeCargado() {
        return this.porcentajeCargado;
    }

    // Setter para porcentajeCargado
    public void setPorcentajeCargado(String porcentaje) {
        this.porcentajeCargado.setText(porcentaje);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        textoCargando = new javax.swing.JLabel();
        porcentajeCargado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashScreen/imagenes/logo LAB.png"))); // NOI18N

        textoCargando.setForeground(new java.awt.Color(255, 255, 255));
        textoCargando.setText("Cargando...");

        porcentajeCargado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        porcentajeCargado.setForeground(new java.awt.Color(255, 255, 255));
        porcentajeCargado.setText("0%");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel2))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textoCargando)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(porcentajeCargado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCargando)
                    .addComponent(porcentajeCargado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(pantallaDeCarga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(pantallaDeCarga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(pantallaDeCarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pantallaDeCarga sp = new pantallaDeCarga();
        sp.setVisible(true);
        
        try {
            for(int i = 0; i<101;i++){
                Thread.sleep(30);
                sp.porcentajeCargado.setText(i+ "%");
                if (i == 10) {
                    sp.textoCargando.setText("Cargando módulos...");
                }
                if (i == 20) {
                    sp.textoCargando.setText("Módulos cargados...");
                }
                if (i == 50) {
                    sp.textoCargando.setText("Conectando a base de datos...");
                }
                if (i == 70) {
                    sp.textoCargando.setText("Conexión establecida...");
                }
                if (i == 80) {
                    sp.textoCargando.setText("Lanzando aplicación...");
                }
                sp.barraProgreso.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        sp.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel porcentajeCargado;
    private javax.swing.JLabel textoCargando;
    // End of variables declaration//GEN-END:variables
}
