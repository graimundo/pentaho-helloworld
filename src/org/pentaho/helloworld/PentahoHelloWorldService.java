package org.pentaho.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.*;

@Path( "/pentaho-helloworld-plugin/api" )
public class PentahoHelloWorldService {

  @GET
  @Path( "/hello" )
  @Produces( TEXT_PLAIN )
  public String hello() {
    return "Hello World from Pentaho Service!";
  }
}
