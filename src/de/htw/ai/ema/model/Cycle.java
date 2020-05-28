package de.htw.ai.ema.model;

public class Cycle {

    private Stack stack;
    int cycleNumber;

    public Cycle(){
        this.stack = new Stack();
        this.cycleNumber=0;
    }

    public int getCycleNumber() { return cycleNumber; }

    public void setCycleNumber(int cycleNumber) { this.cycleNumber = cycleNumber; }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }
}
