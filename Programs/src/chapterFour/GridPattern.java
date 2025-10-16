package Programs.src.chapterFour;

import java.util.Scanner;

/*
*   Program Name: Grid Pattern
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/09/2025
*   Brief Description: Generate a grid based on the rows and column entered
*   Description of inputs: Rows, column
*   Description of outputs: Display the grid with all numbers
*/
public class GridPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 0;
        int column = 0;
        char again = 'Y';

        do {
            System.out.print("Enter the number of rows (1-10 ): ");
            rows = input.nextInt();

            while (rows < 1 || rows > 10) {
                System.out.print("Please enter a number between 1-10: ");
                rows = input.nextInt();
            }

            System.out.print("Enter the number of column (1-10): ");
            column = input.nextInt();

            while (column < 1 || column > 10) {
                System.out.print("Please enter a number between 1-10: ");
                column = input.nextInt();
            }

            int total = 1;
            for (int r = 1; r <= rows; r++) {
                total = r;
                for (int c = 1; c <= column; c++) {
                    System.out.print(" " + total);
                    total = total + rows;
                }
                System.out.println("");
            }

            System.out.print("Do you want to do it again? Press 'Y' for yes and 'N' for No: ");
            again = input.next().toUpperCase().charAt(0);

        } while (again == 'Y');

        System.out.println("Goodbye!!");
    }
}

/**
 * Output
 * 
 * Enter the number of rows (1-10 ): 4
 * Enter the number of column (1-10): 6
 * 1 5 9 13 17 21
 * 2 6 10 14 18 22
 * 3 7 11 15 19 23
 * 4 8 12 16 20 24
 * Do you want to do it again? Press 'Y' for yes and 'N' for No: Y
 * Enter the number of rows (1-10 ): 12
 * Please enter a number between 1-10: 3
 * Enter the number of column (1-10): 14
 * Please enter a number between 1-10: 3
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * Do you want to do it again? Press 'Y' for yes and 'N' for No: n
 * Goodbye!!
 */