package Programs.src.chapterTwo;

import java.util.Scanner;

/*
*   Program Name: Fraction
*   Author: Matheus Marques
*   Class: CS110
*   Date Written: 09/09/2025
*   Brief Description: This program displays the decimal equivalent of a fraction.
*   Description of inputs: integer numerator, integer denominator
*   Description of outputs: decimal equivalent
*/
public class Fraction {
    public static void main(String[] args) {
        // 1. declare Variables below
        double result;
        int firstInt;
        int secondInt;
        Scanner scan = new Scanner(System.in);

        /*
         * In order to use the Scanner class for input we must first
         * declare a Scanner object
         */
        // 2. Prompt user and get Inputs
        System.out.print("Please enter the numerator of fraction: ");
        firstInt = scan.nextInt();

        System.out.print("Please enter the denominator of fraction: ");
        secondInt = scan.nextInt();

        scan.close();

        // 3. Process inputs: calculate the decimal equivalent
        result = (double) firstInt / secondInt;

        // 4. Display Output
        System.out.println(firstInt + "/" + secondInt + " = " + result);
    }
}

// Expected Output
/*
 * Please enter the numerator of fraction: 5
 * Please enter the denominator of fraction: 3
 * 5/3 = 1.6666666666666667
 */
