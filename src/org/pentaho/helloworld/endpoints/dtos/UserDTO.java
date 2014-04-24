package org.pentaho.helloworld.endpoints.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {

  //region Attributes
  public String userName;
  public String password;
  public AddressDTO address;
  //endregion
}
