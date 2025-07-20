package com.cricinfo.interfaces;

import com.cricinfo.dao.Tournament;
import com.cricinfo.dao.match.Match;
import java.util.Date;

public interface TournamentService {
    Tournament createTournament(String name, Date startDate);
    void addMatchToTournament(String tournamentName, Match match);
    void updatePointsTable(String tournamentName, String teamName, int points);
}
