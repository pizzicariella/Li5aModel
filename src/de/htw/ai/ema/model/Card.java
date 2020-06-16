package de.htw.ai.ema.model;

import java.io.Serializable;

public class Card implements Serializable {

    private Suit suit;
    private Rank rank;
    private String name;
    private boolean li5a;
    private int value;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
        this.name = suit.name()+rank.name();
        this.li5a = cardIsLi5a();
        this.value = setCardValue();
    }

    public Suit getSuit() { return suit; }

    public Rank getRank() {
        return rank;
    }

    public String getName() { return name; }

    public boolean isLi5a() { return li5a; }

    public int getValue() { return value; }

    private boolean cardIsLi5a(){
        if (this.name.equals("SPADESQUEEN") || this.name.equals("DIAMONDSTEN")){
            return true;
        }
        return false;
    }

    private int setCardValue(){
        if (this.suit == Suit.HEARTS){
            return 1;
        } else if (this.name.equals("SPADESQUEEN")){
            return 13;
        } else if(this.name.equals("DIAMONDSTEN")){
            return 10;
        }
        return 0;
    }
}
