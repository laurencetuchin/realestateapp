package com.laurencetuchin.realestateapp.services;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService customerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
