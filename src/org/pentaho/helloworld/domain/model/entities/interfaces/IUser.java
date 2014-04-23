package org.pentaho.helloworld.domain.model.entities.interfaces;

import org.pentaho.helloworld.domain.model.complexTypes.interfaces.IAddress;

public interface IUser {

  //region Properties
  String getUserName();
  public String getPassword();
  public IAddress getAddress();
  public int getAge();
  //endregion
}
