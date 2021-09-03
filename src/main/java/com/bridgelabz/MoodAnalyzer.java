package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}