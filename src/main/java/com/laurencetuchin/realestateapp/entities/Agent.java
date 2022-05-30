package com.laurencetuchin.realestateapp.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AGENT")
public class Agent {

    @OneToOne
    @JoinColumn(name = "user_id")
    @Autowired
    private User user;

    @Autowired
    @OneToMany(orphanRemoval = true, mappedBy = "agent")
    private List<Property> property;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "AGENT_FIRSTNAME", nullable = false)
    private String firstName = user.getFirstName();
    @Column(name = "AGENT_LASTNAME",nullable = false)
    private String lastName;
    @Column(name = "AGENT_PHONENUMBER",nullable = false)
    private String phoneNumber;
    @Column(name = "AGENT_PROPERTYLIST")


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    public Agent(Integer id, String firstName, String lastName, String phoneNumber, List<Property> property) {
        this.id = id;
        this.firstName = user.getLastName();
        this.lastName = user.getLastName();
        this.phoneNumber = user.getPhoneNumber();
        this.property = property;
    }

    public Agent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}
