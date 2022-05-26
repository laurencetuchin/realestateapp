package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.entities.User;
import com.laurencetuchin.realestateapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public List<User> createUserList(List<User> users) {
        return userRepository.saveAll(users);
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }


}
