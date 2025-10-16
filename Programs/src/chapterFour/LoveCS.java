package Programs.src.chapterFour;

import java.util.Scanner;

public class LoveCS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isEvenNumber = false;
        int limit = 0;
        System.out.print("Enter an even number of times the message should be displayed: ");

        do {
            limit = input.nextInt();
            isEvenNumber = limit % 2 == 0;
            if (!isEvenNumber) {
                System.out.println("Only even numbers are allowed:");
                System.out.print("Please enter an even number of times:");
            }
        } while (!isEvenNumber);

        int count = 1;
        int sum = 0;

        while (count <= limit) {
            sum = sum + count;
            System.out.println(count + " I Love Computer Science!!");
            count++;
        }

        System.out.println("Message was printed " + (count - 1) + " times");
        System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum);
    }
}
