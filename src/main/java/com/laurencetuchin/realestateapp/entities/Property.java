package com.laurencetuchin.realestateapp.entities;

import javax.persistence.Entity;

@Entity
public class Property {
    private String address;
    private Long price;
    private Integer bedrooms;
    private Integer bathrooms;
    private Long landSize;
    private String agentName;
    private String agentPhoneNumber;



    public Property() {
    }

    public Property(String address, Long price, Integer bedrooms, Integer bathrooms, Long landSize, String agentName, String agentPhoneNumber) {
        this.address = address;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.landSize = landSize;
        this.agentName = agentName;
        this.agentPhoneNumber = agentPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Long getLandSize() {
        return landSize;
    }

    public void setLandSize(Long landSize) {
        this.landSize = landSize;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhoneNumber() {
        return agentPhoneNumber;
    }

    public void setAgentPhoneNumber(String agentPhoneNumber) {
        this.agentPhoneNumber = agentPhoneNumber;
    }
}
