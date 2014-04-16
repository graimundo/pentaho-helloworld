package org.pentaho.helloworld.domain.model.factories.interfaces;

import org.pentaho.helloworld.domain.model.interfaces.IAddress;
import org.pentaho.helloworld.domain.model.interfaces.IUser;

public interface IUserFactory {
  IUser create( String userName, String password, IAddress address, int age );
  IUser create( String userName, String password, String addressStreetName, String addressPostalCode, int age );
}
