/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package System;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Immanuel
 */
public class Statistik extends javax.swing.JPanel {
    
    private static InfDB idb;


    /**
     * Creates new form Statistik
     */
    public Statistik() {
        initComponents();
        this.idb = idb;
    }
    
public void fyllAr()
{
    String hamtaAr = "SELECT YEAR(Datum) AS År FROM hattmakarna.orders ORDER BY Datum DESC";
    int i = 0;
        try {
            ArrayList<String> allaAr = idb.fetchColumn(hamtaAr);
            
            for(String ar : allaAr)
            {
                cbAr.insertItemAt(ar, i);
                i++;
            }
            
            
        } catch (InfException ex) {
            Logger.getLogger(Statistik.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAr = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbManad = new javax.swing.JComboBox<>();
        txtStatistik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbKvartal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAr = new javax.swing.JButton();
        btnKvartal = new javax.swing.JButton();
        btnManad = new javax.swing.JButton();

        jLabel1.setText("Välj år");

        cbManad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "Novermber", "December" }));

        txtStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatistikActionPerformed(evt);
            }
        });

        jLabel2.setText("Välj månad");

        cbKvartal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q3", "Q4" }));

        jLabel3.setText("Välj kvartal");

        btnAr.setText("Visa statistik för valt år");

        btnKvartal.setText("Visa statistik för valt kvartal");
        btnKvartal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKvartalActionPerformed(evt);
            }
        });

        btnManad.setText("Visa statistik för vald månad");
        btnManad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbManad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAr)
                    .addComponent(btnKvartal)
                    .addComponent(btnManad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbKvartal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbManad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKvartal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addComponent(btnAr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKvartal)
                        .addGap(18, 18, 18)
                        .addComponent(btnManad))
                    .addComponent(txtStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatistikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatistikActionPerformed

    private void btnKvartalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKvartalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKvartalActionPerformed

    private void btnManadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAr;
    private javax.swing.JButton btnKvartal;
    private javax.swing.JButton btnManad;
    private javax.swing.JComboBox<String> cbAr;
    private javax.swing.JComboBox<String> cbKvartal;
    private javax.swing.JComboBox<String> cbManad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtStatistik;
    // End of variables declaration//GEN-END:variables
}
