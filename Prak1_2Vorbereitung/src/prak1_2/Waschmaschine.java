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
public class Waschmaschine {
    
    //aktueller Zustand
    private ZustandWaschmaschine aktuellerZustand;
    
    //alle möglichen Zustände
    private ZustandWaschmaschine aus;
    private ZustandWaschmaschine inBetrieb;
    private ZustandWaschmaschine pause;
    private ZustandWaschmaschine programmGewaehlt;
    private ZustandWaschmaschine standby;
    
    
    public Waschmaschine () {
        aus= new Aus(this);
        inBetrieb = new InBetrieb(this);
        pause= new Pause(this);
        programmGewaehlt = new ProgrammGewaehlt(this);
        standby = new Standby(this);
        aktuellerZustand=aus;
                
    }

    public ZustandWaschmaschine getAus() {
        return aus;
    }

    public ZustandWaschmaschine getInBetrieb() {
        return inBetrieb;
    }

    public ZustandWaschmaschine getPause() {
        return pause;
    }

    public ZustandWaschmaschine getProgrammGewaehlt() {
        return programmGewaehlt;
    }

    public ZustandWaschmaschine getStandby() {
        return standby;
    }
    
    
    
       public void getZustand(){      
           System.out.println("Waschmaschine ist im Zustand: "+aktuellerZustand.getName());
           
            
        };
        
        public void setZustand(ZustandWaschmaschine z){
            aktuellerZustand=z;
        }
        
        public void ein(){
            aktuellerZustand.ein();
        };
        
        public void aus(){
            aktuellerZustand.aus();
        };
        
        public void ende(){
            aktuellerZustand.ende();
        }
        
        public void abbrechen(){
            aktuellerZustand.abbrechen();
        };
        
        public void programm(int zahl){
            aktuellerZustand.programm(zahl);
        };
        
        public void start(){
            aktuellerZustand.start();
        };
        
        public void pause(){
            aktuellerZustand.pause();
        };
        
        public void weiter() {
            aktuellerZustand.weiter();
        }
        
        
        
        
        
    
}
