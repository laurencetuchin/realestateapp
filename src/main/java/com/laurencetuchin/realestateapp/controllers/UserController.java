package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.User;
import com.laurencetuchin.realestateapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    @ResponseBody
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

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PutMapping(value = "/updateuser", consumes = {"application/xml","application/json"})
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }


}
