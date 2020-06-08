package de.htw.ai.ema.model;

import java.io.Serializable;

public class GameRound implements Serializable {

    private Cycle currentCycle;
    private int roundNumber;

    public GameRound(){
        this.currentCycle = new Cycle();
        this.roundNumber = 0;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Cycle getCurrentCycle() {
        return currentCycle;
    }

    public void setCurrentCycle(Cycle currentCycle) {
        this.currentCycle = currentCycle;
    }
}
