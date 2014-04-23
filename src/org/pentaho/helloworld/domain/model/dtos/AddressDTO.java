package org.pentaho.helloworld.domain.model.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressDTO {

  //region Attributes
  public String streetName;
  public String postalCode;
  //endregion
}
