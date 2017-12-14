/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

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

        String response = target.path( "test" )
                                .request()
                                .accept( MediaType.TEXT_PLAIN )
                                .get( String.class );
        System.out.println(response);
        
        
    }
    
}
