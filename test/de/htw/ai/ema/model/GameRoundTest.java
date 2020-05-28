package de.htw.ai.ema.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameRoundTest {

    GameRound gr = new GameRound();

    @Test
    public void testConstruct(){
        assertNotNull("Cycle object was not initialized", gr.getCurrentCycle());
        assertTrue("roundNumber was not set to 0", gr.getRoundNumber()==0);
    }

    @Test
    public void testSetRoundNumber(){
        gr.setRoundNumber(66);
        assertTrue("roundnumber was not set correctly", gr.getRoundNumber()==66);
    }

    @Test
    public void testSetCurrentCycle(){
        Cycle c = new Cycle();
        gr.setCurrentCycle(c);
        assertTrue("cycle not set correctly", gr.getCurrentCycle().getCycleNumber()==0);
    }
}
