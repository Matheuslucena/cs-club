package Programs.src.chapterFour;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
*   Program Name: Writing to File
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/09/2025
*   Brief Description: Write the scores to a file
*   Description of inputs: Student Score
*   Description of outputs: Write student scores to a file
*/
public class WritingToFiles {

    public static void main(String arg[]) throws FileNotFoundException {
        // declare needed Variables. score is already declared

        double score;
        int count; // to keep track of the number of exam scores
        // Define/declare a PrintWriter object reference outFile and
        Scanner scan = new Scanner(System.in);

        // create a PrintWriter object by passing file name StudentData.txt
        // to the constructor
        PrintWriter outFile = new PrintWriter("StudentData.txt");

        // Initialize the count variable to 1
        // Start a while loop that iterates 5 times. Use the count variable to control
        // the loop
        for (int i = 1; i <= 5; i++) {
            // prompt the user for the exam score
            System.out.print("Enter the " + i + " score: ");
            // read the exam score in the score variable
            score = scan.nextDouble();
            // now write the score in the opened file

            outFile.print(score + " \t");
            // end while loop
        }

        // write a message back to the user
        System.out.println("Your numbers have been written to the StudentData.txt file.\n");

        // Close the output file
        outFile.close();

        System.out.println("Goodbye\n");
    }
}
