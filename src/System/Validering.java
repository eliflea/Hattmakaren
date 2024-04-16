package System;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 * Klassen som validerar och kontrollerar varje inmatning av användaren.
 *
 * @author tomas
 */
public class Validering {
    
    
public static boolean harTextFaltetVarde(JTextField rutaAttKolla, JLabel meddelande){
    
    //kollar att det angivna faltet inte är tomt
    
    boolean faltHarVarde = true;
    
    if(rutaAttKolla.getText().isEmpty()){
        meddelande.setText("Fyll i alla rutor!");
        faltHarVarde = false;
        rutaAttKolla.requestFocus();
    }
    return faltHarVarde;
}

public static boolean kollaHeltal(JTextField rutaAttKolla){
    
    //kollar att texten i faltet är ett heltal
    
     boolean inmatningArHeltal = true;
    try {
         if(!rutaAttKolla.getText().isEmpty()){
        Integer.parseInt(rutaAttKolla.getText());
    }
    
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett heltal!");
        inmatningArHeltal = false;
        rutaAttKolla.requestFocus();
    }
    return inmatningArHeltal;
}

public static boolean kollaDecimalTal(JTextField rutaAttKolla){
    
    //kollar att falttexten är decimaltal
    
     boolean inmatningArDecimalTal = true;
    try {
         if(!rutaAttKolla.getText().isEmpty()){
        Double.parseDouble(rutaAttKolla.getText());
    }
    
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett giltigt decimaltal!");
        inmatningArDecimalTal = false;
        rutaAttKolla.requestFocus();
    }
    return inmatningArDecimalTal;
}

public static boolean kollaDatumFormat(JTextField rutaAttKolla) {
    
    //kollar att falttexten är i rätt datumformat, och anger rätt format att mata in ifall det inte är det.
    
    boolean inmatningsFormat = true;
    
         String input = rutaAttKolla.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        
        try {
            Date date = format.parse(input);
            
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fel datum format, vänligen ange datumet som 'yyyy-MM-dd'");
            inmatningsFormat = false;
            rutaAttKolla.requestFocus();
        }
        return inmatningsFormat;
    }
}
