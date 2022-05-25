package com.laurencetuchin.realestateapp.entities;

import javax.persistence.*;
import java.util.Collection;

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

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;


    public User() {
    }

    public User(String username, String firstName, String lastName, String phoneNumber) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


}
