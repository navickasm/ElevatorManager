package com.macknavickas.elevator.algorithm;

import com.macknavickas.elevator.components.building.Building;

/**
 *
 */
public interface Algorithm {
    Instruction processStateUpdate(Building building, StateUpdate update);
}
