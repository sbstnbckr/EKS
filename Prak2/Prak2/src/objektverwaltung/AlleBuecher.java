/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektverwaltung;

import entities.Buch;
import entities.Lieferant;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class AlleBuecher {
    
    private static AlleBuecher alleBuecher;
    private AlleBuecher() {
        buecher = new ArrayList();
    }
    private ArrayList<Buch> buecher;
 
    public static AlleBuecher getInstance(){
        if(alleBuecher == null) {
            alleBuecher = new AlleBuecher();
        } 
        return alleBuecher;
    }

    public ArrayList<Buch> getBuecher() {
        return buecher;
    }
    
    public void addBuch(Buch b) {
        buecher.add(b);
    }
    
    public void removeLieferant(Buch b) {
        buecher.remove(b);
    }
    
    public String neuesBuch(Lieferant l, int preis){
        
        int regnr=freieNummer();
                System.out.println("buch erstellt1");

        
        Buch buch = new Buch();
                System.out.println("buch erstellt2");

        buch.setPreis(preis);
                System.out.println("buch erstellt3");

        buch.setRegistrierungsnummer(regnr);
                System.out.println("buch erstellt4");

        buecher.add(buch);

        l.addLiefert(buch);
                System.out.println("buch erstellt5");

        System.out.println("buch erstellt");
        return Integer.toString(regnr);
        
        
        
    }
    
    public Buch getBuch(int regnr) {
        for(Buch b : buecher){
            if(b.getRegistrierungsnummer()==regnr){
                return b;
            }
        }
        return null;
    }
    
    public int freieNummer() {
        int n=0;
        for (Buch b : buecher) {
            if( n<b.getRegistrierungsnummer()){
                n=b.getRegistrierungsnummer();
            }
        }
        return n+1;
    }
    
}
