package org.pentaho.helloworld.endpoints.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StringOperationResultDTO extends OperationResultDTO {

  //region Attributes
  public String element;
  //endregion
}
