package com.company.jira.repository;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;

import java.util.Date;

public class InMemoryTicketRepository implements ITicketRepository {
    @Override
    public Ticket save(Ticket ticket) {
        return null;
    }

    @Override
    public Ticket get(String ticketId) {
        return null;
    }

    @Override
    public void saveTicketAgent(Ticket ticket, Agent agent) {

    }

    @Override
    public Ticket getTicketForAgent(Agent agent) {
        return null;
    }

    @Override
    public void markResolved(Ticket ticket) {
        ticket.setResolvedAt(new Date());
    }

    @Override
    public Agent getAgentForTicket(Ticket ticket) {
        return null;
    }
}
