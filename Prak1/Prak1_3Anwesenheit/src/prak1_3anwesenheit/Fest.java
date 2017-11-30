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
public class Fest extends Leuchte{

    @Override
    public void farbeWechseln() {
        
        this.setFarbe("grün");
        System.out.println(this.getFarbe());
    
    }
    
   
}
