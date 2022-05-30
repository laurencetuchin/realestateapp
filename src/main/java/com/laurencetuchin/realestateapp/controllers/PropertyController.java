package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.Property;
import com.laurencetuchin.realestateapp.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/property/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Property createProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @PostMapping("/property/new/list")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Property> createPropertyList(@RequestBody List<Property> properties) {
        return propertyService.createPropertyList(properties);
    }



}
