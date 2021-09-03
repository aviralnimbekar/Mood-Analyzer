package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {

        try {
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Please enter a valid input!!!");
        }
    }
}