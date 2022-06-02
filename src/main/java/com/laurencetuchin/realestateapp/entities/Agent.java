package com.laurencetuchin.realestateapp.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agent extends User {

    @Autowired
    @OneToMany(orphanRemoval = true, mappedBy = "agent")
    private List<Property> property;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;






    public Agent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}
