package com.cricinfo.dao;

import com.cricinfo.dao.person.Player;
import java.util.ArrayList;
import java.util.List;

public class InningBowlingPlayer {
    private Player bowler;
    private List<Over> overs;
    private int madeins;
    private int runs;
    private int wickets;
    private int noBalls;
    private int wide;
    private double economy;

    public InningBowlingPlayer(Player player){
        this.bowler = player;
        overs = new ArrayList<>();
        economy = 0.0;
    }
}
