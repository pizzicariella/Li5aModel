package de.htw.ai.ema.model;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HandTest {

    Hand hand = new Hand();
    Card c1 = new Card(Suit.CLUBS, Rank.ACE);
    Card c2 = new Card(Suit.HEARTS, Rank.QUEEN);
    Card c3 = new Card(Suit.CLUBS, Rank.EIGHT);
    Card c4 = new Card(Suit.SPADES, Rank.QUEEN);
    ArrayList<Card> cards = new ArrayList<>();

    @Test
    public void testConstruct(){
        assertTrue("hand not constructed correctly", hand.getCards().size() == 0);
    }

    @Test
    public void testSetCards(){
        cards.add(c1);
        cards.add(c2);
        hand.setCards(cards);
        List<Card> cardsSet = hand.getCards();
        assertTrue("cards not set correctly", cardsSet.size()==2);
    }

    @Test
    public void testAddCard(){
        Card c3 = new Card(Suit.SPADES, Rank.FIVE);
        int cardsBefore = hand.getCards().size();
        hand.addCard(c3);
        int cardsAfter = hand.getCards().size();
        assertTrue("card not added correctly", cardsAfter==cardsBefore+1);
    }

    @Test
    public void testAddCards(){
        cards.add(c1);
        cards.add(c2);
        hand.addCard(c1);
        hand.addCard(c2);
        int cardsBefore = hand.getCards().size();
        List<Card> cardsToAdd= new LinkedList<>();
        cardsToAdd.add(c3);
        cardsToAdd.add(c4);
        hand.addCards(cardsToAdd);
        int cardsAfter = hand.getCards().size();
        assertTrue("cards not added correctly, size was "+cardsBefore+" before and "+cardsAfter+" after",
                cardsAfter==cardsBefore+2);
    }

    @Test
    public void testRemoveCard(){
        hand.addCard(c1);
        hand.addCard(c2);
        hand.addCard(c3);
        hand.addCard(c4);
        int sizeBefore = hand.getCards().size();
        String nameC2 = c2.getName();
        hand.removeCard(nameC2);
        List<Card> cardsAfterRemoval = hand.getCards();
        int sizeAfter = cardsAfterRemoval.size();
        assertTrue("Card hasn't been removed correctly", sizeAfter==sizeBefore-1);
        assertFalse("Correct Card was not removed", cardsAfterRemoval.contains(c2));
    }
}
