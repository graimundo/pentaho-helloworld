package org.pentaho.helloworld.domain.model;

import org.pentaho.helloworld.domain.model.interfaces.IAddress;
import org.pentaho.helloworld.domain.model.interfaces.IUser;

public class User implements IUser {

  //region Properties
  private String userName;
  private String password;
  private IAddress address;
  //this property is hidden from the DTO on purpose,
  //to illustrate that domain objects should not be passed over the wire.
  private int age;

  @Override
  public String getUserName() {
    return this.userName;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public IAddress getAddress() {
    return this.address;
  }

  public int getAge() {
    return age;
  }
  //endregion

  //region Constructors
  public User( String userName, String password, IAddress address, int age) {
    this.userName = userName;
    this.password = password;
    this.address = address;
    this.age = age;
  }
  //endregion
}
