package com.example.maylisw.myapplication;

/**
 * Created by maylisw on 1/12/18.
 */

public class Word {
    private String word;
    private int score;
    private int numSyllables;

    public Word() {
        word = "default";
        score = 0;
        numSyllables = 2;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumSyllables() {
        return numSyllables;
    }

    public void setNumSyllables(int numSyllables) {
        this.numSyllables = numSyllables;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", score=" + score +
                ", numSyllables=" + numSyllables +
                '}';
    }
}
