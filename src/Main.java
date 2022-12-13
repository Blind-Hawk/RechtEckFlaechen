import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double sideA = 0.0;
        double sideB = 0.0;
        double surfaceArea = 0.0;

    }

    public static double[] getSideSizes(double surfaceArea, double customSideA,
                                      double customSideB){
        double calculateA = 0;
        double calculateB = 0;
        double[] resultArray = new double[2];
        calculateA = Math.sqrt(surfaceArea);
        calculateB = Math.sqrt(surfaceArea);

            if(customSideA < customSideB){
                while(calculateA != customSideA && calculateB != customSideB){
                    calculateA--;
                    calculateB++;
                }
        }
            while(calculateA != customSideA && calculateB != customSideB){
                calculateA++;
                calculateB--;
            }

            resultArray[0] = calculateA;
            resultArray[1] = calculateB;

            return resultArray;
    }

    public static boolean customSidesPossible(double surfaceArea, double customSideA, double customSideB){
        return customSideA * customSideB == surfaceArea;
    }
}
