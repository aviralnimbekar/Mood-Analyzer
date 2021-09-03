package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenContainsSAD_ShouldReturnSAD() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = analyzer.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenContainsANY_ShouldReturnHAPPY() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
