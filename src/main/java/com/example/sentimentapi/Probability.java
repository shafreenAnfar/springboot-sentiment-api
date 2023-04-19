package com.example.sentimentapi;

public class Probability {
    private double neg;
    private double neutral;
    private double pos;

    public Probability(double neg, double neutral, double pos) {
        this.neg = neg;
        this.neutral = neutral;
        this.pos = pos;
    }

    public double getNeg() {
        return neg;
    }

    public void setNeg(double neg) {
        this.neg = neg;
    }

    public double getNeutral() {
        return neutral;
    }

    public void setNeutral(double neutral) {
        this.neutral = neutral;
    }

    public double getPos() {
        return pos;
    }

    public void setPos(double pos) {
        this.pos = pos;
    }
}
