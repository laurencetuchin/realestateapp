package com.laurencetuchin.realestateapp.services;

import com.laurencetuchin.realestateapp.entities.Agent;
import com.laurencetuchin.realestateapp.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;


    public Agent createAgent(Agent agent) {
        return agentRepository.save(agent);
    }

}
