package com.example.springKaiser.AbstractExample.AbstractInterface;

public class ResidentialHouse implements House {
    @Override
    public int getRooms() {
        return walls;
    }

    @Override
    public int getWalls() {
        return 20;
    }

    @Override
    public boolean isIsWaterGoingThroughIt() {
        return true;
    }

    public String getGovernmentHouseTypeId() {
        return HOUSETYPE;
    }
}
