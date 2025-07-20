package com.cricinfo.dao;

import com.cricinfo.enums.WinType;

public class MatchResult {
    Team winingTeam;
    WinType winType;
    int marginOfVictory;

    public MatchResult(Team winingTeam, WinType winType, int marginOfVictory) {
        this.winingTeam = winingTeam;
        this.winType = winType;
        this.marginOfVictory = marginOfVictory;
    }
}
