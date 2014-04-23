package org.pentaho.helloworld.domain.model.complexTypes;

import org.pentaho.helloworld.domain.model.complexTypes.interfaces.IAddress;

public class Address implements IAddress {

  private String streetName;
  private String postalCode;

  @Override
  public String getStreetName() {
    return this.streetName;
  }

  @Override
  public void setStreetName( String streetName ) {
    this.streetName = streetName;
  }

  @Override
  public String getPostalCode() {
    return this.postalCode;
  }

  @Override
  public void setPostalCode( String postalCode ) {
    this.postalCode = postalCode;
  }
}
