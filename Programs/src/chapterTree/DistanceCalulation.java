package Programs.src.chapterTree;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
*   Program Name: Distance Calculation
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/16/2025
*   Brief Description: Calculate the distance between 2 points on a x,y
*   Description of inputs: x1,y1,x2,y2
*   Description of outputs: The value of the distance
*/

/*
 * 
 * IPO
 * 
 * Input            | Processing                    |Output
 * x1, y1, x2, y2   | Use the formula to calculate  | Return the result of the calculation
 * integer values   | the disntance.                |
 * 
 */
public class DistanceCalulation {
    public static void main(String[] args) {
        int x1;
        int x2;
        int y1;
        int y2;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("*********** Distance Calculation **********");

        System.out.println("Enter the first coordinate values: ");
        System.out.print("x1 = ");
        x1 = input.nextInt();
        System.out.print("y1 = ");
        y1 = input.nextInt();

        System.out.println("Enter the second coordinate values: ");
        System.out.print("x2 = ");
        x2 = input.nextInt();
        System.out.print("y2 = ");
        y2 = input.nextInt();

        result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        DecimalFormat dcFormat = new DecimalFormat("#.###");

        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is "
                + dcFormat.format(result));

        System.out.println("God Bye!!");
        double z = (double) 5 / (double) 10;

        System.out.println(z);
    }
}

/*
 * *********** Distance Calculation **********
 * Enter the first coordinate values:
 * x1 = 5
 * y1 = 3
 * Enter the second coordinate values:
 * x2 = 6
 * y2 = 7
 * The distance between (5,3) and (6,7) is 4.123
 * God Bye!!
 */