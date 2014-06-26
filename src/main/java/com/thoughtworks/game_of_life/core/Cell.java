package com.thoughtworks.game_of_life.core;

public interface Cell {
    boolean isAlive();

    boolean isZombie();

    Cell nextState(int numberOfAliveNeighbours);
}
