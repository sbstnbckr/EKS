/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grenz;


/**
 *
 * @author Sebastian
 */
public class GrenzBestellung {
    private  int bestellnr;
    private String nameBesteller;
    private GrenzBuch buch;
    

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

    public GrenzBuch getBuch() {
        return buch;
    }

    public void setBuch(GrenzBuch buch) {
        this.buch = buch;
    }
}
