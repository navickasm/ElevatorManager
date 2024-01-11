package com.macknavickas.elevator.components.building;

public class Shaft {
    // Seismic mode (trigger seismic detection button, move cab away from counterweight)

    private final int bottomFloor;
    private final int topFloor;
    private final int id;

    public Shaft(int bottomFloor, int topFloor, int id) {
        this.bottomFloor = bottomFloor;
        this.topFloor = topFloor;
        this.id = id;
    }

    /**
     * @return The number of floors the shaft spans
     */
    public int getHeight() {
        return topFloor - bottomFloor + 1;
    }

    public int getBottomFloor() { return bottomFloor; }

    public int getTopFloor() { return topFloor; }

    public int getId() { return id; }
}
