package org.pentaho.helloworld.endpoints.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusMessageDTO {

  //region Attributes
  public String code;
  public String message;
  //endregion
}
