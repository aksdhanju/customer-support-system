package com.company.jira.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Builder
public class Ticket {
    @Setter
    private String id;
    private String details;
    private String title;
    private List<String> linkedReferenceIds;
    private TicketDomain domain;
    private TicketStatus status;
//    private Priority priority;
//
//    private Date createdAt;
    @Setter
    private Date resolvedAt;
//
//    private Date slaDate;
}
