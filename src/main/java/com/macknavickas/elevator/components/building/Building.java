package com.macknavickas.elevator.components.building;

import java.util.ArrayList;
import java.util.HashMap;

public class Building {
    // Riot mode
    private HashMap<Integer, Shaft> shafts;

    int floors;

    public Building() {
        shafts = new HashMap<>();
        this.floors = 1;
    }

    public Building(int floors) {
        shafts = new HashMap<>();
        this.floors = floors;
    }

    /**
     * Add a shaft from bottomFloor to topFloor, inclusive, for elevators to travel within.
     * @return ID number of shaft inside building.
     */
    public int addShaft(int bottomFloor, int topFloor) {
        shafts.put(shafts.size(), new Shaft(bottomFloor, topFloor, shafts.size()));
        return shafts.size() - 1;
    }
}
