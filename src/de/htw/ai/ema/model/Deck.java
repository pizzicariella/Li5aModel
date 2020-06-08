package de.htw.ai.ema.model;

import java.io.Serializable;

public class Deck implements Serializable {

    //TODO sinnvoll als Singleton?

    private Card[] cards;

    public Deck(){
        this.cards = new Card[52];
        this.fill();
    }

    public Card[] getCards() {
        return cards;
    }

    private void fill(){
        int c = 0;
        for(Suit s: Suit.values()) {
            for(Rank r: Rank.values()){
                cards[c] = new Card(s,r);
                c++;
            }
        }
    }
}
