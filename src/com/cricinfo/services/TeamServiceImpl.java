package com.cricinfo.services;

import com.cricinfo.dao.Team;
import com.cricinfo.dao.person.Coach;
import com.cricinfo.dao.person.Player;
import com.cricinfo.interfaces.TeamService;
import java.util.HashMap;
import java.util.Map;

public class TeamServiceImpl implements TeamService {
    Map<String, Team> teams = new HashMap<>();

    private boolean validateTeamName(String name){
        if(!teams.containsKey(name)){
            throw new IllegalArgumentException("Team with name '" + name + "' does not exist.");
        } 
        return true;
    }

    @Override
    public Team createTeam(String name) {
        name = name.trim();
        if (teams.containsKey(name)) {
            throw new IllegalArgumentException("Team with name '" + name + "' already exists.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Team name cannot be null or empty");
        }
        Team t = new Team(name);
        teams.put(name, t);
        return t;
    }

    @Override
    public void addPlayerToTeam(String teamName, Player player) {
        teamName = teamName.trim();
        validateTeamName(teamName);
        Team t = teams.get(teamName);
        t.addPlayer(player);
        player.setTeam(t);
    }

    @Override
    public void removePlayerFromTeam(String team, Player player) {
        team = team.trim();
        validateTeamName(team);
        teams.get(team).removePlayer(player);
    }

    @Override
    public void addCoachToTeam(String team, Coach coach) {
        team = team.trim();
        validateTeamName(team);
        teams.get(team).addCoach(coach);
    }

    @Override
    public void removeCoachFromTeam(String team, Coach coach) {
        team = team.trim();
        validateTeamName(team);
        teams.get(team).removeCoach(coach);
    }
}
