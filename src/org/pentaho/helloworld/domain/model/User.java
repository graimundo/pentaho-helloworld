package org.pentaho.helloworld.domain.model;

public class User {

  //region Properties
  private String userName;
  private String password;
  //this property is hidden from the DTO on purpose,
  //to illustrate that domain objects should not be passed over the wire.
  private int age;

  public String getUserName() {
    return userName;
  }

  public void setUserName( String userName ) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword( String password ) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge( int age ) {
    this.age = age;
  }
  //endregion

  //region Constructors
  public User( String userName, String password, int age ) {
    this.userName = userName;
    this.password = password;
    this.age = age;
  }
  //endregion
}
