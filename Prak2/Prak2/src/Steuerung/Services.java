/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steuerung;

import entities.Lieferant;
import grenz.GrenzLieferant;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import objektverwaltung.AlleLieferanten;


/**
 *
 * @author Sebastian
 */
@Path("buchservices")
public class Services {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("test")
    public String message(){
        return "TEST!";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Path("lieferant")
    public void createLieferant(Lieferant lieferant){
        AlleLieferanten lieferanten = AlleLieferanten.getInstance();
        lieferanten.addLieferant(lieferant);
        System.out.println( "POST /buchservices/lieferant/ ");
        
    }
    
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
    
}
