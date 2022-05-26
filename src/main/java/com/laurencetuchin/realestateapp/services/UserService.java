package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.entities.User;
import com.laurencetuchin.realestateapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.ServiceNotFoundException;
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

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        Optional<User> userToUpdate = userRepository.findById(user.getId());
        if (userToUpdate.isPresent()) {
            User updateUser = userToUpdate.get();
            updateUser.setFirstName(updateUser.getFirstName());
            updateUser.setLastName(updateUser.getLastName());
            updateUser.setPhoneNumber(updateUser.getPhoneNumber());
            updateUser.setUsername(updateUser.getUsername());
            userRepository.save(updateUser);

        }
        else return new User();


    }


}
