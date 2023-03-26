package CodingBat;

public class StringTimes {
    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 3)); // → "HiHiHi"
    }

    private static String stringTimes (String str, int times){

        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
