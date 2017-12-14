/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektverwaltung;

import entities.Lieferant;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class AlleLieferanten {
    
    private static AlleLieferanten alleLieferanten;
    private AlleLieferanten() {
        lieferanten= new ArrayList();}
    private ArrayList<Lieferant> lieferanten;
 
    public static AlleLieferanten getInstance(){
        if(alleLieferanten == null) {
            alleLieferanten = new AlleLieferanten();
        } 
        return alleLieferanten;
    }
    
    public void addLieferant(Lieferant l) {
        lieferanten.add(l);
    }
    
    public void removeLieferant(Lieferant l) {
        lieferanten.remove(l);
    }
    
    public Lieferant getLieferant(String name) {
        for(Lieferant l : lieferanten){
            if((l.getName().toLowerCase()).equals(name.toLowerCase())){
                return l;
            }
        }
        return null;
    }
}
 