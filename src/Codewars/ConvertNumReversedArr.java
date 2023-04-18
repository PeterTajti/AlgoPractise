package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNumReversedArr {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reversedArr(35231))); // [1,3,2,5,3]
    }

    public static int[] reversedArr (int num){

        List<Character> result = new ArrayList<>();
        String numConvert = String.format("%d", num);

        int[] reverseArr = new int[numConvert.length()];

        for (int i = 0; i < numConvert.length(); i++) {

             result.add(numConvert.charAt(i));
        }

        for (int i = 0; i < result.size(); i++) {
            reverseArr[i] = result.get(i);
        }

                return reverseArr;
    }
}
