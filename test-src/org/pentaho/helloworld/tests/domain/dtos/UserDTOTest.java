package org.pentaho.helloworld.tests.domain.dtos;

import junit.framework.Assert;
import org.junit.Test;
import org.pentaho.helloworld.domain.dtos.UserDTO;
import org.pentaho.helloworld.domain.model.User;

public class UserDTOTest {

  @Test
  public void convertUserToUserDTO() {

    User user = new User("test user", "test password", 30 );
    UserDTO userDTO = new UserDTO( user );

    Assert.assertEquals( userDTO.getUserName(), user.getUserName());
    Assert.assertEquals( userDTO.getPassword(), user.getPassword());
  }
}
