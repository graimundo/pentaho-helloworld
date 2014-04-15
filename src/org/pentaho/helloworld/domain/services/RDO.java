package org.pentaho.helloworld.domain.services;

import org.pentaho.helloworld.domain.dtos.UserDTO;
import org.pentaho.helloworld.domain.model.User;
import java.util.ArrayList;
import java.util.List;

public class RDO implements IRDO {

  //region Properties
  private List<User> Users;
  //endregion

  //region Constructors
  public RDO() {
    this.Users = new ArrayList<User>();

    //initialize user array to simulate persistency
    for ( int i = 0; i < 5; i++ ) {

      User user = new User( "user" + i, "pass" + i, i );
      this.Users.add( user );
    }
  }
  //endregion

  //region IRDO implementation
  @Override
  public List<UserDTO> getUsers() {

    List<UserDTO> dtoUsers = new ArrayList<UserDTO>();

    for ( User user : this.Users ) {
      dtoUsers.add( new UserDTO( user ) );
    }

    return dtoUsers;
  }

  @Override public UserDTO getUser( String userName ) {

    for ( User user : this.Users ) {
      if ( user.getUserName().equals( userName ) ) {
        return new UserDTO( user );
      }
    }

    return null;
  }
  //endregion
}
