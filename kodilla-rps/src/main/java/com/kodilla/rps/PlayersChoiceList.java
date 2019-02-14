package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class PlayersChoiceList {
    private final List<PlayersChoice> theList = new ArrayList<>();
    public PlayersChoiceList(){
        //status for draw
        theList.add(new PlayersChoice(Choice.ROCK, Choice.ROCK, "DRAW"));
        theList.add(new PlayersChoice(Choice.PAPER, Choice.PAPER, "DRAW"));
        theList.add(new PlayersChoice(Choice.SCISSORS, Choice.SCISSORS, "DRAW"));

        //when one wins
        theList.add(new PlayersChoice(Choice.ROCK, Choice.PAPER, "PCWIN"));
        theList.add(new PlayersChoice(Choice.PAPER, Choice.ROCK, "PLAYERWIN"));

        theList.add(new PlayersChoice(Choice.PAPER, Choice.SCISSORS, "PCWIN"));
        theList.add(new PlayersChoice(Choice.SCISSORS, Choice.PAPER, "PLAYERWIN"));

        theList.add(new PlayersChoice(Choice.ROCK, Choice.SCISSORS, "PLAYERWIN"));
        theList.add(new PlayersChoice(Choice.SCISSORS, Choice.ROCK, "PCWIN"));
    }
    public List<PlayersChoice> getTheList(){
        return new ArrayList<>(theList);
    }
}
