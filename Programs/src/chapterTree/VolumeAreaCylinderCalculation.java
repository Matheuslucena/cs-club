package Programs.src.chapterTree;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
*   Program Name: Volume Area Cylinder Calculation
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/23/2025
*   Brief Description: Calculates the volume and area of a cylinder given radius and height
*   Description of inputs: radius, height
*   Description of outputs: Display the volume and area
*/
public class VolumeAreaCylinderCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.##");

        double radius;
        double height;
        double volume;
        double area;

        System.out.print("Please enter the radius of the Cylinder: ");
        radius = input.nextDouble();

        System.out.print("Please enter the height of the Cylinder: ");
        height = input.nextDouble();

        volume = Math.PI * Math.pow(radius, 2) * height;
        area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

        System.out.println("Volume (cubic inches): " + dFormat.format(volume));
        System.out.println("Surface area (square inches): " + dFormat.format(area));
    }
}

/*
 * Output
 * Please enter the radius of the Cylinder: 5.2
 * Please enter the height of the Cylinder: 8.1
 * Volume (cubic inches): 688.08
 * Surface area (square inches): 434.55
 */
