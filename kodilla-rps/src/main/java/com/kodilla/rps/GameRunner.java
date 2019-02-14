package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {

        Scanner scanner;
        GameConfiguration configuration = new GameConfiguration();
        while (!configuration.end) {

            scanner = new Scanner(System.in);
            System.out.println("Welcome in rock-paper-scissors game!");
            System.out.println("Write Your user name");
            String name = scanner.nextLine();
            configuration.setUserName(name);

            System.out.println("Please type quantity of won rounds leading to victory:");
            int intValue = -1;
            do {
                System.out.print("Please enter a integer value greater than 0: ");
                String next = scanner.next();
                try {
                    intValue = Integer.parseInt(next);
                } catch (NumberFormatException e) {
                }
            } while (intValue < 0);
            configuration.setRoundsToVictory(intValue);

            System.out.println("here game controls:");
            System.out.println("press 1 to play ROCK");
            System.out.println("press 2 to play PAPER");
            System.out.println("press 3 to play SCISSORS");

            GameSolver gameSolver = new GameSolver();
            do {
                System.out.println("Please type your choice in round " + configuration.getCurrentRound());
                System.out.print("Please type: 1, 2 or 3: ");
                boolean input = false;
                String playerChoice = scanner.next();

                //set player choice
                do {
                    switch (playerChoice) {
                        case ("1"):
                            gameSolver.setTypedUserChoice(Choice.ROCK);
                            input = true;
                            break;
                        case ("2"):
                            gameSolver.setTypedUserChoice(Choice.PAPER);
                            input = true;
                            break;
                        case ("3"):
                            gameSolver.setTypedUserChoice(Choice.SCISSORS);
                            input = true;
                            break;
                        default:
                            System.out.println("Please try again and type: 1, 2 or 3: ");
                            input = false;
                            break;
                    }
                } while (input = false);

                //set PC choice
                int bound = Choice.values().length;
                int pick = new Random().nextInt(bound);
                Choice randomCpuChoice = Choice.values()[pick];
                gameSolver.setValueForPCChoice(randomCpuChoice);

                //one round result
                String roundResult = gameSolver.getOneRoundResult();

                switch (roundResult) {
                    case ("PLAYERWIN"):
                        configuration.userPoints++;
                        configuration.setCurrentRoundWinner(name);
                        configuration.roundReport(gameSolver.getTypedUserChoice(), gameSolver.getValueForPCChoice());
                        configuration.currentRound++;
                        break;
                    case ("PCWIN"):
                        configuration.cpuPoints++;
                        configuration.setCurrentRoundWinner("CPU");
                        configuration.roundReport(gameSolver.getTypedUserChoice(), gameSolver.getValueForPCChoice());
                        configuration.currentRound++;
                        break;
                    default:
                        configuration.setCurrentRoundWinner("DRAW");
                        configuration.roundReport(gameSolver.getTypedUserChoice(), gameSolver.getValueForPCChoice());
                        configuration.currentRound++;
                }

                if (configuration.getUserPoints() == configuration.getRoundsToVictory() || configuration.getCpuPoints() == configuration.getRoundsToVictory()) {
                    configuration.end = true;
                    System.out.println("Your wins: " + configuration.getUserPoints());
                    System.out.println("Your losses: " + configuration.getCpuPoints());
                }
            } while (!configuration.end);

            configuration.finalResult();
            System.out.println("Do you wish to play again? Y/N");
            scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            configuration.end = !answer.equalsIgnoreCase("y");

        }
    }
}
