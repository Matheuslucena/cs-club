package Programs.src.chapterFour;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Enter the value of x: ");
        x = input.nextInt();

        System.out.print("Enter the value of y: ");
        y = input.nextInt();

        int quadrant;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x > 0 && y < 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }

        System.out.println("The quadrant for the point (" + x + "," + y + ") is " + quadrant);

    }
}
