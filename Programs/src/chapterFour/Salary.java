package Programs.src.chapterFour;

import java.util.Scanner;

/*Program Name: Salary.java
Author:         
Class:          CSC 110
Date Written:   Today's Date
   
   Description:
		Demonstrates : Using if..else. Statements
		Demonstrates : Using switch statement.

   Computes the raise and new salary for an employee.

     The input to the program includes the current annual salary
     for the employee and a number indicating the performance
     rating (1=excellent, 2=good, and 3=poor). An employee with a
     rating of 1 will receive a 6% raise, an employee with a rating
     of 2 will receive a 4% raise, and one with a rating of 3 will
     receive a 1.5% raise.  All other ratings are invalid and
	 the raise will be set to 0 and a message displayed.

  ***************************************************************/
public class Salary {

    public static void main(String[] args) {

        double currentSalary = 0; // current annual salary
        int rating = 0; // performance rating
        double raise = 0; // dollar amount of the raise
        Scanner scan = new Scanner(System.in);

        final int EXCELLENT_PERFORMANCE = 1;
        final int GOOD_PERFORMANCE = 2;
        final int POOR_PERFORMANCE = 3;

        final double EXCELLENT_PERFORMANCE_RATE = 0.6;
        final double GOOD_PERFORMANCE_RATE = 0.2;
        final double POOR_PERFORMANCE_RATE = 0.15;

        // Input: Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating: ");
        rating = scan.nextInt();
        // Process
        // Compute the raise -- Use if ... else ... below
        if (rating == EXCELLENT_PERFORMANCE) {
            raise = currentSalary * EXCELLENT_PERFORMANCE_RATE;
        } else if (rating == GOOD_PERFORMANCE) {
            raise = currentSalary * GOOD_PERFORMANCE_RATE;
        } else if (rating == POOR_PERFORMANCE) {
            raise = currentSalary * POOR_PERFORMANCE_RATE;
        } else {
            raise = 0;
            System.out.println("Invalid rating.");
        }

        // Output: Print the results
        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + (currentSalary + raise));

        // Compute the raise again using switch statement using the same variables

        // Print the results
        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + (currentSalary + raise));
        System.out.println("Both output are the same! Good Bye");

    }

}
