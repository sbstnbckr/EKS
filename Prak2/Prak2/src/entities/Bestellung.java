/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import objektverwaltung.AlleBestellungen;

/**
 *
 * @author Sebastian
 */
@XmlRootElement
public class Bestellung {
    
    private  int bestellnr;
    private String nameBesteller;
    private Buch buch;

    public Bestellung() {
    }

    public Bestellung(int bestellnr, String nameBesteller, Buch buch) {
        this.bestellnr = bestellnr;
        this.nameBesteller = nameBesteller;
        this.buch = buch;
    }
    

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getNameBesteller() {
        return nameBesteller;
    }

    public void setNameBesteller(String nameBesteller) {
        this.nameBesteller = nameBesteller;
    }

    public Buch getBuch() {
        return buch;
    }

    public void setBuch(Buch buch) {
        this.buch = buch;
    }

    
    
    
    
    
    
    

}
