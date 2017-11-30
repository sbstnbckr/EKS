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
public class Standby implements ZustandWaschmaschine{
    
    private Waschmaschine waschmaschine;

    public Standby(Waschmaschine w){
        waschmaschine=w;
    }

    @Override
    public void ein() {
        System.out.println("Mehtode ein() ist aus dem Zustand Standby nicht möglich!");
    }

    @Override
    public void aus() {
        waschmaschine.setZustand(waschmaschine.getAus());
    }

    @Override
    public void abbrechen() {
        System.out.println("Mehtode abbrechen() ist aus dem Zustand Standby nicht möglich!");
    }

    @Override
    public void programm(int zahl) {
        waschmaschine.setZustand(waschmaschine.getProgrammGewaehlt());
    }

    @Override
    public void start() {
        System.out.println("Mehtode start() ist aus dem Zustand Standby nicht möglich!");
    }

    @Override
    public void pause() {
        System.out.println("Mehtode pause() ist aus dem Zustand Standby nicht möglich!");
    }

    @Override
    public void weiter() {
        System.out.println("Mehtode weiter() ist aus dem Zustand Standby nicht möglich!");
    }

    @Override
    public void ende() {
        System.out.println("Mehtode ende() ist aus dem Zustand Programm gewählt nicht möglich!");
    }

    @Override
    public String getName() {
        return "Standby";
    }
    
}
