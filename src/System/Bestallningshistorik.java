/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Pontus
 */
public class Bestallningshistorik extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form Bestallningshistorik
     */
    public Bestallningshistorik(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllRullLista();
        fyllTextrutaMedBestallningshistorik();
    }
    
    public void fyllRullLista()
    {
        String sqlHamtaPersonalEpost = "SELECT Epost FROM kund";
        ArrayList<String> allPersonalEpost = new ArrayList<String>();
        try {
            allPersonalEpost = idb.fetchColumn(sqlHamtaPersonalEpost);
            
            for(String enEpost : allPersonalEpost)
            {
                cbValjKundEpost.addItem(enEpost);
            }
            
        } catch (InfException ex) {
            Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fyllTextrutaMedBestallningshistorik()
    {
        String valdEpost = cbValjKundEpost.getSelectedItem().toString().trim();
        
        String sqlHamtaKundID = "SELECT Kund_ID FROM Kund WHERE Epost = '" + valdEpost + "'";
        String kundID = "";
        try {
            kundID = idb.fetchSingle(sqlHamtaKundID);
        } catch (InfException ex) {
            Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlHamtaRelevantaOrdrar = "SELECT * FROM orders WHERE Kund = '" + kundID + "' ORDER BY Datum DESC";
        ArrayList<HashMap<String, String>> allaOrderID = new ArrayList<HashMap<String, String>>();
        try {
            allaOrderID = idb.fetchRows(sqlHamtaRelevantaOrdrar);
        } catch (InfException ex) {
            Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String ettPar = "";
        
        ArrayList<String> ettParVarden = new ArrayList<String>();
        
        for(HashMap<String,String> order : allaOrderID)
        {
            for(String nyckel : order.keySet())
            {
                if(nyckel.equals("Totalsumma") && order.get(nyckel) == null)
                {
                    ettPar = nyckel + " = 0";
                }
                else if(nyckel.equals("Kund"))
                {
                    String sqlHamtaFornamn = "SELECT Förnamn FROM Kund WHERE Kund_ID = " + order.get(nyckel);
                    String sqlHamtaEfternamn = "SELECT Efternamn FROM Kund WHERE Kund_ID = " + order.get(nyckel);
                    
                    String fornamn = "";
                    String efternamn = "";
                    
                    try {
                        fornamn = idb.fetchSingle(sqlHamtaFornamn);
                        efternamn = idb.fetchSingle(sqlHamtaEfternamn);

                    } catch (InfException ex) {
                        Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    ettPar = "Kund = " + fornamn + " " + efternamn;
                }
                else if(nyckel.equals("Order_ID"))
                {
                    ettPar = "Ordernummer = " + order.get(nyckel);
                }
                else if(nyckel.equals("Fraktsedel") && order.get(nyckel) == null)
                {
                    ettPar = nyckel + " = 0 st";
                }
                else if (nyckel.equals("Kommentar") && order.get(nyckel).equals(""))
                {
                    ettPar = nyckel + " = Ingen kommentar.";
                }
                else if(nyckel.equals("Fraktsedel") && order.get(nyckel) != null)
                {
                    ettPar = nyckel + " = " + order.get(nyckel) + " st";

                }
                else if(nyckel.equals("Brådskande") && Integer.parseInt(order.get(nyckel)) == 0)
                {
                    ettPar = nyckel + " = Nej";
                }
                else if(nyckel.equals("Brådskande") && Integer.parseInt(order.get(nyckel)) == 1)
                {
                    ettPar = nyckel + " = Ja";
                }
                else
                {
                ettPar = nyckel + " = " + order.get(nyckel);
                }
                
                ettParVarden.add(ettPar + "\n");
            }
            
            String sqlHamtaHattar = "SELECT Hatt_ID FROm hatt_i_order WHERE Order_ID = " + order.get("Order_ID");
            ArrayList<String> allaHattarIOrder = new ArrayList<String>();
            try {
                allaHattarIOrder = idb.fetchColumn(sqlHamtaHattar);
            } catch (InfException ex) {
                Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ArrayList<String> allaHattNamn = new ArrayList<String>();
            
            for(String hatt : allaHattarIOrder)
            {
                String sqlHamtaHattNamn = "SELECT Namn FROM Hatt WHERE Produkt_ID = " + hatt;
                String ettHattNamn = "";
                try {
                    ettHattNamn = idb.fetchSingle(sqlHamtaHattNamn);
                } catch (InfException ex) {
                    Logger.getLogger(Bestallningshistorik.class.getName()).log(Level.SEVERE, null, ex);
                }
                allaHattNamn.add(ettHattNamn);
                        
            }
            
            ettParVarden.add("Hattar i order: ");
            for(String hattNamn : allaHattNamn)
            {
                ettParVarden.add(hattNamn);
            }
                    
            ettParVarden.add("\n");
                        ettParVarden.add("\n");

        }
        
        jtxtBestallningsHistorik.setText(ettParVarden + "\n");
        
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
        cbValjKundEpost = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtBestallningsHistorik = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbValjKundEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjKundEpostActionPerformed(evt);
            }
        });

        jtxtBestallningsHistorik.setEditable(false);
        jtxtBestallningsHistorik.setColumns(20);
        jtxtBestallningsHistorik.setRows(5);
        jScrollPane1.setViewportView(jtxtBestallningsHistorik);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cbValjKundEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cbValjKundEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjKundEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjKundEpostActionPerformed
        // TODO add your handling code here:
        fyllTextrutaMedBestallningshistorik();
    }//GEN-LAST:event_cbValjKundEpostActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjKundEpost;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtBestallningsHistorik;
    // End of variables declaration//GEN-END:variables
}
