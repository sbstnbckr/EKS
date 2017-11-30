/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1_2;

/**
 *
 * @author sebastian
 */
public class Prak1_2 {

    /**
     * @param args the command line arguments
     * 
     *
     */
    private static Waschmaschine maschine;

    
    
    public static void main(String[] args) {
        
        maschine=new Waschmaschine();
        maschine.getZustand();
        maschine.ein();
        maschine.getZustand();
        maschine.programm(3);
        maschine.getZustand();
        maschine.start();
        maschine.getZustand();
        maschine.pause();
        maschine.getZustand();
        maschine.weiter();
        maschine.getZustand();
        maschine.ende();  //ende = abbrechen()?
        maschine.getZustand();
        
        maschine.aus();
        maschine.getZustand();
        maschine.ein();
        maschine.programm(4);
        maschine.abbrechen();
        maschine.getZustand();
        
        maschine.programm(2);
        maschine.start();
        maschine.programm(2);
        maschine.abbrechen();
        
        maschine.pause();
        maschine.pause();
        maschine.abbrechen();
        maschine.getZustand();
        maschine.aus();
        maschine.getZustand();
        


        
    }
    
}
