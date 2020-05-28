package de.htw.ai.ema.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    @Test
    public void testFill(){
        Deck d = new Deck();
        Card[] cards = d.getCards();
        Card c1 = cards[2]; //should be heartsfour
        Card c2 = cards[51]; //should be spadesace
        int clubs = 0;
        int queens = 0;
        for(Card c: cards){
            if(c.getSuit() == Suit.CLUBS){
                clubs++;
            }
            if(c.getRank() == Rank.QUEEN){
                queens++;
            }
        }
        assertTrue("card array has the wrong length", cards.length == 52);
        assertTrue("card[2] didn't equal heartsfour but"+c1.getName(), c1.getName().equals("HEARTSFOUR"));
        assertTrue("card[51] didn't equal spadesace but"+c2.getName(), c2.getName().equals("SPADESACE"));
        assertTrue("deck does not contain right number of clubs", clubs == Rank.values().length);
        assertTrue("deck does not contain right number of queens", queens == Suit.values().length);
    }
}
