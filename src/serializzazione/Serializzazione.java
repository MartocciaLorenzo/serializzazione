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
 * @author martoccia.lorenzo
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException { 
        Studente s = new Studente("nome", "cognome", 578);
        
        try {
            FileOutputStream FO = new FileOutputStream("test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO);
            OS.writeObject(9);
            OS.writeObject("Ciao");
            OS.writeObject((float)0.15756498);
//            OS.writeObject(false);
//            OS.writeObject('f');
            OS.flush();
            OS.close();
            FO.close();
            FileInputStream FI = new FileInputStream("test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);
            Integer v1 = (Integer) IS.readObject();
            System.out.println("v1: "+v1);
            String v2 = (String) IS.readObject();
            System.out.println("v2: "+v2);
            Float v3 = (Float) IS.readObject();
            System.out.println("v3: "+v3);
            
        } catch (FileNotFoundException ex) {
            System.err.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.err.println("Hai rotto java");
        }
    }
}
