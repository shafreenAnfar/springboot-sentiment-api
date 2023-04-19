package com.example.sentimentapi;

public class Sentiment {

    private Probability probability;
    private String label;

    public Sentiment(Probability probability, String label) {
        this.probability = probability;
        this.label = label;
    }

    public Probability getProbability() {
        return probability;
    }

    public void setProbability(Probability probability) {
        this.probability = probability;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
