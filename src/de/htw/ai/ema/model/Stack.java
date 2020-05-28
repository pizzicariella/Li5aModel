package de.htw.ai.ema.model;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Card> cards;

    public Stack(){
        this.cards = new ArrayList<>(4);
    }

    public List<Card> getCards() { return cards; }

    public void addCard(Card c){
        cards.add(c);
    }

    public void clear(){
        this.cards.clear();
    }
}
