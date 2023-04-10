package Codewars;

public class StripComments {
    public static void main(String[] args) {

        //System.out.println(stripComments2("apples, pears # and bananas", new String[]{"#", "!"}));
        //System.out.println(stripComments2("grapes         ", new String[]{"#", "!"}));
        //System.out.println(stripComments2("bananas !apples", new String[]{"#", "!"}));
        System.out.println(stripComments2("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
    }

    public static String stripComments2(String text, String[] commentSymbols) {

        String result = "";
        String[] words = text.split(" ");

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.charAt(i) == ' ' || text.charAt(i) == ','){
                result += text.charAt(i);
            }
            if (String.valueOf(text.charAt(i)).equals(commentSymbols[0]) || String.valueOf(text.charAt(i)).equals(commentSymbols[1])){
                break;
            }
        }

        return result.trim();
    }
    public static String stripComments(String text, Character[] commentSymbols) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.charAt(i) == ' ' || text.charAt(i) == ','){
                result += text.charAt(i);
            }
            if (text.charAt(i) == commentSymbols[0] || text.charAt(i) == commentSymbols[1]){
                break;
            }
        }

        return result.trim();
    }
}
