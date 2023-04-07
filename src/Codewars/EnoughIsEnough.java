package Codewars;

import java.util.Arrays;

// Given a list and a number, create a new list
// that contains each number of list at most N times, without reordering.
// Delete occurrences of an element if it occurs more than n times
public class EnoughIsEnough {

    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 1, 2, 1, 2, 3};

        System.out.println(Arrays.toString(deleteNth(elements, 2))); // [1, 2, 3, 1, 2, 3]

        int[] elements2 = {20, 37, 20, 21};

        System.out.println(Arrays.toString(deleteNth(elements2, 1))); // [20, 37, 21]
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        int[] result = new int[elements.length];

        int counter = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (elements[i] == elements[j]){
                    counter++;
                    if (counter > maxOccurrences){
                        elements[j] = 0;
                    }
                }
            }
            counter = 0;
        }

        for (int i = 0, k = 0; i < elements.length; i++) {
            if (elements[i] == 0){
                continue;
            }
            result[k] = elements[i];
            k++;
        }

        return result;
    }
}
