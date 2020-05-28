package de.htw.ai.ema.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    String name = "Peter";
    Player p = new Player(name);
    Card c1 = new Card(Suit.CLUBS, Rank.ACE);
    Card c2 = new Card(Suit.HEARTS, Rank.QUEEN);

    @Test
    public void testConstruct(){
        assertEquals("Players name does not equal Peter", p.getName(), name);
        assertNotNull("Hand of p is null", p.getHand());
        assertNotNull("Account of p is null", p.getAccount());
        assertTrue("score wasn't set to 0", p.getTotalScore()==0);
    }

    @Test
    public void testSetHand(){
        Hand hand = new Hand();
        hand.addCard(c1);
        hand.addCard(c2);
        p.setHand(hand);
        Hand handOfP = p.getHand();
        assertTrue("Hand wasn't set correctly", handOfP.getCards().size() == 2);
    }

    @Test
    public void testSetAccount(){
        Account a = new Account();
        a.addCard(c1);
        a.addCard(c2);
        p.setAccount(a);
        assertTrue("Account of p wasn't set correctly", p.getAccount().getCards().size()==2);
    }

    @Test
    public void setTotalScore(){
        p.setTotalScore(33);
        assertTrue(p.getTotalScore()==33);
    }
}
