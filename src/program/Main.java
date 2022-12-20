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
        getSideSizes(8.0, 1, 2);

    }

    public static void getSideSizes(double surfaceArea, int shorterSide, int longerSide) {

        double calculateA = 0;
        double calculateB = 0;
        calculateA = calculateB = Math.sqrt(surfaceArea);
        int counter = 0;

        if (shorterSide < longerSide) {
            while (calculateA >= 0.0) {
                counter++;
                System.out.println("Mögliches " + counter + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " + calculateB + "\n");
                calculateA -= 1.0;
                calculateB += 1.0;
            }

        } else {

            while (calculateB >= 0.0) {
                counter++;
                System.out.println("Mögliches " + counter + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " + calculateB + "\n");
                calculateA += 1.0;
                calculateB -= 1.0;
            }
        }
    }

    public static void getSideSizesInCustomThresholdAndSteps(double surfaceArea, boolean shorterSide, double thresholdRange, double steps) {

        double calculateA = 0.0;
        double calculateB = 0.0;
        calculateA = calculateB = Math.sqrt(surfaceArea);
        int counter = 0;

        if (shorterSide < longerSide) {
            while (calculateA >= 0.0) {
                counter++;
                System.out.println("Mögliches " + counter + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " + calculateB + "\n");
                calculateA -= steps;
                calculateB += steps;
            }

        } else {

            while (calculateB >= 0.0) {
                counter++;
                System.out.println("Mögliches " + counter + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " + calculateB + "\n");
                calculateA += steps;
                calculateB -= steps;
            }
        }
    }

    public static boolean customSidesPossible(double surfaceArea, double customSideA, double customSideB) {
        return customSideA * customSideB == surfaceArea;
    }
}
