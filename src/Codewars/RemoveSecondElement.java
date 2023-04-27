package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveSecondElement {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeEveryOther(new Object[] {"Hello", "Goodbye", "Hello Again" })));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"one", "two", "three", "four"})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{2, 4, 6, 8, 9})));
    }

    public static Object[] removeEveryOther(Object[] arr) {

        int resultSize = arr.length / 2 + arr.length % 2;
        Object[] result = new Object[resultSize];

        int arrElementPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                result[arrElementPosition] = arr[i];
                arrElementPosition++;
            }
        }
        return result;
    }

    @Test
    void basicTest() {
        Assertions.assertArrayEquals(new Object[] { "Hello", "Hello Again" },removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
        Assertions.assertArrayEquals(new Object[] { new Object[] { 1, 2 } },removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
        Assertions.assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        Assertions.assertArrayEquals(new Object[] { "Goodbye" }, removeEveryOther(new Object[] { "Goodbye" }));
        Assertions.assertArrayEquals(new Object[] {}, removeEveryOther(new Object[] {}));
    }
}
