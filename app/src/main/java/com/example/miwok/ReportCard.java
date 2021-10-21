package com.example.miwok;

import androidx.annotation.NonNull;

public class ReportCard {

    private int englishScore;
    private int mathScore;
    private int biologyScore;
    private String name;

    public ReportCard(String name, int englishScore, int mathScore, int biologyScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.biologyScore = biologyScore;
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
    public int getMathScore() {
        return mathScore;
    }
    public int getBiologyScore(){
        return biologyScore;
    }


    public String toString() {
        String result = "Name: " + name + ".  English grade: " + englishScore + ". Biology grade: " + biologyScore + ". Math grade: " + mathScore;
        return result;
    }

    public void setEnglishScore(int score) {
        englishScore = score;
    }
    public void setMathScore(int score) {
        mathScore = score;
    }
    public void setBiologyScore(int score) {
        biologyScore = score;
    }
}
