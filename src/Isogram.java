import java.util.Arrays;

public class Isogram {
    public static void main(String[] args) {

        System.out.println(isIsogram("fWakfbvla uiBo aofw")); // false
        System.out.println(isIsogram("akfBvl hon Qwpse")); // true
    }

    private static boolean isIsogram(String input) {

        input = input.toLowerCase().replace(" ", "");

        // If you want to be very precise or there are numbers / special characters in the input:
        // input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");

        char[] letters = input.toCharArray();
        Arrays.sort(letters);

        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
