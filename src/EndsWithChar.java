//Create a function called endsWithChar that takes a string text and character endingChar as an input
//and returns the number of all unique words in string that end with given endingChar.
//Repeated uses of same word only count once.

//Example1
//endsWithChar("ends with s characters", 's');
//  should return 3 because "ends", "s" and "characters" all end with "s" and all the words are unique.

//Example2
//endsWithChar("all is well that ends well", 'l')
//  should return 2 because while there are 3 words that end with l (all, well, well),
//  word "well" is repeated and will only count once.

import java.util.HashSet;
import java.util.Set;

public class EndsWithChar {
    public static void main(String[] args) {

        System.out.println(endsWithChar("ends with s characters", 's'));
        System.out.println(endsWithChar("all is well that ends well", 'l'));
    }

    private static int endsWithChar(String text, char endingChar) {

        String[] words = text.split(" ");

        Set<String> wordsEndingWithEndingChar = new HashSet<>();

        for (String word : words) {
            if (word.endsWith(String.valueOf(endingChar))) {
                wordsEndingWithEndingChar.add(word);
            }
        }

        return wordsEndingWithEndingChar.size();
    }
}
