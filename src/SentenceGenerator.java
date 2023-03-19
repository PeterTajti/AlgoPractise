public class SentenceGenerator {

    public static void main(String[] args) {
        String[] firstWord = {"Cat", "Dog", "Parrot", "Bear", "Fox", "Pig"};
        String[] secondWord = {"is very", "is not too"};
        String[] thirdWord = {"clever.", "fast.", "slow.", "tired.", "hungry."};

        System.out.println(randomSentence(firstWord, secondWord, thirdWord));
    }

    private static String randomSentence(String[] firstWord, String[] secondWord, String[] thirdWord) {

        int firstWordRandom = (int) (Math.random() * firstWord.length);
        int secondWordRandom = (int) (Math.random() * secondWord.length);
        int thirdWordRandom = (int) (Math.random() * thirdWord.length);

        return firstWord[firstWordRandom] + " " + secondWord[secondWordRandom] + " " + thirdWord[thirdWordRandom];
    }
}
