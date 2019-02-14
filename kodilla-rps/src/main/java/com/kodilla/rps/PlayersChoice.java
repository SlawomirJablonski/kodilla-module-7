package com.kodilla.rps;

public class PlayersChoice {
    public Choice userMove;
    public Choice pcMove;
    public String roundResult;

    public PlayersChoice(Choice userMove, Choice pcMove, String roundResult) {
        this.userMove = userMove;
        this.pcMove = pcMove;
        this.roundResult = roundResult;
    }

    public Choice getUserMove() {
        return userMove;
    }

    public Choice getPcMove() {
        return pcMove;
    }

    public String getRoundResult() {
        return roundResult;
    }
}
