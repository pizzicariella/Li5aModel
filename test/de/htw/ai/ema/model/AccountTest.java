package de.htw.ai.ema.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class AccountTest {

    @Test
    public void testConstruct(){
        Account a = new Account();
        List<Card> cards = a.getCards();
        assertTrue( "List was not created correctly.", cards.size()==0);
    }

    @Test
    public void testAddCard(){
        Account a = new Account();
        Card c1 = new Card(Suit.HEARTS, Rank.JACK);
        Card c2 = new Card(Suit.CLUBS, Rank.ACE);
        a.addCard(c1);
        a.addCard(c2);
        List<Card> cards = a.getCards();
        assertTrue("Cards weren't added correctly", cards.size()==2);
        assertTrue("Card not added in correct position",cards.get(0).getName().equals("HEARTSJACK"));
    }
}
