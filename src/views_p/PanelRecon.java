/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views_p;

import Logica.Conexion;
import com.mysql.jdbc.Statement;
import java.math.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDWINI
 */
public class PanelRecon extends javax.swing.JPanel {

    /**
     * Creates new form PanelRecon
     */
    Conexion Conec = new Conexion();
    Connection cn = Conec.getConexion();

    public PanelRecon() {
        initComponents();
        TxtReconvMonetaria.setToolTipText("Ejemplo: 100000");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtReconvMonetaria = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 102, 0));
        setMaximumSize(new java.awt.Dimension(659, 392));
        setMinimumSize(new java.awt.Dimension(659, 392));
        setPreferredSize(new java.awt.Dimension(659, 392));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Reconversión monetaria");

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ejemplo: 10000, 10000000");

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ingrese el valor de la reconversión, en forma de división.");

        TxtReconvMonetaria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtReconvMonetaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtReconvMonetariaActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(255, 204, 0));
        BtnGuardar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtReconvMonetaria, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtReconvMonetaria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void TxtReconvMonetariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtReconvMonetariaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtReconvMonetariaActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        
        if (TxtReconvMonetaria.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No ha ingresado el valor correspondiente. Por favor, intente de nuevo.", "CONFIGURACION", JOptionPane.WARNING_MESSAGE);
        } else {
            String sql = "SELECT Cod_Productos, Precio_Unitario FROM Productos";
            Statement st;
            double Recon_TProd = 0, valor;
            valor = Double.valueOf(TxtReconvMonetaria.getText());
            double[] dts = new double[8];
            PreparedStatement dtos;

            try {
                st = (Statement) cn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()) {
                    dts[0] = result.getDouble(1);
                    dts[1] = result.getDouble(2);
                    Recon_TProd = dts[1] / valor;
                    BigDecimal bd = new BigDecimal(Recon_TProd).setScale(2, RoundingMode.HALF_UP);
                    double Reconver = bd.doubleValue();
                    dtos = cn.prepareStatement("UPDATE Productos SET Precio_Unitario = " + Reconver + " WHERE Cod_Productos = " + dts[0] + "");
                    dtos.executeUpdate();
                }

            } catch (SQLException ex) {
                Logger.getLogger(PanelRecon.class.getName()).log(Level.SEVERE, null, ex);
            }

            sql = "SELECT Cod_Disponibles, Precio_Unitario FROM disponibles";
            //double[] dis = new double[8];
            PreparedStatement disp;

            try {
                st = (Statement) cn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()) {
                    dts[0] = result.getDouble(1);
                    dts[1] = result.getDouble(2);
                    Recon_TProd = dts[1] / valor;
                    BigDecimal bd = new BigDecimal(Recon_TProd).setScale(2, RoundingMode.HALF_UP);
                    double Reconver = bd.doubleValue();
                    disp = cn.prepareStatement("UPDATE Disponibles SET Precio_Unitario = " + Reconver + " WHERE Cod_Disponibles = " + dts[0] + "");
                    disp.executeUpdate();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PanelRecon.class.getName()).log(Level.SEVERE, null, ex);
            }

            sql = "SELECT Cod_Moneda,Valor FROM Moneda";
            //double[] Mon = new double[1];
            PreparedStatement Moneda;

            try {
                st = (Statement) cn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()) {
                    dts[0] = result.getDouble(1);
                    dts[1] = result.getDouble(2);
                    Recon_TProd = dts[1] / valor;
                    BigDecimal bd = new BigDecimal(Recon_TProd).setScale(2, RoundingMode.HALF_UP);
                    double Reconver = bd.doubleValue();
                    Moneda = cn.prepareStatement("UPDATE Moneda SET Valor = " + Reconver + " WHERE Cod_Moneda = " + dts[0] + "");
                    Moneda.executeUpdate();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PanelRecon.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "Datos reconvertidos de forma exitosa", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        limpiar();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    public void limpiar() {
        TxtReconvMonetaria.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField TxtReconvMonetaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
