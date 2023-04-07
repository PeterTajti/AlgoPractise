package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given a list and a number, create a new list
// that contains each number of list at most N times, without reordering.
// Delete occurrences of an element if it occurs more than n times
public class EnoughIsEnough {

    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 1, 2, 1, 2, 3};

        System.out.println(Arrays.toString(deleteNth(elements, 2))); // [1, 2, 3, 1, 2, 3]

        int[] elements2 = {20, 37, 20, 21};

        System.out.println(Arrays.toString(deleteNth(elements2, 1))); // [20, 37, 21]

        int[] elements3 = {6, 2, 4, 2, 3, 5, 7, 8, 0};

        System.out.println(Arrays.toString(deleteNth(elements3, 8))); // []

        int[] elements4 = {2, 3, 4, 1, 2, 0};

        System.out.println(Arrays.toString(deleteNth(elements4, 0))); // []
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if (maxOccurrences == 0) {
            int[] zeroArray = {};
            return zeroArray;
        }

        List<Integer> foundedNums = new ArrayList<>();

        int counter = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (elements[i] == elements[j]) {
                    counter++;
                    if (counter > maxOccurrences) {
                        elements[j] = -1;
                    }
                }
            }
            if (counter == maxOccurrences) {
                foundedNums.add(elements[i]);
            }
            counter = 0;
        }

        if (foundedNums.isEmpty()) {
            int[] emptyArray = {};
            return emptyArray;
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != -1) {
                counter++;
            }
        }

        int[] result = new int[counter];

        for (int i = 0, k = 0; i < elements.length; i++) {
            if (elements[i] == -1) {
                continue;
            }
            result[k] = elements[i];
            k++;
        }

        return result;
    }
}
