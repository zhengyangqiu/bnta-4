package com.bnta.exercise.week4_mon.sports_team.pojos;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    private Player[]players;
    private String name;
    private Manager manager;
    //size will be in constror


    public Team(Player[] players, String name, Manager manager) {
        this.players = players;
        this.name = name;
        this.manager = manager;
    }

    public Team(String name, Manager manager) {
        this.name = name;
        this.manager=manager;
        this.players = new Player[15];

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && name.equals(team.name) && manager.equals(team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
