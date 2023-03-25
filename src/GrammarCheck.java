//Create a function that receives a string(text) and checks whether . is followed by an empty space and a capital letter.

//Example cases:
//grammarCheck("This is a good example. This is a good example.");
// should return true.
//grammarCheck("this is still a good example. Second sentence starts with capital letter.");
// should return true.
//grammarCheck("This is a bad example. no capital letter here.");
// should return false.

public class GrammarCheck {

    public static void main(String[] args) {

        System.out.println(grammarCheck("This is a good example. This is a good example.")); // true
        System.out.println(grammarCheck("this is still a good example. Second sentence starts with capital letter.")); // true
        System.out.println(grammarCheck("This is a bad example. no capital letter here.")); // false
        System.out.println(grammarCheck("This is also a bad example.No space here.")); // false
    }

    private static boolean grammarCheck(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '.' && str.charAt(i + 1) == ' ' && Character.isUpperCase(str.charAt(i + 2))){
                return true;
            }
        }
        return false;
    }
}
