
//Create a function called pyramidSort that takes an array of numbers (inputArray) and returns sorted array as follows:
//-Odd numbers should be ascending
//-Even numbers should be descending
//-Odd numbers come before even numbers
//Example case:
//pyramidSort([1,2,3,4,5,6,7]);
//  should return [1,3,5,7,6,4,2].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PyramidSort {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(pyramidSort(new int[]{1,2,3,4,5,6,7})));
    }

    private static Integer[] pyramidSort(int[] array){

        List<Integer> result = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int n : array) {
            if (n % 2 != 0) {
                result.add(n);
            } else {
                evens.add(n);
            }
        }

        Collections.sort(result);
        Collections.reverse(evens);
        result.addAll(evens);

        return result.toArray(new Integer[0]);
    }
}
