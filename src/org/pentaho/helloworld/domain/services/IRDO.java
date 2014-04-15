package org.pentaho.helloworld.domain.services;

import org.pentaho.helloworld.domain.dtos.UserDTO;

import java.util.List;

public interface IRDO {
  List<UserDTO> getUsers();
  UserDTO getUser( String userName );
}
