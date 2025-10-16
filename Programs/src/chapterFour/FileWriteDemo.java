package Programs.src.chapterFour;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) throws FileNotFoundException {

        String name;

        PrintWriter outFile = new PrintWriter("data.txt");

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name of your friend: ");
            name = scan.next();

            outFile.println(name);
        }

        outFile.close();
        System.out.println("Goodbye!!");
    }
}
