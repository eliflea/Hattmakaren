/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author elisaleah
 */
public class SkapaHatt extends javax.swing.JFrame {

    private final InfDB idb;
    /**
     * Creates new form SkapaHatt
     * @param idb
     */
    public SkapaHatt(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAngeProduktnummer = new javax.swing.JTextField();
        lblSkapaHatt = new javax.swing.JLabel();
        lblAngeProduktnummer = new javax.swing.JLabel();
        txtAngeNamn = new javax.swing.JTextField();
        lblAngeNamn = new javax.swing.JLabel();
        txtAngeStorlek = new javax.swing.JTextField();
        txtAngePris = new javax.swing.JTextField();
        lblAngeStorlek = new javax.swing.JLabel();
        txtAngeModell = new javax.swing.JTextField();
        cbValjTyp = new javax.swing.JComboBox<>();
        lblAngePris = new javax.swing.JLabel();
        lblValjTyp = new javax.swing.JLabel();
        lblAngeModell = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        txtAngeText = new javax.swing.JTextField();
        lblAngeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAngeProduktnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngeProduktnummerActionPerformed(evt);
            }
        });

        lblSkapaHatt.setText("Skapa Hatt");

        lblAngeProduktnummer.setText("Ange Produktnummer");

        lblAngeNamn.setText("Ange Namn");

        lblAngeStorlek.setText("Ange Storlek");

        cbValjTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lagerförd", "Special" }));

        lblAngePris.setText("Ange Pris");

        lblValjTyp.setText("Välj Typ");

        lblAngeModell.setText("Ange modell");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblAngeText.setText("Ange Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSkapaHatt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAngeProduktnummer)
                                    .addComponent(txtAngeProduktnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAngeNamn)
                                    .addComponent(txtAngeNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtAngePris, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAngeStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngeStorlek))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAngeModell, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngeModell)
                            .addComponent(lblValjTyp)
                            .addComponent(txtAngeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngeText)
                            .addComponent(btnSpara)))
                    .addComponent(lblAngePris, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(71, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblSkapaHatt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeProduktnummer)
                    .addComponent(lblAngeModell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngeProduktnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngeModell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeNamn)
                    .addComponent(lblAngeText))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAngeNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblAngeStorlek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAngeStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAngePris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAngePris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpara)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAngeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblValjTyp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbValjTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
try {

// Hämta värden från användargränssnittet   
String produktnummer = txtAngeProduktnummer.getText();
String namn = txtAngeNamn.getText();
String storlek = txtAngeStorlek.getText();
String modell = txtAngeModell.getText();
String pris = txtAngePris.getText();
String valjTyp = cbValjTyp.getSelectedItem().toString();
String text = txtAngeText.getText();
String string1 = "Lagerförd";

// Kontrollera om alla fält är ifyllda
boolean allaFaltIfyllda = 
            Validering.harTextFaltetVarde(txtAngeProduktnummer) &&
            Validering.harTextFaltetVarde(txtAngeNamn) &&
            Validering.harTextFaltetVarde(txtAngeStorlek) &&
            Validering.harTextFaltetVarde(txtAngeModell) &&
            Validering.harTextFaltetVarde(txtAngePris) &&
            Validering.harTextFaltetVarde(txtAngeText);
   
// Skapa SQL-query för att lägga till en hatt i databasen, med olika värden beroende på vald typ
String skapaHattQuery = "insert into hatt (Produkt_ID, Namn, Storlek, Modell, Pris, Godkänd, Text) Values ('"+produktnummer+"', '"+namn+"', '"+storlek+"', '"+modell+"', '"+pris+"','"+1+"','"+text+"')";
String skapaHattQuery2 = "insert into hatt (Produkt_ID, Namn, Storlek, Modell, Pris, Godkänd, Text) Values ('"+produktnummer+"', '"+namn+"', '"+storlek+"', '"+modell+"', '"+pris+"','"+0+"','"+text+"')";

 // Om typen är "Lagerförd", lägg till en hatt i databasen med status godkänd (1), annars lägg till med status ej godkänd (0)
if (valjTyp.equals(string1)){idb.insert(skapaHattQuery);}
else{idb.insert(skapaHattQuery2);}
   
    } 
catch (InfException e) {
    // Hantera undantag vid felaktig interaktion med databasen
System.out.println(e);
    }

    }//GEN-LAST:event_btnSparaActionPerformed

    
    private void txtAngeProduktnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngeProduktnummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngeProduktnummerActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cbValjTyp;
    private javax.swing.JLabel lblAngeModell;
    private javax.swing.JLabel lblAngeNamn;
    private javax.swing.JLabel lblAngePris;
    private javax.swing.JLabel lblAngeProduktnummer;
    private javax.swing.JLabel lblAngeStorlek;
    private javax.swing.JLabel lblAngeText;
    private javax.swing.JLabel lblSkapaHatt;
    private javax.swing.JLabel lblValjTyp;
    private javax.swing.JTextField txtAngeModell;
    private javax.swing.JTextField txtAngeNamn;
    private javax.swing.JTextField txtAngePris;
    private javax.swing.JTextField txtAngeProduktnummer;
    private javax.swing.JTextField txtAngeStorlek;
    private javax.swing.JTextField txtAngeText;
    // End of variables declaration//GEN-END:variables
}
