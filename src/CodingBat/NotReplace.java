package CodingBat;
/*
Given a string, return a string where every appearance of the lowercase word
"is" has been replaced with "is not". The word "is" should not be immediately proceeded
or followed by a letter -- so for example the "is" in "this" does not count.

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */

public class NotReplace {
    public static void main(String[] args) {

        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {

        String[] words = str.split("\\W");

        String result = "";

        for (String word : words) {
            if (word.equals("is")) {
                word = "is not";
            }
            result += word + " ";
        }

        return result.trim();
    }
}
