package com.company.jira.strategy;

import com.company.jira.model.Agent;

import java.util.List;

public class RandomPreferenceStrategy implements IPreferenceStrategy {
    @Override
    public boolean canSupport(String strategy) {
        return strategy.equals("random");
    }

    @Override
    public Agent accept(List<Agent> agents) {
        int randIndex = 0;// get random index
        return agents.get(randIndex);
    }
}
