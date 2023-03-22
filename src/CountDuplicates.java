import java.util.HashSet;
import java.util.Set;

// Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
// that occur more than once in the input string. The input string can be assumed to contain alphabets
// (both uppercase and lowercase) and numeric digits.

public class CountDuplicates {
    public static void main(String[] args) {

        String str1 = "abcde"; // 0
        String str2 = "aabBcde"; // 2
        String str3 = "aA11"; // 2
        String str4 = "Indivisibilities"; // 2
        String str5 = "a25B2bc71ACa2"; // 4

        System.out.println(countDuplicates(str1));
        System.out.println(countDuplicates(str2));
        System.out.println(countDuplicates(str3));
        System.out.println(countDuplicates(str4));
        System.out.println(countDuplicates(str5));
    }
    private static int countDuplicates(String str){

        String newStr = str.toLowerCase();
        Set<Character> list = new HashSet<>();

        for (int i = 0; i < newStr.length(); i++) {
            for (int j = 0; j < newStr.length() ; j++) {
                if (newStr.charAt(i) == newStr.charAt(j) && i != j){
                    list.add(newStr.charAt(i));
                }
            }
        }
        return list.size();
    }
}
