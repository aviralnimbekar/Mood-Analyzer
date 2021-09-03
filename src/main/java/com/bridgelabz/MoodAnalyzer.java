package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {

        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "You have entered a EMPTY Mood");
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "You have not Entered any Mood");
    }}
}