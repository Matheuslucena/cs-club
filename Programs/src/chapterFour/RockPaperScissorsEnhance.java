package Programs.src.chapterFour;

import java.util.Random;
import java.util.Scanner;

/*
*   Program Name: RockPaperScissors
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/14/2025
*   Brief Description: Play a rock paper scissors game agains the computer until decided not to.
*   Description of inputs: player choose between rock, paper, scissors
*   Description of outputs: Display the winner and the totals.
*/
public class RockPaperScissorsEnhance {
    public static void main(String[] args) {
        final String ROCK = "ROCK";
        final String PAPER = "PAPER";
        final String SCISSORS = "SCISSORS";
        char again = 'N';
        int totalWinPlayer = 0;
        int totalWinComputer = 0;
        int totalTie = 0;

        do {
            System.out.println("********Rock Paper Scissors***************");

            String computerValue = ROCK;
            Random random = new Random();

            int randomValue = random.nextInt(3);

            Scanner input = new Scanner(System.in);
            String userValue;

            switch (randomValue) {
                case 0:
                    computerValue = ROCK;
                    break;
                case 1:
                    computerValue = PAPER;
                    break;
                case 2:
                    computerValue = SCISSORS;
                    break;
            }

            do {

                System.out.println("Enter one of the following: \n-- Rock \n-- Paper \n-- Scissors");
                userValue = input.nextLine().toUpperCase();

            } while (!userValue.equals(ROCK) && !userValue.equals(PAPER) && !userValue.equals(SCISSORS));

            System.out.println("You picked: " + userValue);
            System.out.println("Computer picked: " + computerValue);

            String winner = "Computer";

            // Check if user is the winner or tie
            if ((userValue.equals(ROCK) && computerValue.equals(SCISSORS)) ||
                    (userValue.equals(SCISSORS) && computerValue.equals(PAPER))
                    || (userValue.equals(PAPER) && computerValue.equals(ROCK))) {
                winner = "Player";
                totalWinPlayer++;
            } else if ((userValue.equals(ROCK) && computerValue.equals(ROCK)) ||
                    (userValue.equals(SCISSORS) && computerValue.equals(SCISSORS))
                    || (userValue.equals(PAPER) && computerValue.equals(PAPER))) {
                winner = "Tie";
                totalTie++;
            } else {
                totalWinComputer++;
            }

            System.out.println("Winner: " + winner);

            System.err.print("Do you want to play again: Y/N ? ");
            again = input.nextLine().toUpperCase().charAt(0);

            System.out.println("");
        } while (again == 'Y');

        System.out.println("You won: " + totalWinPlayer + " times.");
        System.out.println("You lost: " + totalWinComputer + " times.");
        System.out.println("We tie: " + totalTie + " times.");
        System.out.println("\nGoodbye!!");

    }
}

/**
 * ********Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * rock
 * You picked: ROCK
 * Computer picked: ROCK
 * Winner: Tie
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * paper
 * You picked: PAPER
 * Computer picked: PAPER
 * Winner: Tie
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * pape
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * paper
 * You picked: PAPER
 * Computer picked: PAPER
 * Winner: Tie
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * paper
 * You picked: PAPER
 * Computer picked: SCISSORS
 * Winner: Computer
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * paper
 * You picked: PAPER
 * Computer picked: SCISSORS
 * Winner: Computer
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * Paper
 * You picked: PAPER
 * Computer picked: ROCK
 * Winner: Player
 * Do you want to play again: Y/N ? y
 * 
 ******** Rock Paper Scissors***************
 * Enter one of the following:
 * -- Rock
 * -- Paper
 * -- Scissors
 * Paper
 * You picked: PAPER
 * Computer picked: SCISSORS
 * Winner: Computer
 * Do you want to play again: Y/N ? n
 * 
 * You won: 1 times.
 * You lost: 3 times.
 * We tie: 3 times.
 * 
 * Goodbye!!
 */