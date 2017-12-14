/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektverwaltung;

import entities.Buch;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class AlleBuecher {
    
    private static AlleBuecher alleBuecher;
    private AlleBuecher() {
        buecher = new ArrayList();}
    private ArrayList<Buch> buecher;
 
    public static AlleBuecher getInstance(){
        if(alleBuecher == null) {
            alleBuecher = new AlleBuecher();
        } 
        return alleBuecher;
    }
    
    public void addBuch(Buch b) {
        buecher.add(b);
    }
    
    public void removeLieferant(Buch b) {
        buecher.remove(b);
    }
    
    public Buch getBuch(int regnr) {
        for(Buch b : buecher){
            if(b.getRegistrierungsnummer()==regnr){
                return b;
            }
        }
        return null;
    }
    
}
