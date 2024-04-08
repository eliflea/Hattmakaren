/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author tomas
 */
public class SkapaKund extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form SkapaKund
     */
    public SkapaKund() throws InfException {
        initComponents();
        idb = new InfDB("hattmakaren","3306","hattmakaren","team5key");
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
        txtFornamn = new javax.swing.JTextField();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        txtEfternamn = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        lblEpost = new javax.swing.JLabel();
        lblGatuadress = new javax.swing.JLabel();
        txtGatuadress = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtPostadress = new javax.swing.JTextField();
        lblPostadress = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        btnSkapaKund = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fyll i samtliga fält");

        txtFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornamnActionPerformed(evt);
            }
        });

        lblFornamn.setText("Förnamn");

        lblEfternamn.setText("Efternamn");

        lblEpost.setText("E-post");

        lblGatuadress.setText("Gatuadress");

        lblTelefon.setText("Telefon");

        lblPostadress.setText("Postadress");

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        btnSkapaKund.setText("Skapa kund");
        btnSkapaKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaKundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFornamn)
                        .addGap(18, 18, 18)
                        .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEfternamn)
                                .addComponent(lblEpost, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblGatuadress)
                            .addComponent(lblPostadress)
                            .addComponent(lblTelefon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGatuadress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPostadress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnSkapaKund)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfternamn)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGatuadress)
                    .addComponent(txtGatuadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPostadress)
                            .addComponent(txtPostadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSkapaKund)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void txtFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornamnActionPerformed

    private void btnSkapaKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaKundActionPerformed


        try {
            String fornamn = txtFornamn.getText();
            String efternamn = txtEfternamn.getText();
            String epost = txtEpost.getText();
            String gatuadress = txtGatuadress.getText();
            String telefon = txtPostadress.getText();
            int kundId = Integer.parseInt(idb.fetchSingle("SELECT MAX(Kund_ID) FROM Kund"))+1;
            String kundIdString = Integer.toString(kundId);
            
            String[] delar = txtPostadress.getText().split(" ");
            String postnummer = delar[0];
            String postort = delar[1];
            
            String fraga = "INSERT INTO kund VALUES (" + kundIdString + ", '" + fornamn + "', '" + efternamn + "', '" + telefon + "', '" + epost + "', '" + gatuadress + "', '" + postnummer + "', '" + postort + "')";
            
            idb.insert(fraga);
            
        } catch (InfException ex) {
            Logger.getLogger(SkapaKund.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_btnSkapaKundActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkapaKund;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblGatuadress;
    private javax.swing.JLabel lblPostadress;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtGatuadress;
    private javax.swing.JTextField txtPostadress;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
