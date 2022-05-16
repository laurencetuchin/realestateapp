package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    Customer customer;

    @GetMapping(value = "customers")
    public Customer <List<Customer>> getAll() {
        return new Customer<>(customer.getAll(), HttpStatus.OK);
    }

    @GetMapping("customers/{id}")
    public Customer getCustomer(Long id) {
        findByCustomerId(Long id)
    }

    private Customer findByCustomerId(Long id) {

    }


    }
