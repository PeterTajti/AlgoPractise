package CodingChallenge;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class StepEstimate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("KM, on foot?");
        double distance = sc.nextInt();

        System.out.println("How tall are you?");
        double high = sc.nextInt();

        double stepsOneKm = distance * 1000 / (high / 100 * 0.2);

        System.out.println("The number of steps, per km: " + String.format("%.1f", stepsOneKm));

        double caloriesPerStep = 0.046;
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        System.out.println("Calories burned: " + numberFormat.format(caloriesPerStep * stepsOneKm));
    }
}
