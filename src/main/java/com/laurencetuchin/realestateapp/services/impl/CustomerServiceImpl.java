package com.laurencetuchin.realestateapp.services.impl;

import com.laurencetuchin.realestateapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerService customerService;

    @Transactional
    public Customer saveCustomer(Customer customer) {
        Customer response = customerRepository.save(customer);
        return response;
    }
}
