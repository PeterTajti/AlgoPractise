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

            return getResultString(a, b);

        } else if (a.length() < b.length()) {

            String sameLengthA = b.substring(0, a.length());

            result = getResultString(a, sameLengthA);

            return result + b.substring(sameLengthA.length());

        }
        String sameLengthB = a.substring(0, b.length());

        result = getResultString(sameLengthB, b);

        return result + a.substring(sameLengthB.length());
    }

    public static String getResultString(String a, String b) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                result.append(a.charAt(i));
                result.append(b.charAt(j));
                i++;
            }
        }
        return result.toString();
    }
}
