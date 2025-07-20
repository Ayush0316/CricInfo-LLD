package com.cricinfo.dao;

import com.cricinfo.dao.person.Umpire;

public class MatchUmpire {
    Umpire mainUmpire;
    Umpire legUmpire;
    Umpire thirdUmpire;
    Umpire reserveUmpire;

    public MatchUmpire(Umpire mainUmpire, Umpire legUmpire, Umpire thirdUmpire, Umpire reserveUmpire) {
        this.mainUmpire = mainUmpire;
        this.legUmpire = legUmpire;
        this.thirdUmpire = thirdUmpire;
        this.reserveUmpire = reserveUmpire;
    }
}
