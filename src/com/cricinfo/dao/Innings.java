package com.cricinfo.dao;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    private Team batting;
    private Team bowling;
    private int totalRuns;
    private int totalWickets;
    private int extras;
    private int totalOvers;
    private List<InningBattingPlayer> batters;
    private List<InningBowlingPlayer> bowlers;
    private List<Over> overs;

    public Innings(Team batting, Team bowling){
        this.batting = batting;
        this.bowling = bowling;
        this.batters = new ArrayList<>();
        this.bowlers = new ArrayList<>();
        this.overs = new ArrayList<>();
    }
}
