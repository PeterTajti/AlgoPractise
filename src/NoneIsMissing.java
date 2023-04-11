//Create a function called noneIsMissing that takes a number array(inputArray)
//and checks if every number is present from 1 to the highest possible.

import java.util.Arrays;

public class NoneIsMissing {

    public static void main(String[] args) {

        System.out.println(noneIsMissing(new int[]{})); // false
        System.out.println(noneIsMissing(new int[]{4, 2, 3})); // false
        System.out.println(noneIsMissing(new int[]{0, -1, 1})); // false
        System.out.println(noneIsMissing(new int[]{1, 6})); // false
        System.out.println(noneIsMissing(new int[]{1, 4, 2, 2})); // false
        System.out.println(noneIsMissing(new int[]{1})); // true
        System.out.println(noneIsMissing(new int[]{4, 1, 3, 2})); // true
    }

    private static boolean noneIsMissing(int[] inputArray) {

        Arrays.sort(inputArray);

        if (inputArray.length == 0 || inputArray[0] != 1) {
            return false;
        }

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] + 1 != inputArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}