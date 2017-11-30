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
public class Aus implements ZustandWaschmaschine {
    
    private Waschmaschine waschmaschine ;
    
    public Aus(Waschmaschine w){
        waschmaschine=w;
    }
    

    @Override
    public void ein() {
        waschmaschine.setZustand(waschmaschine.getStandby());
         }

    @Override
    public void aus() {
        System.out.println("Mehtode aus() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void abbrechen() {
        System.out.println("Mehtode abbrechen() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void programm(int zahl) {
        System.out.println("Mehtode programm(zahl) ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void start() {
        System.out.println("Mehtode start() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void pause() {
        System.out.println("Mehtode pause() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void weiter() {
        System.out.println("Mehtode weiter() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public void ende() {
        System.out.println("Mehtode ende() ist aus dem Zustand aus nicht möglich!");
    }

    @Override
    public String getName() {
        return "aus";
        }
    
    
}
