package com.Exercise.OOPConcepts.soccerinheritance;

public class Soccer extends Sports {
    @Override
    public String getName() {
        return "Soccer Class";
    }

    public void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
