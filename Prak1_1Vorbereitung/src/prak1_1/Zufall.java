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
public class Zufall implements Algorithmus{

    @Override
    public int werfen() {

        return (int) ((Math.random()*6)+1);
        
    }
    
    
    
}
