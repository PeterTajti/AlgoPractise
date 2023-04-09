package Codewars;

public class NextBiggerNumber {

    public static void main(String[] args) {

        System.out.println(nextBiggerNumber(10990)); // 19009
        System.out.println(nextBiggerNumber(531)); // -1
        System.out.println(nextBiggerNumber(12)); // 21
        System.out.println(nextBiggerNumber(513)); // 531
        System.out.println(nextBiggerNumber(2017)); // 2071
        System.out.println(nextBiggerNumber(9)); // -1
        System.out.println(nextBiggerNumber(111)); // -1

    }

    public static long nextBiggerNumber(long n) {

        if (n < 10) {
            return -1;
        }

        String num = String.valueOf(n);
        char[] digits = num.toCharArray();
        char firstNum = digits[0];
        int counter = 0;

        for (int i = 0; i < digits.length; i++) {
            if (firstNum == digits[i]) {
                counter++;
            }
            if (counter == digits.length) { // if every digits are same in num
                return -1;
            }
        }

        counter = 0;
        for (int i = 0; i < digits.length - 1; i++) {

            if (digits[i] > digits[i + 1]) {
                counter++;
            }
            if (counter == digits.length - 1) { // if every digits are DESC order
                return -1;
            }
        }

        char digitContainer = ' ';
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]){ // rearranging digits
                digitContainer = digits[i];
                digits[i] = digits[i - 1];
                digits[i - 1] = digitContainer;
                break;
            }
        }

        String result = "";

        for (int i = 0; i < digits.length; i++) {
            result += digits[i];
        }

        return Long.parseLong(result);
    }
}
