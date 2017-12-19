/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steuerung;

import entities.Bestellung;
import entities.Buch;
import entities.Lieferant;
import grenz.GrenzLieferant;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import objektverwaltung.AlleBestellungen;
import objektverwaltung.AlleBuecher;
import objektverwaltung.AlleLieferanten;


/**
 *
 * @author Sebastian
 */
@Path("buchservices")
public class Services {
    
    //Testausgabe
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("test")
    public String message(){
        return "TEST!";
    }
    
    // 1. Erstellung eines neuen Lieferanten
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Path("lieferant")
    public void createLieferant(Lieferant lieferant){
        AlleLieferanten lieferanten = AlleLieferanten.getInstance();
        lieferanten.addLieferant(lieferant);
        System.out.println( "POST /buchservices/lieferant/ ");
 
    }
    
    // 2. Abfrage Lieferanten-Ressource
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("lieferant/{name}")
    public GrenzLieferant getLieferant(@PathParam("name") String name){
        AlleLieferanten lieferanten = AlleLieferanten.getInstance();
        Lieferant l= lieferanten.getLieferant(name);
        if (l!= null) {
            GrenzLieferant grenz = new GrenzLieferant();
            grenz.setAdresse(l.getAdresse());
            grenz.setName(l.getName());
            return grenz;
        }
        return new GrenzLieferant();
    }
    
    //3. Erstellung einer Bestellung
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("buch/{regnr}")
    public String createBestellung(@PathParam ("regnr") int regnr, String name) {
        AlleBestellungen alle = AlleBestellungen.getInstance();
        return alle.neueBestellung(regnr, name);
    }
    
    
   //4. Erstellung eines Buches
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("lieferant/{name}/buch")
    public String  createBuch(@PathParam("name") String name, String preis){
        System.out.println("erstellung Buch");
        AlleBuecher buecher = AlleBuecher.getInstance();
        System.out.println("erstellung Buch");

        AlleLieferanten lieferanten = AlleLieferanten.getInstance();
        System.out.println("erstellung Buch");
        Lieferant l= lieferanten.getLieferant(name);
        System.out.println(l.getName()+"  "+  l.getAdresse());

        String number =  buecher.neuesBuch(l,Integer.parseInt(preis));
                System.out.println("erstellung Buch");

        return number;
    }
    
    // 5. Alle Bestellungen eines Buches 
    
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_XML)
    @Path("buch/{regnr}/bestellungen")
    public Bestellung[] getAlleBestellungenfuerBuch(@PathParam("regnr") int regnr){
        AlleBuecher buecher = AlleBuecher.getInstance();
        ArrayList<Bestellung> bestellungen = buecher.getBuch(regnr).getBestellung();
        return bestellungen.toArray(new Bestellung[bestellungen.size()]);    
    }
    
    //6 preis von buch erfragen input: regnr
    
    
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_XML)
    @Path("buch/{regnr}/preis")
    public String getPreis(@PathParam("regnr") int regnr) {
        AlleBuecher buecher = AlleBuecher.getInstance();
        Buch buch = buecher.getBuch((regnr));
        return Integer.toString(buch.getPreis());
    }
    
    // 7 alle bestellungen von einem Kunden input: name als string
    
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_XML)
    @Path("kunde/{name}/bestellungen")
    public Bestellung[] getAlleBestellungenfuerKunde(@PathParam("name") String name) {
        AlleBestellungen best = AlleBestellungen.getInstance();
        ArrayList<Bestellung> alleBestellungen = best.getBestellungen();
        ArrayList<Bestellung> kundeBestellungen = new ArrayList();
        for (Bestellung b : alleBestellungen) {
            if (b.getNameBesteller().equals(name)) {
                kundeBestellungen.add(b);
            }
        }
        return kundeBestellungen.toArray(new Bestellung[kundeBestellungen.size()]);    
    }
    
    // 8. alle Buchobjekte
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("buch/alle")
    public Buch[] getAlleBuecher() {
        AlleBuecher alleBuecher = AlleBuecher.getInstance();
        ArrayList<Buch> buecher = alleBuecher.getBuecher();
       
        return buecher.toArray(new Buch[buecher.size()]);    
    }
    
    
    
    
    
}
