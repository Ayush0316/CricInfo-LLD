package com.cricinfo.dao.match;

import com.cricinfo.dao.MatchUmpire;
import com.cricinfo.dao.Stadium;
import com.cricinfo.dao.Team;
import com.cricinfo.dao.person.Comentator;
import java.util.Date;
import java.util.List;

public class Test extends Match {

    public Test(Stadium stadium, Date date, Team team1, Team team2, MatchUmpire matchUmpire, List<Comentator> commentators) {
        super(stadium, date, team1, team2, matchUmpire, commentators);
    }
    
}
