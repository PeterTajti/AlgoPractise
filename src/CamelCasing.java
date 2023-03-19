public class CamelCasing {

    public static void main(String[] args) {

        String input1 = "the-stealth-warrior";
        String input2 = "The_stealth_warrior";

        System.out.println(camelCase(input1)); // theStealthWarrior
        System.out.println(camelCase(input2)); // TheStealthWarrior
    }

    private static String camelCase(String input) {

        String[] words = input.split("[-_]");

        String result = words[0];

        for (int i = 1; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return result;

    }

}
