package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenContainsSAD_ShouldReturnSAD() {
        try {
            String mood = new MoodAnalyzer("Sad").analyseMood();
            Assertions.assertEquals("SAD", mood);

        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMessage_WhenNull_ShouldReturnProperMessageToUser() {
        try {
            new MoodAnalyzer(null).analyseMood();

        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
