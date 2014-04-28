package org.pentaho.helloworld.endpoints.dtos;

import org.pentaho.helloworld.endpoints.dtos.entities.UserDTO;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class UserDTOListOperationResultDTO extends OperationResultDTO {

  //region Attributes
  public List<UserDTO> elements;
  //endregion
}
