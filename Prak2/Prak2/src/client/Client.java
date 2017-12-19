/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entities.Bestellung;
import entities.Buch;
import entities.Lieferant;
import grenz.GrenzBestellung;
import grenz.GrenzLieferant;
import java.util.ArrayList;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import static javax.ws.rs.sse.SseEventSource.target;

/**
 *
 * @author Sebastian
 */
public class Client {
    
    public static void main(String args[]) {
        javax.ws.rs.client.Client c =  ClientBuilder.newClient();
        WebTarget target = c.target("http://localhost:55321/buchservices");
/*
        String response = target.path( "test" )
                                .request()
                                .accept( MediaType.TEXT_PLAIN )
                                .get( String.class );
        System.out.println(response);*/

        //ERstellung Lieferanten
        
        Lieferant l= new Lieferant("Ballauf","Koeln");
        target.path("lieferant")
                .request()
                .post(Entity.entity(l,MediaType.APPLICATION_XML));
        
        l = new Lieferant("Thiel" , "Muenster");
        target.path("lieferant")
                .request()
                .post(Entity.entity(l,MediaType.APPLICATION_XML));
                
        l = new Lieferant("Batic" , "Muenchen");
        target.path("lieferant")
                .request()
                .post(Entity.entity(l,MediaType.APPLICATION_XML));
        
        //Abfrage Ballauf
        System.out.println("Ballauf abfragen");
//        
        GrenzLieferant lieferant= target.path("lieferant")
                .path("Ballauf")
                .request()
                .accept(MediaType.APPLICATION_XML)
                .get(GrenzLieferant.class);
        System.out.println("\tName: "+lieferant.getName()+", Adresse: "+lieferant.getAdresse());
        
        
        //Erstellung der Bücher
        
        String preis = "50";
        String returnRegnr = target.path("lieferant")
                .path("Ballauf")
                .path("buch")
                .request()                
                .accept(MediaType.TEXT_PLAIN)
                .post(Entity.entity(preis, MediaType.APPLICATION_XML),String.class);
        
        System.out.println("Registrierungsnummer Buch Ballauf: "+returnRegnr);
        
        preis = "80";
        returnRegnr = target.path("lieferant")
                .path("Thiel")
                .path("buch")
                .request()                
                .accept(MediaType.TEXT_PLAIN)
                .post(Entity.entity(preis, MediaType.APPLICATION_XML),String.class);
        
        System.out.println("Registrierungsnummer Buch Muenster: "+returnRegnr);
        
        preis = "120";
        returnRegnr = target.path("lieferant")
                .path("Batic")
                .path("buch")
                .request()                
                .accept(MediaType.TEXT_PLAIN)
                .post(Entity.entity(preis, MediaType.APPLICATION_XML),String.class);
        
        System.out.println("Registrierungsnummer Buch Batic: "+returnRegnr);
                
        //ERstellung einer Bestellung fuer adler
        
        String bestellnr = target.path("buch")
                .path(returnRegnr)
                .request()                
                .accept(MediaType.TEXT_PLAIN)
                .post(Entity.entity("Adler", MediaType.APPLICATION_XML),String.class);
                
        System.out.println("Bestellnummer Adler: "+bestellnr);
        
        //Alle Bestellungen von Adler abfragen
        
        Bestellung[] bestellungen = target.path("kunde")
                .path("Adler")
                .path("bestellungen")
                .request()                
                .accept(MediaType.APPLICATION_XML)
                .get(Bestellung[].class);
        
        for (Bestellung b : bestellungen ){
            System.out.println("Bestellung von Adler: bestellnr: " + b.getBestellnr()+" preis: "+ b.getBuch().getPreis());
        } 
        
        // ERstellung einer Bestellung fuer Neuer 
        bestellnr = target.path("buch")
                .path(returnRegnr)
                .request()                
                .accept(MediaType.TEXT_PLAIN)
                .post(Entity.entity("Neuer", MediaType.APPLICATION_XML),String.class);
                
        System.out.println("Bestellnummer Neuer: "+bestellnr);
        
        //Alle Bestellungen des Buches von Batic anzeigen
        
         bestellungen = target.path("buch")
                .path(returnRegnr)
                .path("bestellungen")
                .request()                
                .accept(MediaType.APPLICATION_XML)
                .get(Bestellung[].class);
        
        for (Bestellung b : bestellungen ){
            System.out.println("Bestellung von Batics Buch: bestellnr: "+ b.getBestellnr()+" preis: "+ b.getBuch().getPreis() );
        } 
        
        //buchpreis erfragen
        
        String buchpreis = target.path("buch")
                .path(returnRegnr)
                .path("preis")
                .request()                
                .accept(MediaType.APPLICATION_XML)
                .get(String.class);
        
        System.out.println("Buchpreis Ballauf : "+ buchpreis);
        
        //Erfragung aller Buecher
        
         Buch[] buecher = target.path("buch")
                .path("alle")
                .request()                
                .accept(MediaType.APPLICATION_XML)
                .get(Buch[].class);
         
         for (Buch b : buecher ){
            System.out.println("Buch nr.: "+b.getRegistrierungsnummer()+" preis: "+b.getPreis());
        }
        
        
        
        

        
    }
    
}
