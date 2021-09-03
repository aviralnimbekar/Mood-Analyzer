package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenContainsSAD_ShouldReturnTrue() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD",mood);
    }
}
