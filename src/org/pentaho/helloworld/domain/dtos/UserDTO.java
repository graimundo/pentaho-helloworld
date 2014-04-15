package org.pentaho.helloworld.domain.dtos;

import org.pentaho.helloworld.domain.model.User;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {

  //region Properties
  private String userName;
  private String password;

  public String getUserName() {
    return this.userName;
  }

  public void setUserName( String userName ) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword( String password ) {
    this.password = password;
  }
  //endregion

  //region Constructors
  public UserDTO() {}

  public UserDTO( User user ) {
    this.userName = user.getUserName();
    this.password = user.getPassword();
  }
  //endregion
}
