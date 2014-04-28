package org.pentaho.helloworld.endpoints.dtos.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {

  //region Attributes
  public String userName;
  public String password;
  public AddressDTO address;
  //endregion
}
