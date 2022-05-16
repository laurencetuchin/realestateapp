package com.laurencetuchin.realestateapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "has_role", nullable = false)
    private String has_role = "customer";

    public CustomerEntity() {
    }

    public CustomerEntity(Long id, String name, String has_role) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHas_role() {
        return has_role;
    }

    public void setHas_role(String has_role) {
        this.has_role = has_role;
    }
}
