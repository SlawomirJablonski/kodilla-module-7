package com.kodilla.rps;

import java.util.Scanner;

public class GameConfiguration {

    public String userName;
    public int roundsToVictory;
    public int currentRound = 1;
    public boolean end = false;
    public int userPoints = 0;
    public int cpuPoints = 0;
    public String currentRoundWinner;


    public GameConfiguration() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoundsToVictory() {
        return roundsToVictory;
    }

    public void setRoundsToVictory(int roundsToVictory) {
        this.roundsToVictory = roundsToVictory;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public int getCpuPoints() {
        return cpuPoints;
    }

    public void setCpuPoints(int cpuPoints) {
        this.cpuPoints = cpuPoints;
    }

    public String getCurrentRoundWinner() {
        return currentRoundWinner;
    }

    public void setCurrentRoundWinner(String currentRoundWinner) {
        this.currentRoundWinner = currentRoundWinner;
    }

    public void roundReport(Choice typedUserChoice, Choice valueForPCChoice) {

        System.out.println("Your choice: " + typedUserChoice + ", CPU choice: " + valueForPCChoice);
        System.out.println("Round winner " + currentRoundWinner + ", game result: " + userName + " " + userPoints + " won rounds <> CPU " + cpuPoints + " won rounds");
        System.out.println(userName + " remaining " + (this.roundsToVictory - this.userPoints) + " rounds to victory");
        System.out.println("CPU remaining " + (this.roundsToVictory - this.cpuPoints) + " rounds to victory");
    }

    public void finalResult() {
        if (this.getUserPoints() > this.getCpuPoints()) {
            System.out.println("You won rock-paper-scissors game");
        } else {
            System.out.println("Computer won rock-paper-scissors game");
        }
    }
}
