package org.pentaho.helloworld.endpoints.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OperationResultDTO {

  public StatusMessageDTO statusMessage;

  public OperationResultDTO() {
    this.statusMessage = new StatusMessageDTO();
  }
}
