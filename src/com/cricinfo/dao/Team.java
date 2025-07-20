package com.cricinfo.dao;

import com.cricinfo.dao.person.Coach;
import com.cricinfo.dao.person.Player;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    List<Player> players;
    List<Coach> coaches;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.coaches = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (player == null || player.getTeam() != null) {
            throw new IllegalArgumentException("Player cannot be null and must not already belong to a team.");
        }
        players.add(player);
    }

    public void addCoach(Coach coach) {
        if (coach == null) {
            throw new IllegalArgumentException("Coach cannot be null.");
        }
        coaches.add(coach);
    }

    public void removePlayer(Player player) {
        if (player == null || !players.contains(player)) {
            throw new IllegalArgumentException("Player cannot be null and must belong to the team.");
        }
        players.remove(player);
    }

    public void removeCoach(Coach coach) {
        if (coach == null || !coaches.contains(coach)) {
            throw new IllegalArgumentException("Coach cannot be null and must belong to the team.");
        }
        coaches.remove(coach);
    }
}
