/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1_1;

/**
 *
 * @author sebastian
 */
public class Reihe implements Algorithmus {
    
    int aktuellerWert=0;

    @Override
    public int werfen() {
        aktuellerWert++;
        if (aktuellerWert>6) {
            aktuellerWert=1; 
        }
        
        
        return aktuellerWert;
        
    }
    
}
