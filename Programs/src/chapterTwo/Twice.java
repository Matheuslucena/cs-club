package Programs.src.chapterTwo;

import java.util.Scanner;

/*
*   Program Name: Twice.java 
*   Author: Matheus Marques
*   Class: HelloWolrd
*   Date Written: 09/04/2025
*   Brief Description: Write a Java program that gets an integer input and then displays
*   Description of inputs: Integer number
*   Description of outputs: double the number
*/
public class Twice {

    public static void main(String[] args) {
        // next() - doesnt read the white spaces

        // 1.Declare variables needed
        int userNumber;
        int result;
        Scanner input;

        // 2. Create a Scanner object
        input = new Scanner(System.in); // System.in represents the input from keyboard

        // 3. Prompt the user for the input
        System.out.print("Insert the number to be double: ");

        // 4. Read the input using Scanner object and store it in appropriate variable
        userNumber = input.nextInt();
        input.close();

        // 5. Process the input: Calculate double the number
        result = userNumber * 2;

        // 6. Display output
        System.err.println("The number " + userNumber + " times 2 is " + result);
    }

}

/**
 * Insert the number to be double: 2
 * The double of 2 is 4
 */