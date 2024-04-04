package System;

/**
 *
 * @author leyla
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Start {

    private static InfDB idb;

    public static void main(String[] args) throws InfException {

        try {
            idb = new InfDB("hattmakarna", "3306", "hattmakarna", "team5key");
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Personalsida(idb).setVisible(true);
    }
}
