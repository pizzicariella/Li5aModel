package de.htw.ai.ema.model;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StackTest {

    Stack s = new Stack();
    Card c1 = new Card(Suit.CLUBS, Rank.ACE);
    Card c2 = new Card(Suit.HEARTS, Rank.QUEEN);

    @Test
    public void testConstruct(){
        assertNotNull("List of cards wasn't initialized", s.getCards());
        assertTrue("List of cards hasn't been created as ArrayList", s.getCards() instanceof ArrayList);
    }

    @Test
    public void testAddCard(){
        int sizeBefore = s.getCards().size();
        s.addCard(c1);
        s.addCard(c2);
        List<Card> addedCards =  s.getCards();
        int sizeAfter = addedCards.size();
        assertTrue("cards haven't been added to list correctly", sizeAfter==sizeBefore+2);
    }

    @Test
    public void testClear(){
        s.addCard(c1);
        s.addCard(c2);
        s.clear();
        assertEquals("Stack is not empty", 0, s.getCards().size());
    }
}
