import java.util.Arrays;

public class IsConsecutive {
    public static void main(String[] args) {

        System.out.println(isConsecutive(new int[]{3, 5, 2, 1, 4})); // true
        System.out.println(isConsecutive(new int[]{3, 5, 2, 1, 6})); // false
        System.out.println(isConsecutive(new int[]{7, 8, 6, 10, 11})); // false
        System.out.println(isConsecutive(new int[]{4, 2, 3, 6, 5})); // true

    }
    private static boolean isConsecutive(int[] input) {

        Arrays.sort(input);

        int firstNumber = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] != firstNumber){
                return false;
            }
            firstNumber++;
        }
        return true;
    }
}
