package com.company.jira;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;

import java.util.List;

public class PostTicketResolutionPubSub {

    List<IPostTicketResolutionSubscriber> subscribers;

    public void addSubscriber(IPostTicketResolutionSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAll(Ticket ticket, Agent agent) {
        subscribers.forEach(subscriber -> subscriber.consume(ticket, agent));
    }
}
