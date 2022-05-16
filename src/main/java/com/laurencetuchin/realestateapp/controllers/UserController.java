package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.UserEntity;
import com.laurencetuchin.realestateapp.repositories.UserRepository;
import com.laurencetuchin.realestateapp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
        private final UserService userService;

        public UserController(UserService userService, UserRepository userRepository) {
            this.userService = userService;
        }

    // Add
    @PostMapping(value = "/users")
    public UserEntity Post(@RequestBody UserEntity params) {
        return userService.Post(params);
    }

    // Get
    @GetMapping(value = "/users")
    public List<UserEntity> Get() {
        return userService.Get();
    }

    // Get By ID
    @GetMapping(value = "/users/{id}")
    public UserEntity Get(@PathVariable int id) {
        return userService.Get(id);
    }

    // Update
    @PutMapping(value = "/users/{id}")
    public UserEntity Update(@PathVariable int id, @RequestBody UserEntity params) {
        return userService.Update(params, id);
    }

    // Delete
    @DeleteMapping(value = "/users/{id}")
    public String Delete(@PathVariable int id) {
        return userService.Delete(id);
    }

}
