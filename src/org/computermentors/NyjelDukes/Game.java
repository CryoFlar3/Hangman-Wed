package org.computermentors.NyjelDukes;

public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer){
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public String getAnswer() {
        return answer;
    }

    public boolean applyGuess(char letter){
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit){
            hits += letter;
        } else {
            misses += letter;
        }
        return isHit;
    }

    public int getMaxMisses(){
        return MAX_MISSES - misses.length();
    }
}
