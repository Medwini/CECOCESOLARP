/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.ImageIcon;
import views_p.*;

/**
 *
 * @author MEDWINI
 */
public class FrmConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form FrmConfiguracion
     */
    PanelContra CambiarCont = new PanelContra();
    PanelRecon Reconversion = new PanelRecon();
    PanelTasa CambiarTasa = new PanelTasa();

    public FrmConfiguracion() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        this.setTitle("Cooperativa Cecosesola Ruiz Pineda - Configuración del sistema");
        this.setLocationRelativeTo(null);
        PanelInvisible.setVisible(true);
        Capas.add(CambiarCont);
        Capas.add(Reconversion);
        Capas.add(CambiarTasa);
        CambiarCont.setVisible(false);
        Reconversion.setVisible(false);
        CambiarTasa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnTasa = new javax.swing.JButton();
        BtnReconv = new javax.swing.JButton();
        BtnContra = new javax.swing.JButton();
        BtnMenuP = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        Capas = new javax.swing.JLayeredPane();
        PanelInvisible = new javax.swing.JPanel();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jPanel1.setForeground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Configuración");

        BtnTasa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTasa.setText("Valor de Tasa $");
        BtnTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTasaActionPerformed(evt);
            }
        });

        BtnReconv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnReconv.setText("Reconversión");
        BtnReconv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReconvActionPerformed(evt);
            }
        });

        BtnContra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnContra.setText("Cambiar contraseña");
        BtnContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContraActionPerformed(evt);
            }
        });

        BtnMenuP.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BtnMenuP.setText("Volver al menú ");
        BtnMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuPActionPerformed(evt);
            }
        });

        BtnVolver.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BtnVolver.setText("Volver al inicio");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        Capas.setLayout(new java.awt.CardLayout());

        PanelInvisible.setOpaque(false);
        PanelInvisible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lg-b-b-venta al peso.jpg"))); // NOI18N
        PanelInvisible.add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 400));

        Capas.add(PanelInvisible, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Capas, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BtnTasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnContra)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnMenuP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnReconv)
                        .addGap(91, 91, 91))
                    .addComponent(BtnVolver, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMenuP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(BtnTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnReconv, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(BtnContra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Capas, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTasaActionPerformed
        // TODO add your handling code here:
        PanelInvisible.setVisible(false);
        CambiarTasa.setVisible(true);
        CambiarCont.setVisible(false);
        Reconversion.setVisible(false);

    }//GEN-LAST:event_BtnTasaActionPerformed

    private void BtnReconvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReconvActionPerformed
        // TODO add your handling code here:
        PanelInvisible.setVisible(false);
        Reconversion.setVisible(true);
        CambiarCont.setVisible(false);
        CambiarTasa.setVisible(false);
    }//GEN-LAST:event_BtnReconvActionPerformed

    private void BtnContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContraActionPerformed

        CambiarCont.setVisible(true);
        PanelInvisible.setVisible(false);
        Reconversion.setVisible(false);
        CambiarTasa.setVisible(false);
    }//GEN-LAST:event_BtnContraActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuPActionPerformed
        // TODO add your handling code here:
        FrmAdd Menu = new FrmAdd();
        Menu.setVisible(true);
        Menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMenuPActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContra;
    private javax.swing.JButton BtnMenuP;
    private javax.swing.JButton BtnReconv;
    private javax.swing.JButton BtnTasa;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLayeredPane Capas;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JPanel PanelInvisible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
