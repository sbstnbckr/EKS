/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Buch {
    
    private int preis;
    private int registrierungsnummer;
    private ArrayList<Bestellung> bestellung;
    

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getRegistrierungsnummer() {
        return registrierungsnummer;
    }

    public void setRegistrierungsnummer(int registrierungsnummer) {
        this.registrierungsnummer = registrierungsnummer;
    }
    
    public void addBestellung(Bestellung b) {
        bestellung.add(b);
    }
    
    public void removeBestellung(Bestellung b) {
        bestellung.remove(b);
    }
    
}
