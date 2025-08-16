package com.company.jira.strategy;

import com.company.jira.model.Agent;

import java.util.List;

public interface IPreferenceStrategy {
    boolean canSupport(String strategy);
    Agent accept(List<Agent> agents);
}
