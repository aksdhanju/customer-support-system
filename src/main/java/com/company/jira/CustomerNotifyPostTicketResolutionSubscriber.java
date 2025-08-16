package com.company.jira;

import com.company.jira.model.Agent;
import com.company.jira.model.Ticket;

public class CustomerNotifyPostTicketResolutionSubscriber implements IPostTicketResolutionSubscriber {
    @Override
    public void consume(Ticket ticket, Agent agent) {
        //consumer.notify();
    }
}
