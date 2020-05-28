package de.htw.ai.ema.model;

public class Player {

    private String name;
    private Hand hand;
    private Account account;
    private int totalScore;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
        this.account = new Account();
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Account getAccount() {
        return account;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
