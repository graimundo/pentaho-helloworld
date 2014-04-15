package org.pentaho.helloworld;

import org.pentaho.helloworld.domain.dtos.UserDTO;
import org.pentaho.helloworld.domain.services.IRDO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path( "@plugin.java.rest.path.root@" )
public class PentahoHelloWorldService {

  private IRDO RDO;

  @Autowired
  public PentahoHelloWorldService( IRDO rdo ) {

    //dependency obtained via constructor dependency injection from spring framework
    this.RDO = rdo;
  }

  @GET
  @Path( "/hello" )
  @Produces( TEXT_PLAIN )
  public String hello() {
    return "Hello World from Pentaho Service!";
  }

  @GET
  @Path( "/users" )
  @Produces( { APPLICATION_JSON, APPLICATION_XML } )
  public List<UserDTO> getUsers() {
    return this.RDO.getUsers();
  }

  @GET
  @Path( "/user/{userName}" )
  @Produces( { APPLICATION_JSON, APPLICATION_XML } )
  public UserDTO getUser( @PathParam( "userName" ) String userName ) {
    return this.RDO.getUser( userName );
  }
}
