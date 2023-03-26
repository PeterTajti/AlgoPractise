package CodingBat;

/*
Given two strings, a and b, create a bigger string
made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on.
Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/

public class MixString {
    public static void main(String[] args) {

        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String a, String b) {

        String result = "";

        if (a.length() == b.length()) {

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    result += a.charAt(i);
                    result += b.charAt(j);
                    i++;
                }
            }
            return result;
        } else if (a.length() < b.length()) {

            String sameLengthA = b.substring(0, a.length());

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < sameLengthA.length(); j++) {
                    result += a.charAt(i);
                    result += sameLengthA.charAt(j);
                    i++;
                }
            }
            return result + b.substring(sameLengthA.length());

        }

        return result;
    }
}
