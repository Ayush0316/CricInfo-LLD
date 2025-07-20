package com.cricinfo.dao.person;

import com.cricinfo.dao.Location;

public class Comentator extends Person {
    private String language;
    private String expertise;

    public Comentator(String name, Location address, String language, String expertise) {
        super(name, address);
        this.language = language;
        this.expertise = expertise;
    }

    public String getLanguage() {
        return language;
    }

    public String getExpertise() {
        return expertise;
    }
    
}
