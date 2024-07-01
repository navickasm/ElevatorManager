package com.macknavickas.elevator.components.building;

import java.util.HashMap;

public class Building {
    // Riot mode

    // Test1
    private static int shaftIdIncrementer = -1;

    private HashMap<Integer, Shaft> shafts;

    private int floors;

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
        int id = getNextShaftId();
        shafts.put(id, new Shaft(bottomFloor, topFloor, shafts.size()));
        return id;
    }

    public int getNextShaftId() {
        return shaftIdIncrementer++;
    }

    /**
     *
     * @return The Shaft in use or null if not in use.
     */
    public Shaft isIdInUse(int id) {
        if (shafts.containsKey(id)) {
            return shafts.get(id);
        } else return null;
    }
}
