package com.cricinfo.dao;

import com.cricinfo.dao.person.Player;
import java.util.List;

public class PlayingXI {
    private Squad squad;
    private List<Player> playingPlayers;
    private Player captain;
    private Player viceCaptain;
    private Player twelfth;

    public PlayingXI(Squad squad, List<Player> playingPlayers, Player captain, Player viceCaptain, Player twelfth) {
        this.squad = squad;
        this.playingPlayers = playingPlayers;
        this.captain = captain;
        this.viceCaptain = viceCaptain;
        this.twelfth = twelfth;
    }
    
}
