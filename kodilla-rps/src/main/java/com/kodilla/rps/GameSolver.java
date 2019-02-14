package com.kodilla.rps;

import java.util.List;

public class GameSolver {

    public Choice typedUserChoice;
    public Choice valueForPCChoice;

    public GameSolver() {
    }

    public Choice getTypedUserChoice() {
        return typedUserChoice;
    }

    public void setTypedUserChoice(Choice typedUserChoice) {
        this.typedUserChoice = typedUserChoice;
    }

    public Choice getValueForPCChoice() {
        return valueForPCChoice;
    }

    public void setValueForPCChoice(Choice valueForPCChoice) {
        this.valueForPCChoice = valueForPCChoice;
    }

    public String getOneRoundResult() {

        PlayersChoiceList playerChoiceList = new PlayersChoiceList();
        List<PlayersChoice> myList = playerChoiceList.getTheList();

        String resultAfterOneRound = myList.stream()
                .filter(c -> c.getUserMove() == this.typedUserChoice && c.getPcMove() == this.valueForPCChoice)
                .map(PlayersChoice::getRoundResult)
                .findFirst().get();

        return resultAfterOneRound;
    }
}