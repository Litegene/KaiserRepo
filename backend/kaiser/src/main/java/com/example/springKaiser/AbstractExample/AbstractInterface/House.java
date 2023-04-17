package com.example.springKaiser.AbstractExample.AbstractInterface;

public interface House {

    final String HOUSETYPE = "ID9123701";

    int rooms = 0;
    int walls = 0;
    boolean isWaterGoingThroughIt = true;

    public int getRooms();

    public int getWalls();

    public boolean isIsWaterGoingThroughIt();

}
