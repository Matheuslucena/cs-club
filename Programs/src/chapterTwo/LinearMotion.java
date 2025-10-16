package Programs.src.chapterTwo;

import java.util.Scanner;

/*
*   Program Name: Linear Motion
*   Author: Matheus Marques
*   Class: CS110
*   Date Written: 09/09/2025
*   Brief Description: Calculate the position of a body in linear motion
*   Description of inputs: initialPos, initialVel, acceleration, time
*   Description of outputs: The final position
*/
public class LinearMotion {
    public static void main(String[] args) {

        // Variables
        double initialPos;
        double initialVel;
        double acceleration;
        double time;
        double finalPos;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the Initial Position in meters: ");
        initialPos = input.nextDouble();

        System.out.print("Insert the Falling Time in seconds: ");
        time = input.nextDouble();

        System.out.print("Insert the Initial Velocity in m/s: ");
        initialVel = input.nextDouble();

        System.out.print("Insert the Acceleration: ");
        acceleration = input.nextDouble();

        finalPos = initialPos + (initialVel * time) + 0.5 * (acceleration * Math.pow(time, 2));

        System.out.println("Your final positon: " + finalPos + "m");
        input.close();

    }
}
// Expected Output
/*
 * Insert the Initial Position in meters: 12.0
 * Insert the Falling Time in seconds: 10
 * Insert the Initial Velocity in m/s: 3.5
 * Insert the Acceleration: 9.8
 * Your final positon: 537.0m
 */