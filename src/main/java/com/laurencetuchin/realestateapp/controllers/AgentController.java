package com.laurencetuchin.realestateapp.controllers;

import com.laurencetuchin.realestateapp.entities.Agent;
import com.laurencetuchin.realestateapp.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/agent/new")
    public Agent createAgent(Agent agent) {
        return agentService.createAgent(agent);
    }
}
