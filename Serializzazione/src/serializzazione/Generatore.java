/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author martoccia.lorenzo
 */
public class Generatore implements Runnable{
    
    public String GeneraNome(){
        String[] listaN = {"lorenzo", "luca", "adrian", "pietro"};
        return listaN[(int) (Math.random()*4)];
    }
    
    public String GeneraCognome(){
        String[] listaC = {"martoccia", "bho", "peppo", "generatore"};
        return listaC[(int) (Math.random()*4)];
    }
    
    public int GeneraNumero(){
        return (int) (Math.random()*30);
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            try {
                Studente s = new Studente(GeneraNome(), GeneraCognome(), GeneraNumero());
                System.out.println("Thread n. "+i +"//"+s.ToString());
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Generatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
