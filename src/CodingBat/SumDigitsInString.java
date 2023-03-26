package CodingBat;

/*

Given a string, return the sum of the digits 0-9
that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string.

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */
public class SumDigitsInString {

    public static void main(String[] args) {

        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));

    }

    private static int sumDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) { // Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
                sum += Integer.parseInt(String.valueOf(str.charAt(i))); // Integer.parseInt(string) converts a string to an int.
            }
        }
        return sum;
    }
}
