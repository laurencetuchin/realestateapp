package com.laurencetuchin.realestateapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "USER_USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name = "USER_FIRSTNAME", nullable = false)
    private String firstName;
    @Column(name = "USER_LASTNAME", nullable = false)
    private String lastName;
    @Column(name = "USER_PHONENUMBER", nullable = false)
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
