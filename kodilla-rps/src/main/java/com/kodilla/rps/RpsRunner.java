package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        GameMethods gameMethods = new GameMethods();

        gameMethods.setUserName();
        gameMethods.setRoundQuantityToWin();
        gameMethods.printInstruction();
        do {
            gameMethods.setPlayerChoice();
            gameMethods.setCpuChoice();
            gameMethods.oneRoundResult();
            if (gameMethods.getUserPoints() == gameMethods.getRoundsToVictory() || gameMethods.getCpuPoints() == gameMethods.getRoundsToVictory()) {
                gameMethods.end = true;
                System.out.println("Your wins: " + gameMethods.getUserPoints());
                System.out.println("Your losses: " + gameMethods.getCpuPoints());
            }
            if (!gameMethods.end) {
                gameMethods.controlsAfterOneRound();
            }
        } while (!gameMethods.end);
        gameMethods.finalResult();
    }
}