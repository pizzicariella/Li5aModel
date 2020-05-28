package de.htw.ai.ema.model;

import java.util.LinkedList;

public class Account {

    private LinkedList<Card> cards;

    public Account(){
        this.cards = new LinkedList<>();
    }

    public LinkedList<Card> getCards() {
        return cards;
    }

    public void addCard(Card c){
        this.cards.add(c);
    }
}
