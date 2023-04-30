package Codewars;

public class BMICalculator {

    public static void main(String[] args) {

        System.out.println(bmi(63, 1.7)); // Normal
    }

    public static String bmi(double weight, double height) {

        double resultBmi = weight / Math.pow(height, 2);

        if (resultBmi <= 18.5) {
            return "Underweight";
        } else if (resultBmi > 18.5 && resultBmi <= 25) {
            return "Normal";
        } else if (resultBmi > 25 && resultBmi <= 30) {
            return "Overweight";
        }
        return "Obese";
    }
}
