package de.htw.ai.ema.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card c1 = new Card(Suit.CLUBS, Rank.ACE);
    Card c2 = new Card(Suit.HEARTS, Rank.FIVE);
    Card c3 = new Card(Suit.SPADES, Rank.QUEEN);

    @Test
    public void testSuit(){
        assertTrue("Suit not assigned correctly", c1.getSuit().equals(Suit.CLUBS));
    }

    @Test
    public void testRank(){
        assertTrue("Rank not assigned correctly", c1.getRank().equals(Rank.ACE));
    }

    @Test
    public void testName(){
        assertTrue("name not composed correctly", c1.getName().equals("CLUBSACE"));
    }

    @Test
    public void testCardIsLi5a(){
        assertFalse("li5a not set correctly", c1.isLi5a());
        assertTrue("li5a not set correctly", c3.isLi5a());
    }

    @Test
    public void testSetCardValue(){
        assertTrue("value not set correctly", c1.getValue()==0);
        assertTrue("value not set correctly", c2.getValue()==1);
        assertTrue("value not set correctly", c3.getValue()==13);
    }

    @Test
    public void testImgPath(){
        assertEquals("imagePath not correct", c1.getImgPath(), "CLUBSACE.png");
    }

    @Test
    public void testSetImgPath(){
        String pathToSet = "resources/"+c1.getImgPath();
        c1.setImgPath(pathToSet);
        assertEquals("Path to image not set correctly", pathToSet, c1.getImgPath());
    }
}
