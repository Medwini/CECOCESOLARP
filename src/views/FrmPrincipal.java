/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Logica.Conexion;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDWINI
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */    
    //private FrmAdd Conf;
        Conexion Conec = new Conexion();
        Connection cn = Conec.getConexion();        
    public FrmPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        this.setTitle("Cooperativa Cecosesola Ruiz Pineda");
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        imagen();
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
        BtnStart = new javax.swing.JButton();
        LblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblConf = new javax.swing.JLabel();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnStart.setBackground(new java.awt.Color(255, 153, 51));
        BtnStart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtnStart.setText("¡Comenzar!");
        BtnStart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 250, 80));

        LblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-cecosesola.png"))); // NOI18N
        jPanel1.add(LblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, 120));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("¡Bienvenido a la Cooperativa Cecosesola!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 630, 60));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Para utilizar el sistema de pesaje, por favor, presione en el botón \"¡Comenzar!\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 600, 50));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel3.setText("y seleccione el producto que necesita comprar.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        LblConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting_settings_wrench_cogwheel_icon_193910.png"))); // NOI18N
        LblConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblConf.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting_settings_wrench_cogwheel_icon_193880.png"))); // NOI18N
        LblConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblConfMouseClicked(evt);
            }
        });
        jPanel1.add(LblConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, 40));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comprar_a_granel_1024x.jpg"))); // NOI18N
        jPanel1.add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        // TODO add your handling code here:
        FrmSelect MiSelect = new FrmSelect();
        MiSelect.setVisible(true);
        MiSelect.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnStartActionPerformed

    private void LblConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblConfMouseClicked
        // TODO add your handling code here:
        String clave;
        //clave = "";
        clave = JOptionPane.showInputDialog(this, "Ingrese, por favor, la contraseña para continuar: ", "CONFIGURACION", JOptionPane.QUESTION_MESSAGE);
        String Clav = Conec.Consultar_Cont();        
        if (clave.equals(Clav)){
            JOptionPane.showMessageDialog(this, "Contraseña Correcta", "CONFIGURACION", JOptionPane.INFORMATION_MESSAGE);
            FrmAdd Menu = new FrmAdd();
            Menu.setVisible(true);
            Menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        else if (clave.isEmpty()){
            JOptionPane.showMessageDialog(this, "No ha ingresado la contraseña. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "CONFIGURACION", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LblConfMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    public void imagen(){
        ImageIcon MiImagen = new ImageIcon(getClass().getResource("/images/comprar_a_granel_1024x.jpg"));
        Icon fond = new ImageIcon(MiImagen.getImage().getScaledInstance(LblFondo.getWidth(), LblFondo.getHeight(), Image.SCALE_DEFAULT));
        LblFondo.setIcon(fond); 
        ImageIcon MiLogo = new ImageIcon(getClass().getResource("/images/logo-cecosesola.png"));
        Icon fond2 = new ImageIcon(MiLogo.getImage().getScaledInstance(LblLogo.getWidth(), LblLogo.getHeight(), Image.SCALE_DEFAULT));
        LblLogo.setIcon(fond2);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel LblConf;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}