package com.example.sentimentapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentimentController {

    @PostMapping("/text-processing/api/sentiment")
    public Sentiment sentiment() {
        Probability probability = new Probability(0.30135019761690551, 0.27119050546800266, 0.69864980238309449);
        Sentiment sentiment = new Sentiment(probability, "pos");
        return sentiment;
    }
}
