/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektverwaltung;

import entities.Bestellung;
import entities.Buch;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class AlleBestellungen {
    private static AlleBestellungen alleBestellungen;
    private AlleBestellungen() {
        bestellungen = new ArrayList();}
    private ArrayList<Bestellung> bestellungen;
 
    public static AlleBestellungen getInstance(){
        if(alleBestellungen == null) {
            alleBestellungen= new AlleBestellungen();
        } 
        return alleBestellungen;
    }
    
    public void addBestellung(Bestellung b) {
        bestellungen.add(b);
    }

    public ArrayList<Bestellung> getBestellungen() {
        return bestellungen;
    }
    
    public void removeBestellung(Bestellung b) {
        bestellungen.remove(b);
    }
    
    public String neueBestellung(int regnr, String name){
        Bestellung best= new Bestellung();
        int bestellnr=freieNummer();
        best.setBestellnr(bestellnr);
        Buch buch = AlleBuecher.getInstance().getBuch(regnr);
        best.setBuch(AlleBuecher.getInstance().getBuch(regnr));
        best.setNameBesteller(name);
        
        buch.addBestellung(best);
        bestellungen.add(best);
        
        return Integer.toString(bestellnr);
        }
    
    public Bestellung getBestellung(int regnr) {
        for(Bestellung b : bestellungen){
            if(b.getBestellnr()==regnr){
                return b;
            }
        }
        return null;
    }
    //todo: algorithmus optimieren
    public int freieNummer() {
        int n=0;
        for (Bestellung b : bestellungen) {
            if( n<b.getBestellnr()){
                n=b.getBestellnr();
            }
        }
        return n+1;
    }
}
