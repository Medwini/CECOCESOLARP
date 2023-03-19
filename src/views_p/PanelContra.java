/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views_p;

import Logica.Conexion;
import Logica.Datos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDWINI
 */
public class PanelContra extends javax.swing.JPanel {

    /**
     * Creates new form PanelContra
     */
    Conexion Conec = new Conexion();
    Connection cn = Conec.getConexion();
    Datos dtos = new Datos();

    public PanelContra() {
        initComponents();
        limpiar();
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
        TxtContAnterior = new javax.swing.JPasswordField();
        TxtContNueva = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtConfirmarC = new javax.swing.JPasswordField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 51));
        setMaximumSize(new java.awt.Dimension(832, 400));
        setMinimumSize(new java.awt.Dimension(832, 400));
        setPreferredSize(new java.awt.Dimension(832, 400));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cambiar contraseña");

        TxtContAnterior.setMinimumSize(new java.awt.Dimension(6, 23));

        TxtContNueva.setMinimumSize(new java.awt.Dimension(6, 23));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña anterior:");

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contraseña nueva:");

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Confirmar nueva contraseña:");

        TxtConfirmarC.setMinimumSize(new java.awt.Dimension(6, 23));

        BtnAceptar.setBackground(new java.awt.Color(255, 204, 0));
        BtnAceptar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setMaximumSize(new java.awt.Dimension(91, 31));
        BtnAceptar.setMinimumSize(new java.awt.Dimension(91, 31));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        BtnCancelar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setMaximumSize(new java.awt.Dimension(91, 31));
        BtnCancelar.setMinimumSize(new java.awt.Dimension(91, 31));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtContNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtContAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtConfirmarC, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(286, 286, 286))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtContAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtContNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtConfirmarC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        try {
            // TODO add your handling code here:

            PreparedStatement dts = cn.prepareStatement("UPDATE Usuarios SET Clave = ? WHERE Cod_Us = 1");
            String clave, confirmar;
            clave = TxtContAnterior.getText();
            String Clav = Conec.Consultar_Cont();
            dtos.Clave = TxtContNueva.getText();
            confirmar = TxtConfirmarC.getText();

            if (clave.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No ha ingresado la contraseña anterior. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
            } else if (dtos.Clave.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No ha ingresado la nueva contraseña. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
            } else if (confirmar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No ha ingresado la confirmación de la contraseña. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
            }else if (clave.equals(Clav)) {
                if (dtos.Clave.equals(confirmar)) {
                    dts.setString(1, dtos.Clave);

                    if (dts.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(this, "Contraseña cambiada correctamente", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Ocurrió un error al momento de cambiar la contraseña, intente nuevamente.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La nueva contraseña no es igual a la confirmación", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No coincide con la contraseña anterior", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(PanelContra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtnAceptarActionPerformed

    public void limpiar(){
       TxtConfirmarC.setText("");
       TxtContAnterior.setText("");
       TxtContNueva.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JPasswordField TxtConfirmarC;
    private javax.swing.JPasswordField TxtContAnterior;
    private javax.swing.JPasswordField TxtContNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}