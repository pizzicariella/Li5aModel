package de.htw.ai.ema.model;

import java.io.Serializable;
import java.util.Map;

//TODO Singleton sinnvoll??
//TODO eventuell unter Klassen GameRound und Cycle löschen und alles in Game?
public class Game implements Serializable {

    private Map<String, Player> players;
    private boolean over;
    private GameRound currentRound;
    private Deck deck;

    public Game(Map<String, Player> players){
        this.players = players;
        this.over = false;
        this.deck = new Deck();
        this.currentRound = new GameRound();
    }

    public Deck getDeck() {
        return deck;
    }

    public Map<String, Player> getPlayers() {
        return players;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public GameRound getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(GameRound currentRound) {
        this.currentRound = currentRound;
    }
}
