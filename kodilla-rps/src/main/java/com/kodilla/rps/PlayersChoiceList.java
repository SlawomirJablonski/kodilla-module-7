package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class PlayersChoiceList {
    private final List<PlayersChoice> theList = new ArrayList<>();
    public PlayersChoiceList(){
        //status for draw
        theList.add(new PlayersChoice(1, 1, 0));
        theList.add(new PlayersChoice(2, 2, 0));
        theList.add(new PlayersChoice(3, 3, 0));

        //when one wins
        theList.add(new PlayersChoice(1, 2, 10));
        theList.add(new PlayersChoice(2, 1, 5));

        theList.add(new PlayersChoice(2, 3, 10));
        theList.add(new PlayersChoice(3, 2, 5));

        theList.add(new PlayersChoice(1, 3, 5));
        theList.add(new PlayersChoice(3, 1, 10));
    }
    public List<PlayersChoice> getTheList(){
        return new ArrayList<>(theList);
    }
}
