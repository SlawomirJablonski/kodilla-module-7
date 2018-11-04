package com.kodilla.rps;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameMethods {
    public String userName;
    public int roundsToVictory;
    public int currentRound = 1;
    public boolean end = false;
    public int userPoints = 0;
    public int cpuPoints = 0;
    public String currentRoundWinner;
    public int typedUserChoice;
    public int valueForPCChoice;


    public int getUserPoints() {
        return userPoints;
    }

    public int getCpuPoints() {
        return cpuPoints;
    }

    public int getRoundsToVictory() {
        return roundsToVictory;
    }

    public void setUserName() {
        System.out.println("Welcome in rock-paper-scissors game!");
        System.out.println("Write Your user name");
        Scanner scanner = new Scanner(System.in);
        this.userName = scanner.nextLine();
    }

    public void setRoundQuantityToWin() {
        System.out.println("Please type quantity of won rounds leading to victory:");
        Scanner input = new Scanner(System.in);

        int intValue = -1;
        do {
            System.out.print("Please enter a integer value greater than 0: ");
            String next = input.next();
            try {
                intValue = Integer.parseInt(next);
            } catch (NumberFormatException e) {
            }
        } while (intValue < 0);

        this.roundsToVictory = intValue;
    }

    public void printInstruction() {

        System.out.println("here game controls:");
        System.out.println("press 1 to play STONE");
        System.out.println("press 2 to play PAPER");
        System.out.println("press 3 to play SCISSORS");
    }

    public void roundReport() {

        System.out.println("Your choice: " + typedUserChoice + ", CPU choice: " + valueForPCChoice);
        System.out.println("Round winner " + currentRoundWinner + ", game result: " + userName + " " + userPoints + " won rounds <> CPU " + cpuPoints + " won rounds");
        System.out.println(userName + " remaining " + (this.roundsToVictory - this.userPoints) + " rounds to victory");
        System.out.println("CPU remaining " + (this.roundsToVictory - this.cpuPoints) + " rounds to victory");
    }

    public void setPlayerChoice() {
        System.out.println("Please type your choice in round " + this.currentRound);
        System.out.print("Please type: 1, 2 or 3: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        switch (input) {
            case ("1"):
                this.typedUserChoice = Integer.parseInt(input);
                break;
            case ("2"):
                this.typedUserChoice = Integer.parseInt(input);
                break;
            case ("3"):
                this.typedUserChoice = Integer.parseInt(input);
                break;
            default:
                setPlayerChoice();
        }
    }

    public void setCpuChoice() {
        Random random = new Random();
        int valueForPCChoice = random.nextInt(3) + 1;
        this.valueForPCChoice = valueForPCChoice;
    }

    public void oneRoundResult() {

        PlayersChoiceList playerChoiceList = new PlayersChoiceList();
        List<PlayersChoice> myList = playerChoiceList.getTheList();

        int resultAfterOneRound = myList.stream()
                .filter(c -> c.getUserMove() == this.typedUserChoice && c.getPcMove() == this.valueForPCChoice)
                .map(PlayersChoice::getRoundResult)
                .findFirst().get();

        switch (resultAfterOneRound) {
            case (5):
                this.userPoints++;
                this.currentRoundWinner = userName;
                roundReport();
                this.currentRound++;
                break;
            case (10):
                cpuPoints++;
                this.currentRoundWinner = "CPU";
                roundReport();
                this.currentRound++;
                break;
            default:
                this.currentRoundWinner = "DRAW";
                roundReport();
                this.currentRound++;
        }
    }

    public void play() {
        setUserName();
        setRoundQuantityToWin();
        setPlayerChoice();
        setCpuChoice();
        oneRoundResult();
        controlsAfterOneRound();
    }

    public void controlsAfterOneRound() {
        System.out.println("Please type what next:");
        System.out.println("press n to restart game");
        System.out.println("press x to finish game");
        System.out.println("other key to continue");
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);
        switch (input) {
            case ('n'):
                play();
            case ('x'):
                end = true;
                System.out.println("Your wins :" + (this.userPoints));
                System.out.println("Your losses :" + (this.cpuPoints));
        }
    }

    public void finalResult() {
        if (this.getUserPoints() > this.getCpuPoints()) {
            System.out.println("You won rock-paper-scissors game");
        } else {
            System.out.println("Computer won rock-paper-scissors game");
        }
    }
}