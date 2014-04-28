package org.pentaho.helloworld.endpoints.dtos;

import org.pentaho.helloworld.endpoints.dtos.entities.UserDTO;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTOOperationResultDTO extends OperationResultDTO {

  //region Attributes
  public UserDTO element;
  //endregion
}
