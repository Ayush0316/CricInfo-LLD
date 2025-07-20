package com.cricinfo.dao.person;

import com.cricinfo.dao.Location;

public abstract class Person {
    private String name;
    private Location address;

    public Person(String name, Location address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Location getAddress() {
        return address;
    }
}
