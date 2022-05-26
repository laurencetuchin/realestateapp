package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.User;
import com.laurencetuchin.realestateapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/adduserlist")
    public List<User> addUserList(@RequestBody List<User> user) {
        return userService.createUserList(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
       return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }
}
