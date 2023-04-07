package Codewars;

public class SmashWords {
    public static void main(String[] args) {

        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));
    }

    public static String smash(String[] words) {

        String result = "";

        if (words.length == 0){
            return result;
        }
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            result += " ";
        }
        return result.trim();
    }
}
