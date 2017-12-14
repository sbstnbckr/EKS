/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sebastian
 */
@XmlRootElement
public class Lieferant {
    
    private String name;
    private String Adresse;
    private ArrayList<Buch> liefert;

    public Lieferant() {}
    
    public Lieferant(String name, String Adresse) {
        this.name = name;
        this.Adresse = Adresse;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
    public void addLiefert(Buch b) {
        liefert.add(b);
    }
    
    public void removeLiefert(Buch b) {
        liefert.remove(b);
    }
    
    
    
}
