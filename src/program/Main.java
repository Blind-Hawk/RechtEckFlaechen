package program;

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double sideA = 0.0;
        double sideB = 0.0;
        double surfaceArea = 0.0;

        System.out.println(customSidesPossible(8.0, 2.0, 4.0) + "\n");
        System.out.println(customSidesPossible(8.0, 2.0, 3.0) + "\n");
        System.out.println(getSideSizes(8.0, 2.0, 4.0));

        if (customSidesPossible(100, 0, 0) == true) {
            System.out.println(getSideSizes(100, 15, 10));
        }
        System.out.println("Doesn't calculate");

    }

    public static String getSideSizes(double surfaceArea, double customSideA,
                                      double customSideB) {

        double calculateA = 0;
        double calculateB = 0;
        calculateA = calculateB = Math.sqrt(surfaceArea);

        if (customSideA < customSideB) {
            while (calculateA >= customSideA)
                calculateA -= 0.01;

            while (calculateB <= customSideB) {
                calculateB += 0.01;
            }
            return "Side A: " + Math.round(calculateA) + "\nSide B: " + Math.round(calculateB);
        } else {

            while (calculateA <= customSideA) {

                calculateA += 0.01;
            }

            while (calculateB >= customSideB) {
                calculateB -= 0.01;
            }
            return "Side A: " + Math.round(calculateA) + "\nSide B: " + Math.round(calculateB);
        }


    }

    public static boolean customSidesPossible(double surfaceArea, double customSideA, double customSideB) {
        return customSideA * customSideB == surfaceArea;
    }
}
