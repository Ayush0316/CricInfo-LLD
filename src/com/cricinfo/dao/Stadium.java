package com.cricinfo.dao;

public class Stadium {
    private final String name;
    private final Location location;
    private final int capacity;

    public Stadium(String name, Location location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }
}