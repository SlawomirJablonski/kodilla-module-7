package com.kodilla.rps;

public class PlayersChoice {
    public int userMove;
    public int pcMove;
    public int roundResult;

    public PlayersChoice(int userMove, int pcMove, int roundResult) {
        this.userMove = userMove;
        this.pcMove = pcMove;
        this.roundResult = roundResult;
    }

    public int getUserMove() {
        return userMove;
    }

    public int getPcMove() {
        return pcMove;
    }

    public int getRoundResult() {
        return roundResult;
    }
}
