package Programs.src.chapterTree;

import java.util.Random;

/*
*   Program Name: Dice
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/11/2025
*   Brief Description: Generate a random number between 1-6 to simulate a dice
*   Description of inputs: -
*   Description of outputs: Display the random number generated
*/
public class Dice {

    public static void main(String[] args) {
        Random random = new Random();

        // variables
        int dice1;
        int dice2;
        int result;

        // Generating values
        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;

        // Sum calculation
        result = dice1 + dice2;

        // Output
        System.out.println("******* Simulating Rolling Two Dice ********");
        System.out.println("Face value of Dice 1: " + dice1);
        System.out.println("Face value of Dice 2: " + dice2);
        System.out.println("The sum of the two face values is: " + result);
        System.out.println("Good bye");

    }

}

/**
 * ******* Simulating Rolling Two Dice ********
 * Face value of Dice 1: 4
 * Face value of Dice 2: 2
 * The sum of the two face values is: 6
 * Good bye
 */
