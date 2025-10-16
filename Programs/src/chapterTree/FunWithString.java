package Programs.src.chapterTree;

import java.util.Scanner;

/*
*   Program Name: Fun With String
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 09/11/2025
*   Brief Description: Learn methods of String class
*   Description of inputs: -
*   Description of outputs: Display string methods results
*/
public class FunWithString {
    public static void main(String[] args) {
        // Declare Variables
        String str1;
        String str2;
        String str3;

        int strLenght;
        char ch;

        String resultStr;

        // Create the Scanner Object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        str1 = scan.next();

        System.out.println("Enter the second string: ");
        str2 = scan.next();

        strLenght = str1.length();
        ch = str2.charAt(0);

        str3 = str1.toUpperCase();

        resultStr = str2.replace('a', 'z');

        System.out.println("The length of str1: " + strLenght);
        System.out.println("The char at index 0 in str2: " + ch);
        System.out.println("str1 all upper case: " + str3);
        System.out.println("Str1 reamins the same: " + str1);
        System.out.println("All a's in str2 replaced by z: " + resultStr);

    }
}
