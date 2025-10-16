package Programs.src.chapterFour;

import java.util.Scanner;

/*
*   Program Name: Factorial
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/06/2025
*   Brief Description: Calculate factorial of a number
*   Description of inputs: value to be calculated
*   Description of outputs: Display the result
*/
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        int result = 0;
        do {
            System.out.println("********Factorial********");
            System.out.print("Please enter a value between 1-10 (0 to quit): ");
            value = input.nextInt();

            while (value < 0 || value > 10) {
                System.out.print("Value is out of range. Please Re-enter a value between 1-10 (0 to quit): ");
                value = input.nextInt();
            }

            if (value == 0) {
                System.out.println("Goodbye!");
            } else {
                result = value;
                String message = value + "";
                for (int i = (value - 1); i > 0; i--) {
                    message += "*" + i;
                    result *= i;
                }

                System.out.println(value + "! = " + result);
                // System.out.println(message + " = " + result);
            }
        } while (value != 0);

    }
}

/**
 * ********Factorial********
 * Please enter a value between 1-10 (0 to quit): 22
 * Value is out of range. Please Re-enter a value between 1-10 (0 to quit):
 * 
 * ********Factorial********
 * Please enter a value between 1-10 (0 to quit): 22
 * Value is out of range. Please Re-enter a value between 1-10 (0 to quit): 7
 * 7! = 5040
 * 
 * ********Factorial********
 * Please enter a value between 1-10 (0 to quit): 1
 * 1! = 1
 * 
 * ********Factorial********
 * Please enter a value between 1-10 (0 to quit): 0
 * Goodbye!
 */