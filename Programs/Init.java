package Programs;

import java.util.Scanner;

//Program Name:            Hi.java
//Author:                          your first and last name
//Class:                            CSC 110
//Date Written:                Today’s date                                                                                                                    
//Brief Description:         What your program does. Use complete sentences.

//Description of inputs:   List every input, its type, and its meaning in the application    

//Description of outputs: List every output and its meaning to the applications

public class Init {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello World!");
        String name = scn.nextLine();
        System.out.println("Hello -> " + name);

        scn.close();
    }

}