/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views_p;

import Logica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDWINI
 */
public class PanelTasa extends javax.swing.JPanel {

    /**
     * Creates new form PanelTasa
     */
    Conexion Conec = new Conexion();
    Connection cn = Conec.getConexion();

    public PanelTasa() {
        initComponents();
        this.CBMoneda.setModel(Conec.Obt_OpcionesMoneda());
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
        BtnActualizarTasa = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNuevaTasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTasaAnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBMoneda = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(660, 387));
        setMinimumSize(new java.awt.Dimension(660, 387));
        setPreferredSize(new java.awt.Dimension(660, 387));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 387));

        BtnActualizarTasa.setBackground(new java.awt.Color(255, 204, 0));
        BtnActualizarTasa.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        BtnActualizarTasa.setText("Actualizar");
        BtnActualizarTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarTasaActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        BtnCancelar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TxtNuevaTasa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtNuevaTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNuevaTasaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nuevo valor:");

        TxtTasaAnt.setEditable(false);
        TxtTasaAnt.setBackground(new java.awt.Color(204, 204, 204));
        TxtTasaAnt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtTasaAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTasaAntActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Valor actual:");

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Moneda:");

        CBMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMonedaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Actualizar Tasa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtTasaAnt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBMoneda, javax.swing.GroupLayout.Alignment.LEADING, 0, 449, Short.MAX_VALUE)
                            .addComponent(TxtNuevaTasa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(BtnActualizarTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtTasaAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNuevaTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizarTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTasaAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTasaAntActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtTasaAntActionPerformed

    private void TxtNuevaTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNuevaTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNuevaTasaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        limpiar();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnActualizarTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarTasaActionPerformed
        // TODO add your handling code here:
        if(TxtTasaAnt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No ha seleccionado alguna moneda. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
        }
        else if (TxtNuevaTasa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No ha ingresado el valor correspondiente. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            double NuevaTasa = 0;
            String Selec = CBMoneda.getSelectedItem().toString();

            NuevaTasa = Double.parseDouble(TxtNuevaTasa.getText());
            PreparedStatement dts;
            try {
                dts = cn.prepareStatement("UPDATE Moneda SET Valor = ? WHERE Nombre = '" + Selec + "'");
                dts.setDouble(1, NuevaTasa);
                if (dts.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Tasa actualizada correctamente", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrió un error al momento de actualizar la tasa, intente nuevamente.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error en base de datos.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(PanelTasa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BtnActualizarTasaActionPerformed

    private void CBMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMonedaActionPerformed
        // TODO add your handling code here:
        String Selec = CBMoneda.getSelectedItem().toString();
        double TasaAct = Conec.Consult_Valor(Selec);
        TxtTasaAnt.setText("" + TasaAct + "");
    }//GEN-LAST:event_CBMonedaActionPerformed

    public void limpiar() {
        TxtNuevaTasa.setText("");
        TxtTasaAnt.setText("");
        this.CBMoneda.setModel(Conec.Obt_OpcionesMoneda());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarTasa;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JComboBox CBMoneda;
    private javax.swing.JTextField TxtNuevaTasa;
    private javax.swing.JTextField TxtTasaAnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
