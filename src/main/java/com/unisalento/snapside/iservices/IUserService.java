package com.unisalento.snapside.iservices;

import java.util.List;

import com.unisalento.snapside.generated.domain.UserEntity;
import com.unisalento.snapside.exceptions.UserNotFoundException;


public interface IUserService {
    public List<UserEntity> getAll() throws UserNotFoundException;
    public UserEntity save(UserEntity user);
    public void removeUserById (int id) throws UserNotFoundException;
    public UserEntity getById(int id) throws UserNotFoundException;
    public int count() throws UserNotFoundException;
    UserEntity userbyid(int id) throws UserNotFoundException;
}
