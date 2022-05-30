package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.Property;
import com.laurencetuchin.realestateapp.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/property/{id}")
    public Optional<Property> findPropertyById(@PathVariable Integer id) {
        return propertyService.findPropertyById(id);
    }

    @GetMapping("/properties")
    public List<Property> getAllProperties() {
        return propertyService.getAllProperty();
    }

    @PutMapping("/property/{id}/update")
    public String updateProperty(Property property) {
        return "blank";
    }

}
