package com.company.jira;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;

public interface IPostTicketResolutionSubscriber {

    void consume(Ticket ticket, Agent agent);
}
