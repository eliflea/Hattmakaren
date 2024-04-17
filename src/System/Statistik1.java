/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author meyac_2qya4l2
 */
public class Statistik1 extends javax.swing.JFrame {
    private static InfDB idb; 
    

    /**
     * Creates new form Statistik1
     */
    public Statistik1(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllAr();
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
        cbAr = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbManad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbKvartal = new javax.swing.JComboBox<>();
        txtStatistik = new javax.swing.JTextField();
        btnAr = new javax.swing.JButton();
        btnKvartal = new javax.swing.JButton();
        btnManad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj år");

        jLabel2.setText("Välj månad");

        cbManad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "Novermber", "December" }));

        jLabel3.setText("Välj kvartal");

        cbKvartal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q3", "Q4" }));

        txtStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatistikActionPerformed(evt);
            }
        });

        btnAr.setText("Visa statistik för valt år");
        btnAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatistikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatistikActionPerformed
    public void fyllAr()
{
    String hamtaAr = "SELECT DISTINCT YEAR(Datum) AS År FROM hattmakarna.orders ORDER BY År DESC";
    int i = 0;
        try {
            ArrayList<String> allaAr = idb.fetchColumn(hamtaAr);
            
            for(String ar : allaAr)
            {
                String aret = ar.substring(0, 4);
                cbAr.insertItemAt(aret, i);
                i++;
            }
            
            
         } catch (InfException ex) {
            Logger.getLogger(Statistik.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void btnKvartalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKvartalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKvartalActionPerformed

    private void btnManadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManadActionPerformed

    private void btnArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArActionPerformed
        // TODO add your handling code here:
        String valtAr = cbAr.getSelectedItem().toString();
        
        String sqlHamtaArsforsaljning = "SELECT SUM(Totalsumma) AS Årssumma FROM Orders WHERE Datum<= '" + valtAr + "-12-31' && Datum>='" + valtAr + "-01-01'";
        
        try {
            String totalForsaljningsSumma = idb.fetchSingle(sqlHamtaArsforsaljning);
            txtStatistik.setText("Total försäljning år " + valtAr + ": " + totalForsaljningsSumma + " SEK");
        } catch (InfException ex) {
            Logger.getLogger(Statistik1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnArActionPerformed

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
            java.util.logging.Logger.getLogger(Statistik1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistik1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistik1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistik1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistik1().setVisible(true);
            }
        });
    }

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
