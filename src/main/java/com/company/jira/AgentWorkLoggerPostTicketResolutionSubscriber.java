package com.company.jira;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;
import com.company.jira.service.AgentService;

public class AgentWorkLoggerPostTicketResolutionSubscriber implements  IPostTicketResolutionSubscriber {
    private AgentService agentService;

    @Override
    public void consume(Ticket ticket, Agent agent) {

    }
}
