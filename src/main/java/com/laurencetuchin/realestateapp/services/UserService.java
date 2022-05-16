package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    UserEntity Post(UserEntity params);

    List<UserEntity> Get();

    UserEntity Get(int id);

    UserEntity Update(UserEntity params, int id);

    String Delete(int id);

}
