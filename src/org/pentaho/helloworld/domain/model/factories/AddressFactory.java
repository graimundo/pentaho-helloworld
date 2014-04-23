package org.pentaho.helloworld.domain.model.factories;

import org.pentaho.helloworld.domain.model.complexTypes.Address;
import org.pentaho.helloworld.domain.model.complexTypes.interfaces.IAddress;
import org.pentaho.helloworld.domain.model.factories.interfaces.IAddressFactory;

public class AddressFactory implements IAddressFactory {

  @Override public IAddress create() {
    return new Address();
  }
}
