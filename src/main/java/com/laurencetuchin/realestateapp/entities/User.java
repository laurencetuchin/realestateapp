package com.laurencetuchin.realestateapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public User() {
    }

    public User(String username, String firstName, String lastName, String phoneNumber) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


}
