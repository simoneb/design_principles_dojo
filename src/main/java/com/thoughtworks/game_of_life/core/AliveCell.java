package com.thoughtworks.game_of_life.core;

public class AliveCell implements Cell{

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean isZombie() {
        return false;
    }

    @Override
    public Cell nextState(int numberOfAliveNeighbours) {
        if(numberOfAliveNeighbours == 2 || numberOfAliveNeighbours == 3) {
            return this;
        } else if(numberOfAliveNeighbours == 4) {
              return new ZombieCell();
        } else {
            return new DeadCell();
        }
    }
}
