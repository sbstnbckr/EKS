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
public class Zyklisch extends Leuchte{

    int zustand=0;
    @Override
    public void farbeWechseln() {
        
        switch(zustand) {
            case 0: this.setFarbe("rot");break;
            case 1: this.setFarbe("gelb");break;
            case 2: this.setFarbe("grün");break;
            case 3: this.setFarbe("blau");break;
            case 4: this.setFarbe("weiss");break;
        }
        
        if (zustand<4){
            zustand++;
        } else {
            zustand=0;
        }
        
        System.out.println(this.getFarbe());
    }
    
}
