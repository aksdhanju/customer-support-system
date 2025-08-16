package com.company.jira.service;

import lombok.AllArgsConstructor;
import com.company.jira.PostTicketResolutionPubSub;
import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;
import com.company.jira.repository.ITicketRepository;
import com.company.jira.strategy.IPreferenceStrategy;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
public class TicketService {
    private ITicketRepository ticketRepository;
    private AgentService agentService;
    private List<IPreferenceStrategy> preferenceStrategies;
    private PostTicketResolutionPubSub postTicketResolutionPubSub;

    public Ticket createTicket(Ticket ticket) {
        final String id = UUID.randomUUID().toString();
        ticket.setId(id);
        return ticketRepository.save(ticket);
    }

    public Ticket resolveTicket(Ticket ticket) {
        ticketRepository.markResolved(ticket);
//        postTicketResolutionPubSub.notifyAll(ticket, ticketRepository.getAgentForTicket(ticket));
        agentService.addWorkLog(ticket, ticketRepository.getAgentForTicket(ticket));
//        customerService.notifyCustomer(ticket);
//        agentService.unblock();
        return ticket;
    }

    public Agent assignTicket(String ticketId, String strategy) {
        final Ticket ticket = ticketRepository.get(ticketId);
        // Filter
        final List<Agent> assignableAgents = agentService.getAllAgents().stream()
                .filter(agent -> agent.getDomain().contains(ticket.getDomain()))
                .filter(agent -> {
                    Ticket assignedTicket = ticketRepository.getTicketForAgent(agent);
                    return assignedTicket == null && !agent.isOOO();
                })
                .collect(Collectors.toList());

        // Picking one - sorting/preference.
        final IPreferenceStrategy preferenceStrategy = preferenceStrategies.stream()
                .filter(prefStrat -> prefStrat.canSupport(strategy)).findAny().orElseThrow();
        Agent finalAgent = preferenceStrategy.accept(assignableAgents);
        ticketRepository.saveTicketAgent(ticket, finalAgent);
        return finalAgent;
        /**
         * 1. Random.
         * 2. Best Rating.
         */

        /**
         * 1. ticket service vs agent service.
         * 2. strategy -
         */
    }
}

