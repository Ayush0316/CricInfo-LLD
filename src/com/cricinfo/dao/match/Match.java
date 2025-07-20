package com.cricinfo.dao.match;

import com.cricinfo.dao.Innings;
import com.cricinfo.dao.MatchResult;
import com.cricinfo.dao.MatchUmpire;
import com.cricinfo.dao.Stadium;
import com.cricinfo.dao.Team;
import com.cricinfo.dao.person.Comentator;
import com.cricinfo.enums.MatchStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Match {
    private Stadium stadium;
    private Date date;
    private Team team1;
    private Team team2;
    private MatchStatus status;
    private MatchResult result;
    private MatchUmpire matchUmpire;
    private List<Comentator> comentators;
    private List<Innings> innings;

    public Match(Stadium stadium, Date date, Team team1, Team team2, MatchUmpire matchUmpire, List<Comentator> comentators) {
        this.stadium = stadium;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.status = MatchStatus.NOT_STARTED;
        this.result = null;
        this.matchUmpire = matchUmpire;
        this.comentators = comentators;
        this.innings = new ArrayList<>();
    }

}
