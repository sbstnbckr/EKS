/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Steuerung.Services;
import com.sun.net.httpserver.HttpServer;
import java.net.URI;
import java.net.URISyntaxException;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig ;

/**
 *
 * @author Sebastian
 */
public class Server {

    /**
     * @param args the command line arguments
    */
    
    static final String BASE_URI = "http://localhost:55321/";
    
    public static void main(String[] args) {
        
        try {
            ResourceConfig rc = new ResourceConfig(Services.class);
            URI endpoint = new URI(BASE_URI);
            
            HttpServer server = JdkHttpServerFactory.createHttpServer(endpoint, rc);
            
        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
