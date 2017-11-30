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
public interface ZustandWaschmaschine {
    
    public void ein();
    public void aus();
    public void ende();
    public void abbrechen();
    public void programm(int zahl);
    public void start();
    public void pause();
    public void weiter();
    public String getName();
    
    
}
