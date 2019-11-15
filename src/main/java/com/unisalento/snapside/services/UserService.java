package com.unisalento.snapside.services;


import java.util.List;

import com.unisalento.snapside.generated.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unisalento.snapside.iservices.IUserService;
import com.unisalento.snapside.generated.domain.UserEntity;
import com.unisalento.snapside.exceptions.UserNotFoundException;

import com.unisalento.snapside.repositories.UserRepository;



@Service
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> getAll() throws UserNotFoundException {
        return userRepository.findAll();
    }

    @Override
    public UserEntity save(UserEntity user) {
        return null;
    }

    @Override
    public void removeUserById(int id) throws UserNotFoundException {

    }

    @Override
    public UserEntity getById(int id) throws UserNotFoundException {
        return null;
    }

    @Override
    public int count() throws UserNotFoundException {
        return 0;
    }

    @Override
    public UserEntity userbyid(int id) throws UserNotFoundException {
        return null;
    }


}
