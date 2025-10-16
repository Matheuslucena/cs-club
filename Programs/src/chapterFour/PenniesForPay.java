package Programs.src.chapterFour;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
*   Program Name: Pennies for Pay
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/06/2025
*   Brief Description: Double a pennie for every day of work entered
*   Description of inputs: worked day
*   Description of outputs: A table with the total and the amount pay each day
*/
public class PenniesForPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daysWorked = 0;
        DecimalFormat dFormat = new DecimalFormat("#.##");
        NumberFormat nFormat = NumberFormat.getCurrencyInstance();

        System.out.print("How many days did the employee work this month? ");
        daysWorked = input.nextInt();

        while (daysWorked < 1 || daysWorked > 31) {
            System.out.println("The number of days must be between 1 and 31.");
            System.out.print("Please re-enter the days worked. ");
            daysWorked = input.nextInt();
        }

        System.out.println("Day\tPay");
        System.out.println("-----------------");
        double monthlyPay = 0;
        double dailyPay = 0.01;
        for (int i = 1; i <= daysWorked; i++) {
            monthlyPay += dailyPay;
            System.out.println(i + "\t" + dFormat.format(dailyPay));
            dailyPay *= 2;
        }

        System.out.println("-----------------");
        System.out.println("Total\t" + nFormat.format(monthlyPay));
        System.out.println("Goodbye!");
    }
}

/**
 * How many days did the employee work this month? 3
 * Day Pay
 * -----------------
 * 1 0.01
 * 2 0.02
 * 3 0.04
 * -----------------
 * Total $0.07
 * Goodbye!
 * 
 * How many days did the employee work this month? 45
 * The number of days must be between 1 and 31.
 * Please re-enter the days worked.
 * 
 * How many days did the employee work this month? -2
 * The number of days must be between 1 and 31.
 * Please re-enter the days worked.
 * 
 * Please re-enter the days worked. 7
 * Day Pay
 * -----------------
 * 1 0.01
 * 2 0.02
 * 3 0.04
 * 4 0.08
 * 5 0.16
 * 6 0.32
 * 7 0.64
 * -----------------
 * Total $1.27
 * Goodbye!
 */