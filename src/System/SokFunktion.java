package System;

import java.util.ArrayList;
import javax.swing.JComboBox;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import oru.inf.InfDB;
import oru.inf.InfException;



/**
 *
 * @author leyla
 */
public class SokFunktion extends javax.swing.JFrame {

    private InfDB idb;
    
    /**
     * Creates new form SokFunktion
     */
    public SokFunktion(InfDB idb) {
        this.idb = idb;
        initComponents();
        fyllEpost();
        AutoCompleteDecorator.decorate(cbKundEpost);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbKundEpost = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbKundEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundEpostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(cbKundEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cbKundEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbKundEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundEpostActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbKundEpostActionPerformed

    private void fyllEpost () {
        String fraga = "SELECT Epost FROM kund";
        try {
            ArrayList<String> epost = idb.fetchColumn(fraga);
            for (String enEpost : epost ){
            cbKundEpost.addItem(enEpost); }
        }
        catch(InfException fel) {
            fel.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbKundEpost;
    // End of variables declaration//GEN-END:variables
}
