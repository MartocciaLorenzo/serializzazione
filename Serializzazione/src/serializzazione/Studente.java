/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author martoccia.lorenzo
 */
public class Studente implements Serializable, Runnable{
    String nome;
    String cognome;
    int numero;

    public Studente(String nome, String cognome, int numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public String ToString() {
        return "Studente: "+numero+"      nome: "+nome+"      cognome: "+cognome;
    }

    @Override
    public void run() {
        Thread t1 = new Thread();
        
    }
    
}
