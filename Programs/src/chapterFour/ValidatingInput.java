package Programs.src.chapterFour;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade = 0;

        System.out.print("Enter the grade: ");
        grade = input.nextInt();

        while (grade < 0 || grade > 100) {
            System.out.print("Wrong grade. Enter again: ");
            grade = input.nextInt();
        }
    }
}
