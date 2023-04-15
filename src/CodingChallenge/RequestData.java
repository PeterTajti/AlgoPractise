package CodingChallenge;

import java.util.Random;
import java.util.Scanner;

public class RequestData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, give a number 1-10:");
        int num = sc.nextInt();

        Random random = new Random();
        int machineNumb = random.nextInt(10) + 1;
        System.out.println("The machine number: " + machineNumb);

        String result = (num + machineNumb) % 2 == 0 ? "You win!" : "You lost!";

        System.out.println(result);
    }
}
