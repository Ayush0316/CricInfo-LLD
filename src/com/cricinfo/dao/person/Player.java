package com.cricinfo.dao.person;

import com.cricinfo.dao.Location;
import com.cricinfo.dao.Team;
import com.cricinfo.enums.PlayerType;

public class Player extends Person {
    private PlayerType role;
    private Team team;

    public Player(String name, Location address, PlayerType role, Team team) {
        super(name, address);
        this.role = role;
        this.team = team;
    }

    public PlayerType getRole() {
        return role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team t){
        this.team = t;
    }
}