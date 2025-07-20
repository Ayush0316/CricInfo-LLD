package com.cricinfo.dao.person;

import com.cricinfo.dao.Location;

public class Umpire extends Person {
    private int yearsOfExperience;

    public Umpire(String name, Location address, int yearsOfExperience) {
        super(name, address);
        this.yearsOfExperience = yearsOfExperience;
    }
}
