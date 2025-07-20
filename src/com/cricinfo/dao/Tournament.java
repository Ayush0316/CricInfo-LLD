package com.cricinfo.dao;

import com.cricinfo.dao.match.Match;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tournament {
    private String name;
    private Date startDate;
    private PointsTable pointsTable;
    List<Match> matches;

    public Tournament(String name, Date startDate, PointsTable pointsTable) {
        this.name = name;
        this.startDate = startDate;
        this.pointsTable = pointsTable;
        this.matches = new ArrayList<>();
    }

    public Tournament(String name, Date startDate, PointsTable pointsTable, List<Match> matches) {
        this.name = name;
        this.startDate = startDate;
        this.pointsTable = pointsTable;
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public PointsTable getPointsTable() {
        return pointsTable;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void addMatch(Match match) {
        this.matches.add(match);
    }

}