package de.htw.ai.ema.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public void addCards(Collection<Card> cardsToAdd){
        cards.addAll(cardsToAdd);
    }

    public void removeCard(String name){
        cards.removeIf(card -> card.getName().equals(name));
    }
}
