package com.company.jira.service;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;
import com.company.jira.repository.IAgentRepository;

import java.util.List;

public class AgentService {

    private IAgentRepository agentRepository;

    public List<Agent> getAllAgents() {
        return agentRepository.getAllAgents();
    }

    public void addWorkLog(Ticket ticket, Agent agentForTicket) {

    }
}
