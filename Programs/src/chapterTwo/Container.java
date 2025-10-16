package Programs.src.chapterTwo;

import java.util.Scanner;

/*
*   Program Name: Container
*   Author: Matheus Marques
*   Class: CS110
*   Date Written: 09/09/2025
*   Brief Description: calculates How many and what size containers are needed to ship widgets
*   Description of inputs: numberWidgets
*   Description of outputs: Total of each container used and total value to ship
*/
public class Container {
    public static void main(String[] args) {
        final int HUGE_CAPACITY = 50;
        final double HUGE_COST = 35.00;

        final int LARGE_CAPACITY = 20;
        final double LARGE_COST = 15.00;

        final int MEDIUM_CAPACITY = 5;
        final double MEDIUM_COST = 4.25;

        final int SMALL_CAPACITY = 1;
        final double SMALL_COST = 0.95;

        int hugeNum;
        int largeNum;
        int mediumNum;
        int smallNum;

        int leftOver;

        int numberWidgets;

        double totalCost;

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\tWidget Manufacturing Company");
        System.out.println("Container Information Program");
        System.out.print("Enter the number of widgets to be shipped: ");
        numberWidgets = input.nextInt();
        input.close();

        hugeNum = numberWidgets / HUGE_CAPACITY;
        leftOver = numberWidgets % HUGE_CAPACITY;

        largeNum = leftOver / LARGE_CAPACITY;
        leftOver = leftOver % LARGE_CAPACITY;

        mediumNum = leftOver / MEDIUM_CAPACITY;
        leftOver = leftOver % MEDIUM_CAPACITY;

        smallNum = leftOver / SMALL_CAPACITY;

        totalCost = (hugeNum * HUGE_COST) + (largeNum * LARGE_COST) + (mediumNum * MEDIUM_COST)
                + (smallNum * SMALL_COST);

        System.out.println("");
        System.out.println("\nContainer/s \t\t Number");
        System.out.println("=========== \t\t ======");
        System.out.println("Huge        \t\t" + hugeNum);
        System.out.println("Large       \t\t" + largeNum);
        System.out.println("Medium      \t\t" + mediumNum);
        System.out.println("Small       \t\t" + smallNum);
        System.out.println("=========== \t\t ======");
        System.out.println("Total Cost     \t\t" + totalCost);
        System.out.println("\nContainer Information Program completed.\n");

    }
}

/**
 * Widget Manufacturing Company
 * Container Information Program
 * Enter the number of widgets to be shipped: 1098
 * 
 * 
 * Container/s Number
 * =========== ======
 * Huge 21
 * Large 2
 * Medium 1
 * Small 3
 * =========== ======
 * Total Cost 772.1
 * 
 * Container Information Program completed.
 */