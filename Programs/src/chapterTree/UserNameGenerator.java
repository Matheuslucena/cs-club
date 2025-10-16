package Programs.src.chapterTree;

import java.util.Random;
import java.util.Scanner;

/*
*   Program Name: User Name Generator
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/18/2025
*   Brief Description: Return a generated username based on the user first and last name
*   Description of inputs: firstName, lastName
*   Description of outputs: the generated username
*/
public class UserNameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String firstName;
        String lastName;
        String username;

        System.out.println("******Username Generator******");

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();

        int randomInt = random.nextInt(50) + 50;
        username = (firstName.charAt(firstName.length() - 1) + "").toUpperCase() + lastName.substring(0, 4) + ""
                + randomInt;

        System.out.println("Username Generated: " + username);
        System.out.println("Good bye!");
    }
}

/*
 * 
 ****** Username Generator******
 * Enter your first name: Dennis
 * Enter your last name: Ritchie
 * Username Generated: SRitc61
 * Good bye!
 */