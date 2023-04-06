package Codewars;

import java.util.ArrayList;
import java.util.List;

public class BitCounting {

    public static void main(String[] args) {

        System.out.println(binaryConvertAndSum(13)); // Binary: 1101 --> Sum digits: 3
        System.out.println(binaryConvertAndSum(1234)); // Binary: 10011010010 --> Sum digits: 5

    }
    private static int binaryConvertAndSum (int input){

        List<Integer> binaryNums = new ArrayList<>();

        int remainder;

        while (input != 0){
            remainder = input % 2;
            binaryNums.add(remainder);
            input = input / 2;
        }

        int result = 0;
        for (int i = 0; i < binaryNums.size(); i++) {
            if (binaryNums.get(i) == 1){
                result += 1;
            }
        }
        return result;
    }
}