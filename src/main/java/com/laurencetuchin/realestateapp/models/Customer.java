package com.laurencetuchin.realestateapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "has_role", nullable = false)
    private String has_role = "customer";

    public Customer() {
    }

    public Customer(Long id, String name, String has_role) {
        this.id = id;
        this.name = name;
        this.has_role = has_role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
