package Codewars;

public class EvenOrOdd {

    public static void main(String[] args) {

        int x = 8;
        int y = 9;

        System.out.println(evenOrOdd(x));
        System.out.println(evenOrOdd(y));
    }
    public static String evenOrOdd(int number) {

        return number % 2 == 0 ? "Even" : "Odd";

    }
}
