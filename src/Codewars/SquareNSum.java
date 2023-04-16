package Codewars;

public class SquareNSum {
    public static void main(String[] args) {

        int[] n = {1, 2, 2};
        System.out.println(squareNumsSum(n)); // 9
    }

    public static int squareNumsSum(int[] n) {

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}
