package program;

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    //TODO find solution for impossible solutions (SurfaceArea: 16, true => 0 => 16)
    /**
     * Method to estimate possible rectangles from a specific surface are
     *
     * @param surfaceArea double surface area that the rectangle is based on
     * @param leftShorter boolean if the left side is smaller than the right
     */
    public static void getSideSizes(double surfaceArea, boolean leftShorter) {

        double calculateA = 0;
        double calculateB = 0;
        calculateA = calculateB = Math.sqrt(surfaceArea);
        int counterOfRectangles = 0;

        /*
        Because a rectangle is not side symmetric one side is always larger than the other and thus
        we need to check if the "left" side is smaller than the other one
         */
        if (leftShorter) {
            while (calculateA >= 0.0) {

                /*
                Afterwards we print the sides of a potential rectangle and continue
                to the next by shortening the shorter side and lengthen the longer side
                of the rectanlge
                 */
                counterOfRectangles++;
                System.out.println(
                    "Mögliches " + counterOfRectangles + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " +
                        calculateB +
                        "\n");
                calculateA -= 1.0;
                calculateB += 1.0;
            }

        } else {

            while (calculateB >= 0.0) {
                counterOfRectangles++;

                System.out.println(
                    "Mögliches " + counterOfRectangles + ". Rechteck" + "\n" + "Side A: " + calculateA + "\nSide B: " +
                        calculateB +
                        "\n");
                calculateA += 1.0;
                calculateB -= 1.0;
            }
        }
    }

    /*
    TODO Find solution for the problem when the calculated Sides are bigger than the custom
    threshold
     */
    /**
     * A method to estimate the sides of a rectangle in a specific threshhold and custom steps
     * enabling a custom number of rectangles for the use
     *
     * @param surfaceArea        double surface area that the rectangle is based on
     * @param leftShorter        boolean if the left side is smaller than the right
     * @param minThresholdRange  double minimal threshold in meters
     * @param maxThreshholdRange double maximal threshold in meters
     * @param steps              double steps that increases/decreases in meters
     */
    public static void getSideSizesCustom(double surfaceArea, boolean leftShorter,
                                          double minThresholdRange, double maxThreshholdRange, double steps) {

        double calculateA = 0.0;
        double calculateB = 0.0;
        calculateA = calculateB = Math.sqrt(surfaceArea);
        int counterOfRectangles = 0;

        if (leftShorter) {

            while ((maxThreshholdRange >= calculateA) && (calculateA >= minThresholdRange)) {
                counterOfRectangles++;
                printRectangle(counterOfRectangles, calculateA, calculateB);
                calculateA -= steps;
                calculateB += steps;
            }

        } else {

            while ((maxThreshholdRange >= calculateB) && (calculateB >= minThresholdRange)) {
                counterOfRectangles++;
                printRectangle(counterOfRectangles, calculateA, calculateB);
                calculateA += steps;
                calculateB -= steps;
            }
        }
    }

    public static String printRectangle(int countOfRectangles, double sideA, double sideB) {
        return "Mögliches " + countOfRectangles + ". Rechteck" + "\n" + "Side A: " + sideA + "\nSide B: " + sideB + "\n";
    }

    //TODO implement this method to check overlapping sizes of the calulation side over the threshold sizes
    public static boolean checkSidesWithThreshold(double calculateSide,double minThresholdRange,
                                                   double maxThresholdRange) {

        return (sideA >= minThresholdRange) && (sideA <= maxThresholdRange) && (sideB >= minThresholdRange) &&
            (sideB <= maxThresholdRange);
    }
}
