package Programs.src.chapterFour;

import java.util.Random;
import java.util.Scanner;

/*
*   Program Name: Math Tutor
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/25/2025
*   Brief Description: Give random numbers to be calculated
*   Description of inputs: operation
*   Description of outputs: Display the problem and if the answer is right or not
*/
public class MathTutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int result = 0;
        int firstRandom = (random.nextInt(16) + 15); // random 15 - 30 inclusive;
        int secondRandom = (random.nextInt(31) + 40); // random 40 - 70 inclusive;
        String message = "";
        boolean isInvalidOp = false;

        System.out.println("\tMath Tutor\n\t---------");
        System.out.println("Enter + for Addition Problem\nEnter - for Addition Problem\nEnter * for Addition Problem");
        String op = input.nextLine();

        switch (op) {
            case "+":
                result = firstRandom + secondRandom;
                message = "\t" + firstRandom + "\n+\t" + secondRandom + "\n\t---\n\t";
                break;
            case "-":
                result = firstRandom - secondRandom;
                message = "\t" + firstRandom + "\n-\t" + secondRandom + "\n\t---\n\t";
                break;
            case "*":
                result = firstRandom * secondRandom;
                message = "\t" + firstRandom + "\n*\t" + secondRandom + "\n\t---\n\t";
                break;
            default:
                message = "Illegal operator \nGoodbye!";
                isInvalidOp = true;
                break;
        }

        if (isInvalidOp) {
            System.out.print(message);
        } else {
            System.out.print(message);
            int userResponse = input.nextInt();

            if (result == userResponse) {
                System.out.println("Congratulations!!! That is correct\nGoodbye!");
            } else {
                System.out.println("Sorry, the correct answer is: " + result + "\nGoodbye!");
            }
        }

    }
}

/**
 * Math Tutor
 * ---------
 * Enter + for Addition Problem
 * Enter - for Addition Problem
 * Enter * for Addition Problem
 * -
 * 23
 * - 49
 * ---
 * -26
 * Congratulations!!! That is correct
 * Goodbye!
 * Math Tutor
 * ---------
 * Enter + for Addition Problem
 * Enter - for Addition Problem
 * Enter * for Addition Problem
 *
 * 25
 * 66
 * ---
 * 1650
 * Congratulations!!! That is correct
 * Goodbye!
 * Math Tutor
 * ---------
 * Enter + for Addition Problem
 * Enter - for Addition Problem
 * Enter * for Addition Problem
 * $
 * Illegal operator
 * Goodbye!
 */