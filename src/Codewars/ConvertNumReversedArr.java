package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNumReversedArr {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reversedArr(35231))); // [1,3,2,5,3]
    }

    public static int[] reversedArr(long n) {

        if (n == 0){
            return new int[] {0};
        }

        String numConvert = String.valueOf(n);

        int[] resultArr = new int[numConvert.length()];

        int positionInArr = 0;

        for (int i = numConvert.length() - 1; i >= 0; i--){
            resultArr[positionInArr] = numConvert.charAt(i) - '0';
            positionInArr++;
        }
        return resultArr;
    }
}