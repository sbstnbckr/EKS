/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grenz;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class GrenzLieferant {
    
    private String name;
    private String Adresse;
    private ArrayList<GrenzBuch> liefert;
    

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
    
    public void addLiefert(GrenzBuch b) {
        liefert.add(b);
    }
    
    public void removeLiefert(GrenzBuch b) {
        liefert.remove(b);
    }
    
}
