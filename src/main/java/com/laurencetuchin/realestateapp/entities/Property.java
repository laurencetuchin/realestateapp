package com.laurencetuchin.realestateapp.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTY")
public class Property {

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Integer id;
    @Column(name = "ADDRESS", length = 255, nullable = false, unique = false)
    private String address;
    @Column(name = "PRICE", nullable = false)
    private Long price;
    @Column(name = "BEDROOMS", nullable = false)
    private Integer bedrooms;
    @Column(name = "BATHROOMS", nullable = false)
    private Integer bathrooms;
    @Column(name = "LANDSIZE", nullable = false)
    private Long landSize;
    @Column(name = "AGENTNAME")
    private String agentName;
    @Column(name = "AGENTPHONENUMBER")
    private String agentPhoneNumber;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }


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

    @Autowired
    public Property(Integer id, String address, Long price, Integer bedrooms, Integer bathrooms, Long landSize) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.landSize = landSize;
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
