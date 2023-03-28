
//Create a function called reverseWords that takes a string as an input and reverses the letters in every word
//(but does not reverse the words order in the sentences) and returns the string with the reversed words.
//You shouldn't care about upper or lower case letters.
//You cannot use LINQ/Streams or built-in Reverse() function.
//Example case:
//reverseWords("lleW ,enod taht saw ton taht .drah ?eeS");
//  should return "Well done, that was not that hard. See?".

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("lleW ,enod taht saw ton taht .drah ?eeS"));
    }

    private static String reverseWords(String text) {

        String[] words = text.split(" ");
        String result = "";

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);
            }
            result += " ";
        }

        return result.trim();
    }
}