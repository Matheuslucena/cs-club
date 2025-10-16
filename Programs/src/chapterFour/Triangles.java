package Programs.src.chapterFour;

import java.util.Scanner;

/*
*   Program Name: Triangle
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/25/2025
*   Brief Description: Check if the sides given forms a triangle and check what type and calculate the perimeter
*   Description of inputs: the sides a, b, c
*   Description of outputs: Display the type of the triangle and perimeter or a message informing it is not a triangle.
*/
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        String message = "";
        System.out.println("**************Triangle***************************");

        System.out.print("Please enter the first side length: ");
        a = input.nextInt();

        System.out.print("Please enter the second side length: ");
        b = input.nextInt();

        System.out.print("Please enter the third side length: ");
        c = input.nextInt();

        boolean isRealTriangle = (a + b > c && a + c > b && c + b > a) ? true : false;

        if (isRealTriangle) {
            int perimeter = a + b + c;
            message += "Perimeter: " + perimeter;

            if (a == b && b == c) {
                message += "\nThis Triangle is Equilateral";
            } else if (a == b || a == c || b == c) {
                message += "\nThis Triangle is Isosceles";
            } else {
                message += "\nThis Triangle is Scalene";
            }

        } else {
            message += "The side lengths provided cannot form a triangle.";
        }

        System.out.println(message + "\nGoodBye");
    }
}

/**
 * **************Triangle***************************
 * Please enter the first side length: 3
 * Please enter the second side length: 4
 * Please enter the third side length: 5
 * Perimeter: 12
 * This Triangle is Scalene
 * GoodBye
 * **************Triangle***************************
 * Please enter the first side length: 1
 * Please enter the second side length: 5
 * Please enter the third side length: 4
 * The side lengths provided cannot form a triangle.
 * GoodBye
 */