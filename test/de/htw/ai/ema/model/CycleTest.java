package de.htw.ai.ema.model;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CycleTest {

    Cycle c = new Cycle();

    @Test
    public void testConstruct(){
        assertNotNull("Cycle wasn't constructed correctly", c.getStack());
    }

    @Test
    public void testSetStack(){
        Stack s = new Stack();
        Card ca = new Card(Suit.CLUBS, Rank.ACE);
        s.addCard(ca);
        c.setStack(s);
        Stack stackSet = c.getStack();
        assertTrue("stack wasn't replaced correctly", stackSet.getCards().size()==1);
    }
}
