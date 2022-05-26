package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.User;
import com.laurencetuchin.realestateapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/addmanyuser")
    public List<User> addUserList(@RequestBody List<User> user) {
        return userService.createUserList(user);
    }
}
