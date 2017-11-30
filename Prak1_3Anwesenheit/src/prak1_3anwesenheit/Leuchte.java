/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1_3anwesenheit;

/**
 *
 * @author Sebastian
 */
public abstract class Leuchte {
    
    private String farbe;
    
    public void einschalten (){
        
        for (int i=0;i<10;i++) {
            farbeWechseln();
        }
        
    }
    
    public abstract void farbeWechseln();

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
}
