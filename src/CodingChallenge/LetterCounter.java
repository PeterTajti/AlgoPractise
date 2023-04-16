package CodingChallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCounter {

    public static void main(String[] args) {

        String str = "Welcome to JavaTpoint!";
        System.out.println(letterCounter(str, 'a'));
        System.out.println(maxNumLetter(str));
    }

    public static int letterCounter(String str, char c) {

        int counter = 0;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(c, index) > -1) {
                counter++;
                index = str.indexOf(c, index) + 1;
            } else {
                break;
            }
        }
        return counter;
    }

    @Test
    public void letterCounterTest() {

        String str = "Welcome to JavaTpoint!";

        Assertions.assertEquals(2, letterCounter(str, 't'));
        Assertions.assertNotEquals(1, letterCounter(str, 'x'));
    }

    public static int maxNumLetter(String str) {

        int counter = 0;
        int max = 0;

        List<Character> frequentLetters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (max < counter) {
                max = counter;
                frequentLetters.add(str.charAt(i));
            }
            counter = 0;
        }

        System.out.println("The most frequented character is: " + frequentLetters.get(frequentLetters.size() - 1));
        return max;
    }
}
