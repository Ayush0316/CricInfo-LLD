package com.cricinfo.interfaces;

import com.cricinfo.dao.Team;
import com.cricinfo.dao.person.Coach;
import com.cricinfo.dao.person.Player;

public interface  TeamService {
    Team createTeam(String name);
    void addPlayerToTeam(String teamName, Player player);
    void removePlayerFromTeam(String teamName, Player player);
    void addCoachToTeam(String teamName, Coach coach);
    void removeCoachFromTeam(String teamName, Coach coach);
}
