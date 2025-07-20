package com.cricinfo.dao;

import java.util.Map;

public class PointsTable {
   Map<Team, Integer> points;

    public PointsTable(Map<Team, Integer> points) {
         this.points = points;
    }
}