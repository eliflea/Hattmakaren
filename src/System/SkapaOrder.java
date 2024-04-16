/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;

/**
 *
 * @author tomas
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SkapaOrder extends javax.swing.JFrame {
    private InfDB idb;
    private String ordernummer;
    
    /**
     * Creates new form SkapaOrder
     */
    public SkapaOrder(InfDB idb) {
        initComponents();
        this.idb = idb; 
        fyllBoxKund();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnValjHatt = new javax.swing.JButton();
        btnSparaOrder = new javax.swing.JButton();
        lblRubrikOrder = new javax.swing.JLabel();
        cbValjStatus = new javax.swing.JComboBox<>();
        lblRubrikKund = new javax.swing.JLabel();
        cbValjKund = new javax.swing.JComboBox<>();
        lblRubrikLaggTillIOrder = new javax.swing.JLabel();
        lblRubrikDatum = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        lblRubrikDatum1 = new javax.swing.JLabel();
        txtKommentar = new javax.swing.JTextField();
        cbValjPrioritering = new javax.swing.JComboBox<>();
        lblRubrikPrioritering = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnValjHatt.setText("Välj hatt");
        btnValjHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjHattActionPerformed(evt);
            }
        });

        btnSparaOrder.setText("Skapa order");
        btnSparaOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaOrderActionPerformed(evt);
            }
        });

        lblRubrikOrder.setText("Kundens godkännande:");

        cbValjStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Godkänd", "Inte godkänd" }));
        cbValjStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjStatusActionPerformed(evt);
            }
        });

        lblRubrikKund.setText("Kund:");

        cbValjKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjKundActionPerformed(evt);
            }
        });

        lblRubrikLaggTillIOrder.setText("Lägg till hatt i en existerande order:");

        lblRubrikDatum.setText("Datum:");

        lblRubrikDatum1.setText("Kommentar:");

        txtKommentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKommentarActionPerformed(evt);
            }
        });

        cbValjPrioritering.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brådskande", "Inte brådskande" }));

        lblRubrikPrioritering.setText("Orderns prioritering:");

        jLabel2.setText("Skapa order");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Redo", "Påbörjad", "Avslutad" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("Ange status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSparaOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnValjHatt))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRubrikLaggTillIOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRubrikOrder)
                                    .addComponent(lblRubrikPrioritering)
                                    .addComponent(lblRubrikDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRubrikDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRubrikKund)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKommentar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbValjPrioritering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbValjStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRubrikOrder)
                            .addComponent(cbValjStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRubrikPrioritering))
                    .addComponent(cbValjPrioritering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikDatum)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblRubrikKund))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKommentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRubrikDatum1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(btnSparaOrder)
                .addGap(18, 18, 18)
                .addComponent(lblRubrikLaggTillIOrder)
                .addGap(18, 18, 18)
                .addComponent(btnValjHatt)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaOrderActionPerformed
        // TODO add your handling code here:
        boolean allaFaltIfyllda = 
       //     Validering.harTextFaltetVarde(txtDatum) &&
            Validering.kollaDatumFormat(txtDatum);
        
         //Hämtar valt objekt från ComboBoxen samt konverterar det till sträng
        String valdKundsGodkännande = cbValjStatus.getSelectedItem().toString().toLowerCase();
        String valdKund = cbValjKund.getSelectedItem().toString();
        //Texten hämtas från textrutan och tilldelas till variabeln som deklareras
        String kommentar = txtKommentar.getText(); 
        String datum = txtDatum.getText();
        String valdStatus = cbStatus.getSelectedItem().toString();
        String valdPrioritering = cbValjPrioritering.getSelectedItem().toString().toLowerCase();
        
        try {
            
       
            
             String [] namn = cbValjKund.getSelectedItem().toString().split(" ");
           
                String fornamn = namn[0];     // First part is the first name
                 String efternamn = namn[1];   // Second part is the last name
    
    // Create SQL query to fetch the Kund_ID based on first name and last name
    String fragakundID = "SELECT Kund_ID FROM kund WHERE Förnamn = '" + fornamn + "' AND Efternamn = '" + efternamn + "'";
    
    // Execute the SQL query to fetch the Kund_ID
    String kundID = idb.fetchSingle(fragakundID);
         
  
        int orderId = Integer.parseInt(idb.fetchSingle("SELECT MAX(Order_ID) FROM Orders"))+1;
        String orderIdString = Integer.toString(orderId);
         
        String fragaSkapaOrder = ""; 
        //SQL fråga för att skapa order 
        //och villkor för att bestämma brådskande för order
        if (valdPrioritering.equalsIgnoreCase("Brådskande")) {
            valdPrioritering = "1";
             fragaSkapaOrder = "Insert into orders (Order_ID, KundsGodkännande, Kund, Kommentar, Brådskande, Datum, Status) "
                                + "Values ('" + orderIdString + "','" + valdKundsGodkännande + "','" + kundID + "','" + kommentar + "','" + valdPrioritering + "','" + datum + "','" + valdStatus + "')";
             idb.insert(fragaSkapaOrder); 
        }
        if (valdPrioritering.equalsIgnoreCase("Inte brådskande")) {
            valdPrioritering = "0";
             fragaSkapaOrder = "Insert into orders (Order_ID, KundsGodkännande, Kund, Kommentar, Brådskande, Datum, Status) "
                                + "Values ('" + orderIdString + "','" + valdKundsGodkännande + "','" + kundID + "','" + kommentar + "','" + valdPrioritering + "','" + datum + "','" + valdStatus + "')";
             idb.insert(fragaSkapaOrder);
             
           
        }
        
        //felmeddelande
         } catch(InfException ex){
            System.out.println(ex);
            
        }
    }//GEN-LAST:event_btnSparaOrderActionPerformed
 
    private void btnValjHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjHattActionPerformed
         // TODO add your handling code here:                                   
         new ValjHatt1(idb).setVisible(true);                   
    }//GEN-LAST:event_btnValjHattActionPerformed

    private void txtKommentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKommentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKommentarActionPerformed

    private void cbValjKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjKundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjKundActionPerformed

    private void cbValjStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjStatusActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed
         
   private void fyllBoxKund() {
       //Metod, fylla en combobox med kundnamn
        try {
             String fragaFyllBox = "Select Förnamn, Efternamn from kund order by Kund_ID";
             ArrayList<HashMap<String, String>> allaKunder = idb.fetchRows(fragaFyllBox);
             for (HashMap<String, String> kund : allaKunder) {
            //Kundens efternamn och förnamn hämtas 
            String fornamn = kund.get("Förnamn");
            String efternamn = kund.get("Efternamn");
           
            //förnamn och efternamn kombineras för att läggas i combobox
            cbValjKund.addItem(fornamn + " " + efternamn );
              }      
           } catch (InfException ettUndantag) {
             System.out.println("Error " + ettUndantag.getMessage()); 
           }
          }
     
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSparaOrder;
    private javax.swing.JButton btnValjHatt;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbValjKund;
    private javax.swing.JComboBox<String> cbValjPrioritering;
    private javax.swing.JComboBox<String> cbValjStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRubrikDatum;
    private javax.swing.JLabel lblRubrikDatum1;
    private javax.swing.JLabel lblRubrikKund;
    private javax.swing.JLabel lblRubrikLaggTillIOrder;
    private javax.swing.JLabel lblRubrikOrder;
    private javax.swing.JLabel lblRubrikPrioritering;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtKommentar;
    // End of variables declaration//GEN-END:variables
}
