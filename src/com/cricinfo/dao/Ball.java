package com.cricinfo.dao;

import com.cricinfo.enums.BallType;
import com.cricinfo.enums.RunType;
import com.cricinfo.enums.WicketType;

public class Ball {
    private float number;
    private BallType ballType;
    private RunType runType;
    private WicketType wicketType;
    private int runs;
    private Comment comment;

    public Ball(float number, BallType ballType, RunType runType, WicketType wicketType, int runs, Comment comment){
        this.number = number;
        this.ballType = ballType;
        this.runType = runType;
        this.wicketType = wicketType;
        this.runs = runs;
        this.comment = comment;
    }
}
