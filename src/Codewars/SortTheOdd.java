package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

    public static void main(String[] args) {

        int[] array = {5, 8, 6, 3, 1};
        System.out.println(Arrays.toString(sortTheOdd(array)));

        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(sortTheOdd(array2)));
    }

    public static int[] sortTheOdd(int[] array) {

        List<Integer> arrayTemp = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                arrayTemp.add(array[i]);
            }
        }

        Collections.sort(arrayTemp);

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTemp.size(); j++) {
                if (array[i] % 2 != 0) {
                    array[i] = arrayTemp.get(index);
                    index++;
                    if (index == arrayTemp.size()){
                        break;
                    }
                    i++;
                }
            }

        }
        return array;
    }
}
