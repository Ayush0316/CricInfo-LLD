package com.cricinfo.interfaces;

import com.cricinfo.dao.PlayingXI;
import com.cricinfo.dao.match.Match;


public interface SquadService {
    PlayingXI createPlayingXI(String teamName, Match match);
}