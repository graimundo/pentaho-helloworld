package org.pentaho.helloworld.domain.model.dtos.mappers;

import org.pentaho.helloworld.domain.model.dtos.UserDTO;
import org.pentaho.helloworld.domain.model.dtos.mappers.interfaces.IAddressDTOMapper;
import org.pentaho.helloworld.domain.model.dtos.mappers.interfaces.IUserDTOMapper;
import org.pentaho.helloworld.domain.model.entities.interfaces.IUser;
import org.pentaho.helloworld.domain.model.factories.interfaces.IUserFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class UserDTOMapper implements IUserDTOMapper {

  //region Attributes
  IUserFactory userFactory;
  IAddressDTOMapper addressDTOMapper;
  //endregion

  //region Constructors
  @Autowired
  public UserDTOMapper( IUserFactory userFactory, IAddressDTOMapper addressDTOMapper ) {

    //dependency initialization
    this.userFactory = userFactory;
    this.addressDTOMapper = addressDTOMapper;
  }
  //endregion

  //region IUserDTOMapper implementation
  @Override
  public IUser toEntity( UserDTO dto ) {
    return this.userFactory.create( dto.userName, dto.password, dto.address.streetName, dto.address.postalCode, 0 );
  }

  @Override
  public UserDTO toDTO( IUser user ) {

    //get new dto instance
    UserDTO dto = new UserDTO();

    //fill this dto's attributes
    dto.userName = user.getUserName();
    dto.password = user.getPassword();
    dto.address = this.addressDTOMapper.toDTO( user.getAddress() );

    //return the dto
    return dto;
  }

  @Override
  public Iterable<IUser> toEntities( Iterable<UserDTO> userDTOs ) {

    Collection<IUser> users = new ArrayList<IUser>();

    for ( UserDTO userDTO : userDTOs ) {
      users.add( this.userFactory.create( userDTO.userName, userDTO.password, userDTO.address.streetName,
        userDTO.address.postalCode, 0 ) );
    }

    return users;
  }

  @Override
  public Iterable<UserDTO> toDTOs( Iterable<IUser> users ) {

    Collection<UserDTO> userDTOs = new ArrayList<UserDTO>();

    for ( IUser user : users ) {
      userDTOs.add( this.toDTO( user ) );
    }

    return userDTOs;
  }
  //endregion
}
