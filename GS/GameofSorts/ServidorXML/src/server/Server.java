package server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/server")
public class Server {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		String response = "<?xml version='1.0'?>"+
				"<hello>Hello XML</hello>";
		return response;
		
	}

}
