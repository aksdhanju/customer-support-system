package com.company.jira.repository;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;

public interface ITicketRepository {

    Ticket save(Ticket ticket);

    Ticket get(String ticketId);

    void saveTicketAgent(Ticket ticket, Agent agent);

    Ticket getTicketForAgent(Agent agent);

    void markResolved(Ticket ticket);

    Agent getAgentForTicket(Ticket ticket);
}
