package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class NextBiggerNumber {

    public static void main(String[] args) {

        System.out.println(nextBiggerNumber(531)); // -1
        System.out.println(nextBiggerNumber(12)); // 21
        System.out.println(nextBiggerNumber(513)); // 531
        System.out.println(nextBiggerNumber(2017)); // 2071
        System.out.println(nextBiggerNumber(9)); // -1
        System.out.println(nextBiggerNumber(111)); // -1


    }

    public static long nextBiggerNumber(long n) {

        if (n < 10) {
            return -1;
        }

        String num = String.valueOf(n);
        char[] digits = num.toCharArray();
        char firstNum = digits[0];
        int counter = 0;

        for (int i = 0; i < digits.length; i++) {
            if (firstNum == digits[i]) {
                counter++;
            }
            if (counter == digits.length) { // if every digits are same in num
                return -1;
            }
        }

        return n;
    }
}
