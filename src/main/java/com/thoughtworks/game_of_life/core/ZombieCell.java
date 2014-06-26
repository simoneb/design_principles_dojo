package com.thoughtworks.game_of_life.core;

/**
 * Created by simone on 26/06/2014.
 */
public class ZombieCell implements Cell {
    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isZombie() {
        return true;
    }

    @Override
    public Cell nextState(int numberOfAliveNeighbours) {
        return this;
    }
}
