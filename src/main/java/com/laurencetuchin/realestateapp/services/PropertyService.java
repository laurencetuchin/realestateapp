package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.entities.Property;
import com.laurencetuchin.realestateapp.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Optional<Property> findPropertyById(Integer id) {
        return propertyRepository.findById(id);
    }

    public List<Property> getAllProperty() {
        return propertyRepository.findAll();
    }

    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    public List<Property> createPropertyList(List<Property> properties) {
        return propertyRepository.saveAll(properties);
    }


}
