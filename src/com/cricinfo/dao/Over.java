package com.cricinfo.dao;

import java.util.List;

public class Over {
    private int number;
    private List<Ball> balls;

    public Over(int number, List<Ball> balls){
        this.balls = balls;
        this.number = number;
    }
}
