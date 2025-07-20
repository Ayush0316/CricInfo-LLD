package com.cricinfo.dao;

import com.cricinfo.dao.person.Player;
import java.util.List;

public class Squad {
    private Team team;
    private List<Player> players;
    private Player captain;
    private Player viceCaptain;
    private Tournament tournament;

    public Squad(Team team, List<Player> players, Player captain, Player viceCaptain, Tournament tournament) {
        this.team = team;
        this.players = players;
        this.captain = captain;
        this.viceCaptain = viceCaptain;
        this.tournament = tournament;
    }
}
