package org.pentaho.helloworld.domain.model.interfaces;

public interface IAddress {

  //region properties
  String getStreetName();
  void setStreetName( String streetName );

  String getPostalCode();
  void setPostalCode( String postalCode);
  //endregion
}
