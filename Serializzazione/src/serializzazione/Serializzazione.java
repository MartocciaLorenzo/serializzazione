/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martoccia.lorenzo
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Studente[] lista = new Studente[3];
        Studente s1 = new Studente("lorenzo", "cognome", 578);
        Studente s2 = new Studente("luca", "cognome", 452);
        Studente s3 = new Studente("adrian", "cognome", 657);
        lista[0] = s1;
        lista[1] = s2;
        lista[2] = s3;
        
        try {
            FileOutputStream FO = new FileOutputStream("test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO);
            OS.writeObject(lista);
//            OS.writeObject(9);
//            OS.writeObject("Ciao");
//            OS.writeObject((float)0.15756498);
//            OS.writeObject(false);
//            OS.writeObject('f');
            OS.flush();
            OS.close();
            FO.close();
            FileInputStream FI = new FileInputStream("test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);
            Studente[] v1 = (Studente[]) IS.readObject();
            for (Studente s : lista) {
                System.out.println("Array --> "+s.ToString());
            }
//            String v2 = (String) IS.readObject();
//            System.out.println("v2: "+v2);
//            Float v3 = (Float) IS.readObject();
//            System.out.println("v3: "+v3);
            
        } catch (FileNotFoundException ex) {
            System.err.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.err.println("Hai rotto java");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
