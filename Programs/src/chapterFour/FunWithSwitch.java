package Programs.src.chapterFour;

import java.util.Scanner;

public class FunWithSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Enter the year: ");
        year = input.nextInt();

        String message = "You are a ";
        switch (year) {
            case 1:
                message = message + "Freshman";
                break;
            case 2:
                message = message + "Sophomore";
                break;
            case 3:
                message = message + "Junior";
                break;
            case 4:
                message = message + "Senior";
                break;
            default:
                message = "Invalid year (1-4)";
                break;
        }

        System.out.println(message);
    }
}
