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
public class InBetrieb implements ZustandWaschmaschine {
    
    private Waschmaschine waschmaschine;
    
    public InBetrieb(Waschmaschine w){
        waschmaschine=w;
    }

    @Override
    public void ein() {
        System.out.println("Mehtode ein() ist aus dem Zustand inBetrieb nicht möglich!");
    }

    @Override
    public void aus() {
        System.out.println("Mehtode aus() ist aus dem Zustand inBetrieb nicht möglich!");
    }

    @Override
    public void abbrechen() {
        waschmaschine.setZustand(waschmaschine.getStandby());
    }

    @Override
    public void programm(int zahl) {
        System.out.println("Mehtode programm() ist aus dem Zustand inBetrieb nicht möglich!");
    }

    @Override
    public void start() {
        System.out.println("Mehtode start() ist aus dem Zustand inBetrieb nicht möglich!");
    }

    @Override
    public void pause() {
        waschmaschine.setZustand(waschmaschine.getPause());
    }

    @Override
    public void weiter() {
        System.out.println("Mehtode weiter() ist aus dem Zustand inBetrieb nicht möglich!");
    }

    @Override
    public void ende() {
        waschmaschine.setZustand(waschmaschine.getStandby());    }

    @Override
    public String getName() {
        return "inBetrieb";
    }
    
    
}
