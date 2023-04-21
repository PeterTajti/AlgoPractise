package Codewars;

public class YesOrNo {

    public static void main(String[] args) {

        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));

    }

    public static String boolToWord(boolean b) {

       String result = b ? "Yes" : "No";

       return result;
    }
}
