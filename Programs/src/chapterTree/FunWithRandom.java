package Programs.src.chapterTree;

import java.util.Random;

/*
*   Program Name: Fun With Random
*   Author: Matheus Marques
*   Class: CS110
*   Date Written: 09/11/2025
*   Brief Description: Learning about random class
*   Description of inputs: -
*   Description of outputs: Display random class methods results
*/
public class FunWithRandom {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random Integer from MIN_INTEGER to MAX_INTEGER: " + random.nextInt());

        System.out.println("Random Integer between 0 and 10: " + random.nextInt(11));

        System.out.println("Random Double 0.0 (included) and 1.0 (exluded): " + random.nextDouble());

        System.out.println("Dice 1-6 random: " + (random.nextInt(6) + 1));

    }
}
