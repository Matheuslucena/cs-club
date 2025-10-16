package Programs.src.chapterFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
*   Program Name: ReadingFile
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/14/2025
*   Brief Description: Read the scores from a file and calculate the avg
*   Description of inputs: -
*   Description of outputs: Display the scores and the avg
*/
public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {

        final String FILE_URI = "StudentData.txt";

        File fileInput = new File(FILE_URI);
        Scanner scanner = new Scanner(fileInput);

        double total = 0.0;
        int totalLines = 0;
        while (scanner.hasNext()) {
            double currentVal = scanner.nextDouble();
            total += currentVal;
            System.out.println(currentVal);
            totalLines++;
        }

        DecimalFormat nFormat = new DecimalFormat("#.##");
        System.out.println("Avg: " + nFormat.format(total / totalLines));

        scanner.close();
    }

}

/*
 * Output
 * 89.0
 * 80.6
 * 99.0
 * 78.88
 * 98.55
 * Avg: 89.21
 */
