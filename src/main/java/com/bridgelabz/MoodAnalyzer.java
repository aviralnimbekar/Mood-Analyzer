package com.bridgelabz;

public class MoodAnalyzer {

    public String analyseMood(String message) {

        if (message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}