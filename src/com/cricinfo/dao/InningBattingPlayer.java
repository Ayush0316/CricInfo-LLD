package com.cricinfo.dao;

import com.cricinfo.dao.person.Player;
import java.util.ArrayList;
import java.util.List;

public class InningBattingPlayer {
    private Player batter;
    private String status;
    private List<Ball> ballsPlayed;
    private int totalRuns;
    private int totalBalls;
    private int fours;
    private int sixs;
    private double sr;

    public InningBattingPlayer(Player player){
        this.batter = player;
        ballsPlayed = new ArrayList<>();
        status = "";
        sr = 0.0;
    }

}
