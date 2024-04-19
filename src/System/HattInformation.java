/*0
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;
//imports som används, graphics, toolkit & printjob används för att kunna omvandla till pdf
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.PrintJob;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sarah
 */
public class HattInformation extends javax.swing.JFrame {
    
    private int hattId;
    private InfDB idb;

    /**
     * Creates new form HattInformation
     */
    public HattInformation(int hattId) throws InfException {
        initComponents();
        this.hattId = hattId;
        idb = new InfDB("hattmakarna", "3306", "hattmakarna", "team5key");
        fyllMaterialLista();
        hamtaInfoOmHatt();
    }
    
   private void fyllMaterialLista() {
    try {
        ArrayList<HashMap<String, String>> rader = idb.fetchRows("Select Material_ID, namn from material where Material_ID in (Select Material_ID from material_i_hatt where Hatt_ID = 1)");

        int i = 0; // Index börjar från 0 eftersom det är en arrayindexering
        for (HashMap<String, String> enRad : rader) {
            String materialId = "MaterialId: " + enRad.get("Material_ID");
            String namn = " Namn: " + enRad.get("Namn");

            // Hämta JLabel för den aktuella raden
            JLabel materialLabel = getMaterialLabel(i);

            // Uppdatera texten för JLabel
            materialLabel.setText(materialId + namn);

            i++;
        }
    } catch (InfException ex) {
        Logger.getLogger(PnlMaterial.class.getName()).log(Level.SEVERE, null, ex);
    }
}

// Hjälpmetod för att hämta JLabel för en given index
private JLabel getMaterialLabel(int index) {
    switch (index) {
        case 0:
            return lblM1;
        case 1:
            return lblM2;
        case 2:
            return lblM3;
        case 3:
            return lblM4;
        default:
            return null; // Felhantering om index är ogiltigt
    }
}

    public void hamtaInfoOmHatt ()
    {
        //Denna kod använder här en HashMap för att få information om hatten 
        try {
            String hattString = Integer.toString(hattId);
            HashMap<String, String> hattensRad = idb.fetchRow("select * from hatt where Produkt_ID = "+ hattString);
            String utskrift = "Produktnummer: " + hattensRad.get("Produkt_ID") + "\nNamn: " + hattensRad.get("Namn") + "\nModell: " + hattensRad.get("Modell");
            
            
           
            txtInfoRuta.setText(utskrift);
            
        } catch (InfException ex) {
            Logger.getLogger(HattInformation.class.getName()).log(Level.SEVERE, null, ex);
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

        btnSkrivUtMaterial = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoRuta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblM1 = new javax.swing.JLabel();
        lblM2 = new javax.swing.JLabel();
        lblM3 = new javax.swing.JLabel();
        lblM4 = new javax.swing.JLabel();
        lblN1 = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        lblN3 = new javax.swing.JLabel();
        lblN4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        btnSkrivUtMaterial.setBackground(new java.awt.Color(0, 0, 255));
        btnSkrivUtMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnSkrivUtMaterial.setText("Skriv ut material");
        btnSkrivUtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivUtMaterialActionPerformed(evt);
            }
        });

        txtInfoRuta.setColumns(20);
        txtInfoRuta.setRows(5);
        txtInfoRuta.setBorder(null);
        txtInfoRuta.setSelectionColor(new java.awt.Color(0, 0, 204));
        jScrollPane1.setViewportView(txtInfoRuta);

        jTabbedPane1.addTab("Hatt", jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblM1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblM4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblM3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblN4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(lblN3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(lblN2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(lblN1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblM4, lblN1, lblN2, lblN3, lblN4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblM1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblN2)
                        .addGap(18, 18, 18)
                        .addComponent(lblN3)
                        .addGap(18, 18, 18)
                        .addComponent(lblN4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblM3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblM4)))
                .addGap(19, 19, 19))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblM1, lblM3, lblM4, lblN1, lblN2, lblN3, lblN4});

        jTabbedPane1.addTab("Material", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSkrivUtMaterial)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSkrivUtMaterial)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkrivUtMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivUtMaterialActionPerformed

     //Denna koden använder sig av importerena för att kunna omvandla till pdf                                       
    PnlMaterial pnlMaterial = new PnlMaterial(1);
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    PrintJob printJob = toolkit.getPrintJob(this, "Utskrift", null);
    JOptionPane.showMessageDialog(this, pnlMaterial, "Utskriftens innehåll", JOptionPane.PLAIN_MESSAGE);
    if (printJob != null) {
        Graphics graphics = printJob.getGraphics();
        if (graphics != null) {
            pnlMaterial.printAll(graphics);
            graphics.dispose();
        } else {
            System.out.println("Ingen grafik för utskrift.");
        }
        printJob.end();
    } else {
        System.out.println("Kunde inte skapa utskriftsjobb.");
    }


    }//GEN-LAST:event_btnSkrivUtMaterialActionPerformed

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
            java.util.logging.Logger.getLogger(HattInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HattInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HattInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HattInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HattInformation(1).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(HattInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkrivUtMaterial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblM1;
    private javax.swing.JLabel lblM2;
    private javax.swing.JLabel lblM3;
    private javax.swing.JLabel lblM4;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblN3;
    private javax.swing.JLabel lblN4;
    private javax.swing.JTextArea txtInfoRuta;
    // End of variables declaration//GEN-END:variables
}
