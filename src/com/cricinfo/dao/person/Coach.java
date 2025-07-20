package com.cricinfo.dao.person;

import com.cricinfo.dao.Location;
import com.cricinfo.enums.CoachType;

public class Coach extends Person {
    private CoachType coachingRole;

    public Coach(String name, Location address, CoachType coachingRole) {
        super(name, address);
        this.coachingRole = coachingRole;
    }

    public CoachType getCoachingRole() {
        return coachingRole;
    }
}
