package com.company.jira.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Agent {
    private String id;
    private String name;
    private List<TicketDomain> domain;
    private boolean isOOO;
    // other metadata fields.
    private String email;
}

