package client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Client {
	
	public static void main(String [] args) {
		
		
		Client cliente = (Client) ClientBuilder.newClient();
		
		
		WebTarget target = ((javax.ws.rs.client.Client) cliente).target("http://localhost:8081/ServidorXML/server");
		
		
		System.out.println(target.request(MediaType.TEXT_XML).get(String.class));
		
	}

}
