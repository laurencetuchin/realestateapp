package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;
}
