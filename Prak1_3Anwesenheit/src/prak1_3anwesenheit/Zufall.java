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
public class Zufall extends Leuchte{

    @Override
    public void farbeWechseln() {
        int zahl = (int) ((Math.random()*5));
        switch(zahl) {
            case 0: this.setFarbe("rot");break;
            case 1: this.setFarbe("gelb");break;
            case 2: this.setFarbe("grün");break;
            case 3: this.setFarbe("blau");break;
            case 4: this.setFarbe("weiss");break;
            default: System.out.println("Error");
            
        }
        
        System.out.println(this.getFarbe());
    }
    
}
