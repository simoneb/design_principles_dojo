package com.thoughtworks.game_of_life.core;

public class DeadCell implements Cell{

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isZombie() {
        return false;
    }

    @Override
    public Cell nextState(int numberOfAliveNeighbours) {
        if(numberOfAliveNeighbours == 3)
            return new AliveCell();
        else {
            return this;
        }
    }
}
