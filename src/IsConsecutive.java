import java.util.Arrays;

public class IsConsecutive {
    public static void main(String[] args) {

        System.out.println(isConsecutive(new int[]{3, 5, 2, 1, 4})); // true
        System.out.println(isConsecutive2(new int[]{3, 5, 2, 1, 6})); // false
        System.out.println(isConsecutive(new int[]{7, 8, 6, 10, 11})); // false
        System.out.println(isConsecutive2(new int[]{4, 2, 3, 6, 5})); // true

        System.out.println();

        System.out.println(isConsecutive3(new int[]{3, 5, 2, 1, 4})); // true
        System.out.println(isConsecutive3(new int[]{3, 5, 2, 1, 6})); // false
        System.out.println(isConsecutive3(new int[]{7, 8, 6, 10, 11})); // false
        System.out.println(isConsecutive3(new int[]{4, 2, 3, 6, 5})); // true

    }

    private static boolean isConsecutive(int[] input) {

        Arrays.sort(input);

        int firstNumber = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] != firstNumber) {
                return false;
            }
            firstNumber++;
        }
        return true;
    }

    private static boolean isConsecutive2(int[] input) {

        Arrays.sort(input);

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] - input[i] != 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean isConsecutive3(int[] input){

        Arrays.sort(input);

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] + 1 != input[i + 1]){
                return false;
            }
        }
        return true;
    }
}
