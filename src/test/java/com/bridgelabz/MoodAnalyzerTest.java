package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenContainsSAD_ShouldReturnSAD() throws MoodAnalysisException {
        String mood = new MoodAnalyzer("Sad").analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() throws MoodAnalysisException {
        String mood = new MoodAnalyzer("Happy").analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNull_ShouldReturnProperMessageToUser() {
        try {
            new MoodAnalyzer(null).analyseMood();

        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenMessage_WhenEmpty_ShouldReturnProperMessageToUser() {
        try {
            new MoodAnalyzer("").analyseMood();

        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
            System.out.println(e.getMessage());
        }
    }
}
