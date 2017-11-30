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
public class Wuerfel {
    
private Algorithmus algorithmus;
   

public void setAlgorithmus(Algorithmus algorithmus) {
    this.algorithmus=algorithmus;
}

public int werfen(){
    return algorithmus.werfen();      
}
    
}
