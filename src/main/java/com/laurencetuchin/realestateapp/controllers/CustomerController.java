package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entity.CustomerEntity;
import com.laurencetuchin.realestateapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @GetMapping(value = "customers")
//    public CustomerEntity<List<CustomerEntity>> getAll() {
//        return new CustomerEntity<>(customer.getAll(), HttpStatus.OK);
//    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Customer save(@RequestBody Customer customer) {
        Customer customerResponse = (Customer);
        customerService.saveCustomer(customer);
        return customerResponse;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable Long id) {
        Customer customerResponse = (Customer)
                customerService.getCustomer(id);
        return customerResponse;
    }

//    @GetMapping("customers/{id}")
//    public CustomerEntity getCustomer(@PathVariable Long id) {
//        return findByCustomerId(id);
//    }

    private CustomerEntity findByCustomerId(Long id) {

    }


    }
