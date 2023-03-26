package CodingBat;

//Given a string and a non-negative int n,
// we'll say that the front of the string is the first 3 chars,
// or whatever is there if the string is less than length 3.
// Return n copies of the front;
public class StringFrontTimes {
    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate", 3)); // → "ChoChoCho"
        System.out.println(frontTimes("a", 5)); // aaaaa
    }

    private static String frontTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                result += str;
            } else {
                result += str.substring(0, 3);
            }
        }
        return result;
    }
}