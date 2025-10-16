package Programs.src.chapterFour;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
*   Program Name: Ticket Price
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/18/2025
*   Brief Description: Calculate the ticket price based on the age
*   Description of inputs: age, price
*   Description of outputs: Display the value to be paid
*/
public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat nFormat = NumberFormat.getCurrencyInstance(Locale.US);

        double price;
        int age;
        String message;

        System.out.println("Movie Ticket Price Calculator\n");
        System.out.print("Your age please:");
        age = input.nextInt();
        System.out.print("Enter ticket price: ");
        price = input.nextDouble();

        if (age <= 5) {
            message = "Kid: Free ticket";
        } else if (age >= 21) {
            message = "Adult: You pay full price " + nFormat.format(price);
        } else {
            message = "Student: You pay half price " + nFormat.format((price / 2));
        }

        System.out.println(message);
    }
}

/*
 * OUTPUT
 *
 * Movie Ticket Price Calculator
 * 
 * Your age please:19
 * Enter ticket price: 9.5
 * Student: You pay half price $4.75
 */
