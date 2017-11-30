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
public class Prak1_3Anwesenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Leuchte l=new Zufall();
        l.einschalten();
        l=new Fest();
        l.einschalten();
        l=new Zyklisch();
        l.einschalten();
        
    }
    
}
