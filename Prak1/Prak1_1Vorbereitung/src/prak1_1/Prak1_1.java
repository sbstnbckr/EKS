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
public class Prak1_1 {

    public static void main(String args[]) {
        Wuerfel wuerfel = new Wuerfel();
        System.out.println("Zufall:");
        wuerfel.setAlgorithmus(new Zufall());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        System.out.println("Reihe:");

        wuerfel.setAlgorithmus(new Reihe());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        System.out.println("Fester Wert:");

        wuerfel.setAlgorithmus(new Fester_Wert());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        System.out.println(wuerfel.werfen());
        


    }
    
    
    
    
}
