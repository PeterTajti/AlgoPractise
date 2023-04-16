package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @Test
    public void squareNumSumTest(){

        int[] n = {5, -3, 4};
        Assertions.assertEquals(50, squareNumsSum(n));

        int[] empty = {};
        Assertions.assertNotEquals(1, squareNumsSum(empty)); // 0
    }
}
