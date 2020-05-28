package de.htw.ai.ema.model;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GameTest {

    Map<String, Player> players = new HashMap<>();

    @Test
    public void testConstruct(){
        players.put("p1", new Player("p1"));
        players.put("p2", new Player("p2"));
        players.put("p3", new Player("p3"));
        players.put("p4", new Player("p4"));
        Game g = new Game(players);
        Deck d = g.getDeck();
        GameRound gr = g.getCurrentRound();
        assertTrue("players not set correctly", g.getPlayers().size()==4);
        assertFalse("over was not set to false", g.isOver());
        assertNotNull("Deck was not initialized", d);
        assertNotNull("GameRound was not initialized", gr);
    }

    @Test
    public void testSetOver(){
        players.put("p1", new Player("p1"));
        players.put("p2", new Player("p2"));
        players.put("p3", new Player("p3"));
        players.put("p4", new Player("p4"));
        Game g = new Game(players);
        g.setOver(true);
        assertTrue("setOver does not work", g.isOver());
    }

    @Test
    public void testSetCurrentRound(){
        players.put("p1", new Player("p1"));
        players.put("p2", new Player("p2"));
        players.put("p3", new Player("p3"));
        players.put("p4", new Player("p4"));
        Game g = new Game(players);
        GameRound gr = new GameRound();
        gr.setRoundNumber(44);
        g.setCurrentRound(gr);
        assertTrue("current round not set correctly", g.getCurrentRound().getRoundNumber()==44);
    }
}
