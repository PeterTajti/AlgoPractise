package CodingChallenge;

public class LetterCounter {

    public static void main(String[] args) {

        String str = "Welcome to JavaTpoint!";
        System.out.println(letterCounter(str, 'o'));
    }
    public static int letterCounter (String str, char c){

        int counter = 0;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(c, index) > -1){
                counter++;
                index = str.indexOf(c, index) + 1;
            } else {
                break;
            }
        }
        return counter;
    }
}
